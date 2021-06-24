package ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IATEntryDetail
 */
@JsonInclude(Include.NON_NULL)
public class IATEntryDetail {

	@JsonProperty("ID")
	private String id = null;

	@JsonProperty("transactionCode")
	private Integer transactionCode = null;

	@JsonProperty("RDFIIdentification")
	private String rdFIIdentification = null;

	@JsonProperty("checkDigit")
	private String checkDigit = null;

	@JsonProperty("addendaRecords")
	private Integer addendaRecords = null;

	@JsonProperty("amount")
	private Integer amount = null;

	@JsonProperty("DFIAccountNumber")
	private String dfIAccountNumber = null;

	@JsonProperty("OFACScreeningIndicator")
	private String ofACScreeningIndicator = null;

	@JsonProperty("secondaryOFACScreeningIndicator")
	private String secondaryOFACScreeningIndicator = null;

	@JsonProperty("addendaRecordIndicator")
	private Integer addendaRecordIndicator = null;

	@JsonProperty("traceNumber")
	private String traceNumber = null;

	@JsonProperty("addenda10")
	private Addenda10 addenda10 = null;

	@JsonProperty("addenda11")
	private Addenda11 addenda11 = null;

	@JsonProperty("addenda12")
	private Addenda12 addenda12 = null;

	@JsonProperty("addenda13")
	private Addenda13 addenda13 = null;

	@JsonProperty("addenda14")
	private Addenda14 addenda14 = null;

	@JsonProperty("addenda15")
	private Addenda15 addenda15 = null;

	@JsonProperty("addenda16")
	private Addenda16 addenda16 = null;

	@JsonProperty("addenda17")
	private Addenda17 addenda17 = null;

	@JsonProperty("addenda18")
	private Addenda18 addenda18 = null;

	@JsonProperty("addenda98")
	private Addenda98 addenda98 = null;

	@JsonProperty("addenda99")
	private Addenda99 addenda99 = null;

	@JsonProperty("category")
	private String category = null;

	public IATEntryDetail ID(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Entry Detail ID
	 *
	 * @return ID
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public IATEntryDetail transactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
		return this;
	}

