package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda18
 */
@JsonInclude(Include.NON_NULL)
public class Addenda18 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("foreignCorrespondentBankName")
	private String foreignCorrespondentBankName = null;

	@JsonProperty("foreignCorrespondentBankIDNumberQualifier")
	private String foreignCorrespondentBankIDNumberQualifier = null;

	@JsonProperty("foreignCorrespondentBankIDNumber")
	private String foreignCorrespondentBankIDNumber = null;

	@JsonProperty("foreignCorrespondentBankBranchCountryCode")
	private String foreignCorrespondentBankBranchCountryCode = null;

	@JsonProperty("sequenceNumber")
	private Integer sequenceNumber = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda18 id(String id) {
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

	public Addenda18 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 18 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda18 foreignCorrespondentBankName(String foreignCorrespondentBankName) {
		this.foreignCorrespondentBankName = foreignCorrespondentBankName;
		return this;
	}

	/**
	 * Name of the Foreign Correspondent Bank
	 *
	 * @return foreignCorrespondentBankName required
	 **/
	public String getForeignCorrespondentBankName() {
		return foreignCorrespondentBankName;
	}

	public void setForeignCorrespondentBankName(String foreignCorrespondentBankName) {
		this.foreignCorrespondentBankName = foreignCorrespondentBankName;
	}

	public Addenda18 foreignCorrespondentBankIDNumberQualifier(String foreignCorrespondentBankIDNumberQualifier) {
		this.foreignCorrespondentBankIDNumberQualifier = foreignCorrespondentBankIDNumberQualifier;
		return this;
	}

	/**
	 * Foreign Correspondent Bank Identification Number Qualifier contains a 2-digit code that identifies the numbering scheme used in the Foreign Correspondent
	 * Bank Identification Number field. Code values for this field are:   "01" = National Clearing System |   "02" = BIC Code
	 * |   "03" = IBAN Code
	 *
	 * @return foreignCorrespondentBankIDNumberQualifier required
	 **/
	public String getForeignCorrespondentBankIDNumberQualifier() {
		return foreignCorrespondentBankIDNumberQualifier;
	}

	public void setForeignCorrespondentBankIDNumberQualifier(String foreignCorrespondentBankIDNumberQualifier) {
		this.foreignCorrespondentBankIDNumberQualifier = foreignCorrespondentBankIDNumberQualifier;
	}

	public Addenda18 foreignCorrespondentBankIDNumber(String foreignCorrespondentBankIDNumber) {
		this.foreignCorrespondentBankIDNumber = foreignCorrespondentBankIDNumber;
		return this;
	}

	/**
	 * Foreign Correspondent Bank Identification Number contains the bank ID number of the Foreign Correspondent Bank
	 *
	 * @return foreignCorrespondentBankIDNumber required
	 **/
	public String getForeignCorrespondentBankIDNumber() {
		return foreignCorrespondentBankIDNumber;
	}

	public void setForeignCorrespondentBankIDNumber(String foreignCorrespondentBankIDNumber) {
		this.foreignCorrespondentBankIDNumber = foreignCorrespondentBankIDNumber;
	}

	public Addenda18 foreignCorrespondentBankBranchCountryCode(String foreignCorrespondentBankBranchCountryCode) {
		this.foreignCorrespondentBankBranchCountryCode = foreignCorrespondentBankBranchCountryCode;
		return this;
	}

	/**
	 * Foreign Correspondent Bank Branch Country Code contains the two-character code, as approved by the International Organization for Standardization (ISO),
	 * to identify the country in which the branch of the Foreign Correspondent Bank is located. Values can be found on the International Organization for
	 * Standardization website: www.iso.org
	 *
	 * @return foreignCorrespondentBankBranchCountryCode required
	 **/
	public String getForeignCorrespondentBankBranchCountryCode() {
		return foreignCorrespondentBankBranchCountryCode;
	}

	public void setForeignCorrespondentBankBranchCountryCode(String foreignCorrespondentBankBranchCountryCode) {
		this.foreignCorrespondentBankBranchCountryCode = foreignCorrespondentBankBranchCountryCode;
	}

	public Addenda18 sequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	/**
	 * SequenceNumber is consecutively assigned to each Addenda17 Record following an Entry Detail Record. The first Addenda17 sequence number must always be a
	 * 1.
	 *
	 * @return sequenceNumber required
	 **/
	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Addenda18 entryDetailSequenceNumber(Integer entryDetailSequenceNumber) {
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
		Addenda18 addenda18 = (Addenda18) o;
		return Objects.equals(this.id, addenda18.id) &&
			Objects.equals(this.typeCode, addenda18.typeCode) &&
			Objects.equals(this.foreignCorrespondentBankName, addenda18.foreignCorrespondentBankName) &&
			Objects.equals(this.foreignCorrespondentBankIDNumberQualifier, addenda18.foreignCorrespondentBankIDNumberQualifier) &&
			Objects.equals(this.foreignCorrespondentBankIDNumber, addenda18.foreignCorrespondentBankIDNumber) &&
			Objects.equals(this.foreignCorrespondentBankBranchCountryCode, addenda18.foreignCorrespondentBankBranchCountryCode) &&
			Objects.equals(this.sequenceNumber, addenda18.sequenceNumber) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda18.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
		                    typeCode,
		                    foreignCorrespondentBankName,
		                    foreignCorrespondentBankIDNumberQualifier,
		                    foreignCorrespondentBankIDNumber,
		                    foreignCorrespondentBankBranchCountryCode,
		                    sequenceNumber,
		                    entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda18 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    foreignCorrespondentBankName: ").append(toIndentedString(foreignCorrespondentBankName)).append("\n");
		sb.append("    foreignCorrespondentBankIDNumberQualifier: ").append(toIndentedString(foreignCorrespondentBankIDNumberQualifier)).append("\n");
		sb.append("    foreignCorrespondentBankIDNumber: ").append(toIndentedString(foreignCorrespondentBankIDNumber)).append("\n");
		sb.append("    foreignCorrespondentBankBranchCountryCode: ").append(toIndentedString(foreignCorrespondentBankBranchCountryCode)).append("\n");
		sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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
