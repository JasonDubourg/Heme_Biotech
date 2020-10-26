package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;

public class AnalyticsCounter {
	// Cr�er une map pour stocker les occurences pour chaque sympt�me
	static TreeMap<String, Integer> symptomsOccurence = new TreeMap<String, Integer>();

	public static void main(String args[]) throws Exception {
		// Lire le fichier texte
		ReadSymptomDataFromFile readSymptomsDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomsList = readSymptomsDataFromFile.GetSymptoms();

		// Compter le nombre d'occurence dans la liste et ajout dans la map
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

		// G�n�rer un fichier texte avec les sympt�mes et leurs occurences
		FileWriter writer = new FileWriter("result.out");
		Set<String> keys = symptomsOccurence.keySet();
		for (String Key : keys) {
			writer.write(String.format("%s : %d \n", Key, symptomsOccurence.get(Key)));
		}
		writer.close();
	}
}
