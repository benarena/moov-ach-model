# ADVBatchControl

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | Batch ID |  [optional]
**serviceClassCode** | **Integer** | Same as ServiceClassCode in BatchHeader record | 
**entryAddendaCount** | **Integer** | EntryAddendaCount is a tally of each Entry Detail Record and each Addenda Record processed, within either the batch or file as appropriate. | 
**entryHash** | **Integer** | Validate the Receiving DFI Identification in each Entry Detail Record is hashed to provide a check against inadvertent alteration of data contents due to hardware failure or program error. In this context the Entry Hash is the sum of the corresponding fields in the Entry Detail Records on the file.  | 
**totalDebit** | **Integer** | Contains accumulated Entry debit totals within the batch. | 
**totalCredit** | **Integer** | Contains accumulated Entry credit totals within the batch. | 
**achOperatorData** | **String** | Alphanumeric code used to identify an ACH Operator | 
**odFIIdentification** | **String** | The routing number is used to identify the DFI originating entries within a given branch. | 
**batchNumber** | **Integer** | BatchNumber is assigned in ascending sequence to each batch by the ODFI or its Sending Point in a given file of entries. Since the batch number in the Batch Header Record and the Batch Control Record is the same, the ascending sequence number should be assigned by batch and not by record. | 
