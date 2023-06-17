package application;
enum Geschlecht{Männlich,Weiblich,Divers};

public class main {

    String Name;
    int Alter,Gewicht;
    Geschlecht Geschlecht;

	public main(String Name, int Alter, int Gewicht, Geschlecht Geschlecht) {
		this.Name = Name;
        this.Alter = Alter;
        this.Gewicht=0;
        this.Geschlecht=Geschlecht.Männlich;
	}
}
