package com;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private List<String> expectedResult;
	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
		expectedResult = Arrays.asList("1","2",FIZZ,"4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100");
	}

	@Test
	public void shouldReturn100Numbers() {
		List<String> numbers = fizzBuzz.getNumbers();
		assertThat(numbers.size(), equalTo(expectedResult.size()));
		//assertThat(numbers, equalTo(expectedResult));	
	}
	
	@Test
	public void shouldReturnFizzForMultiple3() {
		List<String> numbers = fizzBuzz.getNumbers();
		for (int i=1; i<= numbers.size(); i++) {
			if (i == 3) {
				assertThat(numbers.get(i-1), equalTo(FIZZ));
			}	
			if (i == 6) {
				assertThat(numbers.get(i-1), equalTo(FIZZ));
			}
		}
	}
	
	@Test
	public void shouldReturnBuzzForMultiple5() {
		List<String> numbers = fizzBuzz.getNumbers();
		for (int i=1; i<= numbers.size(); i++) {
			if (i == 5) {
				assertThat(numbers.get(i-1), equalTo(BUZZ));
			}	
			if (i == 10) {
				assertThat(numbers.get(i-1), equalTo(BUZZ));
			}
		}
	}

	
}