package com.mavenpractice.sample;

import java.util.Deque;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		App myApp = new App();
		int result = myApp.perform();
		System.out.println("Result is : " + result);
	}

	public int perform() {
		return 2*2;
	}
}
