package ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda13
 */
@JsonInclude(Include.NON_NULL)
public class Addenda13 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("ODFIName")
	private String odFIName = null;

	@JsonProperty("ODFIIDNumberQualifier")
	private String odFIIDNumberQualifier = null;

	@JsonProperty("ODFIBranchCountryCode")
	private String odFIBranchCountryCode = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda13 id(String id) {
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

	public Addenda13 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 13 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda13 odFIName(String odFIName) {
		this.odFIName = odFIName;
		return this;
	}

	/**
	 * Originating DFI Name For Outbound IAT Entries, this field must contain the name of the U.S. ODFI. For Inbound IATs: Name of the foreign bank providing
	 * funding for the payment transaction
	 *
	 * @return odFIName required
	 **/
	public String getOdFIName() {
		return odFIName;
	}

	public void setOdFIName(String odFIName) {
		this.odFIName = odFIName;
	}

	public Addenda13 odFIIDNumberQualifier(String odFIIDNumberQualifier) {
		this.odFIIDNumberQualifier = odFIIDNumberQualifier;
		return this;
	}

	/**
	 * Originating DFI Identification Number Qualifier. For Inbound IATs: The 2-digit code that identifies the numbering scheme used in the Foreign DFI
	 * Identification Number field: '01' = National Clearing System | '02' = BIC Code | '03' = IBAN Code
	 *
	 * @return odFIIDNumberQualifier required
	 **/
	public String getOdFIIDNumberQualifier() {
		return odFIIDNumberQualifier;
	}

	public void setOdFIIDNumberQualifier(String odFIIDNumberQualifier) {
		this.odFIIDNumberQualifier = odFIIDNumberQualifier;
	}

	public Addenda13 odFIBranchCountryCode(String odFIBranchCountryCode) {
		this.odFIBranchCountryCode = odFIBranchCountryCode;
		return this;
	}

	/**
	 * Originating DFI Branch Country Code: USb = United States //("b" indicates a blank space) For Inbound IATs: This 3 position field
	 * contains a 2-character code as approved by the International Organization for Standardization (ISO) used to identify the country in which the branch of
	 * the bank that originated the entry is located. Values for other countries can be found on the International Organization for Standardization website:
	 * www.iso.org.
	 *
	 * @return odFIBranchCountryCode required
	 **/
	public String getOdFIBranchCountryCode() {
		return odFIBranchCountryCode;
	}

	public void setOdFIBranchCountryCode(String odFIBranchCountryCode) {
		this.odFIBranchCountryCode = odFIBranchCountryCode;
	}

	public Addenda13 entryDetailSequenceNumber(int entryDetailSequenceNumber) {
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
		Addenda13 addenda13 = (Addenda13) o;
		return Objects.equals(this.id, addenda13.id) &&
			Objects.equals(this.typeCode, addenda13.typeCode) &&
			Objects.equals(this.odFIName, addenda13.odFIName) &&
			Objects.equals(this.odFIIDNumberQualifier, addenda13.odFIIDNumberQualifier) &&
			Objects.equals(this.odFIBranchCountryCode, addenda13.odFIBranchCountryCode) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda13.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, odFIName, odFIIDNumberQualifier, odFIBranchCountryCode, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda13 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    odFIName: ").append(toIndentedString(odFIName)).append("\n");
		sb.append("    odFIIDNumberQualifier: ").append(toIndentedString(odFIIDNumberQualifier)).append("\n");
		sb.append("    odFIBranchCountryCode: ").append(toIndentedString(odFIBranchCountryCode)).append("\n");
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
