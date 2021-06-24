package ach.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Addenda02
 */
@JsonInclude(Include.NON_NULL)
public class Addenda02 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("referenceInformationOne")
	private String referenceInformationOne = null;

	@JsonProperty("referenceInformationTwo")
	private String referenceInformationTwo = null;

	@JsonProperty("terminalIdentificationCode")
	private String terminalIdentificationCode = null;

	@JsonProperty("transactionSerialNumber")
	private String transactionSerialNumber = null;

	@JsonProperty("transactionDate")
	@JsonFormat(shape = Shape.STRING, pattern="mmdd")
	private LocalDate transactionDate = null;

	@JsonProperty("authorizationCodeOrExpireDate")
	private String authorizationCodeOrExpireDate = null;

	@JsonProperty("terminalLocation")
	private String terminalLocation = null;

	@JsonProperty("terminalCity")
	private String terminalCity = null;

	@JsonProperty("terminalState")
	private String terminalState = null;

	@JsonProperty("traceNumber")
	private String traceNumber = null;

	public Addenda02 id(String id) {
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

	public Addenda02 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 02 - NACHA regulations
	 *
	 * @return typeCode
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda02 referenceInformationOne(String referenceInformationOne) {
		this.referenceInformationOne = referenceInformationOne;
		return this;
	}

	/**
	 * ReferenceInformationOne may be used for additional reference numbers, identification numbers, or codes that the merchant needs to identify the particular
	 * transaction or customer.
	 *
	 * @return referenceInformationOne
	 **/
	public String getReferenceInformationOne() {
		return referenceInformationOne;
	}

	public void setReferenceInformationOne(String referenceInformationOne) {
		this.referenceInformationOne = referenceInformationOne;
	}

	public Addenda02 referenceInformationTwo(String referenceInformationTwo) {
		this.referenceInformationTwo = referenceInformationTwo;
		return this;
	}

	/**
	 * ReferenceInformationTwo may be used for additional reference numbers, identification numbers, or codes that the merchant needs to identify the particular
	 * transaction or customer.
	 *
	 * @return referenceInformationTwo
	 **/
	public String getReferenceInformationTwo() {
		return referenceInformationTwo;
	}

	public void setReferenceInformationTwo(String referenceInformationTwo) {
		this.referenceInformationTwo = referenceInformationTwo;
	}

	public Addenda02 terminalIdentificationCode(String terminalIdentificationCode) {
		this.terminalIdentificationCode = terminalIdentificationCode;
		return this;
	}

	/**
	 * TerminalIdentificationCode identifies an Electronic terminal with a unique code that allows a terminal owner and/or switching network to identify the
	 * terminal at which an Entry originated.
	 *
	 * @return terminalIdentificationCode required
	 **/
	public String getTerminalIdentificationCode() {
		return terminalIdentificationCode;
	}

	public void setTerminalIdentificationCode(String terminalIdentificationCode) {
		this.terminalIdentificationCode = terminalIdentificationCode;
	}

	public Addenda02 transactionSerialNumber(String transactionSerialNumber) {
		this.transactionSerialNumber = transactionSerialNumber;
		return this;
	}

	/**
	 * TransactionSerialNumber is assigned by the terminal at the time the transaction is originated.  The number, with the Terminal Identification Code, serves
	 * as an audit trail for the transaction and is usually assigned in ascending sequence.
	 *
	 * @return transactionSerialNumber required
	 **/
	public String getTransactionSerialNumber() {
		return transactionSerialNumber;
	}

	public void setTransactionSerialNumber(String transactionSerialNumber) {
		this.transactionSerialNumber = transactionSerialNumber;
	}

	public Addenda02 transactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
		return this;
	}

	/**
	 * Timestamp identifies the date on which the transaction occurred. (Format MMDD - M=Month, D=Day)
	 *
	 * @return transactionDate required
	 **/
	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Addenda02 authorizationCodeOrExpireDate(String authorizationCodeOrExpireDate) {
		this.authorizationCodeOrExpireDate = authorizationCodeOrExpireDate;
		return this;
	}

	/**
	 * Indicates the code that a card authorization center has furnished to the merchant.
	 *
	 * @return authorizationCodeOrExpireDate
	 **/
	public String getAuthorizationCodeOrExpireDate() {
		return authorizationCodeOrExpireDate;
	}

	public void setAuthorizationCodeOrExpireDate(String authorizationCodeOrExpireDate) {
		this.authorizationCodeOrExpireDate = authorizationCodeOrExpireDate;
	}

	public Addenda02 terminalLocation(String terminalLocation) {
		this.terminalLocation = terminalLocation;
		return this;
	}

	/**
	 * Identifies the specific location of a terminal (i.e., street names of an intersection, address, etc.) in accordance with the requirements of Regulation
	 * E.
	 *
	 * @return terminalLocation required
	 **/
	public String getTerminalLocation() {
		return terminalLocation;
	}

	public void setTerminalLocation(String terminalLocation) {
		this.terminalLocation = terminalLocation;
	}

	public Addenda02 terminalCity(String terminalCity) {
		this.terminalCity = terminalCity;
		return this;
	}

	/**
	 * Identifies the city in which the electronic terminal is located.
	 *
	 * @return terminalCity
	 **/
	public String getTerminalCity() {
		return terminalCity;
	}

	public void setTerminalCity(String terminalCity) {
		this.terminalCity = terminalCity;
	}

	public Addenda02 terminalState(String terminalState) {
		this.terminalState = terminalState;
		return this;
	}

	/**
	 * Identifies the state in which the electronic terminal is located.
	 *
	 * @return terminalState required
	 **/
	public String getTerminalState() {
		return terminalState;
	}

	public void setTerminalState(String terminalState) {
		this.terminalState = terminalState;
	}

	public Addenda02 traceNumber(String traceNumber) {
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
		Addenda02 addenda02 = (Addenda02) o;
		return Objects.equals(this.id, addenda02.id) &&
			Objects.equals(this.typeCode, addenda02.typeCode) &&
			Objects.equals(this.referenceInformationOne, addenda02.referenceInformationOne) &&
			Objects.equals(this.referenceInformationTwo, addenda02.referenceInformationTwo) &&
			Objects.equals(this.terminalIdentificationCode, addenda02.terminalIdentificationCode) &&
			Objects.equals(this.transactionSerialNumber, addenda02.transactionSerialNumber) &&
			Objects.equals(this.transactionDate, addenda02.transactionDate) &&
			Objects.equals(this.authorizationCodeOrExpireDate, addenda02.authorizationCodeOrExpireDate) &&
			Objects.equals(this.terminalLocation, addenda02.terminalLocation) &&
			Objects.equals(this.terminalCity, addenda02.terminalCity) &&
			Objects.equals(this.terminalState, addenda02.terminalState) &&
			Objects.equals(this.traceNumber, addenda02.traceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
		                    typeCode,
		                    referenceInformationOne,
		                    referenceInformationTwo,
		                    terminalIdentificationCode,
		                    transactionSerialNumber,
		                    transactionDate,
		                    authorizationCodeOrExpireDate,
		                    terminalLocation,
		                    terminalCity,
		                    terminalState,
		                    traceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda02 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    referenceInformationOne: ").append(toIndentedString(referenceInformationOne)).append("\n");
		sb.append("    referenceInformationTwo: ").append(toIndentedString(referenceInformationTwo)).append("\n");
		sb.append("    terminalIdentificationCode: ").append(toIndentedString(terminalIdentificationCode)).append("\n");
		sb.append("    transactionSerialNumber: ").append(toIndentedString(transactionSerialNumber)).append("\n");
		sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
		sb.append("    authorizationCodeOrExpireDate: ").append(toIndentedString(authorizationCodeOrExpireDate)).append("\n");
		sb.append("    terminalLocation: ").append(toIndentedString(terminalLocation)).append("\n");
		sb.append("    terminalCity: ").append(toIndentedString(terminalCity)).append("\n");
		sb.append("    terminalState: ").append(toIndentedString(terminalState)).append("\n");
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
