package com.hemebiotech.analytics.count;

import java.util.List;
import java.util.TreeMap;

/**
 * Interface to count occurences
 * 
 * @author Jason
 * @version 1.0
 */
public interface ISymptomsCounter {
	/**
	 * This method count occurences of symptoms from a list
	 * 
	 * @param is a list of symptoms
	 * @return a TreeMap of occurences for each symptoms (alphabetical order)
	 */
	TreeMap<String, Integer> countSymptomsFromList(List<String> symptomsList);
}
