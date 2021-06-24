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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ADVBatchControl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-23T19:59:31.531Z[GMT]")
public class ADVBatchControl {
  @SerializedName("ID")
  private String ID = null;

  @SerializedName("serviceClassCode")
  private Integer serviceClassCode = null;

  @SerializedName("entryAddendaCount")
  private Integer entryAddendaCount = null;

  @SerializedName("entryHash")
  private Integer entryHash = null;

  @SerializedName("totalDebit")
  private Integer totalDebit = null;

  @SerializedName("totalCredit")
  private Integer totalCredit = null;

  @SerializedName("achOperatorData")
  private String achOperatorData = null;

  @SerializedName("ODFIIdentification")
  private String odFIIdentification = null;

  @SerializedName("batchNumber")
  private Integer batchNumber = null;

  public ADVBatchControl ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Batch ID
   * @return ID
  **/
  @Schema(example = "62d8f0cd", description = "Batch ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ADVBatchControl serviceClassCode(Integer serviceClassCode) {
    this.serviceClassCode = serviceClassCode;
    return this;
  }

   /**
   * Same as ServiceClassCode in BatchHeader record
   * @return serviceClassCode
  **/
  @Schema(example = "220", required = true, description = "Same as ServiceClassCode in BatchHeader record")
  public Integer getServiceClassCode() {
    return serviceClassCode;
  }

  public void setServiceClassCode(Integer serviceClassCode) {
    this.serviceClassCode = serviceClassCode;
  }

  public ADVBatchControl entryAddendaCount(Integer entryAddendaCount) {
    this.entryAddendaCount = entryAddendaCount;
    return this;
  }

   /**
   * EntryAddendaCount is a tally of each Entry Detail Record and each Addenda Record processed, within either the batch or file as appropriate.
   * @return entryAddendaCount
  **/
  @Schema(example = "1", required = true, description = "EntryAddendaCount is a tally of each Entry Detail Record and each Addenda Record processed, within either the batch or file as appropriate.")
  public Integer getEntryAddendaCount() {
    return entryAddendaCount;
  }

  public void setEntryAddendaCount(Integer entryAddendaCount) {
    this.entryAddendaCount = entryAddendaCount;
  }

  public ADVBatchControl entryHash(Integer entryHash) {
    this.entryHash = entryHash;
    return this;
  }

   /**
   * Validate the Receiving DFI Identification in each Entry Detail Record is hashed to provide a check against inadvertent alteration of data contents due to hardware failure or program error. In this context the Entry Hash is the sum of the corresponding fields in the Entry Detail Records on the file. 
   * @return entryHash
  **/
  @Schema(example = "0", required = true, description = "Validate the Receiving DFI Identification in each Entry Detail Record is hashed to provide a check against inadvertent alteration of data contents due to hardware failure or program error. In this context the Entry Hash is the sum of the corresponding fields in the Entry Detail Records on the file. ")
  public Integer getEntryHash() {
    return entryHash;
  }

  public void setEntryHash(Integer entryHash) {
    this.entryHash = entryHash;
  }

  public ADVBatchControl totalDebit(Integer totalDebit) {
    this.totalDebit = totalDebit;
    return this;
  }

   /**
   * Contains accumulated Entry debit totals within the batch.
   * @return totalDebit
  **/
  @Schema(example = "100", required = true, description = "Contains accumulated Entry debit totals within the batch.")
  public Integer getTotalDebit() {
    return totalDebit;
  }

  public void setTotalDebit(Integer totalDebit) {
    this.totalDebit = totalDebit;
  }

  public ADVBatchControl totalCredit(Integer totalCredit) {
    this.totalCredit = totalCredit;
    return this;
  }

   /**
   * Contains accumulated Entry credit totals within the batch.
   * @return totalCredit
  **/
  @Schema(example = "100", required = true, description = "Contains accumulated Entry credit totals within the batch.")
  public Integer getTotalCredit() {
    return totalCredit;
  }

  public void setTotalCredit(Integer totalCredit) {
    this.totalCredit = totalCredit;
  }

  public ADVBatchControl achOperatorData(String achOperatorData) {
    this.achOperatorData = achOperatorData;
    return this;
  }

   /**
   * Alphanumeric code used to identify an ACH Operator
   * @return achOperatorData
  **/
  @Schema(example = "user", required = true, description = "Alphanumeric code used to identify an ACH Operator")
  public String getAchOperatorData() {
    return achOperatorData;
  }

  public void setAchOperatorData(String achOperatorData) {
    this.achOperatorData = achOperatorData;
  }

  public ADVBatchControl odFIIdentification(String odFIIdentification) {
    this.odFIIdentification = odFIIdentification;
    return this;
  }

   /**
   * The routing number is used to identify the DFI originating entries within a given branch.
   * @return odFIIdentification
  **/
  @Schema(example = "98765432", required = true, description = "The routing number is used to identify the DFI originating entries within a given branch.")
  public String getOdFIIdentification() {
    return odFIIdentification;
  }

  public void setOdFIIdentification(String odFIIdentification) {
    this.odFIIdentification = odFIIdentification;
  }

  public ADVBatchControl batchNumber(Integer batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

   /**
   * BatchNumber is assigned in ascending sequence to each batch by the ODFI or its Sending Point in a given file of entries. Since the batch number in the Batch Header Record and the Batch Control Record is the same, the ascending sequence number should be assigned by batch and not by record.
   * @return batchNumber
  **/
  @Schema(example = "0", required = true, description = "BatchNumber is assigned in ascending sequence to each batch by the ODFI or its Sending Point in a given file of entries. Since the batch number in the Batch Header Record and the Batch Control Record is the same, the ascending sequence number should be assigned by batch and not by record.")
  public Integer getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(Integer batchNumber) {
    this.batchNumber = batchNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ADVBatchControl adVBatchControl = (ADVBatchControl) o;
    return Objects.equals(this.ID, adVBatchControl.ID) &&
        Objects.equals(this.serviceClassCode, adVBatchControl.serviceClassCode) &&
        Objects.equals(this.entryAddendaCount, adVBatchControl.entryAddendaCount) &&
        Objects.equals(this.entryHash, adVBatchControl.entryHash) &&
        Objects.equals(this.totalDebit, adVBatchControl.totalDebit) &&
        Objects.equals(this.totalCredit, adVBatchControl.totalCredit) &&
        Objects.equals(this.achOperatorData, adVBatchControl.achOperatorData) &&
        Objects.equals(this.odFIIdentification, adVBatchControl.odFIIdentification) &&
        Objects.equals(this.batchNumber, adVBatchControl.batchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceClassCode, entryAddendaCount, entryHash, totalDebit, totalCredit, achOperatorData, odFIIdentification, batchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ADVBatchControl {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceClassCode: ").append(toIndentedString(serviceClassCode)).append("\n");
    sb.append("    entryAddendaCount: ").append(toIndentedString(entryAddendaCount)).append("\n");
    sb.append("    entryHash: ").append(toIndentedString(entryHash)).append("\n");
    sb.append("    totalDebit: ").append(toIndentedString(totalDebit)).append("\n");
    sb.append("    totalCredit: ").append(toIndentedString(totalCredit)).append("\n");
    sb.append("    achOperatorData: ").append(toIndentedString(achOperatorData)).append("\n");
    sb.append("    odFIIdentification: ").append(toIndentedString(odFIIdentification)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
