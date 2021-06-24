# IATEntryDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | Entry Detail ID |  [optional]
**transactionCode** | **Integer** | Based on transaction type: 22 - Credit (deposit) to checking account | 23 - Prenote for credit to checking account | 27 - Debit (withdrawal) to checking account | 28 - Prenote for debit to checking account | 32 - Credit to savings account | 33 - Prenote for credit to savings account | 37 - Debit to savings account | 38 - Prenote for debit to savings account  | 
**rdFIIdentification** | **String** | RDFI&#x27;s routing number without the last digit. | 
**checkDigit** | **String** | Last digit in RDFI routing number. | 
**addendaRecords** | [**BigDecimal**](BigDecimal.md) | Number of Addenda Records | 
**amount** | **Integer** | Number of cents you are debiting/crediting this account | 
**dfIAccountNumber** | **String** | The receiver&#x27;s bank account number you are crediting/debiting. It important to note that this is an alphanumeric field, so it&#x27;s space padded, not zero padded  | 
**ofACScreeningIndicator** | **String** | Signifies if the record has been screened against OFAC records | 
**secondaryOFACScreeningIndicator** | **String** | Signifies if the record has been screened against OFAC records by a secondary entry | 
**addendaRecordIndicator** | **Integer** | AddendaRecordIndicator indicates the existence of an Addenda Record. A value of \&quot;1\&quot; indicates that one or more addenda records follow, and \&quot;0\&quot; means no such record is present.  | 
**traceNumber** | **String** | Matches the Entry Detail Trace Number of the entry being returned. |  [optional]
**addenda10** | [**Addenda10**](Addenda10.md) |  | 
**addenda11** | [**Addenda11**](Addenda11.md) |  | 
**addenda12** | [**Addenda12**](Addenda12.md) |  | 
**addenda13** | [**Addenda13**](Addenda13.md) |  | 
**addenda14** | [**Addenda14**](Addenda14.md) |  | 
**addenda15** | [**Addenda15**](Addenda15.md) |  | 
**addenda16** | [**Addenda16**](Addenda16.md) |  | 
**addenda17** | [**Addenda17**](Addenda17.md) |  |  [optional]
**addenda18** | [**Addenda18**](Addenda18.md) |  |  [optional]
**addenda98** | [**Addenda98**](Addenda98.md) |  |  [optional]
**addenda99** | [**Addenda99**](Addenda99.md) |  |  [optional]
**category** | **String** | Category defines if the entry is a Forward, Return, or NOC |  [optional]
