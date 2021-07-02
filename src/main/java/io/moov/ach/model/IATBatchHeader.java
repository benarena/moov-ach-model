package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * IATBatchHeader
 */
@JsonInclude(Include.NON_NULL)
public class IATBatchHeader {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("serviceClassCode")
	private ServiceClassCode serviceClassCode = null;

	@JsonProperty("IATIndicator")
	private String iaTIndicator = null;

	@JsonProperty("foreignExchangeIndicator")
	private String foreignExchangeIndicator = null;

	@JsonProperty("foreignExchangeReferenceIndicator")
	private Integer foreignExchangeReferenceIndicator = null;

	@JsonProperty("foreignExchangeReference")
	private String foreignExchangeReference = null;

	@JsonProperty("ISODestinationCountryCode")
	private String isODestinationCountryCode = null;

	@JsonProperty("originatorIdentification")
	private String originatorIdentification = null;

	@JsonProperty("standardEntryClassCode")
	private String standardEntryClassCode = null;

	@JsonProperty("companyEntryDescription")
	private String companyEntryDescription = null;

	@JsonProperty("ISOOriginatingCurrencyCode")
	private String isOOriginatingCurrencyCode = null;

	@JsonProperty("ISODestinationCurrencyCode")
	private String isODestinationCurrencyCode = null;

	@JsonProperty("effectiveEntryDate")
	@JsonFormat(shape = Shape.STRING, pattern = "yyMMdd")
	private LocalDate effectiveEntryDate = null;

	@JsonProperty("originatorStatusCode")
	private Integer originatorStatusCode = null;

	@JsonProperty("ODFIIdentification")
	private String odFIIdentification = null;

	@JsonProperty("batchNumber")
	private Integer batchNumber = null;

	public IATBatchHeader id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * id is a client-defined string used as a reference to this record.
	 *
	 * @return id
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public IATBatchHeader serviceClassCode(ServiceClassCode serviceClassCode) {
		this.serviceClassCode = serviceClassCode;
		return this;
	}

	/**
	 * Service Class Code - Mixed Debits and Credits '200', ACH Credits Only '220', or ACH Debits Only '225'
	 *
	 * @return serviceClassCode required
	 **/
	public ServiceClassCode getServiceClassCode() {
		return serviceClassCode;
	}

	public void setServiceClassCode(ServiceClassCode serviceClassCode) {
		this.serviceClassCode = serviceClassCode;
	}

	public IATBatchHeader iaTIndicator(String iaTIndicator) {
		this.iaTIndicator = iaTIndicator;
		return this;
	}

	/**
	 * Leave Blank. Only used for corrected IAT entries
	 *
	 * @return iaTIndicator
	 **/
	public String getIaTIndicator() {
		return iaTIndicator;
	}

	public void setIaTIndicator(String iaTIndicator) {
		this.iaTIndicator = iaTIndicator;
	}

	public IATBatchHeader foreignExchangeIndicator(String foreignExchangeIndicator) {
		this.foreignExchangeIndicator = foreignExchangeIndicator;
		return this;
	}

	/**
	 * Code indicating currency conversion: 'FV' (Fixed-to-Variable) – Entry is originated in a fixed-value amount and is to be received in a variable amount
	 * resulting from the execution of the foreign exchange conversion. | 'VF' (Variable-to-Fixed) – Entry is originated in a variable-value amount based on a
	 * specific foreign exchange rate for conversion to a fixed-value amount in which the entry is to be received. | 'FF' (Fixed-to-Fixed) – Entry is originated
	 * in a fixed-value amount and is to be received in the same fixed-value amount in the same currency denomination. There is no foreign exchange conversion
	 * for entries transmitted using this code. For entries originated in a fixed value amount, the foreign Exchange Reference Field will be space filled.
	 *
	 * @return foreignExchangeIndicator required
	 **/
	public String getForeignExchangeIndicator() {
		return foreignExchangeIndicator;
	}

	public void setForeignExchangeIndicator(String foreignExchangeIndicator) {
		this.foreignExchangeIndicator = foreignExchangeIndicator;
	}

	public IATBatchHeader foreignExchangeReferenceIndicator(Integer foreignExchangeReferenceIndicator) {
		this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator;
		return this;
	}

