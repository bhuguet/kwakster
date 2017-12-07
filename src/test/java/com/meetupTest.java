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
		assertThat(message.kwak(), equalTo("MessageQuacked"));
	}
	
	@Test
	public void should_delete_message() {
		message.kwak();
		assertThat(message.delete(), equalTo("MessageDeleted"));
	}
	
	@Test
	public void should_not_send_event_on_delete_of_deleted_message() {
		message.kwak();
		message.delete();
		assertThat(message.delete(), equalTo(""));
	}
}
