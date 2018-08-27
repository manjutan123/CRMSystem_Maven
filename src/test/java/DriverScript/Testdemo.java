package DriverScript;

import org.testng.annotations.Test;

public class Testdemo {

	@Test
	public void start() {
	System.out.println("Starting the server");
	}
	@Test(dependsOnMethods = { "start" })
	public void process() {
	System.out.println("Processing the data!");
	}
	@Test(dependsOnMethods = { "process" })
	public void stop() {
	System.out.println("Stopping the server");
	}
}
