package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda14
 */
@JsonInclude(Include.NON_NULL)
public class Addenda14 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("RDFIName")
	private String rdFIName = null;

	@JsonProperty("RDFIIDNumberQualifier")
	private String rdFIIDNumberQualifier = null;

	@JsonProperty("RDFIIdentification")
	private String rdFIIdentification = null;

	@JsonProperty("RDFIBranchCountryCode")
	private String rdFIBranchCountryCode = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda14 id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Client-defined string used as a reference to this record.
	 *
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Addenda14 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 14 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda14 rdFIName(String rdFIName) {
		this.rdFIName = rdFIName;
		return this;
	}

	/**
	 * Name of the Receiver bank
	 *
	 * @return rdFIName required
	 **/
	public String getRdFIName() {
		return rdFIName;
	}

	public void setRdFIName(String rdFIName) {
		this.rdFIName = rdFIName;
	}

	public Addenda14 rdFIIDNumberQualifier(String rdFIIDNumberQualifier) {
		this.rdFIIDNumberQualifier = rdFIIDNumberQualifier;
		return this;
	}

	/**
	 * Receiving DFI Identification Number Qualifier. The 2-digit code that identifies the numbering scheme used in the Receiving DFI Identification Number
	 * field: '01' = National Clearing System | '02' = BIC Code | '03' = IBAN Code
	 *
	 * @return rdFIIDNumberQualifier required
	 **/
	public String getRdFIIDNumberQualifier() {
		return rdFIIDNumberQualifier;
	}

	public void setRdFIIDNumberQualifier(String rdFIIDNumberQualifier) {
		this.rdFIIDNumberQualifier = rdFIIDNumberQualifier;
	}

	public Addenda14 rdFIIdentification(String rdFIIdentification) {
		this.rdFIIdentification = rdFIIdentification;
		return this;
	}

	/**
	 * This field contains the bank identification number of the DFI at which the Receiver maintains his account.
	 *
	 * @return rdFIIdentification required
	 **/
	public String getRdFIIdentification() {
		return rdFIIdentification;
	}

	public void setRdFIIdentification(String rdFIIdentification) {
		this.rdFIIdentification = rdFIIdentification;
	}

	public Addenda14 rdFIBranchCountryCode(String rdFIBranchCountryCode) {
		this.rdFIBranchCountryCode = rdFIBranchCountryCode;
		return this;
	}

	/**
	 * Receiving DFI Branch Country Code USb" = United States ("b" indicates a blank space) This 3 position field contains a 2-character
	 * code as approved by the International Organization for Standardization (ISO) used to identify the country in which the branch of the bank that receives
	 * the entry is located. Values for other countries can be found on the International Organization for Standardization website: www.iso.org
	 *
	 * @return rdFIBranchCountryCode required
	 **/
	public String getRdFIBranchCountryCode() {
		return rdFIBranchCountryCode;
	}

	public void setRdFIBranchCountryCode(String rdFIBranchCountryCode) {
		this.rdFIBranchCountryCode = rdFIBranchCountryCode;
	}

	public Addenda14 entryDetailSequenceNumber(Integer entryDetailSequenceNumber) {
		this.entryDetailSequenceNumber = entryDetailSequenceNumber;
		return this;
	}

	/**
	 * EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record's trace number. This
	 * number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.
	 *
	 * @return entryDetailSequenceNumber required
	 **/
	public Integer getEntryDetailSequenceNumber() {
		return entryDetailSequenceNumber;
	}

	public void setEntryDetailSequenceNumber(Integer entryDetailSequenceNumber) {
		this.entryDetailSequenceNumber = entryDetailSequenceNumber;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Addenda14 addenda14 = (Addenda14) o;
		return Objects.equals(this.id, addenda14.id) &&
			Objects.equals(this.typeCode, addenda14.typeCode) &&
			Objects.equals(this.rdFIName, addenda14.rdFIName) &&
			Objects.equals(this.rdFIIDNumberQualifier, addenda14.rdFIIDNumberQualifier) &&
			Objects.equals(this.rdFIIdentification, addenda14.rdFIIdentification) &&
			Objects.equals(this.rdFIBranchCountryCode, addenda14.rdFIBranchCountryCode) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda14.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, rdFIName, rdFIIDNumberQualifier, rdFIIdentification, rdFIBranchCountryCode, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda14 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    rdFIName: ").append(toIndentedString(rdFIName)).append("\n");
		sb.append("    rdFIIDNumberQualifier: ").append(toIndentedString(rdFIIDNumberQualifier)).append("\n");
		sb.append("    rdFIIdentification: ").append(toIndentedString(rdFIIdentification)).append("\n");
		sb.append("    rdFIBranchCountryCode: ").append(toIndentedString(rdFIBranchCountryCode)).append("\n");
		sb.append("    entryDetailSequenceNumber: ").append(toIndentedString(entryDetailSequenceNumber)).append("\n");
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
