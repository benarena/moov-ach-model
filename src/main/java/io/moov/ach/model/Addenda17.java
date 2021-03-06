package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda17
 */
@JsonInclude(Include.NON_NULL)
public class Addenda17 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("paymentRelatedInformation")
	private String paymentRelatedInformation = null;

	@JsonProperty("sequenceNumber")
	private Integer sequenceNumber = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda17 id(String id) {
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

	public Addenda17 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 17 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda17 paymentRelatedInformation(String paymentRelatedInformation) {
		this.paymentRelatedInformation = paymentRelatedInformation;
		return this;
	}

	/**
	 * Additional information related to the payment
	 *
	 * @return paymentRelatedInformation required
	 **/
	public String getPaymentRelatedInformation() {
		return paymentRelatedInformation;
	}

	public void setPaymentRelatedInformation(String paymentRelatedInformation) {
		this.paymentRelatedInformation = paymentRelatedInformation;
	}

	public Addenda17 sequenceNumber(Integer sequenceNumber) {
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

	public Addenda17 entryDetailSequenceNumber(Integer entryDetailSequenceNumber) {
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
		Addenda17 addenda17 = (Addenda17) o;
		return Objects.equals(this.id, addenda17.id) &&
			Objects.equals(this.typeCode, addenda17.typeCode) &&
			Objects.equals(this.paymentRelatedInformation, addenda17.paymentRelatedInformation) &&
			Objects.equals(this.sequenceNumber, addenda17.sequenceNumber) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda17.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, paymentRelatedInformation, sequenceNumber, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda17 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    paymentRelatedInformation: ").append(toIndentedString(paymentRelatedInformation)).append("\n");
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
