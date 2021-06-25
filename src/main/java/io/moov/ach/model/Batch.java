package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Batch
 */
@JsonInclude(Include.NON_NULL)
public class Batch {

	@JsonProperty("batchHeader")
	private BatchHeader batchHeader = null;

	@JsonProperty("entryDetails")
	private List<EntryDetail> entryDetails = new ArrayList<EntryDetail>();

	@JsonProperty("batchControl")
	private BatchControl batchControl = null;

	@JsonProperty("offset")
	private Offset offset = null;

	public Batch batchHeader(BatchHeader batchHeader) {
		this.batchHeader = batchHeader;
		return this;
	}

	/**
	 * Get batchHeader
	 *
	 * @return batchHeader required
	 **/
	public BatchHeader getBatchHeader() {
		return batchHeader;
	}

	public void setBatchHeader(BatchHeader batchHeader) {
		this.batchHeader = batchHeader;
	}

	public Batch entryDetails(List<EntryDetail> entryDetails) {
		this.entryDetails = entryDetails;
		return this;
	}

	public Batch addEntryDetailsItem(EntryDetail entryDetailsItem) {
		this.entryDetails.add(entryDetailsItem);
		return this;
	}

	/**
	 * Get entryDetails
	 *
	 * @return entryDetails required
	 **/
	public List<EntryDetail> getEntryDetails() {
		return entryDetails;
	}

	public void setEntryDetails(List<EntryDetail> entryDetails) {
		this.entryDetails = entryDetails;
	}

	public Batch batchControl(BatchControl batchControl) {
		this.batchControl = batchControl;
		return this;
	}

	/**
	 * Get batchControl
	 *
	 * @return batchControl required
	 **/
	public BatchControl getBatchControl() {
		return batchControl;
	}

	public void setBatchControl(BatchControl batchControl) {
		this.batchControl = batchControl;
	}

	public Batch offset(Offset offset) {
		this.offset = offset;
		return this;
	}

	/**
	 * Get offset
	 *
	 * @return offset required
	 **/
	public Offset getOffset() {
		return offset;
	}

	public void setOffset(Offset offset) {
		this.offset = offset;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Batch batch = (Batch) o;
		return Objects.equals(this.batchHeader, batch.batchHeader) &&
			Objects.equals(this.entryDetails, batch.entryDetails) &&
			Objects.equals(this.batchControl, batch.batchControl) &&
			Objects.equals(this.offset, batch.offset);
	}

	@Override
	public int hashCode() {
		return Objects.hash(batchHeader, entryDetails, batchControl, offset);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Batch {\n");

		sb.append("    batchHeader: ").append(toIndentedString(batchHeader)).append("\n");
		sb.append("    entryDetails: ").append(toIndentedString(entryDetails)).append("\n");
		sb.append("    batchControl: ").append(toIndentedString(batchControl)).append("\n");
		sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
