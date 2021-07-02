package io.moov.ach.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ServiceClassCode {
	CREDITS_ONLY(220),
	DEBITS_ONLY(225),
	MIXED_DEBITS_AND_CREDITS(200),
	AUTOMATED_ACCOUNTING_ADVICES(280);

	private final Integer code;

	ServiceClassCode(final Integer code) {
		this.code = code;
	}

	// https://github.com/FasterXML/jackson-databind/issues/1850#issuecomment-837379862
	@JsonCreator
	public static ServiceClassCode fromValue(final Integer code) {
		for (final ServiceClassCode element : ServiceClassCode.values()) {
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
}
