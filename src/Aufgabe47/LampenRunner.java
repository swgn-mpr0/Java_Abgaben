package Aufgabe47;

/**
 * Runner zur Lampen-Aufgabe (Blatt 11)
 */
public class LampenRunner {

	/**
	 * Feld zur Aufnahme aller Lampen(-Referenzen).
	 */
   Lampe[][] feld;

   /**
    * Initialisiert das Lampen-Feld.
    */
   private void erzeugeLampen() {
      feld = new Lampe[10][5];

		// Erzeuge 50 Lampen und speichere diese in `feld`.

		// [Hier Programmtext ergänzen.]


		// Setze Verbindungen zu den maximal vier existierenden Nachbarn.

		// [Hier Programmtext ergänzen.]

   }

   /**
    * Zeigt den Status aller Lampen an.
    * @param s zusätzlicher Informationstext
    */
   private void zeigeStatus(String s) {
      System.out.println("Aktueller Status (" + s + "):");
      for (int i = 0; i < feld.length; i++) {
         for (int j = 0; j < feld[i].length; j++) {
            System.out.print(feld[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }

   /**
    * Hier werden die einzelnen Aktionen ausgeführt.
    */
   private void run() {
      // erzeuge Lampen-Feld und verküpfe Lampen
      erzeugeLampen();
      zeigeStatus("nach Erzeugung aller Lampen");

      // Schalte eine Lampe per Bewegungsmelder an
      // und lasse weiter melden.
      feld[3][4].meldeBewegung();
      zeigeStatus("nach Bewegungsmeldung an Stelle (3,4)");

      // Schalte alle Lampen aus.
		
		// [Hier Programmtext ergänzen.]

      zeigeStatus("nach Ausschalten aller Lampen");

      // Schalte Lampen in der mittlere Reihe an.
		
		// [Hier Programmtext ergänzen.]

      zeigeStatus("nach Anschalten aller Lampen in der mittleren Reihe");

      // Schalte eine Lampe per Bewegungsmelder an
      // und lasse weiter melden.
      feld[0][0].meldeBewegung();
      zeigeStatus("nach Bewegungsmeldung an Stelle (0,0)");

      // Schalte die sued-oestlichste Lampe wiederholt ein und aus, bis sie
      // kaputt geht. Versuche dann, sie erneut einzuschalten.
      Lampe suedOst = feld[feld.length - 1][feld[0].length - 1];
      boolean kaputt = false;
      while (!kaputt) {
         suedOst.schalteLampe(Lampenstatus.ON);
         kaputt = suedOst.schalteLampe(Lampenstatus.OFF) == Lampenstatus.BROKEN;
      }
      suedOst.schalteLampe(Lampenstatus.ON);
      zeigeStatus("nach Kaputtmachen der sued-oestlichsten Lampe");
    }

    public static void main(String[] args) {
      LampenRunner r = new LampenRunner();
      r.run();
    }

}
