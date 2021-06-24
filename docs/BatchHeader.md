# BatchHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **String** | A client-defined ID used as a reference to this batch |  [optional]
**serviceClassCode** | **Integer** | Service Class Code - Mixed Debits and Credits &#x27;200&#x27;, ACH Credits Only &#x27;220&#x27;, or ACH Debits Only &#x27;225&#x27; | 
**companyName** | **String** | Company originating the entries in the batch | 
**companyDiscretionaryData** | **String** | The 9 digit FEIN number (proceeded by a predetermined alpha or numeric character) of the entity in the company name field |  [optional]
**companyIdentification** | **String** | Alphanumeric code used to identify an Originator. The Company Identification Field must be included on all prenotification records and on each entry initiated pursuant to such prenotification. The Company ID may begin with the ANSI one-digit Identification Code Designator (ICD), followed by the identification number. Possible ICDs are the IRS Employer Identification Number (EIN) \&quot;1\&quot;, Data Universal Numbering Systems (DUNS) \&quot;3\&quot;, or User Assigned Number \&quot;9\&quot;.  | 
**standardEntryClassCode** | **String** | Identifies the payment type (product) found within an ACH batch using a 3-character code. | 
**companyEntryDescription** | **String** | A description of the entries contained in the batch. The Originator establishes the value of this field to provide a description of the purpose of the entry to be displayed back to the receiver. For example, \&quot;GAS BILL,\&quot; \&quot;REG. SALARY,\&quot; \&quot;INS. PREM,\&quot;, \&quot;SOC. SEC.,\&quot; \&quot;DTC,\&quot; \&quot;TRADE PAY,\&quot; \&quot;PURCHASE,\&quot; etc. This field must contain the word \&quot;REVERSAL\&quot; (left justified) when the batch contains reversing entries. This field must contain the word \&quot;RECLAIM\&quot; (left justified) when the batch contains reclamation entries. This field must contain the word \&quot;NONSETTLED\&quot; (left justified) when the batch contains entries which could not settle.  |  [optional]
**companyDescriptiveDate** | **String** | The Originator establishes this field as the date it would like to see displayed to the receiver for descriptive purposes. This field is never used to control timing of any computer or manual operation. It is solely for descriptive purposes. The RDFI should not assume any specific format.  |  [optional]
**effectiveEntryDate** | **String** | Date on which the entries are to settle. (Format YYMMDD - Y&#x3D;Year, M&#x3D;Month, D&#x3D;Day) |  [optional]
**originatorStatusCode** | **Integer** | ODFI initiating the Entry. | 0 - ADV File prepared by an ACH Operator. | 1 - This code identifies the Originator as a depository financial institution. | 2 - This code identifies the Originator as a Federal Government entity or agency.  |  [optional]
**odFIIdentification** | **String** | First 8 digits of the originating DFI transit routing number | 
**batchNumber** | **Integer** | BatchNumber is assigned in ascending sequence to each batch by the ODFI or its Sending Point in a given file of entries. Since the batch number in the Batch Header Record and the Batch Control Record is the same, the ascending sequence number should be assigned by batch and not by record.  | 
