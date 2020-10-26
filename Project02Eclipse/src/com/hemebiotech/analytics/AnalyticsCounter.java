package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.count.CountSymptoms;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.write.WriteSymptoms;

public class AnalyticsCounter {

	public void analyticsCounter(String inputFilename, String outputFilename) {
		// Lire le fichier texte
		ReadSymptomDataFromFile readSymptomsDataFromFile = new ReadSymptomDataFromFile(inputFilename);
		List<String> symptomsList = readSymptomsDataFromFile.getSymptoms();

		// Compter le nombre d'occurence dans la liste et ajout dans la map
		CountSymptoms countSymptoms = new CountSymptoms();
		TreeMap<String, Integer> symptomsOccurence = countSymptoms.countSymptomsFromList(symptomsList);

		// Générer un fichier texte avec les symptômes et leurs occurences
		WriteSymptoms writeSymptoms = new WriteSymptoms();
		writeSymptoms.writeSymptomsFromList(symptomsOccurence, outputFilename);
	}
}
