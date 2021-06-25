package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda99
 */
@JsonInclude(Include.NON_NULL)
public class Addenda99 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("returnCode")
	private String returnCode = null;

	@JsonProperty("originalTrace")
	private String originalTrace = null;

	@JsonProperty("dateOfDeath")
	@JsonFormat(shape = Shape.STRING, pattern="yyMMdd")
	private String dateOfDeath = null;

	@JsonProperty("originalDFI")
	private String originalDFI = null;

	@JsonProperty("addendaInformation")
	private String addendaInformation = null;

	@JsonProperty("traceNumber")
	private String traceNumber = null;

	public Addenda99 id(String id) {
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

	public Addenda99 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 99 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda99 returnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	/**
	 * Standard code used by an ACH Operator or RDFI to describe the reason for returning an Entry.
	 *
	 * @return returnCode required
	 **/
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public Addenda99 originalTrace(String originalTrace) {
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

	public Addenda99 dateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
		return this;
	}

	/**
	 * The field date of death is to be supplied on Entries being returned for reason of death (return reason codes R14 and R15). (Format YYMMDD - Y=Year,
	 * M=Month, D=Day)
	 *
	 * @return dateOfDeath
	 **/
	public String getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public Addenda99 originalDFI(String originalDFI) {
		this.originalDFI = originalDFI;
		return this;
	}

	/**
	 * Contains the Receiving DFI Identification (addenda.RDFIIdentification) as originally included on the forward Entry or Prenotification that the RDFI is
	 * returning or correcting.
	 *
	 * @return originalDFI required
	 **/
	public String getOriginalDFI() {
		return originalDFI;
	}

	public void setOriginalDFI(String originalDFI) {
		this.originalDFI = originalDFI;
	}

	public Addenda99 addendaInformation(String addendaInformation) {
		this.addendaInformation = addendaInformation;
		return this;
	}

	/**
	 * Information related to the return
	 *
	 * @return addendaInformation
	 **/
	public String getAddendaInformation() {
		return addendaInformation;
	}

	public void setAddendaInformation(String addendaInformation) {
		this.addendaInformation = addendaInformation;
	}

	public Addenda99 traceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
		return this;
	}

	/**
	 * Matches the Entry Detail Trace Number of the entry being returned.
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
		Addenda99 addenda99 = (Addenda99) o;
		return Objects.equals(this.id, addenda99.id) &&
			Objects.equals(this.typeCode, addenda99.typeCode) &&
			Objects.equals(this.returnCode, addenda99.returnCode) &&
			Objects.equals(this.originalTrace, addenda99.originalTrace) &&
			Objects.equals(this.dateOfDeath, addenda99.dateOfDeath) &&
			Objects.equals(this.originalDFI, addenda99.originalDFI) &&
			Objects.equals(this.addendaInformation, addenda99.addendaInformation) &&
			Objects.equals(this.traceNumber, addenda99.traceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, returnCode, originalTrace, dateOfDeath, originalDFI, addendaInformation, traceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda99 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("    originalTrace: ").append(toIndentedString(originalTrace)).append("\n");
		sb.append("    dateOfDeath: ").append(toIndentedString(dateOfDeath)).append("\n");
		sb.append("    originalDFI: ").append(toIndentedString(originalDFI)).append("\n");
		sb.append("    addendaInformation: ").append(toIndentedString(addendaInformation)).append("\n");
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
