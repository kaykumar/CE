package com.tmobile.cloud.gcprules.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TestUtils {

    public static JsonArray getHitsJsonArrayForVMPublicAccess() {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("_source", gson.fromJson("{\n" +
                "          \"_cloudType\": \"GCP\",\n" +
                "          \"region\": \"us-west1-a\",\n" +
                "          \"id\": \"8993151141438601059\",\n" +
                "          \"projectName\": \"cool-bay-349411\",\n" +
                "          \"name\": \"pacbot-demo-vm\",\n" +
                "          \"description\": \"\",\n" +
                "          \"disks\": [\n" +
                "            {\n" +
                "              \"_cloudType\": \"GCP\",\n" +
                "              \"region\": null,\n" +
                "              \"id\": \"0\",\n" +
                "              \"projectName\": \"cool-bay-349411\",\n" +
                "              \"name\": \"pacbot-demo-vm\",\n" +
                "              \"sizeInGB\": 10,\n" +
                "              \"type\": \"PERSISTENT\",\n" +
                "              \"discoverydate\": null\n" +
                "            }\n" +
                "          ],\n" +
                "          \"tags\": {\n" +
                "            \"for\": \"pacbot-demo\",\n" +
                "            \"by\": \"skchalla\"\n" +
                "          },\n" +
                "          \"machineType\": \"https://www.googleapis.com/compute/v1/projects/cool-bay-349411/zones/us-west1-a/machineTypes/e2-medium\",\n" +
                "          \"status\": \"TERMINATED\",\n" +
                "          \"networkInterfaces\": [\n" +
                "            {\n" +
                "              \"_cloudType\": \"GCP\",\n" +
                "              \"region\": null,\n" +
                "              \"id\": \"nic0\",\n" +
                "              \"projectName\": null,\n" +
                "              \"name\": \"nic0\",\n" +
                "              \"accessConfigs\": [\n" +
                "                {\n" +
                "                  \"_cloudType\": \"GCP\",\n" +
                "                  \"region\": null,\n" +
                "                  \"id\": \"External NAT\",\n" +
                "                  \"projectName\": \"cool-bay-349411\",\n" +
                "                  \"name\": \"External NAT\",\n" +
                "                  \"natIP\": \"\",\n" +
                "                  \"discoverydate\": null\n" +
                "                }\n" +
                "              ],\n" +
                "              \"network\": \"https://www.googleapis.com/compute/v1/projects/cool-bay-349411/global/networks/default\",\n" +
                "              \"discoverydate\": null\n" +
                "            }\n" +
                "          ],\n" +
                "          \"discoverydate\": \"2022-06-16 06:00:00+0000\",\n" +
                "          \"_resourceid\": \"8993151141438601059\",\n" +
                "          \"_docid\": \"8993151141438601059\",\n" +
                "          \"_entity\": \"true\",\n" +
                "          \"_entitytype\": \"vminstance\",\n" +
                "          \"firstdiscoveredon\": \"2022-06-14 10:00:00+0000\",\n" +
                "          \"latest\": true,\n" +
                "          \"_loaddate\": \"2022-06-16 06:12:00+0000\"\n" +
                "        }", JsonElement.class));

        JsonArray array = new JsonArray();
        array.add(jsonObject);
        return array;
    }

    public static JsonArray getHitsJsonArrayForVMPublicAccessFailure() {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("_source", gson.fromJson("{\n" +
                "          \"_cloudType\": \"GCP\",\n" +
                "          \"region\": \"us-west1-a\",\n" +
                "          \"id\": \"8993151141438601059\",\n" +
                "          \"projectName\": \"cool-bay-349411\",\n" +
                "          \"name\": \"pacbot-demo-vm\",\n" +
                "          \"description\": \"\",\n" +
                "          \"disks\": [\n" +
                "            {\n" +
                "              \"_cloudType\": \"GCP\",\n" +
                "              \"region\": null,\n" +
                "              \"id\": \"0\",\n" +
                "              \"projectName\": \"cool-bay-349411\",\n" +
                "              \"name\": \"pacbot-demo-vm\",\n" +
                "              \"sizeInGB\": 10,\n" +
                "              \"type\": \"PERSISTENT\",\n" +
                "              \"discoverydate\": null\n" +
                "            }\n" +
                "          ],\n" +
                "          \"tags\": {\n" +
                "            \"for\": \"pacbot-demo\",\n" +
                "            \"by\": \"skchalla\"\n" +
                "          },\n" +
                "          \"machineType\": \"https://www.googleapis.com/compute/v1/projects/cool-bay-349411/zones/us-west1-a/machineTypes/e2-medium\",\n" +
                "          \"status\": \"TERMINATED\",\n" +
                "          \"networkInterfaces\": [\n" +
                "            {\n" +
                "              \"_cloudType\": \"GCP\",\n" +
                "              \"region\": null,\n" +
                "              \"id\": \"nic0\",\n" +
                "              \"projectName\": null,\n" +
                "              \"name\": \"nic0\",\n" +
                "              \"accessConfigs\": [\n" +
                "                {\n" +
                "                  \"_cloudType\": \"GCP\",\n" +
                "                  \"region\": null,\n" +
                "                  \"id\": \"External NAT\",\n" +
                "                  \"projectName\": \"cool-bay-349411\",\n" +
                "                  \"name\": \"External NAT\",\n" +
                "                  \"natIP\": \"34.148.124.52\",\n" +
                "                  \"discoverydate\": null\n" +
                "                }\n" +
                "              ],\n" +
                "              \"network\": \"https://www.googleapis.com/compute/v1/projects/cool-bay-349411/global/networks/default\",\n" +
                "              \"discoverydate\": null\n" +
                "            }\n" +
                "          ],\n" +
                "          \"discoverydate\": \"2022-06-16 06:00:00+0000\",\n" +
                "          \"_resourceid\": \"8993151141438601059\",\n" +
                "          \"_docid\": \"8993151141438601059\",\n" +
                "          \"_entity\": \"true\",\n" +
                "          \"_entitytype\": \"vminstance\",\n" +
                "          \"firstdiscoveredon\": \"2022-06-14 10:00:00+0000\",\n" +
                "          \"latest\": true,\n" +
                "          \"_loaddate\": \"2022-06-16 06:12:00+0000\"\n" +
                "        }", JsonElement.class));

        JsonArray array = new JsonArray();
        array.add(jsonObject);
        return array;
    }

    public static JsonArray getHitsJsonArrayForBigQuerydataset() {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("_source", gson.fromJson("{\n" +
                "          \"_cloudType\": \"gcp\",\n" +
                "          \"region\": \"US\",\n" +
                "          \"id\": \"tesing_dataset\",\n" +
                "          \"projectName\": \"cool-bay-349411\",\n" +
                "          \"projectId\": \"cool-bay-349411\",\n" +
                "          \"datasetId\": \"tesing_dataset\",\n" +
                "          \"acl\": [\n" +
                "            {\n" +
                "              \"role\": \"WRITER\",\n" +
                "              \"specialGroup\": \"projectWriters\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"OWNER\",\n" +
                "              \"specialGroup\": \"projectOwners\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"OWNER\",\n" +
                "              \"userByEmail\": \"pacbot-demo@cool-bay-349411.iam.gserviceaccount.com\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"OWNER\",\n" +
                "              \"userByEmail\": \"santhosh.challa@zemosolabs.com\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"READER\",\n" +
                "              \"specialGroup\": \"projectReaders\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"READER\",\n" +
                "              \"userByEmail\": \"pacbot-demo@cool-bay-349411.iam.gserviceaccount.com\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"defaultTableLifetime\": null,\n" +
                "          \"description\": \"test data set\",\n" +
                "          \"etag\": \"mS16Y7CQ5o1etp5Qj0oxRg==\",\n" +
                "          \"friendlyName\": null,\n" +
                "          \"generatedId\": \"cool-bay-349411:tesing_dataset\",\n" +
                "          \"lastModified\": null,\n" +
                "          \"labels\": {\n" +
                "            \"application\": \"demo_app\"\n" +
                "          },\n" +
                "          \"kmsKeyName\": null,\n" +
                "          \"defaultPartitionExpirationMs\": null,\n" +
                "          \"discoverydate\": \"2022-06-22 13:00:00+0000\",\n" +
                "          \"_resourceid\": \"tesing_dataset\",\n" +
                "          \"_docid\": \"tesing_dataset\",\n" +
                "          \"_entity\": \"true\",\n" +
                "          \"_entitytype\": \"bigquerydataset\",\n" +
                "          \"firstdiscoveredon\": \"2022-06-22 13:00:00+0000\",\n" +
                "          \"latest\": true,\n" +
                "          \"_loaddate\": \"2022-06-22 13:43:00+0000\"\n" +
                "        }", JsonElement.class));
        JsonArray array = new JsonArray();
        array.add(jsonObject);
        return array;
    }

    public static JsonArray getHitsJsonArrayForBigQuerydatasetFailure() {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("_source", gson.fromJson("{\n" +
                "          \"_cloudType\": \"gcp\",\n" +
                "          \"region\": \"us-east1\",\n" +
                "          \"id\": \"test_dataSet2\",\n" +
                "          \"projectName\": \"cool-bay-349411\",\n" +
                "          \"projectId\": \"cool-bay-349411\",\n" +
                "          \"datasetId\": \"test_dataSet2\",\n" +
                "          \"acl\": [\n" +
                "            {\n" +
                "              \"role\": \"WRITER\",\n" +
                "              \"specialGroup\": \"projectWriters\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"OWNER\",\n" +
                "              \"specialGroup\": \"projectOwners\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"OWNER\",\n" +
                "              \"userByEmail\": \"santhosh.challa@zemosolabs.com\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"READER\",\n" +
                "              \"specialGroup\": \"projectReaders\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"roles/viewer\",\n" +
                "              \"iamMember\": \"allUsers\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"role\": \"roles/viewer\",\n" +
                "              \"specialGroup\": \"projectReaders\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"defaultTableLifetime\": null,\n" +
                "          \"description\": null,\n" +
                "          \"etag\": \"VntiAMxVlRTtmtfE09sq+w==\",\n" +
                "          \"friendlyName\": null,\n" +
                "          \"generatedId\": \"cool-bay-349411:test_dataSet2\",\n" +
                "          \"lastModified\": null,\n" +
                "          \"labels\": {},\n" +
                "          \"kmsKeyName\": null,\n" +
                "          \"defaultPartitionExpirationMs\": null,\n" +
                "          \"discoverydate\": \"2022-06-22 13:00:00+0000\",\n" +
                "          \"_resourceid\": \"test_dataSet2\",\n" +
                "          \"_docid\": \"test_dataSet2\",\n" +
                "          \"_entity\": \"true\",\n" +
                "          \"_entitytype\": \"bigquerydataset\",\n" +
                "          \"firstdiscoveredon\": \"2022-06-22 13:00:00+0000\",\n" +
                "          \"latest\": true,\n" +
                "          \"_loaddate\": \"2022-06-22 13:43:00+0000\"\n" +
                "        }", JsonElement.class));
        JsonArray array = new JsonArray();
        array.add(jsonObject);
        return array;
    }

    public static JsonArray getHitsJsonForTableEncryptCMKsSuccess() {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("_source", gson.fromJson("{\"_cloudType\":\"gcp\",\"region\":null,\"id\":\"test123\",\"projectName\":\"cool-bay-349411\",\"tableId\":\"test123\",\"description\":null,\"friendlyName\":null,\"generatedId\":\"cool-bay-349411:tesing_dataset.test123\",\"labels\":{},\"kmsKeyName\":\"key1\",\"dataSetId\":\"tesing_dataset\",\"iamResourceName\":\"projects/cool-bay-349411/datasets/tesing_dataset/tables/test123\",\"expirationTime\":null,\"creationTime\":1655789087444,\"lastModifiedTime\":null,\"etag\":null,\"requirePartitionFilter\":false,\"discoverydate\":\"2022-06-23 10:00:00+0000\",\"_resourceid\":\"test123\",\"_docid\":\"test123\",\"_entity\":\"true\",\"_entitytype\":\"bigquerytable\",\"firstdiscoveredon\":\"2022-06-23 10:00:00+0000\",\"latest\":true,\"_loaddate\":\"2022-06-23 10:59:00+0000\"}\n", JsonElement.class));
        JsonArray array = new JsonArray();
        array.add(jsonObject);
        return array;
    }

    public static JsonArray getHitsJsonForTableEncryptCMKsFailure() {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("_source", gson.fromJson("{\"_cloudType\":\"gcp\",\"region\":null,\"id\":\"test123\",\"projectName\":\"cool-bay-349411\",\"tableId\":\"test123\",\"description\":null,\"friendlyName\":null,\"generatedId\":\"cool-bay-349411:tesing_dataset.test123\",\"labels\":{},\"kmsKeyName\":null,\"dataSetId\":\"tesing_dataset\",\"iamResourceName\":\"projects/cool-bay-349411/datasets/tesing_dataset/tables/test123\",\"expirationTime\":null,\"creationTime\":1655789087444,\"lastModifiedTime\":null,\"etag\":null,\"requirePartitionFilter\":false,\"discoverydate\":\"2022-06-23 10:00:00+0000\",\"_resourceid\":\"test123\",\"_docid\":\"test123\",\"_entity\":\"true\",\"_entitytype\":\"bigquerytable\",\"firstdiscoveredon\":\"2022-06-23 10:00:00+0000\",\"latest\":true,\"_loaddate\":\"2022-06-23 10:59:00+0000\"}\n", JsonElement.class));
        JsonArray array = new JsonArray();
        array.add(jsonObject);
        return array;
    }
}