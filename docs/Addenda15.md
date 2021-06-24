# Addenda15

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 15 - NACHA regulations | 
**receiverIDNumber** | **String** | Receiver Identification Number contains the accounting number by which the Originator is known to the Receiver for descriptive purposes. NACHA Rules recommend but do not require the RDFI to print the contents of this field on the receiver&#x27;s statement.  |  [optional]
**receiverStreetAddress** | **String** | Receiver&#x27;s physical address | 
**entryDetailSequenceNumber** | [**BigDecimal**](BigDecimal.md) | EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record&#x27;s trace number. This number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.  | 
