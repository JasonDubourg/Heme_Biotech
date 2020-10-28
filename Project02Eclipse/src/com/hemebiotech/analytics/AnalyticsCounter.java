package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.count.CountSymptoms;
import com.hemebiotech.analytics.count.ISymptomsCounter;
import com.hemebiotech.analytics.read.ISymptomReader;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.write.ISymptomsWriter;
import com.hemebiotech.analytics.write.WriteSymptoms;

/**
 * Initiate objects for read, count and write occurences symptoms.
 * 
 * @author Jason
 * @version 1.0
 */
public class AnalyticsCounter {

	/**
	 * Create objects and call there functions to read, count and write occurences
	 * symptoms.
	 * 
	 * @param inputFilename  name of input text file
	 * @param outputFilename name of output text file
	 */
	public void analyticsCounter(String inputFilename, String outputFilename) {
		// Read text file
		ISymptomReader readSymptomsDataFromFile = new ReadSymptomDataFromFile(inputFilename);
		List<String> symptomsList = readSymptomsDataFromFile.getSymptoms();

		// Count occurences symptoms and add to map
		ISymptomsCounter countSymptoms = new CountSymptoms();
		TreeMap<String, Integer> symptomsOccurence = countSymptoms.countSymptomsFromList(symptomsList);

		// Write occurences symptoms on text file (alphabetical order)
		ISymptomsWriter writeSymptoms = new WriteSymptoms();
		writeSymptoms.writeSymptomsFromList(symptomsOccurence, outputFilename);
	}
}
