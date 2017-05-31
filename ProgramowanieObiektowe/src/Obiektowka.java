
public class Obiektowka {
	public static void main (String[] arg){
		//Klasa punkt = new Klasa();
		//punkt.ustawX(-12);
		//punkt.ustawY(5);
		//System.out.println("Wspó³rzêdne punktu to: " + punkt.dajX() + ", " + punkt.dajY());
		Punkt punkt = new Punkt(-16,5);
		punkt.zwiekszX();
		punkt.zwiekszY();
		System.out.println(punkt.getX());
		punkt.wyswietlWsp();
		Punkt nowy = new Punkt(punkt);
		nowy.zmienX(10);
		nowy.zmienY(-2);
		System.out.printf("Nowe wsp punktu to: %d, %d", nowy.getX(), nowy.getY());
	}
}
