package application;

//Rechnen Methode(Formel).
public class MainController {
  // private View view;
  //private Model model;


  public MainController(ModuleLayer.Controller model) {
  }

  //2.individuelle Gewichtung der durchschnittlichen CO2-Tonnage im Bereich Ernährung
  public static void main(String[] args) {
      double NutzerIn = 10.0;
      double Durchschnitt = 5.0;
      double CO = 8.0;
      double Ergebnis;

      Ergebnis = (Math.log(NutzerIn) / Math.log(Durchschnitt)) * (Math.log(CO - Durchschnitt) / Math.log(CO - NutzerIn));

      System.out.println("Ergebnis: " + Ergebnis);

   //1.Pro-Kopf-Emissionen Luftverkehr
      double kgCO2GanzesFlugzeug = 1000.0; // Total CO2 emissions of the entire aircraft (including non-CO2 effects) in kg
      double LFBeiladung = 0.8; // Load factor for cargo
      double LFAuslastung = 0.85; // Load factor for passenger seats
      int Sitzplaetze = 200; // Number of passenger seats

      double kgCO2ProPerson = (kgCO2GanzesFlugzeug * LFBeiladung / LFAuslastung * Sitzplaetze);

      System.out.println("CO2 emissions per person: " + kgCO2ProPerson + " kg/p.P.");

      //3.Berechnung der Vermeidungsfaktoren (Strom, Wohnen, Mobilität)
      double EFReferenzmix = 10.0; // Emissionsfaktor des Referenzmixes
      double EFi = 5.0; // Emissionsfaktor eines Energieträgers.

      double Vermeidungsfaktor = EFReferenzmix - EFi;

      System.out.println("Vermeidungsfaktor: " + Vermeidungsfaktor);

   //4.Berechnung der Vermeidungsfaktoren (Ernährung, Sonstiger Konsum)
      double SFReferenz = 10.0; // Referenzwert, der das Verhalten des Durchschnittsbürgers widerspiegelt (z.B. Körpergewicht)
      double SFi = 5.0; //persönliche sektorale Emissionen

      double Vermeidungsleistung = SFReferenz - SFi;

      System.out.println("Vermeidungsleistung: " + Vermeidungsleistung);
  }
  }





