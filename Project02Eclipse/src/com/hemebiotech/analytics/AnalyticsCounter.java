package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.count.CountSymptoms;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.write.WriteSymptoms;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// Lire le fichier texte
		ReadSymptomDataFromFile readSymptomsDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomsList = readSymptomsDataFromFile.GetSymptoms();

		// Compter le nombre d'occurence dans la liste et ajout dans la map
		CountSymptoms countSymptoms = new CountSymptoms();
		TreeMap<String, Integer> symptomsOccurence = countSymptoms.countSymptomsFromList(symptomsList);

		// Générer un fichier texte avec les symptômes et leurs occurences
		String outputFilename = "result.out";
		WriteSymptoms writeSymptoms = new WriteSymptoms();
		writeSymptoms.writeSymptomsFromList(symptomsOccurence, outputFilename);
	}
}
