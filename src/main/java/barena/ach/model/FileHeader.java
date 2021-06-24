package barena.ach.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * FileHeader
 */
@JsonInclude(Include.NON_NULL)
public class FileHeader {

	@JsonProperty("immediateOrigin")
	private String immediateOrigin = null;

	@JsonProperty("immediateOriginName")
	private String immediateOriginName = null;

	@JsonProperty("immediateDestination")
	private String immediateDestination = null;

	@JsonProperty("immediateDestinationName")
	private String immediateDestinationName = null;

	@JsonProperty("fileCreationTime")
	@JsonFormat(shape = Shape.STRING, pattern = "HHmm")
	private LocalTime fileCreationTime = null;

	@JsonProperty("fileCreationDate")
	@JsonFormat(shape = Shape.STRING, pattern = "yyMMdd")
	private LocalDate fileCreationDate = null;

	@JsonProperty("fileIDModifier")
	private String fileIDModifier = null;

	public FileHeader immediateOrigin(String immediateOrigin) {
		this.immediateOrigin = immediateOrigin;
		return this;
	}

	/**
	 * Contains the Routing Number of the ACH Operator or sending point that is sending the file.
	 *
	 * @return immediateOrigin required
	 **/
	public String getImmediateOrigin() {
		return immediateOrigin;
	}

	public void setImmediateOrigin(String immediateOrigin) {
		this.immediateOrigin = immediateOrigin;
	}

	public FileHeader immediateOriginName(String immediateOriginName) {
		this.immediateOriginName = immediateOriginName;
		return this;
	}

	/**
	 * The name of the ACH Operator or sending point that is sending the file.
	 *
	 * @return immediateOriginName required
	 **/
	public String getImmediateOriginName() {
		return immediateOriginName;
	}

	public void setImmediateOriginName(String immediateOriginName) {
		this.immediateOriginName = immediateOriginName;
	}

	public FileHeader immediateDestination(String immediateDestination) {
		this.immediateDestination = immediateDestination;
		return this;
	}

	/**
	 * Contains the Routing Number of the ACH Operator or receiving point to which the file is being sent.
	 *
	 * @return immediateDestination required
	 **/
	public String getImmediateDestination() {
		return immediateDestination;
	}

	public void setImmediateDestination(String immediateDestination) {
		this.immediateDestination = immediateDestination;
	}

	public FileHeader immediateDestinationName(String immediateDestinationName) {
		this.immediateDestinationName = immediateDestinationName;
		return this;
	}

	/**
	 * The name of the ACH Operator or receiving point to which the file is being sent.
	 *
	 * @return immediateDestinationName required
	 **/
	public String getImmediateDestinationName() {
		return immediateDestinationName;
	}

	public void setImmediateDestinationName(String immediateDestinationName) {
		this.immediateDestinationName = immediateDestinationName;
	}

	public FileHeader fileCreationTime(LocalTime fileCreationTime) {
		this.fileCreationTime = fileCreationTime;
		return this;
	}

	/**
	 * The File Creation Time is the time when the file was prepared by an ODFI. (Format HHmm - H=Hour, m=Minute)
	 *
	 * @return fileCreationTime required
	 **/
	public LocalTime getFileCreationTime() {
		return fileCreationTime;
	}

	public void setFileCreationTime(LocalTime fileCreationTime) {
		this.fileCreationTime = fileCreationTime;
	}

	public FileHeader fileCreationDate(LocalDate fileCreationDate) {
		this.fileCreationDate = fileCreationDate;
		return this;
	}

	/**
	 * The File Creation Date is the date when the file was prepared by an ODFI. (Format YYMMDD - Y=Year, M=Month, D=Day)
	 *
	 * @return fileCreationDate required
	 **/
	public LocalDate getFileCreationDate() {
		return fileCreationDate;
	}

	public void setFileCreationDate(LocalDate fileCreationDate) {
		this.fileCreationDate = fileCreationDate;
	}

	public FileHeader fileIDModifier(String fileIDModifier) {
		this.fileIDModifier = fileIDModifier;
		return this;
	}

	/**
	 * Incremented value for each file for RDFIs.
	 *
	 * @return fileIDModifier required
	 **/
	public String getFileIDModifier() {
		return fileIDModifier;
	}

	public void setFileIDModifier(String fileIDModifier) {
		this.fileIDModifier = fileIDModifier;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FileHeader fileHeader = (FileHeader) o;
		return Objects.equals(this.immediateOrigin, fileHeader.immediateOrigin) &&
			Objects.equals(this.immediateOriginName, fileHeader.immediateOriginName) &&
			Objects.equals(this.immediateDestination, fileHeader.immediateDestination) &&
			Objects.equals(this.immediateDestinationName, fileHeader.immediateDestinationName) &&
			Objects.equals(this.fileCreationTime, fileHeader.fileCreationTime) &&
			Objects.equals(this.fileCreationDate, fileHeader.fileCreationDate) &&
			Objects.equals(this.fileIDModifier, fileHeader.fileIDModifier);
	}

	@Override
	public int hashCode() {
		return Objects
			.hash(immediateOrigin, immediateOriginName, immediateDestination, immediateDestinationName, fileCreationTime, fileCreationDate, fileIDModifier);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileHeader {\n");

		sb.append("    immediateOrigin: ").append(toIndentedString(immediateOrigin)).append("\n");
		sb.append("    immediateOriginName: ").append(toIndentedString(immediateOriginName)).append("\n");
		sb.append("    immediateDestination: ").append(toIndentedString(immediateDestination)).append("\n");
		sb.append("    immediateDestinationName: ").append(toIndentedString(immediateDestinationName)).append("\n");
		sb.append("    fileCreationTime: ").append(toIndentedString(fileCreationTime)).append("\n");
		sb.append("    fileCreationDate: ").append(toIndentedString(fileCreationDate)).append("\n");
		sb.append("    fileIDModifier: ").append(toIndentedString(fileIDModifier)).append("\n");
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
