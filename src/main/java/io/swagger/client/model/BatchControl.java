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
 * BatchControl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-23T19:59:31.531Z[GMT]")
public class BatchControl {
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

  @SerializedName("companyIdentification")
  private String companyIdentification = null;

  @SerializedName("messageAuthentication")
  private String messageAuthentication = null;

  @SerializedName("ODFIIdentification")
  private String odFIIdentification = null;

  @SerializedName("batchNumber")
  private Integer batchNumber = null;

  public BatchControl ID(String ID) {
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

  public BatchControl serviceClassCode(Integer serviceClassCode) {
    this.serviceClassCode = serviceClassCode;
    return this;
  }

   /**
   * Same as ServiceClassCode in BatchHeaderRecord
   * @return serviceClassCode
  **/
  @Schema(example = "220", required = true, description = "Same as ServiceClassCode in BatchHeaderRecord")
  public Integer getServiceClassCode() {
    return serviceClassCode;
  }

  public void setServiceClassCode(Integer serviceClassCode) {
    this.serviceClassCode = serviceClassCode;
  }

  public BatchControl entryAddendaCount(Integer entryAddendaCount) {
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

  public BatchControl entryHash(Integer entryHash) {
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

  public BatchControl totalDebit(Integer totalDebit) {
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

  public BatchControl totalCredit(Integer totalCredit) {
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

  public BatchControl companyIdentification(String companyIdentification) {
    this.companyIdentification = companyIdentification;
    return this;
  }

   /**
   * Alphanumeric code used to identify an Originator. The Company Identification Field must be included on all prenotification records and on each entry initiated pursuant to such prenotification. The Company ID may begin with the ANSI one-digit Identification Code Designator (ICD), followed by the identification number. Possible ICDs are the IRS Employer Identification Number (EIN) \&quot;1\&quot;, Data Universal Numbering Systems (DUNS) \&quot;3\&quot;, and User Assigned Number \&quot;9\&quot;. 
   * @return companyIdentification
  **/
  @Schema(example = "121042882", required = true, description = "Alphanumeric code used to identify an Originator. The Company Identification Field must be included on all prenotification records and on each entry initiated pursuant to such prenotification. The Company ID may begin with the ANSI one-digit Identification Code Designator (ICD), followed by the identification number. Possible ICDs are the IRS Employer Identification Number (EIN) \"1\", Data Universal Numbering Systems (DUNS) \"3\", and User Assigned Number \"9\". ")
  public String getCompanyIdentification() {
    return companyIdentification;
  }

  public void setCompanyIdentification(String companyIdentification) {
    this.companyIdentification = companyIdentification;
  }

  public BatchControl messageAuthentication(String messageAuthentication) {
    this.messageAuthentication = messageAuthentication;
    return this;
  }

   /**
   * MAC is an eight character code derived from a special key used in conjunction with the DES algorithm. The purpose of the MAC is to validate the authenticity of ACH entries. The DES algorithm and key message standards must be in accordance with standards adopted by the American National Standards Institute. The remaining eleven characters of this field are blank.
   * @return messageAuthentication
  **/
  @Schema(example = "3fe106cf", description = "MAC is an eight character code derived from a special key used in conjunction with the DES algorithm. The purpose of the MAC is to validate the authenticity of ACH entries. The DES algorithm and key message standards must be in accordance with standards adopted by the American National Standards Institute. The remaining eleven characters of this field are blank.")
  public String getMessageAuthentication() {
    return messageAuthentication;
  }

  public void setMessageAuthentication(String messageAuthentication) {
    this.messageAuthentication = messageAuthentication;
  }

  public BatchControl odFIIdentification(String odFIIdentification) {
    this.odFIIdentification = odFIIdentification;
    return this;
  }

   /**
   * The routing number is used to identify the DFI originating entries within a given branch.
   * @return odFIIdentification
  **/
  @Schema(example = "123456789", required = true, description = "The routing number is used to identify the DFI originating entries within a given branch.")
  public String getOdFIIdentification() {
    return odFIIdentification;
  }

  public void setOdFIIdentification(String odFIIdentification) {
    this.odFIIdentification = odFIIdentification;
  }

  public BatchControl batchNumber(Integer batchNumber) {
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
    BatchControl batchControl = (BatchControl) o;
    return Objects.equals(this.ID, batchControl.ID) &&
        Objects.equals(this.serviceClassCode, batchControl.serviceClassCode) &&
        Objects.equals(this.entryAddendaCount, batchControl.entryAddendaCount) &&
        Objects.equals(this.entryHash, batchControl.entryHash) &&
        Objects.equals(this.totalDebit, batchControl.totalDebit) &&
        Objects.equals(this.totalCredit, batchControl.totalCredit) &&
        Objects.equals(this.companyIdentification, batchControl.companyIdentification) &&
        Objects.equals(this.messageAuthentication, batchControl.messageAuthentication) &&
        Objects.equals(this.odFIIdentification, batchControl.odFIIdentification) &&
        Objects.equals(this.batchNumber, batchControl.batchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceClassCode, entryAddendaCount, entryHash, totalDebit, totalCredit, companyIdentification, messageAuthentication, odFIIdentification, batchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchControl {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceClassCode: ").append(toIndentedString(serviceClassCode)).append("\n");
    sb.append("    entryAddendaCount: ").append(toIndentedString(entryAddendaCount)).append("\n");
    sb.append("    entryHash: ").append(toIndentedString(entryHash)).append("\n");
    sb.append("    totalDebit: ").append(toIndentedString(totalDebit)).append("\n");
    sb.append("    totalCredit: ").append(toIndentedString(totalCredit)).append("\n");
    sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
    sb.append("    messageAuthentication: ").append(toIndentedString(messageAuthentication)).append("\n");
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
