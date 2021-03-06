# moov-ach-model

This library provides a model/domain objects for ACH ([Automated Clearing House](https://en.wikipedia.org/wiki/Automated_Clearing_House)) files based on the [Moov ACH API](https://github.com/moov-io/ach). ACH is the primary method of electronic money movement throughout the United States.

## Requirements

Building the API client library requires:
1. Java 11+
2. Maven

## Dependencies

Then include the dependency in your project pom:
```xml
<dependency>
    <groupId>io.github.benarena</groupId>
    <artifactId>moov-ach-model</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Jackson Java 8 Time
Note that this library requires the [Jackson Java8 Time Module](https://github.com/FasterXML/jackson-modules-java8/tree/master/datetime)
in order to parse and write dates and times.

In short, be sure to include the following dependency:
```xml        
<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
    <version>${jackson.version}</version>
</dependency>
```

And register the `JavaTimeModule` with your `ObjectMapper`:
```java
ObjectMapper mapper = JsonMapper.builder()
    .addModule(new JavaTimeModule()) // to add just this module
//	.findAndAddModules() // to add all imported modules
    .build();
```

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
 - [EntryDetail](docs/EntryDetail.md)
 - [File](docs/File.md)
 - [FileControl](docs/FileControl.md)
 - [FileHeader](docs/FileHeader.md)
 - [IATBatch](docs/IATBatch.md)
 - [IATBatchHeader](docs/IATBatchHeader.md)
 - [IATEntryDetail](docs/IATEntryDetail.md)
 - [Offset](docs/Offset.md)
 - [ValidateOpts](docs/ValidateOpts.md)

## Publishing

## History

Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) from [moov/ach 1.9.2](https://github.com/moov-io/ach) then slimmed down and enhanced to improve data typing, enumerated values, etc.

This can be reproduced by executing the following:
```
curl --location --request POST 'https://generator3.swagger.io/api/generate' \
--header 'content-type: application/json' \
--data-raw '{
  "specURL" : "https://raw.githubusercontent.com/moov-io/ach/master/openapi.yaml",
  "lang" : "java",
  "type" : "CLIENT",
  "codegenVersion" : "V3"
}'
```
