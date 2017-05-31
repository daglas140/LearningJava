
public class Firma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] imiona = {"Sebastian", "Maciej", "Bartosz"};
		String[] nazwiska = {"Gawlas", "Cyrka", "Nowak"};
		int[] lata = {23,23,36};
		
		Pracownik[] pracownicy = new Pracownik[3];
		
		for(int i = 0; i < pracownicy.length; i++){
			pracownicy[i] = new Pracownik();
			pracownicy[i].imie = imiona[i];
			pracownicy[i].nazwisko = nazwiska[i];
			pracownicy[i].wiek = lata[i];
		}
		
		System.out.printf("Pracownik jeden: %s %s lat %d.", pracownicy[0].imie, pracownicy[0].nazwisko, pracownicy[0].wiek);
		System.out.println();
		System.out.printf("Pracownik dwa: %s %s lat %d.", pracownicy[1].imie, pracownicy[1].nazwisko, pracownicy[1].wiek);
		System.out.println();
		System.out.printf("Pracownik trzy: %s %s lat %d.", pracownicy[2].imie, pracownicy[2].nazwisko, pracownicy[2].wiek);
		
		int a = 6;
		Pracownik.zwieksz(a); // Statyczne metody nie potrzebuj¹ tworzenia obiektu klasy.
		System.out.println(a);
	}

}
