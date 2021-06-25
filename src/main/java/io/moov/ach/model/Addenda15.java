package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda15
 */
@JsonInclude(Include.NON_NULL)
public class Addenda15 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("receiverIDNumber")
	private String receiverIDNumber = null;

	@JsonProperty("receiverStreetAddress")
	private String receiverStreetAddress = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda15 id(String id) {
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

	public Addenda15 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 15 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda15 receiverIDNumber(String receiverIDNumber) {
		this.receiverIDNumber = receiverIDNumber;
		return this;
	}

	/**
	 * Receiver Identification Number contains the accounting number by which the Originator is known to the Receiver for descriptive purposes. NACHA Rules
	 * recommend but do not require the RDFI to print the contents of this field on the receiver's statement.
	 *
	 * @return receiverIDNumber
	 **/
	public String getReceiverIDNumber() {
		return receiverIDNumber;
	}

	public void setReceiverIDNumber(String receiverIDNumber) {
		this.receiverIDNumber = receiverIDNumber;
	}

	public Addenda15 receiverStreetAddress(String receiverStreetAddress) {
		this.receiverStreetAddress = receiverStreetAddress;
		return this;
	}

	/**
	 * Receiver's physical address
	 *
	 * @return receiverStreetAddress required
	 **/
	public String getReceiverStreetAddress() {
		return receiverStreetAddress;
	}

	public void setReceiverStreetAddress(String receiverStreetAddress) {
		this.receiverStreetAddress = receiverStreetAddress;
	}

	public Addenda15 entryDetailSequenceNumber(Integer entryDetailSequenceNumber) {
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
		Addenda15 addenda15 = (Addenda15) o;
		return Objects.equals(this.id, addenda15.id) &&
			Objects.equals(this.typeCode, addenda15.typeCode) &&
			Objects.equals(this.receiverIDNumber, addenda15.receiverIDNumber) &&
			Objects.equals(this.receiverStreetAddress, addenda15.receiverStreetAddress) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda15.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, receiverIDNumber, receiverStreetAddress, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda15 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    receiverIDNumber: ").append(toIndentedString(receiverIDNumber)).append("\n");
		sb.append("    receiverStreetAddress: ").append(toIndentedString(receiverStreetAddress)).append("\n");
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
