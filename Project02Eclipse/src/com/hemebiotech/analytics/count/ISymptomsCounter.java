package com.hemebiotech.analytics.count;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomsCounter {
	TreeMap<String, Integer> countSymptomsFromList(List<String> symptomsList);
}
