# Addenda13

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 13 - NACHA regulations | 
**odFIName** | **String** | Originating DFI Name For Outbound IAT Entries, this field must contain the name of the U.S. ODFI. For Inbound IATs: Name of the foreign bank providing funding for the payment transaction  | 
**odFIIDNumberQualifier** | **String** | Originating DFI Identification Number Qualifier. For Inbound IATs: The 2-digit code that identifies the numbering scheme used in the Foreign DFI Identification Number field: &#x27;01&#x27; &#x3D; National Clearing System | &#x27;02&#x27; &#x3D; BIC Code | &#x27;03&#x27; &#x3D; IBAN Code  | 
**odFIBranchCountryCode** | **String** | Originating DFI Branch Country Code: USb &#x3D; United States //(\&quot;b\&quot; indicates a blank space) For Inbound IATs: This 3 position field contains a 2-character code as approved by the International Organization for Standardization (ISO) used to identify the country in which the branch of the bank that originated the entry is located. Values for other countries can be found on the International Organization for Standardization website: www.iso.org.  | 
**entryDetailSequenceNumber** | [**BigDecimal**](BigDecimal.md) | EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record&#x27;s trace number. This number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.  | 