	/**
	 * Code used to indicate the content of the Foreign Exchange Reference Field and is filled by the gateway operator. Valid entries are 1 - Foreign Exchange
	 * Rate | 2 - Foreign Exchange Reference Number | 3 - Space Filled
	 *
	 * @return foreignExchangeReferenceIndicator required
	 **/
	public Integer getForeignExchangeReferenceIndicator() {
		return foreignExchangeReferenceIndicator;
	}

	public void setForeignExchangeReferenceIndicator(Integer foreignExchangeReferenceIndicator) {
		this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator;
	}

	public IATBatchHeader foreignExchangeReference(String foreignExchangeReference) {
		this.foreignExchangeReference = foreignExchangeReference;
		return this;
	}

	/**
	 * Contains either the foreign exchange rate used to execute the foreign exchange conversion of a cross-border entry or another reference to the foreign
	 * exchange transaction.
	 *
	 * @return foreignExchangeReference required
	 **/
	public String getForeignExchangeReference() {
		return foreignExchangeReference;
	}

	public void setForeignExchangeReference(String foreignExchangeReference) {
		this.foreignExchangeReference = foreignExchangeReference;
	}

	public IATBatchHeader isODestinationCountryCode(String isODestinationCountryCode) {
		this.isODestinationCountryCode = isODestinationCountryCode;
		return this;
	}

	/**
	 * Two-character code, as approved by the International Organization for Standardization (ISO), to identify the country in which the entry is to be
	 * received. For United States use US.
	 *
	 * @return isODestinationCountryCode required
	 **/
	public String getIsODestinationCountryCode() {
		return isODestinationCountryCode;
	}

	public void setIsODestinationCountryCode(String isODestinationCountryCode) {
		this.isODestinationCountryCode = isODestinationCountryCode;
	}

	public IATBatchHeader originatorIdentification(String originatorIdentification) {
		this.originatorIdentification = originatorIdentification;
		return this;
	}

	/**
	 * For U.S. entities: the number assigned will be your tax ID (often Social Security Number) For non-U.S. entities: the number assigned will be your DDA
	 * number, or the last 9 characters of your account number if it exceeds 9 characters
	 *
	 * @return originatorIdentification required
	 **/
	public String getOriginatorIdentification() {
		return originatorIdentification;
	}

	public void setOriginatorIdentification(String originatorIdentification) {
		this.originatorIdentification = originatorIdentification;
	}

	public IATBatchHeader standardEntryClassCode(String standardEntryClassCode) {
		this.standardEntryClassCode = standardEntryClassCode;
		return this;
	}

	/**
	 * StandardEntryClassCode for consumer and non consumer international payments is IAT. Identifies the payment type (product) found within an ACH batch using
	 * a 3-character code. The SEC Code pertains to all items within batch. Determines format of the detail records. Determines addenda records (required or
	 * optional PLUS one or up to 9,999 records). Determines rules to follow (return time frames). Some SEC codes require specific data in predetermined fields
	 * within the ACH record.
	 *
	 * @return standardEntryClassCode required
	 **/
	public String getStandardEntryClassCode() {
		return standardEntryClassCode;
	}

	public void setStandardEntryClassCode(String standardEntryClassCode) {
		this.standardEntryClassCode = standardEntryClassCode;
	}

	public IATBatchHeader companyEntryDescription(String companyEntryDescription) {
		this.companyEntryDescription = companyEntryDescription;
		return this;
	}

	/**
	 * A description of the entries contained in the batch The Originator establishes the value of this field to provide a description of the purpose of the
	 * entry to be displayed back to the receiver. For example, "GAS BILL," "REG. SALARY," "INS. PREM," "SOC. SEC.," "DTC," "TRADE PAY," "PURCHASE," etc. This
	 * field must contain the word "REVERSAL" (left justified) when the batch contains reversing entries. This field must contain the word "RECLAIM" (left
	 * justified) when the batch contains reclamation entries. This field must contain the word "NONSETTLED" (left justified) when the batch contains entries
	 * which could not settle.
	 *
	 * @return companyEntryDescription required
	 **/
	public String getCompanyEntryDescription() {
		return companyEntryDescription;
	}

