package ach.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * BatchHeader
 */
@JsonInclude(Include.NON_NULL)
public class BatchHeader {

	@JsonProperty("ID")
	private String ID = null;

	@JsonProperty("serviceClassCode")
	private Integer serviceClassCode = null;

	@JsonProperty("companyName")
	private String companyName = null;

	@JsonProperty("companyDiscretionaryData")
	private String companyDiscretionaryData = null;

	@JsonProperty("companyIdentification")
	private String companyIdentification = null;

	@JsonProperty("standardEntryClassCode")
	private String standardEntryClassCode = null;

	@JsonProperty("companyEntryDescription")
	private String companyEntryDescription = null;

	@JsonProperty("companyDescriptiveDate")
	private String companyDescriptiveDate = null;

	@JsonProperty("effectiveEntryDate")
	@JsonFormat(shape = Shape.STRING, pattern = "yyMMdd")
	private LocalDate effectiveEntryDate = null;

	@JsonProperty("originatorStatusCode")
	private Integer originatorStatusCode = null;

	@JsonProperty("ODFIIdentification")
	private String odFIIdentification = null;

	@JsonProperty("batchNumber")
	private Integer batchNumber = null;

	public BatchHeader ID(String ID) {
		this.ID = ID;
		return this;
	}

	/**
	 * A client-defined ID used as a reference to this batch
	 *
	 * @return ID
	 **/
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public BatchHeader serviceClassCode(Integer serviceClassCode) {
		this.serviceClassCode = serviceClassCode;
		return this;
	}

	/**
	 * Service Class Code - Mixed Debits and Credits '200', ACH Credits Only '220', or ACH Debits Only '225'
	 *
	 * @return serviceClassCode required
	 **/
	public Integer getServiceClassCode() {
		return serviceClassCode;
	}

	public void setServiceClassCode(Integer serviceClassCode) {
		this.serviceClassCode = serviceClassCode;
	}

	public BatchHeader companyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	/**
	 * Company originating the entries in the batch
	 *
	 * @return companyName required
	 **/
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BatchHeader companyDiscretionaryData(String companyDiscretionaryData) {
		this.companyDiscretionaryData = companyDiscretionaryData;
		return this;
	}

	/**
	 * The 9 digit FEIN number (proceeded by a predetermined alpha or numeric character) of the entity in the company name field
	 *
	 * @return companyDiscretionaryData
	 **/
	public String getCompanyDiscretionaryData() {
		return companyDiscretionaryData;
	}

	public void setCompanyDiscretionaryData(String companyDiscretionaryData) {
		this.companyDiscretionaryData = companyDiscretionaryData;
	}

	public BatchHeader companyIdentification(String companyIdentification) {
		this.companyIdentification = companyIdentification;
		return this;
	}

	/**
	 * Alphanumeric code used to identify an Originator. The Company Identification Field must be included on all prenotification records and on each entry
	 * initiated pursuant to such prenotification. The Company ID may begin with the ANSI one-digit Identification Code Designator (ICD), followed by the
	 * identification number. Possible ICDs are the IRS Employer Identification Number (EIN) "1", Data Universal Numbering Systems (DUNS)
	 * "3", or User Assigned Number "9".
	 *
	 * @return companyIdentification required
	 **/
	public String getCompanyIdentification() {
		return companyIdentification;
	}

	public void setCompanyIdentification(String companyIdentification) {
		this.companyIdentification = companyIdentification;
	}

	public BatchHeader standardEntryClassCode(String standardEntryClassCode) {
		this.standardEntryClassCode = standardEntryClassCode;
		return this;
	}

	/**
	 * Identifies the payment type (product) found within an ACH batch using a 3-character code.
	 *
	 * @return standardEntryClassCode required
	 **/
	public String getStandardEntryClassCode() {
		return standardEntryClassCode;
	}

	public void setStandardEntryClassCode(String standardEntryClassCode) {
		this.standardEntryClassCode = standardEntryClassCode;
	}

	public BatchHeader companyEntryDescription(String companyEntryDescription) {
		this.companyEntryDescription = companyEntryDescription;
		return this;
	}

	/**
	 * A description of the entries contained in the batch. The Originator establishes the value of this field to provide a description of the purpose of the
	 * entry to be displayed back to the receiver. For example, "GAS BILL," "REG. SALARY," "INS. PREM,", "SOC.
	 * SEC.," "DTC," "TRADE PAY," "PURCHASE," etc. This field must contain the word "REVERSAL" (left
	 * justified) when the batch contains reversing entries. This field must contain the word "RECLAIM" (left justified) when the batch contains
	 * reclamation entries. This field must contain the word "NONSETTLED" (left justified) when the batch contains entries which could not settle.
	 *
	 * @return companyEntryDescription
	 **/
	public String getCompanyEntryDescription() {
		return companyEntryDescription;
	}

