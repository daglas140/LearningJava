
public class Wizyta implements IWizyta {
	String dataWizyty;
	Lekarz lekarz;
	Pacjent pacjent;
	public Wizyta(String dataWizyty, Lekarz lekarz, Pacjent pacjent){
		this.dataWizyty = dataWizyty;
		this.lekarz = lekarz;
		this.pacjent = pacjent;
	}
	public void umowWizyte(String dataWizyty){
		this.dataWizyty = dataWizyty; 
	}
	public void dodajBadanie(){
		
	}
	public void dodajLekarza(Lekarz lekarz){
		this.lekarz = lekarz;	
	}
	public void dodajPacjenta(Pacjent pacjent){
		this.pacjent = pacjent;
	}
	public String pokazWizyte(){
		return (pacjent.getPacjent() + "Jest umówiony na wizytê dnia " + this.dataWizyty + ". Lekarz prowadz¹cy: " + lekarz.getLekarz());
	}
}
