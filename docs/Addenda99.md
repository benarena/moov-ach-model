# Addenda99

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 99 - NACHA regulations | 
**returnCode** | **String** | Standard code used by an ACH Operator or RDFI to describe the reason for returning an Entry. | 
**originalTrace** | **String** | OriginalTrace This field contains the Trace Number as originally included on the forward Entry or Prenotification. The RDFI must include the Original Entry Trace Number in the Addenda Record of an Entry being returned to an ODFI, in the Addenda Record of an 98, within an Acknowledgment Entry, or with an RDFI request for a copy of an authorization.  | 
**dateOfDeath** | **String** | The field date of death is to be supplied on Entries being returned for reason of death (return reason codes R14 and R15). (Format YYMMDD - Y&#x3D;Year, M&#x3D;Month, D&#x3D;Day) | 
**originalDFI** | **String** | Contains the Receiving DFI Identification (addenda.RDFIIdentification) as originally included on the forward Entry or Prenotification that the RDFI is returning or correcting. | 
**addendaInformation** | **String** | Information related to the return |  [optional]
**traceNumber** | **String** | Matches the Entry Detail Trace Number of the entry being returned. |  [optional]
