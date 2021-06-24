# Addenda10

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 10 - NACHA regulations | 
**transactionTypeCode** | **String** | Describes the type of payment: &#x27;ANN&#x27; &#x3D; Annuity | &#x27;BUS&#x27; &#x3D; Business/Commercial | &#x27;DEP&#x27; &#x3D; Deposit | &#x27;LOA&#x27; &#x3D; Loan | &#x27;MIS&#x27; &#x3D; Miscellaneous | &#x27;MOR&#x27; &#x3D; Mortgage | &#x27;PEN&#x27; &#x3D; Pension | &#x27;RLS&#x27; &#x3D; Rent/Lease | &#x27;REM&#x27; &#x3D; Remittance2 | &#x27;SAL&#x27; &#x3D; Salary/Payroll | &#x27;TAX&#x27; &#x3D; Tax | &#x27;TEL&#x27; &#x3D; Telephone-Initiated Transaction | &#x27;WEB&#x27; &#x3D; Internet-Initiated Transaction | &#x27;ARC&#x27; &#x3D; Accounts Receivable Entry | &#x27;BOC&#x27; &#x3D; Back Office Conversion Entry | &#x27;POP&#x27; &#x3D; Point of Purchase Entry | &#x27;RCK&#x27; &#x3D; Re-presented Check Entry  |  [optional]
**foreignPaymentAmount** | [**BigDecimal**](BigDecimal.md) | For inbound IAT payments this field should contain the USD amount or may be blank. | 
**foreignTraceNumber** | **String** | Trace number |  [optional]
**name** | **String** | Receiving Company Name/Individual Name | 
**entryDetailSequenceNumber** | [**BigDecimal**](BigDecimal.md) | EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record&#x27;s trace number. This number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.  | 
