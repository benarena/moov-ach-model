# Addenda05

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 05 - NACHA regulations | 
**paymentRelatedInformation** | **String** | Text for describing the related payment | 
**sequenceNumber** | [**BigDecimal**](BigDecimal.md) | SequenceNumber is consecutively assigned to each Addenda05 Record following an Entry Detail Record. The first Addenda05 sequence number must always be a 1. | 
**entryDetailSequenceNumber** | [**BigDecimal**](BigDecimal.md) | EntryDetailSequenceNumber contains the ascending sequence number section of the Entry Detail or Corporate Entry Detail Record&#x27;s trace number. This number is the same as the last seven digits of the trace number of the related Entry Detail Record or Corporate Entry Detail Record.  | 
