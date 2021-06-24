package barena.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EntryDetail
 */
@JsonInclude(Include.NON_NULL)
public class EntryDetail {

	@JsonProperty("ID")
	private String ID = null;

	@JsonProperty("transactionCode")
	private Integer transactionCode = null;

	@JsonProperty("RDFIIdentification")
	private String rdFIIdentification = null;

	@JsonProperty("checkDigit")
	private String checkDigit = null;

	@JsonProperty("DFIAccountNumber")
	private String dfIAccountNumber = null;

	@JsonProperty("amount")
	private Integer amount = null;

	@JsonProperty("identificationNumber")
	private String identificationNumber = null;

	@JsonProperty("individualName")
	private String individualName = null;

	@JsonProperty("discretionaryData")
	private String discretionaryData = null;

	@JsonProperty("addendaRecordIndicator")
	private Integer addendaRecordIndicator = null;

	@JsonProperty("traceNumber")
	private String traceNumber = null;

	@JsonProperty("addenda02")
	private Addenda02 addenda02 = null;

	@JsonProperty("addenda05")
	private List<Addenda05> addenda05 = null;

	@JsonProperty("addenda98")
	private Addenda98 addenda98 = null;

	@JsonProperty("addenda99")
	private Addenda99 addenda99 = null;

	@JsonProperty("category")
	private String category = null;

	public EntryDetail ID(String ID) {
		this.ID = ID;
		return this;
	}

