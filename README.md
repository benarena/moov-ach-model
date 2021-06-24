# swagger-java-client

ACH API
- API version: v1
  - Build date: 2021-06-23T19:59:31.531Z[GMT]

Moov ACH ([Automated Clearing House](https://en.wikipedia.org/wiki/Automated_Clearing_House)) implements an HTTP API for creating, parsing, and validating ACH files. ACH is the primary method of electronic money movement throughout the United States.

  For more information, please visit [https://github.com/moov-io/ach](https://github.com/moov-io/ach)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
        AchFilesApi apiInstance = new AchFilesApi();
        String fileID = "fileID_example"; // String | File ID
        String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
        try {
            apiInstance.deleteACHFile(fileID, xRequestID);
        } catch (ApiException e) {
            System.err.println("Exception when calling AchFilesApi#deleteACHFile");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
        AchFilesApi apiInstance = new AchFilesApi();
        String xRequestID = "xRequestID_example"; // String | Optional Request ID allows application developer to trace requests through the system's logs
        try {
            Files result = apiInstance.getFiles(xRequestID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AchFilesApi#getFiles");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
        AchFilesApi apiInstance = new AchFilesApi();
        try {
            apiInstance.ping();
        } catch (ApiException e) {
            System.err.println("Exception when calling AchFilesApi#ping");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AchFilesApi;

import java.io.File;
import java.util.*;

public class AchFilesApiExample {

    public static void main(String[] args) {
        
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AchFilesApi* | [**addBatchToFile**](docs/AchFilesApi.md#addBatchToFile) | **POST** /files/{fileID}/batches | Append Batch to File
*AchFilesApi* | [**checkFile**](docs/AchFilesApi.md#checkFile) | **GET** /files/{fileID}/validate | Validate File
*AchFilesApi* | [**createFile**](docs/AchFilesApi.md#createFile) | **POST** /files/create | Create File
*AchFilesApi* | [**deleteACHFile**](docs/AchFilesApi.md#deleteACHFile) | **DELETE** /files/{fileID} | Delete File
*AchFilesApi* | [**deleteFileBatch**](docs/AchFilesApi.md#deleteFileBatch) | **DELETE** /files/{fileID}/batches/{batchID} | Delete Batch
*AchFilesApi* | [**flattenFile**](docs/AchFilesApi.md#flattenFile) | **POST** /files/{fileID}/flatten | Flatten Batches
*AchFilesApi* | [**getFileBatch**](docs/AchFilesApi.md#getFileBatch) | **GET** /files/{fileID}/batches/{batchID} | Get Batch
*AchFilesApi* | [**getFileBatches**](docs/AchFilesApi.md#getFileBatches) | **GET** /files/{fileID}/batches | Get Batches
*AchFilesApi* | [**getFileByID**](docs/AchFilesApi.md#getFileByID) | **GET** /files/{fileID} | Retrieve File
*AchFilesApi* | [**getFileContents**](docs/AchFilesApi.md#getFileContents) | **GET** /files/{fileID}/contents | Get File Contents
*AchFilesApi* | [**getFiles**](docs/AchFilesApi.md#getFiles) | **GET** /files | List Files
*AchFilesApi* | [**ping**](docs/AchFilesApi.md#ping) | **GET** /ping | Ping ACH service
*AchFilesApi* | [**segmentFile**](docs/AchFilesApi.md#segmentFile) | **POST** /files/{fileID}/segment | Segment File
*AchFilesApi* | [**validateFile**](docs/AchFilesApi.md#validateFile) | **POST** /files/{fileID}/validate | Validate File (Custom)

## Documentation for Models

 - [ADVBatchControl](docs/ADVBatchControl.md)
 - [ADVEntryDetail](docs/ADVEntryDetail.md)
 - [Addenda02](docs/Addenda02.md)
 - [Addenda05](docs/Addenda05.md)
 - [Addenda10](docs/Addenda10.md)
 - [Addenda11](docs/Addenda11.md)
 - [Addenda12](docs/Addenda12.md)
 - [Addenda13](docs/Addenda13.md)
 - [Addenda14](docs/Addenda14.md)
 - [Addenda15](docs/Addenda15.md)
 - [Addenda16](docs/Addenda16.md)
 - [Addenda17](docs/Addenda17.md)
 - [Addenda18](docs/Addenda18.md)
 - [Addenda98](docs/Addenda98.md)
 - [Addenda99](docs/Addenda99.md)
 - [Batch](docs/Batch.md)
 - [BatchControl](docs/BatchControl.md)
 - [BatchHeader](docs/BatchHeader.md)
 - [Batches](docs/Batches.md)
 - [CreateFile](docs/CreateFile.md)
 - [EntryDetail](docs/EntryDetail.md)
 - [Error](docs/Error.md)
 - [File](docs/File.md)
 - [FileControl](docs/FileControl.md)
 - [FileHeader](docs/FileHeader.md)
 - [FileID](docs/FileID.md)
 - [Files](docs/Files.md)
 - [IATBatch](docs/IATBatch.md)
 - [IATBatchHeader](docs/IATBatchHeader.md)
 - [IATEntryDetail](docs/IATEntryDetail.md)
 - [Offset](docs/Offset.md)
 - [SegmentedFiles](docs/SegmentedFiles.md)
 - [ValidateOpts](docs/ValidateOpts.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


