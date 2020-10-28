package com.hemebiotech.analytics.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

/**
 * Class which write symptoms occurences from a list
 * 
 * @author Jason
 * @version 1.0
 */
public class WriteSymptoms implements ISymptomsWriter {

	/**
	 * Write on text file occurences symptoms in alphabetical order
	 * 
	 * @param a      map with symptoms keys and their occurences values
	 * @param output file name
	 */
	@Override
	public void writeSymptomsFromList(TreeMap<String, Integer> symptomsOccurence, String outputFilename) {
		FileWriter writer;
		try {
			writer = new FileWriter(outputFilename);
			Set<String> keys = symptomsOccurence.keySet();
			for (String Key : keys) {
				writer.write(String.format("%s : %d \n", Key, symptomsOccurence.get(Key)));
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
