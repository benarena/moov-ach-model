# Addenda02

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-defined string used as a reference to this record. |  [optional]
**typeCode** | **String** | 02 - NACHA regulations | 
**referenceInformationOne** | **String** | ReferenceInformationOne may be used for additional reference numbers, identification numbers, or codes that the merchant needs to identify the particular transaction or customer.  |  [optional]
**referenceInformationTwo** | **String** | ReferenceInformationTwo may be used for additional reference numbers, identification numbers, or codes that the merchant needs to identify the particular transaction or customer.  |  [optional]
**terminalIdentificationCode** | **String** | TerminalIdentificationCode identifies an Electronic terminal with a unique code that allows a terminal owner and/or switching network to identify the terminal at which an Entry originated.  | 
**transactionSerialNumber** | **String** | TransactionSerialNumber is assigned by the terminal at the time the transaction is originated.  The number, with the Terminal Identification Code, serves as an audit trail for the transaction and is usually assigned in ascending sequence.  | 
**transactionDate** | **String** | Timestamp identifies the date on which the transaction occurred. (Format MMDD - M&#x3D;Month, D&#x3D;Day) | 
**authorizationCodeOrExpireDate** | **String** | Indicates the code that a card authorization center has furnished to the merchant. |  [optional]
**terminalLocation** | **String** | Identifies the specific location of a terminal (i.e., street names of an intersection, address, etc.) in accordance with the requirements of Regulation E. | 
**terminalCity** | **String** | Identifies the city in which the electronic terminal is located. | 
**terminalState** | **String** | Identifies the state in which the electronic terminal is located. | 
**traceNumber** | **String** | Entry Detail Trace Number |  [optional]
