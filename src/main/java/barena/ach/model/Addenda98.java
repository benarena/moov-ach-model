package barena.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda98
 */
@JsonInclude(Include.NON_NULL)
public class Addenda98 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("changeCode")
	private String changeCode = null;

	@JsonProperty("originalTrace")
	private String originalTrace = null;

	@JsonProperty("originalDFI")
	private String originalDFI = null;

	@JsonProperty("correctedData")
	private String correctedData = null;

	@JsonProperty("traceNumber")
	private String traceNumber = null;

	public Addenda98 id(String id) {
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

	public Addenda98 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 98 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda98 changeCode(String changeCode) {
		this.changeCode = changeCode;
		return this;
	}

	/**
	 * ChangeCode field contains a standard code used by an ACH Operator or RDFI to describe the reason for a change Entry.
	 *
	 * @return changeCode required
	 **/
	public String getChangeCode() {
		return changeCode;
	}

	public void setChangeCode(String changeCode) {
		this.changeCode = changeCode;
	}

	public Addenda98 originalTrace(String originalTrace) {
		this.originalTrace = originalTrace;
		return this;
	}

	/**
	 * OriginalTrace This field contains the Trace Number as originally included on the forward Entry or Prenotification. The RDFI must include the Original
	 * Entry Trace Number in the Addenda Record of an Entry being returned to an ODFI, in the Addenda Record of an 98, within an Acknowledgment Entry, or with
	 * an RDFI request for a copy of an authorization.
	 *
	 * @return originalTrace required
	 **/
	public String getOriginalTrace() {
		return originalTrace;
	}

	public void setOriginalTrace(String originalTrace) {
		this.originalTrace = originalTrace;
	}

	public Addenda98 originalDFI(String originalDFI) {
		this.originalDFI = originalDFI;
		return this;
	}

	/**
	 * The Receiving DFI Identification (addenda.RDFIIdentification) as originally included on the forward Entry or Prenotification that the RDFI is returning
	 * or correcting.
	 *
	 * @return originalDFI required
	 **/
	public String getOriginalDFI() {
		return originalDFI;
	}

	public void setOriginalDFI(String originalDFI) {
		this.originalDFI = originalDFI;
	}

	public Addenda98 correctedData(String correctedData) {
		this.correctedData = correctedData;
		return this;
	}

	/**
	 * Correct field value of what changeCode references
	 *
	 * @return correctedData required
	 **/
	public String getCorrectedData() {
		return correctedData;
	}

	public void setCorrectedData(String correctedData) {
		this.correctedData = correctedData;
	}

	public Addenda98 traceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
		return this;
	}

	/**
	 * Entry Detail Trace Number
	 *
	 * @return traceNumber
	 **/
	public String getTraceNumber() {
		return traceNumber;
	}

	public void setTraceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Addenda98 addenda98 = (Addenda98) o;
		return Objects.equals(this.id, addenda98.id) &&
			Objects.equals(this.typeCode, addenda98.typeCode) &&
			Objects.equals(this.changeCode, addenda98.changeCode) &&
			Objects.equals(this.originalTrace, addenda98.originalTrace) &&
			Objects.equals(this.originalDFI, addenda98.originalDFI) &&
			Objects.equals(this.correctedData, addenda98.correctedData) &&
			Objects.equals(this.traceNumber, addenda98.traceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, changeCode, originalTrace, originalDFI, correctedData, traceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda98 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    changeCode: ").append(toIndentedString(changeCode)).append("\n");
		sb.append("    originalTrace: ").append(toIndentedString(originalTrace)).append("\n");
		sb.append("    originalDFI: ").append(toIndentedString(originalDFI)).append("\n");
		sb.append("    correctedData: ").append(toIndentedString(correctedData)).append("\n");
		sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
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
