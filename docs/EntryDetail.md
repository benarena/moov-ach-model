# EntryDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | Entry Detail ID |  [optional]
**transactionCode** | **Integer** | Based on transaction type: 22 - Credit (deposit) to checking account | 23 - Prenote for credit to checking account | 27 - Debit (withdrawal) to checking account | 28 - Prenote for debit to checking account | 32 - Credit to savings account | 33 - Prenote for credit to savings account | 37 - Debit to savings account | 38 - Prenote for debit to savings account  | 
**rdFIIdentification** | **String** | RDFI&#x27;s routing number without the last digit. | 
**checkDigit** | **String** | Last digit in RDFI routing number. | 
**dfIAccountNumber** | **String** | The receiver&#x27;s bank account number you are crediting/debiting. It important to note that this is an alphanumeric field, so it&#x27;s space padded, not zero padded  | 
**amount** | **Integer** | Number of cents you are debiting/crediting this account | 
**identificationNumber** | **String** | Internal identification (alphanumeric) that you use to uniquely identify this Entry Detail Record |  [optional]
**individualName** | **String** | The name of the receiver, usually the name on the bank account | 
**discretionaryData** | **String** | DiscretionaryData allows ODFIs to include codes, of significance only to them, to enable specialized handling of the entry. There will be no standardized interpretation for the value of this field. It can either be a single two-character code, or two distinct one-character codes, according to the needs of the ODFI and/or Originator involved. This field must be returned intact for any returned entry. WEB uses the Discretionary Data Field as the Payment Type Code.  |  [optional]
**addendaRecordIndicator** | **Integer** | AddendaRecordIndicator indicates the existence of an Addenda Record. A value of \&quot;1\&quot; indicates that one or more addenda records follow, and \&quot;0\&quot; means no such record is present.  |  [optional]
**traceNumber** | **String** | TraceNumber assigned by the ODFI in ascending sequence, is included in each Entry Detail Record, Corporate Entry Detail Record, and Addenda Record. Trace Numbers uniquely identify each entry within a batch in an ACH input file. In association with the Batch Number, transmission (File Creation) Date, and File ID Modifier, the Trace Number uniquely identifies an entry within a given file. For Addenda Records, the Trace Number will be identical to the Trace Number in the associated Entry Detail Record, since the Trace Number is associated with an entry or item rather than a physical record.  |  [optional]
**addenda02** | [**Addenda02**](Addenda02.md) |  |  [optional]
**addenda05** | [**List&lt;Addenda05&gt;**](Addenda05.md) | List of Addenda05 records |  [optional]
**addenda98** | [**Addenda98**](Addenda98.md) |  |  [optional]
**addenda99** | [**Addenda99**](Addenda99.md) |  |  [optional]
**category** | **String** | Category defines if the entry is a Forward, Return, or NOC |  [optional]
