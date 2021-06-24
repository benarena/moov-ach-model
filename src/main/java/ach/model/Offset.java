package ach.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * Offset
 */
@JsonInclude(Include.NON_NULL)
public class Offset {

	@JsonProperty("routingNumber")
	private String routingNumber = null;

	@JsonProperty("accountNumber")
	private String accountNumber = null;
	@JsonProperty("accountType")
	private AccountType accountType = null;
	@JsonProperty("description")
	private String description = null;

	public Offset routingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
		return this;
	}

	/**
	 * ABA routing number
	 *
	 * @return routingNumber required
	 **/
	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public Offset accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Account number used to offset records
	 *
	 * @return accountNumber required
	 **/
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Offset accountType(AccountType accountType) {
		this.accountType = accountType;
		return this;
	}

	/**
	 * Account type used in offset record
	 *
	 * @return accountType required
	 **/
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Offset description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Memo for Offset EntryDetail record
	 *
	 * @return description required
	 **/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Offset offset = (Offset) o;
		return Objects.equals(this.routingNumber, offset.routingNumber) &&
			Objects.equals(this.accountNumber, offset.accountNumber) &&
			Objects.equals(this.accountType, offset.accountType) &&
			Objects.equals(this.description, offset.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(routingNumber, accountNumber, accountType, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Offset {\n");

		sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

	/**
	 * Account type used in offset record
	 */
	public enum AccountType {
		CHECKING("checking"),
		SAVINGS("savings");

		private final String value;

		AccountType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

}
