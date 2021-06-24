# ADVEntryDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | Entry Detail ID |  [optional]
**transactionCode** | **Integer** | TransactionCode representing Accounting Entries: 81 - Credit for ACH debits originated | 82 - Debit for ACH credits originated | 83 - Credit for ACH credits received | 84 - Debit for ACH debits received | 85 - Credit for ACH credits in rejected batches | 86 - Debit for ACH debits in rejected batches | 87 - Summary credit for respondent ACH activity | 88 - Summary debit for respondent ACH activity  | 
**rdFIIdentification** | **String** | RDFI&#x27;s routing number without the last digit. | 
**checkDigit** | **String** | Last digit in RDFI routing number. | 
**dfIAccountNumber** | **String** | The receiver&#x27;s bank account number you are crediting/debiting. It important to note that this is an alphanumeric field, so it&#x27;s space padded, not zero padded  | 
**amount** | **Integer** | Number of cents you are debiting/crediting this account | 
**adviceRoutingNumber** | **String** | Suggested routing number to use | 
**fileIdentification** | **String** | Unique identifier for the File |  [optional]
**achOperatorData** | **String** | Information related to the ACH opreator |  [optional]
**individualName** | **String** | The name of the receiver, usually the name on the bank account | 
**discretionaryData** | **String** | DiscretionaryData allows ODFIs to include codes, of significance only to them, to enable specialized handling of the entry. There will be no standardized interpretation for the value of this field. It can either be a single two-character code, or two distinct one-character codes, according to the needs of the ODFI and/or Originator involved. This field must be returned intact for any returned entry. WEB uses the Discretionary Data Field as the Payment Type Code.  |  [optional]
**addendaRecordIndicator** | **Integer** | AddendaRecordIndicator indicates the existence of an Addenda Record. A value of \&quot;1\&quot; indicates that one or more addenda records follow, and \&quot;0\&quot; means no such record is present.  |  [optional]
**achOperatorRoutingNumber** | **String** | Routing number for ACH Operator | 
**julianDay** | [**BigDecimal**](BigDecimal.md) | Julian Day of the year |  [optional]
**sequenceNumber** | [**BigDecimal**](BigDecimal.md) | SequenceNumber is consecutively assigned to each Addenda05 Record following an Entry Detail Record. The first Addenda05 sequence number must always be a 1. | 
**addenda99** | [**List&lt;Addenda99&gt;**](Addenda99.md) | Addenda99 record for the Entry Detail |  [optional]
**category** | **String** | Category defines if the entry is a Forward, Return, or NOC |  [optional]