	public void setCompanyEntryDescription(String companyEntryDescription) {
		this.companyEntryDescription = companyEntryDescription;
	}

	public BatchHeader companyDescriptiveDate(String companyDescriptiveDate) {
		this.companyDescriptiveDate = companyDescriptiveDate;
		return this;
	}

	/**
	 * The Originator establishes this field as the date it would like to see displayed to the receiver for descriptive purposes. This field is never used to
	 * control timing of any computer or manual operation. It is solely for descriptive purposes. The RDFI should not assume any specific format.
	 *
	 * @return companyDescriptiveDate
	 **/
	public String getCompanyDescriptiveDate() {
		return companyDescriptiveDate;
	}

	public void setCompanyDescriptiveDate(String companyDescriptiveDate) {
		this.companyDescriptiveDate = companyDescriptiveDate;
	}

	public BatchHeader effectiveEntryDate(LocalDate effectiveEntryDate) {
		this.effectiveEntryDate = effectiveEntryDate;
		return this;
	}

	/**
	 * Date on which the entries are to settle. (Format YYMMDD - Y=Year, M=Month, D=Day)
	 *
	 * @return effectiveEntryDate
	 **/
	public LocalDate getEffectiveEntryDate() {
		return effectiveEntryDate;
	}

	public void setEffectiveEntryDate(LocalDate effectiveEntryDate) {
		this.effectiveEntryDate = effectiveEntryDate;
	}

	public BatchHeader originatorStatusCode(Integer originatorStatusCode) {
		this.originatorStatusCode = originatorStatusCode;
		return this;
	}

	/**
	 * ODFI initiating the Entry. | 0 - ADV File prepared by an ACH Operator. | 1 - This code identifies the Originator as a depository financial institution. |
	 * 2 - This code identifies the Originator as a Federal Government entity or agency.
	 *
	 * @return originatorStatusCode
	 **/
	public Integer getOriginatorStatusCode() {
		return originatorStatusCode;
	}

	public void setOriginatorStatusCode(Integer originatorStatusCode) {
		this.originatorStatusCode = originatorStatusCode;
	}

	public BatchHeader odFIIdentification(String odFIIdentification) {
		this.odFIIdentification = odFIIdentification;
		return this;
	}

	/**
	 * First 8 digits of the originating DFI transit routing number
	 *
	 * @return odFIIdentification required
	 **/
	public String getOdFIIdentification() {
		return odFIIdentification;
	}

	public void setOdFIIdentification(String odFIIdentification) {
		this.odFIIdentification = odFIIdentification;
	}

	public BatchHeader batchNumber(Integer batchNumber) {
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
		BatchHeader batchHeader = (BatchHeader) o;
		return Objects.equals(this.ID, batchHeader.ID) &&
			Objects.equals(this.serviceClassCode, batchHeader.serviceClassCode) &&
			Objects.equals(this.companyName, batchHeader.companyName) &&
			Objects.equals(this.companyDiscretionaryData, batchHeader.companyDiscretionaryData) &&
			Objects.equals(this.companyIdentification, batchHeader.companyIdentification) &&
			Objects.equals(this.standardEntryClassCode, batchHeader.standardEntryClassCode) &&
			Objects.equals(this.companyEntryDescription, batchHeader.companyEntryDescription) &&
			Objects.equals(this.companyDescriptiveDate, batchHeader.companyDescriptiveDate) &&
			Objects.equals(this.effectiveEntryDate, batchHeader.effectiveEntryDate) &&
			Objects.equals(this.originatorStatusCode, batchHeader.originatorStatusCode) &&
			Objects.equals(this.odFIIdentification, batchHeader.odFIIdentification) &&
			Objects.equals(this.batchNumber, batchHeader.batchNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID,
		                    serviceClassCode,
		                    companyName,
		                    companyDiscretionaryData,
		                    companyIdentification,
		                    standardEntryClassCode,
		                    companyEntryDescription,
		                    companyDescriptiveDate,
		                    effectiveEntryDate,
		                    originatorStatusCode,
		                    odFIIdentification,
		                    batchNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BatchHeader {\n");

		sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
		sb.append("    serviceClassCode: ").append(toIndentedString(serviceClassCode)).append("\n");
		sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("    companyDiscretionaryData: ").append(toIndentedString(companyDiscretionaryData)).append("\n");
		sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
		sb.append("    standardEntryClassCode: ").append(toIndentedString(standardEntryClassCode)).append("\n");
		sb.append("    companyEntryDescription: ").append(toIndentedString(companyEntryDescription)).append("\n");
		sb.append("    companyDescriptiveDate: ").append(toIndentedString(companyDescriptiveDate)).append("\n");
		sb.append("    effectiveEntryDate: ").append(toIndentedString(effectiveEntryDate)).append("\n");
		sb.append("    originatorStatusCode: ").append(toIndentedString(originatorStatusCode)).append("\n");
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
