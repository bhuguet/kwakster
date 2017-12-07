package com;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> getNumbers() {
		List<String> numbers = new ArrayList<String>();
		for (int i=1; i <=100; i++) {
			FizzBuzzNumber number = new FizzBuzzNumber(i);
			numbers.add(number.getValue());
		}
		return numbers;
	}

}
