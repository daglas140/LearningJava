
public class Osoba {

	String imie, nazwisko, adres, miejsceUrodzenia;
	double pesel, numerTelefonu;
	
	public Osoba(){
		//imie = "nie podano";
		nazwisko = "nie podano";
		adres = "nie podano";
		miejsceUrodzenia = "nie podano";
		pesel = 0;
		numerTelefonu = 0;
	}
	public Osoba(String imie, String nazwisko, String adres, String miejsceUrodzenia, double pesel, int numerTelefonu){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.miejsceUrodzenia = miejsceUrodzenia;
		this.pesel = pesel;
		this.numerTelefonu = numerTelefonu;
		
	}
}