	/**
	 * Entry Detail ID
	 *
	 * @return ID
	 **/
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public EntryDetail transactionCode(Integer transactionCode) {
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

	public EntryDetail rdFIIdentification(String rdFIIdentification) {
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

	public EntryDetail checkDigit(String checkDigit) {
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

	public EntryDetail dfIAccountNumber(String dfIAccountNumber) {
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

	public EntryDetail amount(Integer amount) {
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

	public EntryDetail identificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
		return this;
	}

	/**
	 * Internal identification (alphanumeric) that you use to uniquely identify this Entry Detail Record
	 *
	 * @return identificationNumber
	 **/
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public EntryDetail individualName(String individualName) {
		this.individualName = individualName;
		return this;
	}

	/**
	 * The name of the receiver, usually the name on the bank account
	 *
	 * @return individualName required
	 **/
	public String getIndividualName() {
		return individualName;
	}

	public void setIndividualName(String individualName) {
		this.individualName = individualName;
	}

	public EntryDetail discretionaryData(String discretionaryData) {
		this.discretionaryData = discretionaryData;
		return this;
	}

	/**
	 * DiscretionaryData allows ODFIs to include codes, of significance only to them, to enable specialized handling of the entry. There will be no standardized
	 * interpretation for the value of this field. It can either be a single two-character code, or two distinct one-character codes, according to the needs of
	 * the ODFI and/or Originator involved. This field must be returned intact for any returned entry. WEB uses the Discretionary Data Field as the Payment Type
	 * Code.
	 *
	 * @return discretionaryData
	 **/
	public String getDiscretionaryData() {
		return discretionaryData;
	}

	public void setDiscretionaryData(String discretionaryData) {
		this.discretionaryData = discretionaryData;
	}

	public EntryDetail addendaRecordIndicator(Integer addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
		return this;
	}

	/**
	 * AddendaRecordIndicator indicates the existence of an Addenda Record. A value of "1" indicates that one or more addenda records follow, and "0" means no
	 * such record is present.
	 *
	 * @return addendaRecordIndicator
	 **/
	public Integer getAddendaRecordIndicator() {
		return addendaRecordIndicator;
	}

	public void setAddendaRecordIndicator(Integer addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
	}

	public EntryDetail traceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
		return this;
	}

	/**
	 * TraceNumber assigned by the ODFI in ascending sequence, is included in each Entry Detail Record, Corporate Entry Detail Record, and Addenda Record. Trace
	 * Numbers uniquely identify each entry within a batch in an ACH input file. In association with the Batch Number, transmission (File Creation) Date, and
	 * File ID Modifier, the Trace Number uniquely identifies an entry within a given file. For Addenda Records, the Trace Number will be identical to the Trace
	 * Number in the associated Entry Detail Record, since the Trace Number is associated with an entry or item rather than a physical record.
	 *
	 * @return traceNumber
	 **/
	public String getTraceNumber() {
		return traceNumber;
	}

	public void setTraceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
	}

	public EntryDetail addenda02(Addenda02 addenda02) {
		this.addenda02 = addenda02;
		return this;
	}

	/**
	 * Get addenda02
	 *
	 * @return addenda02
	 **/
	public Addenda02 getAddenda02() {
		return addenda02;
	}

	public void setAddenda02(Addenda02 addenda02) {
		this.addenda02 = addenda02;
	}

	public EntryDetail addenda05(List<Addenda05> addenda05) {
		this.addenda05 = addenda05;
		return this;
	}

	public EntryDetail addAddenda05Item(Addenda05 addenda05Item) {
		if (this.addenda05 == null) {
			this.addenda05 = new ArrayList<Addenda05>();
		}
		this.addenda05.add(addenda05Item);
		return this;
	}

	/**
	 * List of Addenda05 records
	 *
	 * @return addenda05
	 **/
	public List<Addenda05> getAddenda05() {
		return addenda05;
	}

	public void setAddenda05(List<Addenda05> addenda05) {
		this.addenda05 = addenda05;
	}

	public EntryDetail addenda98(Addenda98 addenda98) {
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

	public EntryDetail addenda99(Addenda99 addenda99) {
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

	public EntryDetail category(String category) {
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
		EntryDetail entryDetail = (EntryDetail) o;
		return Objects.equals(this.ID, entryDetail.ID) &&
			Objects.equals(this.transactionCode, entryDetail.transactionCode) &&
			Objects.equals(this.rdFIIdentification, entryDetail.rdFIIdentification) &&
			Objects.equals(this.checkDigit, entryDetail.checkDigit) &&
			Objects.equals(this.dfIAccountNumber, entryDetail.dfIAccountNumber) &&
			Objects.equals(this.amount, entryDetail.amount) &&
			Objects.equals(this.identificationNumber, entryDetail.identificationNumber) &&
			Objects.equals(this.individualName, entryDetail.individualName) &&
			Objects.equals(this.discretionaryData, entryDetail.discretionaryData) &&
			Objects.equals(this.addendaRecordIndicator, entryDetail.addendaRecordIndicator) &&
			Objects.equals(this.traceNumber, entryDetail.traceNumber) &&
			Objects.equals(this.addenda02, entryDetail.addenda02) &&
			Objects.equals(this.addenda05, entryDetail.addenda05) &&
			Objects.equals(this.addenda98, entryDetail.addenda98) &&
			Objects.equals(this.addenda99, entryDetail.addenda99) &&
			Objects.equals(this.category, entryDetail.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID,
		                    transactionCode,
		                    rdFIIdentification,
		                    checkDigit,
		                    dfIAccountNumber,
		                    amount,
		                    identificationNumber,
		                    individualName,
		                    discretionaryData,
		                    addendaRecordIndicator,
		                    traceNumber,
		                    addenda02,
		                    addenda05,
		                    addenda98,
		                    addenda99,
		                    category);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EntryDetail {\n");

		sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
		sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
		sb.append("    rdFIIdentification: ").append(toIndentedString(rdFIIdentification)).append("\n");
		sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
		sb.append("    dfIAccountNumber: ").append(toIndentedString(dfIAccountNumber)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
		sb.append("    individualName: ").append(toIndentedString(individualName)).append("\n");
		sb.append("    discretionaryData: ").append(toIndentedString(discretionaryData)).append("\n");
		sb.append("    addendaRecordIndicator: ").append(toIndentedString(addendaRecordIndicator)).append("\n");
		sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
		sb.append("    addenda02: ").append(toIndentedString(addenda02)).append("\n");
		sb.append("    addenda05: ").append(toIndentedString(addenda05)).append("\n");
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
