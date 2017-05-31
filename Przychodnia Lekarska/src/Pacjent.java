
public class Pacjent extends Osoba{

	public Pacjent(){
	}
	
	public Pacjent(String imie, String nazwisko, String adres, String miejsceUrodzenia, double pesel, int numerTelefonu){
		super(imie, nazwisko, adres, miejsceUrodzenia, pesel, numerTelefonu);
	}
	
	public String getPacjent(){
		return ("Pacjent " + this.imie + " " + this.nazwisko + ". ");
	}
}