	/**
	 * Based on transaction type: 22 - Credit (deposit) to checking account | 23 - Prenote for credit to checking account | 27 - Debit (withdrawal) to checking
	 * account | 28 - Prenote for debit to checking account | 32 - Credit to savings account | 33 - Prenote for credit to savings account | 37 - Debit to
	 * savings account | 38 - Prenote for debit to savings account
	 *
	 * @return transactionCode required
	 **/
	public Integer getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}

	public IATEntryDetail rdFIIdentification(String rdFIIdentification) {
		this.rdFIIdentification = rdFIIdentification;
		return this;
	}

	/**
	 * RDFI's routing number without the last digit.
	 *
	 * @return rdFIIdentification required
	 **/
	public String getRdFIIdentification() {
		return rdFIIdentification;
	}

	public void setRdFIIdentification(String rdFIIdentification) {
		this.rdFIIdentification = rdFIIdentification;
	}

	public IATEntryDetail checkDigit(String checkDigit) {
		this.checkDigit = checkDigit;
		return this;
	}

	/**
	 * Last digit in RDFI routing number.
	 *
	 * @return checkDigit required
	 **/
	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public IATEntryDetail addendaRecords(Integer addendaRecords) {
		this.addendaRecords = addendaRecords;
		return this;
	}

	/**
	 * Number of Addenda Records
	 *
	 * @return addendaRecords required
	 **/
	public Integer getAddendaRecords() {
		return addendaRecords;
	}

	public void setAddendaRecords(Integer addendaRecords) {
		this.addendaRecords = addendaRecords;
	}

	public IATEntryDetail amount(Integer amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Number of cents you are debiting/crediting this account
	 *
	 * @return amount required
	 **/
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public IATEntryDetail dfIAccountNumber(String dfIAccountNumber) {
		this.dfIAccountNumber = dfIAccountNumber;
		return this;
	}

	/**
	 * The receiver's bank account number you are crediting/debiting. It important to note that this is an alphanumeric field, so it's space padded, not zero
	 * padded
	 *
	 * @return dfIAccountNumber required
	 **/
	public String getDfIAccountNumber() {
		return dfIAccountNumber;
	}

	public void setDfIAccountNumber(String dfIAccountNumber) {
		this.dfIAccountNumber = dfIAccountNumber;
	}

	public IATEntryDetail ofACScreeningIndicator(String ofACScreeningIndicator) {
		this.ofACScreeningIndicator = ofACScreeningIndicator;
		return this;
	}

	/**
	 * Signifies if the record has been screened against OFAC records
	 *
	 * @return ofACScreeningIndicator required
	 **/
	public String getOfACScreeningIndicator() {
		return ofACScreeningIndicator;
	}

	public void setOfACScreeningIndicator(String ofACScreeningIndicator) {
		this.ofACScreeningIndicator = ofACScreeningIndicator;
	}

	public IATEntryDetail secondaryOFACScreeningIndicator(String secondaryOFACScreeningIndicator) {
		this.secondaryOFACScreeningIndicator = secondaryOFACScreeningIndicator;
		return this;
	}

	/**
	 * Signifies if the record has been screened against OFAC records by a secondary entry
	 *
	 * @return secondaryOFACScreeningIndicator required
	 **/
	public String getSecondaryOFACScreeningIndicator() {
		return secondaryOFACScreeningIndicator;
	}

	public void setSecondaryOFACScreeningIndicator(String secondaryOFACScreeningIndicator) {
		this.secondaryOFACScreeningIndicator = secondaryOFACScreeningIndicator;
	}

	public IATEntryDetail addendaRecordIndicator(Integer addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
		return this;
	}

	/**
	 * AddendaRecordIndicator indicates the existence of an Addenda Record. A value of "1" indicates that one or more addenda records follow, and "0" means no
	 * such record is present.
	 *
	 * @return addendaRecordIndicator required
	 **/
	public Integer getAddendaRecordIndicator() {
		return addendaRecordIndicator;
	}

	public void setAddendaRecordIndicator(Integer addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
	}

	public IATEntryDetail traceNumber(String traceNumber) {
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

	public IATEntryDetail addenda10(Addenda10 addenda10) {
		this.addenda10 = addenda10;
		return this;
	}

	/**
	 * Get addenda10
	 *
	 * @return addenda10 required
	 **/
	public Addenda10 getAddenda10() {
		return addenda10;
	}

	public void setAddenda10(Addenda10 addenda10) {
		this.addenda10 = addenda10;
	}

	public IATEntryDetail addenda11(Addenda11 addenda11) {
		this.addenda11 = addenda11;
		return this;
	}

	/**
	 * Get addenda11
	 *
	 * @return addenda11 required
	 **/
	public Addenda11 getAddenda11() {
		return addenda11;
	}

	public void setAddenda11(Addenda11 addenda11) {
		this.addenda11 = addenda11;
	}

	public IATEntryDetail addenda12(Addenda12 addenda12) {
		this.addenda12 = addenda12;
		return this;
	}

	/**
	 * Get addenda12
	 *
	 * @return addenda12 required
	 **/
	public Addenda12 getAddenda12() {
		return addenda12;
	}

	public void setAddenda12(Addenda12 addenda12) {
		this.addenda12 = addenda12;
	}

	public IATEntryDetail addenda13(Addenda13 addenda13) {
		this.addenda13 = addenda13;
		return this;
	}

	/**
	 * Get addenda13
	 *
	 * @return addenda13 required
	 **/
	public Addenda13 getAddenda13() {
		return addenda13;
	}

	public void setAddenda13(Addenda13 addenda13) {
		this.addenda13 = addenda13;
	}

	public IATEntryDetail addenda14(Addenda14 addenda14) {
		this.addenda14 = addenda14;
		return this;
	}

	/**
	 * Get addenda14
	 *
	 * @return addenda14 required
	 **/
	public Addenda14 getAddenda14() {
		return addenda14;
	}

	public void setAddenda14(Addenda14 addenda14) {
		this.addenda14 = addenda14;
	}

	public IATEntryDetail addenda15(Addenda15 addenda15) {
		this.addenda15 = addenda15;
		return this;
	}

	/**
	 * Get addenda15
	 *
	 * @return addenda15 required
	 **/
	public Addenda15 getAddenda15() {
		return addenda15;
	}

	public void setAddenda15(Addenda15 addenda15) {
		this.addenda15 = addenda15;
	}

	public IATEntryDetail addenda16(Addenda16 addenda16) {
		this.addenda16 = addenda16;
		return this;
	}

	/**
	 * Get addenda16
	 *
	 * @return addenda16 required
	 **/
	public Addenda16 getAddenda16() {
		return addenda16;
	}

	public void setAddenda16(Addenda16 addenda16) {
		this.addenda16 = addenda16;
	}

	public IATEntryDetail addenda17(Addenda17 addenda17) {
		this.addenda17 = addenda17;
		return this;
	}

	/**
	 * Get addenda17
	 *
	 * @return addenda17
	 **/
	public Addenda17 getAddenda17() {
		return addenda17;
	}

	public void setAddenda17(Addenda17 addenda17) {
		this.addenda17 = addenda17;
	}

	public IATEntryDetail addenda18(Addenda18 addenda18) {
		this.addenda18 = addenda18;
		return this;
	}

	/**
	 * Get addenda18
	 *
	 * @return addenda18
	 **/
	public Addenda18 getAddenda18() {
		return addenda18;
	}

	public void setAddenda18(Addenda18 addenda18) {
		this.addenda18 = addenda18;
	}

	public IATEntryDetail addenda98(Addenda98 addenda98) {
		this.addenda98 = addenda98;
		return this;
	}

	/**
	 * Get addenda98
	 *
	 * @return addenda98
	 **/
	public Addenda98 getAddenda98() {
		return addenda98;
	}

	public void setAddenda98(Addenda98 addenda98) {
		this.addenda98 = addenda98;
	}

	public IATEntryDetail addenda99(Addenda99 addenda99) {
		this.addenda99 = addenda99;
		return this;
	}

	/**
	 * Get addenda99
	 *
	 * @return addenda99
	 **/
	public Addenda99 getAddenda99() {
		return addenda99;
	}

	public void setAddenda99(Addenda99 addenda99) {
		this.addenda99 = addenda99;
	}

	public IATEntryDetail category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Category defines if the entry is a Forward, Return, or NOC
	 *
	 * @return category
	 **/
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IATEntryDetail iaTEntryDetail = (IATEntryDetail) o;
		return Objects.equals(this.id, iaTEntryDetail.id) &&
			Objects.equals(this.transactionCode, iaTEntryDetail.transactionCode) &&
			Objects.equals(this.rdFIIdentification, iaTEntryDetail.rdFIIdentification) &&
			Objects.equals(this.checkDigit, iaTEntryDetail.checkDigit) &&
			Objects.equals(this.addendaRecords, iaTEntryDetail.addendaRecords) &&
			Objects.equals(this.amount, iaTEntryDetail.amount) &&
			Objects.equals(this.dfIAccountNumber, iaTEntryDetail.dfIAccountNumber) &&
			Objects.equals(this.ofACScreeningIndicator, iaTEntryDetail.ofACScreeningIndicator) &&
			Objects.equals(this.secondaryOFACScreeningIndicator, iaTEntryDetail.secondaryOFACScreeningIndicator) &&
			Objects.equals(this.addendaRecordIndicator, iaTEntryDetail.addendaRecordIndicator) &&
			Objects.equals(this.traceNumber, iaTEntryDetail.traceNumber) &&
			Objects.equals(this.addenda10, iaTEntryDetail.addenda10) &&
			Objects.equals(this.addenda11, iaTEntryDetail.addenda11) &&
			Objects.equals(this.addenda12, iaTEntryDetail.addenda12) &&
			Objects.equals(this.addenda13, iaTEntryDetail.addenda13) &&
			Objects.equals(this.addenda14, iaTEntryDetail.addenda14) &&
			Objects.equals(this.addenda15, iaTEntryDetail.addenda15) &&
			Objects.equals(this.addenda16, iaTEntryDetail.addenda16) &&
			Objects.equals(this.addenda17, iaTEntryDetail.addenda17) &&
			Objects.equals(this.addenda18, iaTEntryDetail.addenda18) &&
			Objects.equals(this.addenda98, iaTEntryDetail.addenda98) &&
			Objects.equals(this.addenda99, iaTEntryDetail.addenda99) &&
			Objects.equals(this.category, iaTEntryDetail.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
		                    transactionCode,
		                    rdFIIdentification,
		                    checkDigit,
		                    addendaRecords,
		                    amount,
		                    dfIAccountNumber,
		                    ofACScreeningIndicator,
		                    secondaryOFACScreeningIndicator,
		                    addendaRecordIndicator,
		                    traceNumber,
		                    addenda10,
		                    addenda11,
		                    addenda12,
		                    addenda13,
		                    addenda14,
		                    addenda15,
		                    addenda16,
		                    addenda17,
		                    addenda18,
		                    addenda98,
		                    addenda99,
		                    category);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IATEntryDetail {\n");

		sb.append("    ID: ").append(toIndentedString(id)).append("\n");
		sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
		sb.append("    rdFIIdentification: ").append(toIndentedString(rdFIIdentification)).append("\n");
		sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
		sb.append("    addendaRecords: ").append(toIndentedString(addendaRecords)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    dfIAccountNumber: ").append(toIndentedString(dfIAccountNumber)).append("\n");
		sb.append("    ofACScreeningIndicator: ").append(toIndentedString(ofACScreeningIndicator)).append("\n");
		sb.append("    secondaryOFACScreeningIndicator: ").append(toIndentedString(secondaryOFACScreeningIndicator)).append("\n");
		sb.append("    addendaRecordIndicator: ").append(toIndentedString(addendaRecordIndicator)).append("\n");
		sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
		sb.append("    addenda10: ").append(toIndentedString(addenda10)).append("\n");
		sb.append("    addenda11: ").append(toIndentedString(addenda11)).append("\n");
		sb.append("    addenda12: ").append(toIndentedString(addenda12)).append("\n");
		sb.append("    addenda13: ").append(toIndentedString(addenda13)).append("\n");
		sb.append("    addenda14: ").append(toIndentedString(addenda14)).append("\n");
		sb.append("    addenda15: ").append(toIndentedString(addenda15)).append("\n");
		sb.append("    addenda16: ").append(toIndentedString(addenda16)).append("\n");
		sb.append("    addenda17: ").append(toIndentedString(addenda17)).append("\n");
		sb.append("    addenda18: ").append(toIndentedString(addenda18)).append("\n");
		sb.append("    addenda98: ").append(toIndentedString(addenda98)).append("\n");
		sb.append("    addenda99: ").append(toIndentedString(addenda99)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
