package com.paladincloud;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.paladincloud.utils.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class InvokeNotificationsApi {

    public String handleRequest(Map<String,Object> event, Context context)
    {
        Gson gsonObj = new Gson();
        LambdaLogger logger = context.getLogger();

        String response = new String("hello paladin cloud");
        logger.log("inside handleRequest "+event);
        String jsonStr = gsonObj.toJson(event);
        logger.log("jsonStr -- "+jsonStr);
        JsonParser jsonParser = new JsonParser();
        JsonObject policyParamsJson = (JsonObject) jsonParser.parse(jsonStr);

        JsonElement bodyJson = policyParamsJson.getAsJsonArray("Records").get(0);
        logger.log("bodyJson--"+bodyJson.toString());
        String payload = bodyJson.getAsJsonObject().get("Sns").getAsJsonObject().get("Message").getAsString();

        logger.log("payload for invoking notifications "+payload);

        try {
            String invokeNotificationUrl = System.getenv("INVOKE_NOTIFICATION_URL");
            String token = HttpUtil.getToken();
            logger.log(" token -"+token);
            String notificationSettingsJson = HttpUtil.post(invokeNotificationUrl,payload,token,"Bearer");
            logger.log("notification settings response -"+notificationSettingsJson);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}
