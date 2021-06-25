package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda11
 */
@JsonInclude(Include.NON_NULL)
public class Addenda11 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("originatorName")
	private String originatorName = null;

	@JsonProperty("originatorStreetAddress")
	private String originatorStreetAddress = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda11 id(String id) {
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

	public Addenda11 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 11 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda11 originatorName(String originatorName) {
		this.originatorName = originatorName;
		return this;
	}

	/**
	 * Originator's name (your company name / name)
	 *
	 * @return originatorName required
	 **/
	public String getOriginatorName() {
		return originatorName;
	}

	public void setOriginatorName(String originatorName) {
		this.originatorName = originatorName;
	}

	public Addenda11 originatorStreetAddress(String originatorStreetAddress) {
		this.originatorStreetAddress = originatorStreetAddress;
		return this;
	}

	/**
	 * Originator's street address
	 *
	 * @return originatorStreetAddress required
	 **/
	public String getOriginatorStreetAddress() {
		return originatorStreetAddress;
	}

	public void setOriginatorStreetAddress(String originatorStreetAddress) {
		this.originatorStreetAddress = originatorStreetAddress;
	}

	public Addenda11 entryDetailSequenceNumber(int entryDetailSequenceNumber) {
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
		Addenda11 addenda11 = (Addenda11) o;
		return Objects.equals(this.id, addenda11.id) &&
			Objects.equals(this.typeCode, addenda11.typeCode) &&
			Objects.equals(this.originatorName, addenda11.originatorName) &&
			Objects.equals(this.originatorStreetAddress, addenda11.originatorStreetAddress) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda11.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, originatorName, originatorStreetAddress, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda11 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    originatorName: ").append(toIndentedString(originatorName)).append("\n");
		sb.append("    originatorStreetAddress: ").append(toIndentedString(originatorStreetAddress)).append("\n");
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
