package com.hemebiotech.analytics.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

public class WriteSymptoms implements ISymptomsWriter {

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
