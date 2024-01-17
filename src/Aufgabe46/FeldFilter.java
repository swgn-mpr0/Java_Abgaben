package Aufgabe46;

/**
 * Klasse zur Realisierung verschiedener Filteroperationen
 * auf einem Feld.
 */
public class FeldFilter {

	private int[] feld;

	/*
	 *  Hier Konstruktor ergaenzen.
	 */
	public FeldFilter(int[] neuesfeld){
		feld = new int[neuesfeld.length];
		for (int i = 0; i < feld.length; i++){
			feld[i] = neuesfeld[i];
		}
	}
	
	/*
	 *  Hier ggfs. notwendige Hilfsmethoden ergaenzen.
	 */

	/**
	 * Gib ein Feld zur&uuml;ck, das nur die Werte aus
	 * dem gespeicherten Feld enth&auml;lt, die echt gr&ouml;&szlig;er
	 * als der &uuml;bergebene Wert sind. Die Reihenfolge der Werte
	 * darf dabei nicht ver&auml;ndert werden.
	 * @param untereSchranke Wert, der als untere Schranke gelten soll.
	 * @return Berechnetes Feld.
	 */
	public int[] filterGroesserAls(int untereSchranke) {
		int[] ausgabe = {}; // Default-Rueckgabe: Leeres Feld.



		int count = 0;
		// Schritt 1. Zählen, wie viele Elemente im Feld größer als unterSchranke sind
		for (int i = 0; i < feld.length; i++){
			if (feld[i] > untereSchranke)
				count++;
		}


		// Schritt 2. Array mit der gefundenen Anzahl von Schritt 1. erstellen
		ausgabe = new int[count];


		// Schritt 3. Kopieren der Elemente, die größer als untereSchranke sind, in das auszugebende array
		int index = 0;
		for (int i = 0; i < feld.length; i++){
			if (feld[i] > untereSchranke)
				ausgabe[index++] = feld[i];
		}



		// Gib das Array zurück
		return ausgabe;
	}

	/**
	 * Gib ein Feld zur&uuml;ck, das nur die Werte aus
	 * dem gespeicherten Feld enth&auml;lt, die weder mit
	 * dem minimalen noch mit dem maximalen Element &uuml;bereinstimmen. 
	 * Die Reihenfolge der Werte darf dabei nicht ver&auml;ndert werden.
	 * @return Berechnetes Feld.
	 */
	public int[] eliminiereMinMax() {
		int[] ausgabe = {}; // Default-Rueckgabe: Leeres Feld.


		if (feld.length <= 2) {
			// Wenn das Feld 2 oder weniger Elemente hat, gibt es kein Min oder Max zu eliminieren.
			return ausgabe;
		}

		// Index Zähler für die min und max Elemente im Array.
		int minWert = feld[0];
		int maxWert = feld[0];

		// Finden des minimalen und maximalen Wert im originalen Feld.
		for (int i = 1; i < feld.length; i++) {
			if (feld[i] < minWert) {
				minWert = feld[i];
			} else if (feld[i] > maxWert) {
				maxWert = feld[i];
			}
		}


		// Zähler für die Anzahl der min und max Elemente des Arrays.
		int minAnzahl = 0;
		int maxAnzahl = 0;

		// Zähle, wie oft der minimale und maximale Wert im Feld vorkommt.
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] == minWert) {
				minAnzahl++;
			} else if (feld[i] == maxWert) {
				maxAnzahl++;
			}
		}

		// Überprüfe, ob das Feld nur aus minimalen oder maximalen Werten besteht.
		if (minAnzahl == feld.length || maxAnzahl == feld.length) {
			return ausgabe;
		}

		// Das zurück zu gebende Array der Größe ohne Min und Max Elemente anpassen.
		ausgabe = new int[feld.length - minAnzahl - maxAnzahl];
		int index = 0;

		// Kopieren der Werte, die nicht mit dem min oder max Element übereinstimmen, ins neue Array.
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] != minWert && feld[i] != maxWert) {
				ausgabe[index++] = feld[i];
			}
		}


		// Gib das Array zurück
		return ausgabe;
	}

}
