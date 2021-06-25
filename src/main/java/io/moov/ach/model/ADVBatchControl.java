package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ADVBatchControl
 */
@JsonInclude(Include.NON_NULL)
public class ADVBatchControl {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("serviceClassCode")
	private Integer serviceClassCode = null;

	@JsonProperty("entryAddendaCount")
	private Integer entryAddendaCount = null;

	@JsonProperty("entryHash")
	private Integer entryHash = null;

	@JsonProperty("totalDebit")
	private Integer totalDebit = null;

	@JsonProperty("totalCredit")
	private Integer totalCredit = null;

	@JsonProperty("achOperatorData")
	private String achOperatorData = null;

	@JsonProperty("ODFIIdentification")
	private String odFIIdentification = null;

	@JsonProperty("batchNumber")
	private Integer batchNumber = null;

	public ADVBatchControl id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Batch id
	 *
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ADVBatchControl serviceClassCode(Integer serviceClassCode) {
		this.serviceClassCode = serviceClassCode;
		return this;
	}

	/**
	 * Same as ServiceClassCode in BatchHeader record
	 *
	 * @return serviceClassCode required
	 **/
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
	 *
	 * @return entryAddendaCount required
	 **/
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
	 * Validate the Receiving DFI Identification in each Entry Detail Record is hashed to provide a check against inadvertent alteration of data contents due to
	 * hardware failure or program error. In this context the Entry Hash is the sum of the corresponding fields in the Entry Detail Records on the file.
	 *
	 * @return entryHash required
	 **/
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
	 *
	 * @return totalDebit required
	 **/
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
	 *
	 * @return totalCredit required
	 **/
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
	 *
	 * @return achOperatorData required
	 **/
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
	 *
	 * @return odFIIdentification required
	 **/
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
	 * BatchNumber is assigned in ascending sequence to each batch by the ODFI or its Sending Point in a given file of entries. Since the batch number in the
	 * Batch Header Record and the Batch Control Record is the same, the ascending sequence number should be assigned by batch and not by record.
	 *
	 * @return batchNumber required
	 **/
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
		return Objects.equals(this.id, adVBatchControl.id) &&
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
		return Objects.hash(id, serviceClassCode, entryAddendaCount, entryHash, totalDebit, totalCredit, achOperatorData, odFIIdentification, batchNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ADVBatchControl {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