	public void setCompanyEntryDescription(String companyEntryDescription) {
		this.companyEntryDescription = companyEntryDescription;
	}

	public IATBatchHeader isOOriginatingCurrencyCode(String isOOriginatingCurrencyCode) {
		this.isOOriginatingCurrencyCode = isOOriginatingCurrencyCode;
		return this;
	}

	/**
	 * Three-character code, as approved by the International Organization for Standardization (ISO), to identify the currency denomination in which the entry
	 * was first originated. If the source of funds is within the territorial jurisdiction of the U.S., enter 'USD', otherwise refer to International
	 * Organization for Standardization website for value: www.iso.org
	 *
	 * @return isOOriginatingCurrencyCode required
	 **/
	public String getIsOOriginatingCurrencyCode() {
		return isOOriginatingCurrencyCode;
	}

	public void setIsOOriginatingCurrencyCode(String isOOriginatingCurrencyCode) {
		this.isOOriginatingCurrencyCode = isOOriginatingCurrencyCode;
	}

	public IATBatchHeader isODestinationCurrencyCode(String isODestinationCurrencyCode) {
		this.isODestinationCurrencyCode = isODestinationCurrencyCode;
		return this;
	}

	/**
	 * ISODestinationCurrencyCode is the three-character code, as approved by the International Organization for Standardization (ISO), to identify the currency
	 * denomination in which the entry will ultimately be settled. If the final destination of funds is within the territorial jurisdiction of the U.S., enter
	 * "USD", otherwise refer to International Organization for Standardization website for value: www.iso.org
	 *
	 * @return isODestinationCurrencyCode required
	 **/
	public String getIsODestinationCurrencyCode() {
		return isODestinationCurrencyCode;
	}

	public void setIsODestinationCurrencyCode(String isODestinationCurrencyCode) {
		this.isODestinationCurrencyCode = isODestinationCurrencyCode;
	}

	public IATBatchHeader effectiveEntryDate(LocalDate effectiveEntryDate) {
		this.effectiveEntryDate = effectiveEntryDate;
		return this;
	}

	/**
	 * EffectiveEntryDate the date on which the entries are to settle. Format YYMMDD (Y=Year, M=Month, D=Day)
	 *
	 * @return effectiveEntryDate required
	 **/
	public LocalDate getEffectiveEntryDate() {
		return effectiveEntryDate;
	}

	public void setEffectiveEntryDate(LocalDate effectiveEntryDate) {
		this.effectiveEntryDate = effectiveEntryDate;
	}

	public IATBatchHeader originatorStatusCode(Integer originatorStatusCode) {
		this.originatorStatusCode = originatorStatusCode;
		return this;
	}

	/**
	 * ODFI initiating the Entry. | 0 - ADV File prepared by an ACH Operator. | 1 - This code identifies the Originator as a depository financial institution. |
	 * 2 - This code identifies the Originator as a Federal Government entity or agency.
	 *
	 * @return originatorStatusCode required
	 **/
	public Integer getOriginatorStatusCode() {
		return originatorStatusCode;
	}

	public void setOriginatorStatusCode(Integer originatorStatusCode) {
		this.originatorStatusCode = originatorStatusCode;
	}

	public IATBatchHeader odFIIdentification(String odFIIdentification) {
		this.odFIIdentification = odFIIdentification;
		return this;
	}

	/**
	 * First 8 digits of the originating DFI transit routing number. For Inbound IAT Entries, this field contains the routing number of the U.S. Gateway
	 * Operator.  For Outbound IAT Entries, this field contains the standard routing number, as assigned by Accuity, that identifies the U.S. ODFI initiating
	 * the Entry. (Format TTTTAAAA - T=Federal Reserve Routing Symbol, A=ABA Institution Identifier)
	 *
	 * @return odFIIdentification required
	 **/
	public String getOdFIIdentification() {
		return odFIIdentification;
	}

	public void setOdFIIdentification(String odFIIdentification) {
		this.odFIIdentification = odFIIdentification;
	}

	public IATBatchHeader batchNumber(Integer batchNumber) {
		this.batchNumber = batchNumber;
		return this;
	}

