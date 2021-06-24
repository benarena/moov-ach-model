# Addenda98

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 98 - NACHA regulations | 
**changeCode** | **String** | ChangeCode field contains a standard code used by an ACH Operator or RDFI to describe the reason for a change Entry. | 
**originalTrace** | **String** | OriginalTrace This field contains the Trace Number as originally included on the forward Entry or Prenotification. The RDFI must include the Original Entry Trace Number in the Addenda Record of an Entry being returned to an ODFI, in the Addenda Record of an 98, within an Acknowledgment Entry, or with an RDFI request for a copy of an authorization.  | 
**originalDFI** | **String** | The Receiving DFI Identification (addenda.RDFIIdentification) as originally included on the forward Entry or Prenotification that the RDFI is returning or correcting. | 
**correctedData** | **String** | Correct field value of what changeCode references | 
**traceNumber** | **String** | Entry Detail Trace Number |  [optional]
