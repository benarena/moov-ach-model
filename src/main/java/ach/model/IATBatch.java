package ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IATBatch
 */
@JsonInclude(Include.NON_NULL)
public class IATBatch {

	@JsonProperty("ID")
	private String id = null;

	@JsonProperty("IATBatchHeader")
	private IATBatchHeader iaTBatchHeader = null;

	@JsonProperty("IATEntryDetails")
	private List<IATEntryDetail> iaTEntryDetails = new ArrayList<IATEntryDetail>();

	@JsonProperty("batchControl")
	private BatchControl batchControl = null;

	public IATBatch ID(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Client-defined string used as a reference to this record.
	 *
	 * @return ID
	 **/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public IATBatch iaTBatchHeader(IATBatchHeader iaTBatchHeader) {
		this.iaTBatchHeader = iaTBatchHeader;
		return this;
	}

	/**
	 * Get iaTBatchHeader
	 *
	 * @return iaTBatchHeader required
	 **/
	public IATBatchHeader getIaTBatchHeader() {
		return iaTBatchHeader;
	}

	public void setIaTBatchHeader(IATBatchHeader iaTBatchHeader) {
		this.iaTBatchHeader = iaTBatchHeader;
	}

	public IATBatch iaTEntryDetails(List<IATEntryDetail> iaTEntryDetails) {
		this.iaTEntryDetails = iaTEntryDetails;
		return this;
	}

	public IATBatch addIaTEntryDetailsItem(IATEntryDetail iaTEntryDetailsItem) {
		this.iaTEntryDetails.add(iaTEntryDetailsItem);
		return this;
	}

	/**
	 * Get iaTEntryDetails
	 *
	 * @return iaTEntryDetails required
	 **/
	public List<IATEntryDetail> getIaTEntryDetails() {
		return iaTEntryDetails;
	}

	public void setIaTEntryDetails(List<IATEntryDetail> iaTEntryDetails) {
		this.iaTEntryDetails = iaTEntryDetails;
	}

	public IATBatch batchControl(BatchControl batchControl) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IATBatch iaTBatch = (IATBatch) o;
		return Objects.equals(this.id, iaTBatch.id) &&
			Objects.equals(this.iaTBatchHeader, iaTBatch.iaTBatchHeader) &&
			Objects.equals(this.iaTEntryDetails, iaTBatch.iaTEntryDetails) &&
			Objects.equals(this.batchControl, iaTBatch.batchControl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, iaTBatchHeader, iaTEntryDetails, batchControl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IATBatch {\n");

		sb.append("    ID: ").append(toIndentedString(id)).append("\n");
		sb.append("    iaTBatchHeader: ").append(toIndentedString(iaTBatchHeader)).append("\n");
		sb.append("    iaTEntryDetails: ").append(toIndentedString(iaTEntryDetails)).append("\n");
		sb.append("    batchControl: ").append(toIndentedString(batchControl)).append("\n");
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
