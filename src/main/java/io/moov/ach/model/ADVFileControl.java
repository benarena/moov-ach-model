package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ADVFileControl record contains entry counts, dollar totals and hash
 * totals accumulated from each ADVBatchControl record in the file.
 */
@JsonInclude(Include.NON_NULL)
public class ADVFileControl {

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("recordType")
	private String recordType = "9";

	@JsonProperty("batchCount")
	private Integer batchCount = null;

	@JsonProperty("blockCount")
	private Integer blockCount = null;

	@JsonProperty("entryAddendaCount")
	private Integer entryAddendaCount = null;

	@JsonProperty("entryHash")
	private Integer entryHash = null;

	@JsonProperty("totalDebit")
	private Integer totalDebit = null;

	@JsonProperty("totalCredit")
	private Integer totalCredit = null;

	public ADVFileControl id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * File id
	 *
	 * @return id required
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ADVFileControl recordType(String recordType) {
		this.recordType = recordType;
		return this;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(final String recordType) {
		this.recordType = recordType;
	}

	public ADVFileControl batchCount(Integer batchCount) {
		this.batchCount = batchCount;
		return this;
	}

	/**
	 * Count of Batches in the File
	 * minimum: 1
	 *
	 * @return batchCount required
	 **/
	public Integer getBatchCount() {
		return batchCount;
	}

	public void setBatchCount(Integer batchCount) {
		this.batchCount = batchCount;
	}

	public ADVFileControl blockCount(Integer blockCount) {
		this.blockCount = blockCount;
		return this;
	}

	/**
	 * Total number of records in the file (include all headers and trailer) divided by 10 (This number must be evenly divisible by 10. If not, additional
	 * records consisting of all 9's are added to the file after the initial '9' record to fill out the block 10.)
	 *
	 * @return blockCount required
	 **/
	public Integer getBlockCount() {
		return blockCount;
	}

	public void setBlockCount(Integer blockCount) {
		this.blockCount = blockCount;
	}

	public ADVFileControl entryAddendaCount(Integer entryAddendaCount) {
		this.entryAddendaCount = entryAddendaCount;
		return this;
	}

	/**
	 * Total detail and addenda records in the file
	 * minimum: 1
	 *
	 * @return entryAddendaCount required
	 **/
	public Integer getEntryAddendaCount() {
		return entryAddendaCount;
	}

	public void setEntryAddendaCount(Integer entryAddendaCount) {
		this.entryAddendaCount = entryAddendaCount;
	}

	public ADVFileControl entryHash(Integer entryHash) {
		this.entryHash = entryHash;
		return this;
	}

	/**
	 * Calculated in the same manner as the batch total but includes total from entire file
	 *
	 * @return entryHash required
	 **/
	public Integer getEntryHash() {
		return entryHash;
	}

	public void setEntryHash(Integer entryHash) {
		this.entryHash = entryHash;
	}

	public ADVFileControl totalDebit(Integer totalDebit) {
		this.totalDebit = totalDebit;
		return this;
	}

	/**
	 * Accumulated Batch debit totals within the file.
	 *
	 * @return totalDebit required
	 **/
	public Integer getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(Integer totalDebit) {
		this.totalDebit = totalDebit;
	}

	public ADVFileControl totalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
		return this;
	}

	/**
	 * Accumulated Batch credit totals within the file.
	 *
	 * @return totalCredit required
	 **/
	public Integer getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(Integer totalCredit) {
		this.totalCredit = totalCredit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ADVFileControl fileControl = (ADVFileControl) o;
		return Objects.equals(this.id, fileControl.id) &&
			Objects.equals(this.batchCount, fileControl.batchCount) &&
			Objects.equals(this.blockCount, fileControl.blockCount) &&
			Objects.equals(this.entryAddendaCount, fileControl.entryAddendaCount) &&
			Objects.equals(this.entryHash, fileControl.entryHash) &&
			Objects.equals(this.totalDebit, fileControl.totalDebit) &&
			Objects.equals(this.totalCredit, fileControl.totalCredit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, batchCount, blockCount, entryAddendaCount, entryHash, totalDebit, totalCredit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ADVFileControl {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    batchCount: ").append(toIndentedString(batchCount)).append("\n");
		sb.append("    blockCount: ").append(toIndentedString(blockCount)).append("\n");
		sb.append("    entryAddendaCount: ").append(toIndentedString(entryAddendaCount)).append("\n");
		sb.append("    entryHash: ").append(toIndentedString(entryHash)).append("\n");
		sb.append("    totalDebit: ").append(toIndentedString(totalDebit)).append("\n");
		sb.append("    totalCredit: ").append(toIndentedString(totalCredit)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
