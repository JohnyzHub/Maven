package com.mavenpractice.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testPerform() {
		App app = new App();
		Assert.assertEquals(4, app.perform());
	}
}