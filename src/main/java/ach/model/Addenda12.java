package ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda12
 */
@JsonInclude(Include.NON_NULL)
public class Addenda12 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("originatorCityStateProvince")
	private String originatorCityStateProvince = null;

	@JsonProperty("originatorCountryPostalCode")
	private String originatorCountryPostalCode = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda12 id(String id) {
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

	public Addenda12 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 12 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda12 originatorCityStateProvince(String originatorCityStateProvince) {
		this.originatorCityStateProvince = originatorCityStateProvince;
		return this;
	}

	/**
	 * Originator City &amp; State / Province Data elements City and State / Province  should be separated with an asterisk (*) as a delimiter and the field
	 * should end with a backslash (\\\\).
	 *
	 * @return originatorCityStateProvince required
	 **/
	public String getOriginatorCityStateProvince() {
		return originatorCityStateProvince;
	}

	public void setOriginatorCityStateProvince(String originatorCityStateProvince) {
		this.originatorCityStateProvince = originatorCityStateProvince;
	}

	public Addenda12 originatorCountryPostalCode(String originatorCountryPostalCode) {
		this.originatorCountryPostalCode = originatorCountryPostalCode;
		return this;
	}

	/**
	 * Originator Country &amp; Postal Code Data elements must be separated by an asterisk (*) and must end with a backslash (\\\\).
	 *
	 * @return originatorCountryPostalCode required
	 **/
	public String getOriginatorCountryPostalCode() {
		return originatorCountryPostalCode;
	}

	public void setOriginatorCountryPostalCode(String originatorCountryPostalCode) {
		this.originatorCountryPostalCode = originatorCountryPostalCode;
	}

	public Addenda12 entryDetailSequenceNumber(int entryDetailSequenceNumber) {
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
		Addenda12 addenda12 = (Addenda12) o;
		return Objects.equals(this.id, addenda12.id) &&
			Objects.equals(this.typeCode, addenda12.typeCode) &&
			Objects.equals(this.originatorCityStateProvince, addenda12.originatorCityStateProvince) &&
			Objects.equals(this.originatorCountryPostalCode, addenda12.originatorCountryPostalCode) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda12.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, originatorCityStateProvince, originatorCountryPostalCode, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda12 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    originatorCityStateProvince: ").append(toIndentedString(originatorCityStateProvince)).append("\n");
		sb.append("    originatorCountryPostalCode: ").append(toIndentedString(originatorCountryPostalCode)).append("\n");
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
