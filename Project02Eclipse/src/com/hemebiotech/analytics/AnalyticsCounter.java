package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import com.hemebiotech.analytics.count.CountSymptoms;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// Lire le fichier texte
		ReadSymptomDataFromFile readSymptomsDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomsList = readSymptomsDataFromFile.GetSymptoms();

		// Compter le nombre d'occurence dans la liste et ajout dans la map
		CountSymptoms countSymptoms = new CountSymptoms();
		TreeMap<String, Integer> symptomsOccurence = countSymptoms.countSymptomsFromList(symptomsList);

		// Générer un fichier texte avec les symptômes et leurs occurences
		FileWriter writer = new FileWriter("result.out");
		Set<String> keys = symptomsOccurence.keySet();
		for (String Key : keys) {
			writer.write(String.format("%s : %d \n", Key, symptomsOccurence.get(Key)));
		}
		writer.close();
	}
}
