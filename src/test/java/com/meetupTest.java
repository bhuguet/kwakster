package com;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class meetupTest {

	private Message message;

	@Before 
	public void setup() {
		message = new Message();
	}
	
	@Test
	public void should_kwak() {
		String kwak = message.kwak();
		assertThat(kwak, equalTo("kwaked"));
	}
	
	@Test
	public void should_delete_message() {
		assertThat(message.delete(), equalTo("deleted"));
	}
}
