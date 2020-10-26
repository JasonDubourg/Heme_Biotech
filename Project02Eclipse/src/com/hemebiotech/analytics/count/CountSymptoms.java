package com.hemebiotech.analytics.count;

import java.util.List;
import java.util.TreeMap;

public class CountSymptoms implements ISymptomsCounter {

	@Override
	public TreeMap<String, Integer> countSymptomsFromList(List<String> symptomsList) {
		// Créer une map pour stocker les occurences pour chaque symptôme
		TreeMap<String, Integer> symptomsOccurence = new TreeMap<String, Integer>();
		int occurence = 1;
		for (String lineSymptom : symptomsList) {
			// Si la clé n'est pas présente on associe le nom du symptôme à la clé et on
			// initie la valeur à 1
			if (!(symptomsOccurence.containsKey(lineSymptom))) {
				symptomsOccurence.put(lineSymptom, occurence);
			} else {
				// Sinon on ajoute 1 à la valeur d'occurence
				symptomsOccurence.put(lineSymptom, symptomsOccurence.get(lineSymptom) + occurence);
			}
		}
		return symptomsOccurence;
	}
}
