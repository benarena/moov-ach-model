# AchFilesApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBatchToFile**](AchFilesApi.md#addBatchToFile) | **POST** /files/{fileID}/batches | Append Batch to File
[**checkFile**](AchFilesApi.md#checkFile) | **GET** /files/{fileID}/validate | Validate File
[**createFile**](AchFilesApi.md#createFile) | **POST** /files/create | Create File
[**deleteACHFile**](AchFilesApi.md#deleteACHFile) | **DELETE** /files/{fileID} | Delete File
[**deleteFileBatch**](AchFilesApi.md#deleteFileBatch) | **DELETE** /files/{fileID}/batches/{batchID} | Delete Batch
[**flattenFile**](AchFilesApi.md#flattenFile) | **POST** /files/{fileID}/flatten | Flatten Batches
[**getFileBatch**](AchFilesApi.md#getFileBatch) | **GET** /files/{fileID}/batches/{batchID} | Get Batch
[**getFileBatches**](AchFilesApi.md#getFileBatches) | **GET** /files/{fileID}/batches | Get Batches
[**getFileByID**](AchFilesApi.md#getFileByID) | **GET** /files/{fileID} | Retrieve File
[**getFileContents**](AchFilesApi.md#getFileContents) | **GET** /files/{fileID}/contents | Get File Contents
[**getFiles**](AchFilesApi.md#getFiles) | **GET** /files | List Files
[**ping**](AchFilesApi.md#ping) | **GET** /ping | Ping ACH service
[**segmentFile**](AchFilesApi.md#segmentFile) | **POST** /files/{fileID}/segment | Segment File
[**validateFile**](AchFilesApi.md#validateFile) | **POST** /files/{fileID}/validate | Validate File (Custom)

<a name="addBatchToFile"></a>
# **addBatchToFile**
> addBatchToFile(body, fileID, xRequestID, xIdempotencyKey)

Append Batch to File

Append a Batch record to the specified File.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
Batch body = new Batch(); // Batch | 
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests.
try {
    apiInstance.addBatchToFile(body, fileID, xRequestID, xIdempotencyKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#addBatchToFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Batch**](Batch.md)|  |
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]
 **xIdempotencyKey** | **String**| Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkFile"></a>
# **checkFile**
> Error checkFile(fileID, xRequestID)

Validate File

Validates the existing File. You need only supply the unique File identifier that was returned upon creation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    Error result = apiInstance.checkFile(fileID, xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#checkFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

[**Error**](Error.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFile"></a>
# **createFile**
> FileID createFile(body, xRequestID, xIdempotencyKey, requireABAOrigin, bypassOrigin, bypassDestination)

Create File

Create a new File object from either the plaintext or JSON representation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String body = "body_example"; // String | Content of the ACH file (in json or raw text)
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests.
ValidateOptspropertiesrequireABAOrigin requireABAOrigin = new ValidateOptspropertiesrequireABAOrigin(); // ValidateOptspropertiesrequireABAOrigin | Optional parameter to enable routing number validation over ImmediateOrigin
ValidateOptspropertiesbypassOriginValidation bypassOrigin = new ValidateOptspropertiesbypassOriginValidation(); // ValidateOptspropertiesbypassOriginValidation | Optional parameter to disable ImmediateOrigin validation
ValidateOptspropertiesbypassDestinationValidation bypassDestination = new ValidateOptspropertiesbypassDestinationValidation(); // ValidateOptspropertiesbypassDestinationValidation | Optional parameter to disable ImmediateDestination validation
try {
    FileID result = apiInstance.createFile(body, xRequestID, xIdempotencyKey, requireABAOrigin, bypassOrigin, bypassDestination);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Content of the ACH file (in json or raw text) |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]
 **xIdempotencyKey** | **String**| Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests. | [optional]
 **requireABAOrigin** | [**ValidateOptspropertiesrequireABAOrigin**](.md)| Optional parameter to enable routing number validation over ImmediateOrigin | [optional]
 **bypassOrigin** | [**ValidateOptspropertiesbypassOriginValidation**](.md)| Optional parameter to disable ImmediateOrigin validation | [optional]
 **bypassDestination** | [**ValidateOptspropertiesbypassDestinationValidation**](.md)| Optional parameter to disable ImmediateDestination validation | [optional]

### Return type

[**FileID**](FileID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/json
 - **Accept**: application/json

<a name="createFile"></a>
# **createFile**
> FileID createFile(body, xRequestID, xIdempotencyKey, requireABAOrigin, bypassOrigin, bypassDestination)

Create File

Create a new File object from either the plaintext or JSON representation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String body = "body_example"; // String | Content of the ACH file (in json or raw text)
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests.
ValidateOptspropertiesrequireABAOrigin requireABAOrigin = new ValidateOptspropertiesrequireABAOrigin(); // ValidateOptspropertiesrequireABAOrigin | Optional parameter to enable routing number validation over ImmediateOrigin
ValidateOptspropertiesbypassOriginValidation bypassOrigin = new ValidateOptspropertiesbypassOriginValidation(); // ValidateOptspropertiesbypassOriginValidation | Optional parameter to disable ImmediateOrigin validation
ValidateOptspropertiesbypassDestinationValidation bypassDestination = new ValidateOptspropertiesbypassDestinationValidation(); // ValidateOptspropertiesbypassDestinationValidation | Optional parameter to disable ImmediateDestination validation
try {
    FileID result = apiInstance.createFile(body, xRequestID, xIdempotencyKey, requireABAOrigin, bypassOrigin, bypassDestination);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Content of the ACH file (in json or raw text) |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]
 **xIdempotencyKey** | **String**| Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests. | [optional]
 **requireABAOrigin** | [**ValidateOptspropertiesrequireABAOrigin**](.md)| Optional parameter to enable routing number validation over ImmediateOrigin | [optional]
 **bypassOrigin** | [**ValidateOptspropertiesbypassOriginValidation**](.md)| Optional parameter to disable ImmediateOrigin validation | [optional]
 **bypassDestination** | [**ValidateOptspropertiesbypassDestinationValidation**](.md)| Optional parameter to disable ImmediateDestination validation | [optional]

### Return type

[**FileID**](FileID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/json
 - **Accept**: application/json

<a name="deleteACHFile"></a>
# **deleteACHFile**
> deleteACHFile(fileID, xRequestID)

Delete File

Permanently deletes a File and associated Batches. It cannot be undone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    apiInstance.deleteACHFile(fileID, xRequestID);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#deleteACHFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteFileBatch"></a>
# **deleteFileBatch**
> deleteFileBatch(fileID, batchID, xRequestID)

Delete Batch

Delete a Batch from a File.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String batchID = "batchID_example"; // String | Batch ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    apiInstance.deleteFileBatch(fileID, batchID, xRequestID);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#deleteFileBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **batchID** | **String**| Batch ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="flattenFile"></a>
# **flattenFile**
> FileID flattenFile(fileID, xRequestID, xIdempotencyKey)

Flatten Batches

Consolidate Batches and Entries into the minimum number of Batches needed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests.
try {
    FileID result = apiInstance.flattenFile(fileID, xRequestID, xIdempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#flattenFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]
 **xIdempotencyKey** | **String**| Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests. | [optional]

### Return type

[**FileID**](FileID.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileBatch"></a>
# **getFileBatch**
> Batch getFileBatch(fileID, batchID, xRequestID)

Get Batch

Get a specific Batch on a File.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String batchID = "batchID_example"; // String | Batch ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    Batch result = apiInstance.getFileBatch(fileID, batchID, xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#getFileBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **batchID** | **String**| Batch ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

[**Batch**](Batch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileBatches"></a>
# **getFileBatches**
> Batches getFileBatches(fileID, xRequestID)

Get Batches

Get the Batches on a File.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    Batches result = apiInstance.getFileBatches(fileID, xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#getFileBatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

[**Batches**](Batches.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileByID"></a>
# **getFileByID**
> File getFileByID(fileID, xRequestID)

Retrieve File

Get the details of an existing File using the unique File identifier that was returned upon creation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    File result = apiInstance.getFileByID(fileID, xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#getFileByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileContents"></a>
# **getFileContents**
> String getFileContents(fileID, xRequestID)

Get File Contents

Assembles the existing File (batches and controls) records, computes sequence numbers and totals. Returns plaintext file. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    String result = apiInstance.getFileContents(fileID, xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#getFileContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getFiles"></a>
# **getFiles**
> Files getFiles(xRequestID)

List Files

List all ACH Files created with the ACH service. These Files are not persisted through multiple runs of the service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    Files result = apiInstance.getFiles(xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#getFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

[**Files**](Files.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ping"></a>
# **ping**
> ping()

Ping ACH service

Check if the ACH service is running.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
try {
    apiInstance.ping();
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#ping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="segmentFile"></a>
# **segmentFile**
> SegmentedFiles segmentFile(fileID, xRequestID, xIdempotencyKey)

Segment File

Split one File into two. One with only debits and one with only credits.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests.
try {
    SegmentedFiles result = apiInstance.segmentFile(fileID, xRequestID, xIdempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#segmentFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]
 **xIdempotencyKey** | **String**| Idempotent key in the header which expires after 24 hours. These strings should contain enough entropy to not collide with each other in your requests. | [optional]

### Return type

[**SegmentedFiles**](SegmentedFiles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="validateFile"></a>
# **validateFile**
> Error validateFile(fileID, body, xRequestID)

Validate File (Custom)

Validates the existing File. You need only supply the unique File identifier that was returned upon creation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AchFilesApi;


AchFilesApi apiInstance = new AchFilesApi();
String fileID = "fileID_example"; // String | File ID
ValidateOpts body = new ValidateOpts(); // ValidateOpts | 
String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
try {
    Error result = apiInstance.validateFile(fileID, body, xRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchFilesApi#validateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileID** | **String**| File ID |
 **body** | [**ValidateOpts**](ValidateOpts.md)|  | [optional]
 **xRequestID** | **String**| Optional Request ID allows application developer to trace requests through the system&#x27;s logs | [optional]

### Return type

[**Error**](Error.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

