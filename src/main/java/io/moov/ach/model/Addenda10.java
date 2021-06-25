package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Addenda10
 */
@JsonInclude(Include.NON_NULL)
public class Addenda10 {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("typeCode")
	private String typeCode = null;

	@JsonProperty("transactionTypeCode")
	private String transactionTypeCode = null;

	@JsonProperty("foreignPaymentAmount")
	private Integer foreignPaymentAmount = null;

	@JsonProperty("foreignTraceNumber")
	private String foreignTraceNumber = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("entryDetailSequenceNumber")
	private Integer entryDetailSequenceNumber = null;

	public Addenda10 id(String id) {
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

	public Addenda10 typeCode(String typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	/**
	 * 10 - NACHA regulations
	 *
	 * @return typeCode required
	 **/
	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Addenda10 transactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
		return this;
	}

	/**
	 * Describes the type of payment: 'ANN' = Annuity | 'BUS' = Business/Commercial | 'DEP' = Deposit |
	 * 'LOA' = Loan | 'MIS' = Miscellaneous | 'MOR' = Mortgage | 'PEN' = Pension | 'RLS'
	 * = Rent/Lease | 'REM' = Remittance2 | 'SAL' = Salary/Payroll | 'TAX' = Tax | 'TEL' =
	 * Telephone-Initiated Transaction | 'WEB' = Internet-Initiated Transaction | 'ARC' = Accounts Receivable Entry |
	 * 'BOC' = Back Office Conversion Entry | 'POP' = Point of Purchase Entry | 'RCK' = Re-presented Check Entry
	 *
	 * @return transactionTypeCode
	 **/
	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}

	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}

	public Addenda10 foreignPaymentAmount(int foreignPaymentAmount) {
		this.foreignPaymentAmount = foreignPaymentAmount;
		return this;
	}

	/**
	 * For inbound IAT payments this field should contain the USD amount or may be blank.
	 *
	 * @return foreignPaymentAmount required
	 **/
	public Integer getForeignPaymentAmount() {
		return foreignPaymentAmount;
	}

	public void setForeignPaymentAmount(Integer foreignPaymentAmount) {
		this.foreignPaymentAmount = foreignPaymentAmount;
	}

	public Addenda10 foreignTraceNumber(String foreignTraceNumber) {
		this.foreignTraceNumber = foreignTraceNumber;
		return this;
	}

	/**
	 * Trace number
	 *
	 * @return foreignTraceNumber
	 **/
	public String getForeignTraceNumber() {
		return foreignTraceNumber;
	}

	public void setForeignTraceNumber(String foreignTraceNumber) {
		this.foreignTraceNumber = foreignTraceNumber;
	}

	public Addenda10 name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Receiving Company Name/Individual Name
	 *
	 * @return name required
	 **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Addenda10 entryDetailSequenceNumber(int entryDetailSequenceNumber) {
		this.entryDetailSequenceNumber = entryDetailSequenceNumber;
		return this;
	}

	/**
	 * EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record's trace number. This
	 * number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.
	 *
	 * @return entryDetailSequenceNumber
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
		Addenda10 addenda10 = (Addenda10) o;
		return Objects.equals(this.id, addenda10.id) &&
			Objects.equals(this.typeCode, addenda10.typeCode) &&
			Objects.equals(this.transactionTypeCode, addenda10.transactionTypeCode) &&
			Objects.equals(this.foreignPaymentAmount, addenda10.foreignPaymentAmount) &&
			Objects.equals(this.foreignTraceNumber, addenda10.foreignTraceNumber) &&
			Objects.equals(this.name, addenda10.name) &&
			Objects.equals(this.entryDetailSequenceNumber, addenda10.entryDetailSequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, typeCode, transactionTypeCode, foreignPaymentAmount, foreignTraceNumber, name, entryDetailSequenceNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Addenda10 {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
		sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
		sb.append("    foreignPaymentAmount: ").append(toIndentedString(foreignPaymentAmount)).append("\n");
		sb.append("    foreignTraceNumber: ").append(toIndentedString(foreignTraceNumber)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
