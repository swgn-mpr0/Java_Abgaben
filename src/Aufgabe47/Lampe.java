package Aufgabe47;

import java.util.Random;    // für Zufallsgenerator benötigt

/**
 * Klasse zur Realisierung von Lampen mit Bewegungsmeldern.
 */
public class Lampe {

   /**
    * Globale Konstante für die Ausfallwahrscheinlichkeit beim Schalten einer
    * Lampe.
    */
   public static final double AUSFALLWAHRSCHEINLICHKEIT = 0.01;

   /**
    * Zustand der Lampe.
    * @see Lampenstatus
    */
   private Lampenstatus status;


   // [Hier Vereinbarung zum Speichern der Assoziation ergänzen.]


   /**
    * Konstruktor zur Erzeugung einer Lampe. Die Lampe ist zu Beginn im
    * ausgeschalteten Zustand.
    */
   public Lampe() {

		// [Hier Programmtext ergänzen.]


   }

   /**
    * Schaltet die Lampe ein oder aus. Bei einem Wechsel des Zustands wird
    * besteht die Gefahr, dass die Lampe verschleißt. Zurückgegeben wird der
    * neue Zustand der Lampe.
    * @param neuerStatus neuer Zustand der Lampe; darf nicht `BROKEN` sein
    * @return neuer Zustand der Lampe
    */
   public Lampenstatus schalteLampe(Lampenstatus neuerStatus) {

		// [Hier Programmtext ergänzen.]
		// Wie in den vorherigen Aufgaben kann ein Fehler mit
		//    throw new IllegalArgumentException("Fehlermeldung");
		// erzeugt werden.

		return null;
   }

   /**
    * Eine nicht-angeschaltete und nicht-defekte Lampe wird angeschaltet. Ist
    * zudem der Bewegungsmelder angeschaltet, wird die Bewegung an eventuell
    * benachbarte Lampen weitergemeldet.
    */
   public void meldeBewegung() {

		// [Hier Programmtext ergänzen.]

   }

   /**
    * Methode zur Simulation des Lampenverschleißes.
    */
   private void geheVielleichtKaputt() {
      double zufallswert = new Random().nextDouble();
      if (zufallswert <= AUSFALLWAHRSCHEINLICHKEIT) {
         status = Lampenstatus.BROKEN;
      }
   }

   /**
    * Liefert aktuellen Zustand der Lampe zurück.
    * @return aktueller Zustand der Lampe
    */
   public Lampenstatus getStatus() {
      return status;
   }


	// [Hier Methoden für das Verwalten der Assoziationen ergänzen.]


   @Override
   public String toString() {
      String s = null;

		// [Hier Programmtext ergänzen.]

      return s;
   }

}
