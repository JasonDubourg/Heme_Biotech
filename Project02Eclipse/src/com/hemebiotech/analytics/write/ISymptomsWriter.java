package com.hemebiotech.analytics.write;

import java.util.TreeMap;

public interface ISymptomsWriter {
	void writeSymptomsFromList(TreeMap<String, Integer> symptomsOccurence, String outputFilename);
}