	/**
	 * BatchNumber is assigned in ascending sequence to each batch by the ODFI or its Sending Point in a given file of entries. Since the batch number in the
	 * Batch Header Record and the Batch Control Record is the same, the ascending sequence number should be assigned by batch and not by record.
	 *
	 * @return batchNumber required
	 **/
	public Integer getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(Integer batchNumber) {
		this.batchNumber = batchNumber;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IATBatchHeader iaTBatchHeader = (IATBatchHeader) o;
		return Objects.equals(this.id, iaTBatchHeader.id) &&
			Objects.equals(this.serviceClassCode, iaTBatchHeader.serviceClassCode) &&
			Objects.equals(this.iaTIndicator, iaTBatchHeader.iaTIndicator) &&
			Objects.equals(this.foreignExchangeIndicator, iaTBatchHeader.foreignExchangeIndicator) &&
			Objects.equals(this.foreignExchangeReferenceIndicator, iaTBatchHeader.foreignExchangeReferenceIndicator) &&
			Objects.equals(this.foreignExchangeReference, iaTBatchHeader.foreignExchangeReference) &&
			Objects.equals(this.isODestinationCountryCode, iaTBatchHeader.isODestinationCountryCode) &&
			Objects.equals(this.originatorIdentification, iaTBatchHeader.originatorIdentification) &&
			Objects.equals(this.standardEntryClassCode, iaTBatchHeader.standardEntryClassCode) &&
			Objects.equals(this.companyEntryDescription, iaTBatchHeader.companyEntryDescription) &&
			Objects.equals(this.isOOriginatingCurrencyCode, iaTBatchHeader.isOOriginatingCurrencyCode) &&
			Objects.equals(this.isODestinationCurrencyCode, iaTBatchHeader.isODestinationCurrencyCode) &&
			Objects.equals(this.effectiveEntryDate, iaTBatchHeader.effectiveEntryDate) &&
			Objects.equals(this.originatorStatusCode, iaTBatchHeader.originatorStatusCode) &&
			Objects.equals(this.odFIIdentification, iaTBatchHeader.odFIIdentification) &&
			Objects.equals(this.batchNumber, iaTBatchHeader.batchNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
		                    serviceClassCode,
		                    iaTIndicator,
		                    foreignExchangeIndicator,
		                    foreignExchangeReferenceIndicator,
		                    foreignExchangeReference,
		                    isODestinationCountryCode,
		                    originatorIdentification,
		                    standardEntryClassCode,
		                    companyEntryDescription,
		                    isOOriginatingCurrencyCode,
		                    isODestinationCurrencyCode,
		                    effectiveEntryDate,
		                    originatorStatusCode,
		                    odFIIdentification,
		                    batchNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IATBatchHeader {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    serviceClassCode: ").append(toIndentedString(serviceClassCode)).append("\n");
		sb.append("    iaTIndicator: ").append(toIndentedString(iaTIndicator)).append("\n");
		sb.append("    foreignExchangeIndicator: ").append(toIndentedString(foreignExchangeIndicator)).append("\n");
		sb.append("    foreignExchangeReferenceIndicator: ").append(toIndentedString(foreignExchangeReferenceIndicator)).append("\n");
		sb.append("    foreignExchangeReference: ").append(toIndentedString(foreignExchangeReference)).append("\n");
		sb.append("    isODestinationCountryCode: ").append(toIndentedString(isODestinationCountryCode)).append("\n");
		sb.append("    originatorIdentification: ").append(toIndentedString(originatorIdentification)).append("\n");
		sb.append("    standardEntryClassCode: ").append(toIndentedString(standardEntryClassCode)).append("\n");
		sb.append("    companyEntryDescription: ").append(toIndentedString(companyEntryDescription)).append("\n");
		sb.append("    isOOriginatingCurrencyCode: ").append(toIndentedString(isOOriginatingCurrencyCode)).append("\n");
		sb.append("    isODestinationCurrencyCode: ").append(toIndentedString(isODestinationCurrencyCode)).append("\n");
		sb.append("    effectiveEntryDate: ").append(toIndentedString(effectiveEntryDate)).append("\n");
		sb.append("    originatorStatusCode: ").append(toIndentedString(originatorStatusCode)).append("\n");
		sb.append("    odFIIdentification: ").append(toIndentedString(odFIIdentification)).append("\n");
		sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
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
