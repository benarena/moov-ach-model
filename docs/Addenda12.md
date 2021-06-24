# Addenda12

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 12 - NACHA regulations | 
**originatorCityStateProvince** | **String** | Originator City &amp; State / Province Data elements City and State / Province  should be separated with an asterisk (*) as a delimiter and the field should end with a backslash (\\\\).  | 
**originatorCountryPostalCode** | **String** | Originator Country &amp; Postal Code Data elements must be separated by an asterisk (*) and must end with a backslash (\\\\).  | 
**entryDetailSequenceNumber** | [**BigDecimal**](BigDecimal.md) | EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record&#x27;s trace number. This number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.  | 
