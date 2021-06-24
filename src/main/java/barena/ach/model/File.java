package barena.ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * File
 */
@JsonInclude(Include.NON_NULL)
public class File {

	@JsonProperty("ID")
	private String ID = null;

	@JsonProperty("fileHeader")
	private FileHeader fileHeader = null;

	@JsonProperty("batches")
	private List<Batch> batches = null;

	@JsonProperty("IATBatches")
	private List<IATBatch> iaTBatches = null;

	@JsonProperty("fileControl")
	private FileControl fileControl = null;

	@JsonProperty("NotificationOfChange")
	private List<Batch> notificationOfChange = null;

	@JsonProperty("ReturnEntries")
	private List<Batch> returnEntries = null;

	public File ID(String ID) {
		this.ID = ID;
		return this;
	}

	/**
	 * File ID
	 *
	 * @return ID required
	 **/
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public File fileHeader(FileHeader fileHeader) {
		this.fileHeader = fileHeader;
		return this;
	}

	/**
	 * Get fileHeader
	 *
	 * @return fileHeader required
	 **/
	public FileHeader getFileHeader() {
		return fileHeader;
	}

	public void setFileHeader(FileHeader fileHeader) {
		this.fileHeader = fileHeader;
	}

	public File batches(List<Batch> batches) {
		this.batches = batches;
		return this;
	}

	public File addBatchesItem(Batch batchesItem) {
		if (this.batches == null) {
			this.batches = new ArrayList<Batch>();
		}
		this.batches.add(batchesItem);
		return this;
	}

	/**
	 * Get batches
	 *
	 * @return batches
	 **/
	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	public File iaTBatches(List<IATBatch> iaTBatches) {
		this.iaTBatches = iaTBatches;
		return this;
	}

	public File addIaTBatchesItem(IATBatch iaTBatchesItem) {
		if (this.iaTBatches == null) {
			this.iaTBatches = new ArrayList<IATBatch>();
		}
		this.iaTBatches.add(iaTBatchesItem);
		return this;
	}

	/**
	 * Get iaTBatches
	 *
	 * @return iaTBatches
	 **/
	public List<IATBatch> getIaTBatches() {
		return iaTBatches;
	}

	public void setIaTBatches(List<IATBatch> iaTBatches) {
		this.iaTBatches = iaTBatches;
	}

	public File fileControl(FileControl fileControl) {
		this.fileControl = fileControl;
		return this;
	}

	/**
	 * Get fileControl
	 *
	 * @return fileControl required
	 **/
	public FileControl getFileControl() {
		return fileControl;
	}

	public void setFileControl(FileControl fileControl) {
		this.fileControl = fileControl;
	}

	public File notificationOfChange(List<Batch> notificationOfChange) {
		this.notificationOfChange = notificationOfChange;
		return this;
	}

	public File addNotificationOfChangeItem(Batch notificationOfChangeItem) {
		if (this.notificationOfChange == null) {
			this.notificationOfChange = new ArrayList<Batch>();
		}
		this.notificationOfChange.add(notificationOfChangeItem);
		return this;
	}

	/**
	 * Get notificationOfChange
	 *
	 * @return notificationOfChange
	 **/
	public List<Batch> getNotificationOfChange() {
		return notificationOfChange;
	}

	public void setNotificationOfChange(List<Batch> notificationOfChange) {
		this.notificationOfChange = notificationOfChange;
	}

	public File returnEntries(List<Batch> returnEntries) {
		this.returnEntries = returnEntries;
		return this;
	}

	public File addReturnEntriesItem(Batch returnEntriesItem) {
		if (this.returnEntries == null) {
			this.returnEntries = new ArrayList<Batch>();
		}
		this.returnEntries.add(returnEntriesItem);
		return this;
	}

	/**
	 * Get returnEntries
	 *
	 * @return returnEntries
	 **/
	public List<Batch> getReturnEntries() {
		return returnEntries;
	}

	public void setReturnEntries(List<Batch> returnEntries) {
		this.returnEntries = returnEntries;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		File file = (File) o;
		return Objects.equals(this.ID, file.ID) &&
			Objects.equals(this.fileHeader, file.fileHeader) &&
			Objects.equals(this.batches, file.batches) &&
			Objects.equals(this.iaTBatches, file.iaTBatches) &&
			Objects.equals(this.fileControl, file.fileControl) &&
			Objects.equals(this.notificationOfChange, file.notificationOfChange) &&
			Objects.equals(this.returnEntries, file.returnEntries);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, fileHeader, batches, iaTBatches, fileControl, notificationOfChange, returnEntries);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class File {\n");

		sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
		sb.append("    fileHeader: ").append(toIndentedString(fileHeader)).append("\n");
		sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
		sb.append("    iaTBatches: ").append(toIndentedString(iaTBatches)).append("\n");
		sb.append("    fileControl: ").append(toIndentedString(fileControl)).append("\n");
		sb.append("    notificationOfChange: ").append(toIndentedString(notificationOfChange)).append("\n");
		sb.append("    returnEntries: ").append(toIndentedString(returnEntries)).append("\n");
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
