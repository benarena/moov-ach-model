package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda16
 */
@JsonInclude(Include.NON_NULL)
public class Addenda16 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("receiverCityStateProvince")
	private String receiverCityStateProvince = null;

	@JsonProperty("receiverCountryPostalCode")
	private String receiverCountryPostalCode = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda16 id(String id) {
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

	public Addenda16 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 16 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda16 receiverCityStateProvince(String receiverCityStateProvince) {
		this.receiverCityStateProvince = receiverCityStateProvince;
		return this;
	}

	/**
	 * Receiver City &amp; State / Province Data elements City and State / Province  should be separated with an asterisk (*) as a delimiter and the field
	 * should end with a backslash (\\\\).
	 *
	 * @return receiverCityStateProvince required
	 **/
	public String getReceiverCityStateProvince() {
		return receiverCityStateProvince;
	}

	public void setReceiverCityStateProvince(String receiverCityStateProvince) {
		this.receiverCityStateProvince = receiverCityStateProvince;
	}

	public Addenda16 receiverCountryPostalCode(String receiverCountryPostalCode) {
		this.receiverCountryPostalCode = receiverCountryPostalCode;
		return this;
	}

	/**
	 * Receiver Country &amp; Postal Code Data elements must be separated by an asterisk (*) and must end with a backslash (\\\\).
	 *
	 * @return receiverCountryPostalCode required
	 **/
	public String getReceiverCountryPostalCode() {
		return receiverCountryPostalCode;
	}

	public void setReceiverCountryPostalCode(String receiverCountryPostalCode) {
		this.receiverCountryPostalCode = receiverCountryPostalCode;
	}

	public Addenda16 entryDetailSequenceNumber(Integer entryDetailSequenceNumber) {
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
		Addenda16 addenda16 = (Addenda16) o;
		return Objects.equals(this.id, addenda16.id) &&
			Objects.equals(this.typeCode, addenda16.typeCode) &&
			Objects.equals(this.receiverCityStateProvince, addenda16.receiverCityStateProvince) &&
			Objects.equals(this.receiverCountryPostalCode, addenda16.receiverCountryPostalCode) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda16.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, receiverCityStateProvince, receiverCountryPostalCode, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda16 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    receiverCityStateProvince: ").append(toIndentedString(receiverCityStateProvince)).append("\n");
		sb.append("    receiverCountryPostalCode: ").append(toIndentedString(receiverCountryPostalCode)).append("\n");
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
