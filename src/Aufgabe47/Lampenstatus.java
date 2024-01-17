package Aufgabe47;

/**
 * Aufzählungstyp zur Beschreibung des Zustands von Lampen.
 */
public enum Lampenstatus {
   /**
    * Die Lampe ist eingeschaltet.
    */
   ON,
   
   /**
    * Die Lampe ist ausgeschaltet.
    */
   OFF,
   
   /**
    * Die Lampe ist defekt und kann nicht ein- oder ausgeschaltet werden.
    */
   BROKEN,
}
