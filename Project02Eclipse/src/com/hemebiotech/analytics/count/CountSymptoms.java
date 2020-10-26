package com.hemebiotech.analytics.count;

import java.util.List;
import java.util.TreeMap;

public class CountSymptoms implements ISymptomsCounter {

	@Override
	public TreeMap<String, Integer> countSymptomsFromList(List<String> symptomsList) {
		// Cr�er une map pour stocker les occurences pour chaque sympt�me
		TreeMap<String, Integer> symptomsOccurence = new TreeMap<String, Integer>();
		int occurence = 1;
		for (String lineSymptom : symptomsList) {
			// Si la cl� n'est pas pr�sente on associe le nom du sympt�me � la cl� et on
			// initie la valeur � 1
			if (!(symptomsOccurence.containsKey(lineSymptom))) {
				symptomsOccurence.put(lineSymptom, occurence);
			} else {
				// Sinon on ajoute 1 � la valeur d'occurence
				symptomsOccurence.put(lineSymptom, symptomsOccurence.get(lineSymptom) + occurence);
			}
		}
		return symptomsOccurence;
	}
}
