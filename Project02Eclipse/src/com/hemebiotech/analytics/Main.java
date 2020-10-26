package com.hemebiotech.analytics;

public class Main {
	final static String inputFilename = "symptoms.txt";
	final static String outputFilename = "result.out";

	public static void main(String args[]) throws Exception {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		analyticsCounter.analyticsCounter(inputFilename, outputFilename);
	}
}
