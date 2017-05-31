
public class Lekarz extends Osoba{
	String specjalizacja;
	int numerGabinetu;
	
	public Lekarz(){
		specjalizacja = "nie podano";
		numerGabinetu = 0;
	}
	
	public Lekarz(String imie, String nazwisko, String adres, String miejsceUrodzenia, double pesel, int numerTelefonu, 
					String specjalizacja, int numerGabinetu){
		super(imie, nazwisko, adres, miejsceUrodzenia, pesel, numerTelefonu);
		this.specjalizacja = specjalizacja;
		this.numerGabinetu = numerGabinetu;
	}
	public String getLekarz(){
		return (this.imie + " " + this.nazwisko + " gabinet numer: " + this.numerGabinetu);
	}
	public String toString(){
		return (this.imie + " " + this.nazwisko + " gabinet numer: " + this.numerGabinetu);
	}
}
