/*
 * ACH API
 * Moov ACH ([Automated Clearing House](https://en.wikipedia.org/wiki/Automated_Clearing_House)) implements an HTTP API for creating, parsing, and validating ACH files. ACH is the primary method of electronic money movement throughout the United States.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Batch;
import io.swagger.client.model.Batches;
import io.swagger.client.model.CreateFile;
import io.swagger.client.model.Error;
import java.io.File;
import io.swagger.client.model.FileID;
import io.swagger.client.model.Files;
import io.swagger.client.model.SegmentedFiles;
import io.swagger.client.model.ValidateOpts;
import io.swagger.client.model.ValidateOptspropertiesbypassDestinationValidation;
import io.swagger.client.model.ValidateOptspropertiesbypassOriginValidation;
import io.swagger.client.model.ValidateOptspropertiesrequireABAOrigin;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AchFilesApi
 */
@Ignore
public class AchFilesApiTest {

    private final AchFilesApi api = new AchFilesApi();

    /**
     * Append Batch to File
     *
     * Append a Batch record to the specified File.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBatchToFileTest() throws ApiException {
        Batch body = null;
        String fileID = null;
        String xRequestID = null;
        String xIdempotencyKey = null;
        api.addBatchToFile(body, fileID, xRequestID, xIdempotencyKey);

        // TODO: test validations
    }
    /**
     * Validate File
     *
     * Validates the existing File. You need only supply the unique File identifier that was returned upon creation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkFileTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        Error response = api.checkFile(fileID, xRequestID);

        // TODO: test validations
    }
    /**
     * Create File
     *
     * Create a new File object from either the plaintext or JSON representation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFileTest() throws ApiException {
        String body = null;
        String xRequestID = null;
        String xIdempotencyKey = null;
        ValidateOptspropertiesrequireABAOrigin requireABAOrigin = null;
        ValidateOptspropertiesbypassOriginValidation bypassOrigin = null;
        ValidateOptspropertiesbypassDestinationValidation bypassDestination = null;
        FileID response = api.createFile(body, xRequestID, xIdempotencyKey, requireABAOrigin, bypassOrigin, bypassDestination);

        // TODO: test validations
    }
    /**
     * Delete File
     *
     * Permanently deletes a File and associated Batches. It cannot be undone.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteACHFileTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        api.deleteACHFile(fileID, xRequestID);

        // TODO: test validations
    }
    /**
     * Delete Batch
     *
     * Delete a Batch from a File.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileBatchTest() throws ApiException {
        String fileID = null;
        String batchID = null;
        String xRequestID = null;
        api.deleteFileBatch(fileID, batchID, xRequestID);

        // TODO: test validations
    }
    /**
     * Flatten Batches
     *
     * Consolidate Batches and Entries into the minimum number of Batches needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void flattenFileTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        String xIdempotencyKey = null;
        FileID response = api.flattenFile(fileID, xRequestID, xIdempotencyKey);

        // TODO: test validations
    }
    /**
     * Get Batch
     *
     * Get a specific Batch on a File.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileBatchTest() throws ApiException {
        String fileID = null;
        String batchID = null;
        String xRequestID = null;
        Batch response = api.getFileBatch(fileID, batchID, xRequestID);

        // TODO: test validations
    }
    /**
     * Get Batches
     *
     * Get the Batches on a File.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileBatchesTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        Batches response = api.getFileBatches(fileID, xRequestID);

        // TODO: test validations
    }
    /**
     * Retrieve File
     *
     * Get the details of an existing File using the unique File identifier that was returned upon creation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileByIDTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        File response = api.getFileByID(fileID, xRequestID);

        // TODO: test validations
    }
    /**
     * Get File Contents
     *
     * Assembles the existing File (batches and controls) records, computes sequence numbers and totals. Returns plaintext file. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileContentsTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        String response = api.getFileContents(fileID, xRequestID);

        // TODO: test validations
    }
    /**
     * List Files
     *
     * List all ACH Files created with the ACH service. These Files are not persisted through multiple runs of the service.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesTest() throws ApiException {
        String xRequestID = null;
        Files response = api.getFiles(xRequestID);

        // TODO: test validations
    }
    /**
     * Ping ACH service
     *
     * Check if the ACH service is running.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pingTest() throws ApiException {
        api.ping();

        // TODO: test validations
    }
    /**
     * Segment File
     *
     * Split one File into two. One with only debits and one with only credits.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void segmentFileTest() throws ApiException {
        String fileID = null;
        String xRequestID = null;
        String xIdempotencyKey = null;
        SegmentedFiles response = api.segmentFile(fileID, xRequestID, xIdempotencyKey);

        // TODO: test validations
    }
    /**
     * Validate File (Custom)
     *
     * Validates the existing File. You need only supply the unique File identifier that was returned upon creation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateFileTest() throws ApiException {
        String fileID = null;
        ValidateOpts body = null;
        String xRequestID = null;
        Error response = api.validateFile(fileID, body, xRequestID);

        // TODO: test validations
    }
}
