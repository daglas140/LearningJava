
public class Laborant extends Osoba {
	String uprawnienia;
	
	public Laborant (String imie, String nazwisko, String adres, String miejsceUrodzenia, double pesel, int numerTelefonu){
		super(imie, nazwisko, adres, miejsceUrodzenia, pesel, numerTelefonu);
		uprawnienia = "nie podano";
	}
	public void setUprawnienia(String uprawnienia){
		this.uprawnienia = uprawnienia;
	}
}
