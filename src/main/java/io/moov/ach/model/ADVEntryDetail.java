package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ADVEntryDetail
 */
@JsonInclude(Include.NON_NULL)
public class ADVEntryDetail {

	@JsonProperty("id")
	private String id = null;

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

	@JsonProperty("adviceRoutingNumber")
	private String adviceRoutingNumber = null;

	@JsonProperty("fileIdentification")
	private String fileIdentification = null;

	@JsonProperty("achOperatorData")
	private String achOperatorData = null;

	@JsonProperty("individualName")
	private String individualName = null;

	@JsonProperty("discretionaryData")
	private String discretionaryData = null;

	@JsonProperty("addendaRecordIndicator")
	private Integer addendaRecordIndicator = null;

	@JsonProperty("achOperatorRoutingNumber")
	private String achOperatorRoutingNumber = null;

	@JsonProperty("julianDay")
	private Integer julianDay = null;

	@JsonProperty("sequenceNumber")
	private Integer sequenceNumber = null;

	@JsonProperty("addenda99")
	private List<Addenda99> addenda99 = null;

	@JsonProperty("category")
	private String category = null;

	public ADVEntryDetail id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Entry Detail id
	 *
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ADVEntryDetail transactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
		return this;
	}

	/**
	 * TransactionCode representing Accounting Entries: 81 - Credit for ACH debits originated | 82 - Debit for ACH credits originated | 83 - Credit for ACH
	 * credits received | 84 - Debit for ACH debits received | 85 - Credit for ACH credits in rejected batches | 86 - Debit for ACH debits in rejected batches |
	 * 87 - Summary credit for respondent ACH activity | 88 - Summary debit for respondent ACH activity
	 *
	 * @return transactionCode required
	 **/
	public Integer getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}

	public ADVEntryDetail rdFIIdentification(String rdFIIdentification) {
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

	public ADVEntryDetail checkDigit(String checkDigit) {
		this.checkDigit = checkDigit;
		return this;
	}

	/**
	 * Last digit in RDFI routing number.
	 *
	 * @return checkDigit
	 **/
	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public ADVEntryDetail dfIAccountNumber(String dfIAccountNumber) {
		this.dfIAccountNumber = dfIAccountNumber;
		return this;
	}

	/**
	 * The receiver's bank account number you are crediting/debiting. It important to note that this is an alphanumeric field, so it's space padded,
	 * not zero padded
	 *
	 * @return dfIAccountNumber required
	 **/
	public String getDfIAccountNumber() {
		return dfIAccountNumber;
	}

	public void setDfIAccountNumber(String dfIAccountNumber) {
		this.dfIAccountNumber = dfIAccountNumber;
	}

	public ADVEntryDetail amount(Integer amount) {
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

	public ADVEntryDetail adviceRoutingNumber(String adviceRoutingNumber) {
		this.adviceRoutingNumber = adviceRoutingNumber;
		return this;
	}

	/**
	 * Suggested routing number to use
	 *
	 * @return adviceRoutingNumber required
	 **/
	public String getAdviceRoutingNumber() {
		return adviceRoutingNumber;
	}

	public void setAdviceRoutingNumber(String adviceRoutingNumber) {
		this.adviceRoutingNumber = adviceRoutingNumber;
	}

	public ADVEntryDetail fileIdentification(String fileIdentification) {
		this.fileIdentification = fileIdentification;
		return this;
	}

	/**
	 * Unique identifier for the File
	 *
	 * @return fileIdentification
	 **/
	public String getFileIdentification() {
		return fileIdentification;
	}

	public void setFileIdentification(String fileIdentification) {
		this.fileIdentification = fileIdentification;
	}

	public ADVEntryDetail achOperatorData(String achOperatorData) {
		this.achOperatorData = achOperatorData;
		return this;
	}

	/**
	 * Information related to the ACH opreator
	 *
	 * @return achOperatorData
	 **/
	public String getAchOperatorData() {
		return achOperatorData;
	}

	public void setAchOperatorData(String achOperatorData) {
		this.achOperatorData = achOperatorData;
	}

	public ADVEntryDetail individualName(String individualName) {
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

	public ADVEntryDetail discretionaryData(String discretionaryData) {
		this.discretionaryData = discretionaryData;
		return this;
	}

	/**
	 * DiscretionaryData allows ODFIs to include codes, of significance only to them, to enable specialized handling of the entry. There will be no standardized
	 * interpretation for the value of this field. It can either be a single two-character code, or two distinct one-character codes, according to the needs of
	 * the ODFI and/or Originator involved. This field must be returned intact for any returned entry. WEB uses the Discretionary Data Field as the Payment Type
	 * Code.
	 *
	 * @return discretionaryData required
	 **/
	public String getDiscretionaryData() {
		return discretionaryData;
	}

	public void setDiscretionaryData(String discretionaryData) {
		this.discretionaryData = discretionaryData;
	}

	public ADVEntryDetail addendaRecordIndicator(Integer addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
		return this;
	}

	/**
	 * AddendaRecordIndicator indicates the existence of an Addenda Record. A value of "1" indicates that one or more addenda records follow, and
	 * "0" means no such record is present.
	 *
	 * @return addendaRecordIndicator
	 **/
	public Integer getAddendaRecordIndicator() {
		return addendaRecordIndicator;
	}

	public void setAddendaRecordIndicator(Integer addendaRecordIndicator) {
		this.addendaRecordIndicator = addendaRecordIndicator;
	}

	public ADVEntryDetail achOperatorRoutingNumber(String achOperatorRoutingNumber) {
		this.achOperatorRoutingNumber = achOperatorRoutingNumber;
		return this;
	}

	/**
	 * Routing number for ACH Operator
	 *
	 * @return achOperatorRoutingNumber required
	 **/
	public String getAchOperatorRoutingNumber() {
		return achOperatorRoutingNumber;
	}

	public void setAchOperatorRoutingNumber(String achOperatorRoutingNumber) {
		this.achOperatorRoutingNumber = achOperatorRoutingNumber;
	}

	public ADVEntryDetail julianDay(Integer julianDay) {
		this.julianDay = julianDay;
		return this;
	}

	/**
	 * Julian Day of the year
	 *
	 * @return julianDay
	 **/
	public Integer getJulianDay() {
		return julianDay;
	}

	public void setJulianDay(Integer julianDay) {
		this.julianDay = julianDay;
	}

	public ADVEntryDetail sequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	/**
	 * SequenceNumber is consecutively assigned to each Addenda05 Record following an Entry Detail Record. The first Addenda05 sequence number must always be a
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

	public ADVEntryDetail addenda99(List<Addenda99> addenda99) {
		this.addenda99 = addenda99;
		return this;
	}

	public ADVEntryDetail addAddenda99Item(Addenda99 addenda99Item) {
		if (this.addenda99 == null) {
			this.addenda99 = new ArrayList<Addenda99>();
		}
		this.addenda99.add(addenda99Item);
		return this;
	}

	/**
	 * Addenda99 record for the Entry Detail
	 *
	 * @return addenda99
	 **/
	public List<Addenda99> getAddenda99() {
		return addenda99;
	}

	public void setAddenda99(List<Addenda99> addenda99) {
		this.addenda99 = addenda99;
	}

	public ADVEntryDetail category(String category) {
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
		ADVEntryDetail adVEntryDetail = (ADVEntryDetail) o;
		return Objects.equals(this.id, adVEntryDetail.id) &&
			Objects.equals(this.transactionCode, adVEntryDetail.transactionCode) &&
			Objects.equals(this.rdFIIdentification, adVEntryDetail.rdFIIdentification) &&
			Objects.equals(this.checkDigit, adVEntryDetail.checkDigit) &&
			Objects.equals(this.dfIAccountNumber, adVEntryDetail.dfIAccountNumber) &&
			Objects.equals(this.amount, adVEntryDetail.amount) &&
			Objects.equals(this.adviceRoutingNumber, adVEntryDetail.adviceRoutingNumber) &&
			Objects.equals(this.fileIdentification, adVEntryDetail.fileIdentification) &&
			Objects.equals(this.achOperatorData, adVEntryDetail.achOperatorData) &&
			Objects.equals(this.individualName, adVEntryDetail.individualName) &&
			Objects.equals(this.discretionaryData, adVEntryDetail.discretionaryData) &&
			Objects.equals(this.addendaRecordIndicator, adVEntryDetail.addendaRecordIndicator) &&
			Objects.equals(this.achOperatorRoutingNumber, adVEntryDetail.achOperatorRoutingNumber) &&
			Objects.equals(this.julianDay, adVEntryDetail.julianDay) &&
			Objects.equals(this.sequenceNumber, adVEntryDetail.sequenceNumber) &&
			Objects.equals(this.addenda99, adVEntryDetail.addenda99) &&
			Objects.equals(this.category, adVEntryDetail.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
		                    transactionCode,
		                    rdFIIdentification,
		                    checkDigit,
		                    dfIAccountNumber,
		                    amount,
		                    adviceRoutingNumber,
		                    fileIdentification,
		                    achOperatorData,
		                    individualName,
		                    discretionaryData,
		                    addendaRecordIndicator,
		                    achOperatorRoutingNumber,
		                    julianDay,
		                    sequenceNumber,
		                    addenda99,
		                    category);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ADVEntryDetail {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
		sb.append("    rdFIIdentification: ").append(toIndentedString(rdFIIdentification)).append("\n");
		sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
		sb.append("    dfIAccountNumber: ").append(toIndentedString(dfIAccountNumber)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    adviceRoutingNumber: ").append(toIndentedString(adviceRoutingNumber)).append("\n");
		sb.append("    fileIdentification: ").append(toIndentedString(fileIdentification)).append("\n");
		sb.append("    achOperatorData: ").append(toIndentedString(achOperatorData)).append("\n");
		sb.append("    individualName: ").append(toIndentedString(individualName)).append("\n");
		sb.append("    discretionaryData: ").append(toIndentedString(discretionaryData)).append("\n");
		sb.append("    addendaRecordIndicator: ").append(toIndentedString(addendaRecordIndicator)).append("\n");
		sb.append("    achOperatorRoutingNumber: ").append(toIndentedString(achOperatorRoutingNumber)).append("\n");
		sb.append("    julianDay: ").append(toIndentedString(julianDay)).append("\n");
		sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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
