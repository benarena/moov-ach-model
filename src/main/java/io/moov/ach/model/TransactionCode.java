package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * For a full list of transaction codes, please refer to Appendix Three, Subpart 3.2 – Glossary of Data Elements the Rules.
 */
public enum TransactionCode {
	/**
	 * return that credits the receiver's checking account
	 */
	CHECKING_CREDIT_RETURN_NOC(21),
	/**
	 * credit/deposit to the receiver's checking account
	 */
	CHECKING_CREDIT(22),
	/**
	 * pre-notification of a credit to the receiver's checking account
	 */
	CHECKING_CREDIT_PRENOTIFICATION(23),
	/**
	 * zero dollar remittance data credit to a checking account for CCD, CTX, ACK, and ATX entries
	 */
	CHECKING_CREDIT_ZERO_DOLLAR_REMITTANCE(24),
	/**
	 * return that debits the receiver's checking account
	 */
	CHECKING_DEBIT_RETURN_NOC(26),
	/**
	 * debit to the receivers checking account
	 */
	CHECKING_DEBIT(27),
	/**
	 * pre-notification of a debit to the receiver's checking account
	 */
	CHECKING_DEBIT_PRENOTIFICATION(28),
	/**
	 * zero dollar remittance data debit to a checking account for CCD, CTX,), ACK, and ATX entries
	 */
	CHECKING_DEBIT_ZERO_DOLLAR_REMITTANCE(29),
	/**
	 * return that credits the receiver's savings account
	 */
	SAVINGS_CREDIT_RETURN_NOC(31),
	/**
	 * credit to the receiver's savings account
	 */
	SAVINGS_CREDIT(32),
	/**
	 * pre-notification of a credit to the receiver's savings account
	 */
	SAVINGS_CREDIT_PRENOTIFICATION(33),
	/**
	 * zero dollar remittance data credit to a savings account for CCD), and CTX entries
	 */
	SAVINGS_CREDIT_ZERO_DOLLAR_REMITTANCE(34),
	/**
	 * return that debits the receiver's savings account
	 */
	SAVINGS_DEBIT_RETURN_NOC(36),
	/**
	 * debit to the receivers savings account
	 */
	SAVINGS_DEBIT(37),
	/**
	 * pre-notification of a debit to the receiver's savings account
	 */
	SAVINGS_DEBIT_PRENOTIFICATION(38),
	/**
	 * zero dollar remittance data debit to a savings account for CCD), and CTX entries
	 */
	SAVINGS_ZERO_DOLLAR_REMITTANCE_DEBIT(39),
	/**
	 * return that credits the receiver's general ledger (GL) account
	 */
	GL_CREDIT_RETURN_NOC(41),
	/**
	 * credit to the receiver's general ledger (GL) account
	 */
	GL_CREDIT(42),
	/**
	 * pre-notification of a credit to the receiver's general ledger (GL) account
	 */
	GL_CREDIT_PRENOTIFICATION(43),
	/**
	 * zero dollar remittance data credit to the receiver's general ledger (GL) account
	 */
	GL_CREDIT_ZERO_DOLLAR_REMITTANCE(44),
	/**
	 * debit to the receiver's general ledger (GL) account
	 */
	GL_DEBIT(47),
	/**
	 * return that debits the receiver's general ledger (GL) account
	 */
	GL_DEBIT_RETURN_NOC(46),
	/**
	 * pre-notification of a debit to the receiver's general ledger (GL) account
	 */
	GL_DEBIT_PRENOTIFICATION(48),
	/**
	 * zero dollar remittance data debit to the receiver's general ledger (GL) account
	 */
	GL_DEBIT_ZERO_DOLLAR_REMITTANCE(49),
	/**
	 * return that credits the receiver's loan account
	 */
	LOAN_CREDIT_RETURN_NOC(51),
	/**
	 * credit to the receiver's loan account
	 */
	LOAN_CREDIT(52),
	/**
	 * pre-notification of a credit to the receiver's loan account
	 */
	LOAN_CREDIT_PRENOTIFICATION(53),
	/**
	 * zero dollar remittance data credit to the receiver's loan account
	 */
	LOAN_CREDIT_ZERO_DOLLAR_REMITTANCE(54),
	/**
	 * debit (Reversal's Only) to the receiver's loan account
	 */
	LOAN_DEBIT(55),
	/**
	 * return that debits the receiver's loan account
	 */
	LOAN_DEBIT_RETURN_NOC(56);

	private final Integer code;

	TransactionCode(final Integer code) {
		this.code = code;
	}

	// https://github.com/FasterXML/jackson-databind/issues/1850#issuecomment-837379862
	@JsonCreator
	public static TransactionCode fromValue(final Integer code) {
		for (final TransactionCode element : TransactionCode.values()) {
			if (element.code.equals(code)) {
				return element;
			}
		}
		return null;
	}

	@JsonValue
	public Integer getCode() {
		return code;
	}

	public boolean isCredit() {
		final int checkDigit = code % 10; // second digit
		return checkDigit >= 1 && checkDigit <= 4;
	}

	public boolean isDebit() {
		final int checkDigit = code % 10; // second digit
		return checkDigit >= 5;
	}
}
