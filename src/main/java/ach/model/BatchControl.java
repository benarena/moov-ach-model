package ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchControl
 */
@JsonInclude(Include.NON_NULL)
public class BatchControl {

	@JsonProperty("ID")
	private String ID = null;

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

	@JsonProperty("companyIdentification")
	private String companyIdentification = null;

	@JsonProperty("messageAuthentication")
	private String messageAuthentication = null;

	@JsonProperty("ODFIIdentification")
	private String odFIIdentification = null;

	@JsonProperty("batchNumber")
	private Integer batchNumber = null;

	public BatchControl ID(String ID) {
		this.ID = ID;
		return this;
	}

	/**
	 * Batch ID
	 *
	 * @return ID
	 **/
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
	 *
	 * @return serviceClassCode required
	 **/
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
	 *
	 * @return entryAddendaCount required
	 **/
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

	public BatchControl totalDebit(Integer totalDebit) {
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

	public BatchControl totalCredit(Integer totalCredit) {
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

	public BatchControl companyIdentification(String companyIdentification) {
		this.companyIdentification = companyIdentification;
		return this;
	}

	/**
	 * Alphanumeric code used to identify an Originator. The Company Identification Field must be included on all prenotification records and on each entry
	 * initiated pursuant to such prenotification. The Company ID may begin with the ANSI one-digit Identification Code Designator (ICD), followed by the
	 * identification number. Possible ICDs are the IRS Employer Identification Number (EIN) "1", Data Universal Numbering Systems (DUNS)
	 * "3", and User Assigned Number "9".
	 *
	 * @return companyIdentification required
	 **/
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
	 * MAC is an eight character code derived from a special key used in conjunction with the DES algorithm. The purpose of the MAC is to validate the
	 * authenticity of ACH entries. The DES algorithm and key message standards must be in accordance with standards adopted by the American National Standards
	 * Institute. The remaining eleven characters of this field are blank.
	 *
	 * @return messageAuthentication
	 **/
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
	 *
	 * @return odFIIdentification required
	 **/
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
		return Objects.hash(ID,
		                    serviceClassCode,
		                    entryAddendaCount,
		                    entryHash,
		                    totalDebit,
		                    totalCredit,
		                    companyIdentification,
		                    messageAuthentication,
		                    odFIIdentification,
		                    batchNumber);
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
