package com.hemebiotech.analytics;

/**
 * Application entry. Attribute input and output files names.
 * 
 * @author Jason
 * @version 1.0
 */
public class Main {
	private final static String inputFilename = "symptoms.txt";
	private final static String outputFilename = "result.out";

	/**
	 * Start application. Transmits input and output files names to analyticsCounter
	 * object.
	 * 
	 */
	public static void main(String args[]) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.analyticsCounter(inputFilename, outputFilename);
	}
}
