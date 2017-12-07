package com;

public class FizzBuzzNumber {

	private String value;
	
	public FizzBuzzNumber(Integer number) {
		this.value = computeValue(number);
	}

	public String getValue() {
		return value;
	}

	private boolean isMultiple(Integer number, Integer multiple) {
		return number % multiple == 0;
	}

	private String computeValue(Integer number) {
		if (isMultiple(number, 3)) return new Fizz().value();
		if (isMultiple(number, 5)) return new Buzz().value();
		return String.valueOf(number);
	}
}
