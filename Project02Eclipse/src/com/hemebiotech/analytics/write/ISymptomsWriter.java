package com.hemebiotech.analytics.write;

import java.util.TreeMap;

/**
 * Interface for writing a list
 * 
 * @author Jason
 * @version 1.0
 */
public interface ISymptomsWriter {
	/**
	 * This method is used to write a list on output file
	 * 
	 * @param list   of each symptoms occurences
	 * @param output file name
	 */
	void writeSymptomsFromList(TreeMap<String, Integer> symptomsOccurence, String outputFilename);
}
