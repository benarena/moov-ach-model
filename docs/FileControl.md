# FileControl

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | File ID | 
**batchCount** | **Integer** | Count of Batches in the File | 
**blockCount** | **Integer** | Total number of records in the file (include all headers and trailer) divided by 10 (This number must be evenly divisible by 10. If not, additional records consisting of all 9&#x27;s are added to the file after the initial &#x27;9&#x27; record to fill out the block 10.)  | 
**entryAddendaCount** | **Integer** | Total detail and addenda records in the file | 
**entryHash** | **Integer** | Calculated in the same manner as the batch total but includes total from entire file | 
**totalDebit** | **Integer** | Accumulated Batch debit totals within the file. | 
**totalCredit** | **Integer** | Accumulated Batch credit totals within the file. | 
