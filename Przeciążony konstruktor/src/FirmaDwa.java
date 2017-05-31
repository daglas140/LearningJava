
public class FirmaDwa {
	public static void Main(String[] args){
		Pracownik[] pracownicy = new Pracownik[3];
		pracownicy[0] = new Pracownik();
		pracownicy[1] = new Pracownik("Stasiek", "Nowak", 41);
		pracownicy[2] = new Pracownik(pracownicy[1]);
		for (Pracownik p: pracownicy){
			System.out.println("prac: "+ p.imie + p.nazwisko + p.wiek);
		}
	}
}
