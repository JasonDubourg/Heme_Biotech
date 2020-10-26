package com.hemebiotech.analytics.count;

import java.util.List;
import java.util.TreeMap;

/**
 * Class which count symptoms occurences from a list
 * 
 * @author Jason
 * @version 1.0
 */
public class CountSymptoms implements ISymptomsCounter {

	/**
	 * Create a map with symptom key and occurence value in alphabetical order.
	 * 
	 * @param a list of symptoms
	 * @return a map of symptoms occurences
	 */
	@Override
	public TreeMap<String, Integer> countSymptomsFromList(List<String> symptomsList) {
		TreeMap<String, Integer> symptomsOccurence = new TreeMap<String, Integer>();
		int occurence = 1;
		for (String lineSymptom : symptomsList) {
			// If not true associate symptom name to a new key and
			// initiate value at one
			if (!(symptomsOccurence.containsKey(lineSymptom))) {
				symptomsOccurence.put(lineSymptom, occurence);
			} else {
				// Add one to occurence value of key symptom
				symptomsOccurence.put(lineSymptom, symptomsOccurence.get(lineSymptom) + occurence);
			}
		}
		return symptomsOccurence;
	}
}
