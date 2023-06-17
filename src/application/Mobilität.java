package application;
enum Fahrzeugs {Kleinwage,MittelKlasse,OberKlasse,KfZ,Elektrofahrzeug,Motorrad,Roller,Elektroroller};
public class Mobilität  {
private String FahrzeugArt,Kraftstoff;
private double FahrzeugAlter,Durchschnittsverbrauch;

public static void main(String[] args) {
	Fahrzeugs Fahrzeug = Fahrzeugs.Kleinwage;
	
	switch(Fahrzeug){
	case Kleinwage:
		System.out.println("Kleinwage");
        break;
    case MittelKlasse:
    	System.out.println("Mittelklasse");
        break;
    case OberKlasse:	
    	System.out.println("Oberklasse");
        break;
    case KfZ:
    	System.out.println("KfZ");
        break;
    case Elektrofahrzeug:
    	System.out.println("Elektrofahrzeug");
        break;
    case Motorrad:
    	System.out.println("Motorrad");
        break;
    case Roller:
    	System.out.println("Roller");
        break;
    case Elektroroller:
    	System.out.println("Elektroroller");
        break;
        
	
	
	}
	
}
}
