
public class Strzelcy {
	String imie;
	String nazwisko;
	int wiek;
	
	void Strzelcy(){
		imie = "nie podano";
		nazwisko = " nie podano";
		wiek = 0;
	}
	
	void Strzelcy(String imie, String nazwisko, int wiek){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
}
