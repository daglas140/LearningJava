
public class Przychodnia {

	public static void main(String[] args) {
		
		Osoba os = new Osoba();
		System.out.println(os.imie);
		Lekarz[] lekarz = new Lekarz[3];
		lekarz[0] = new Lekarz("Jan","Nowak", "Opole, ul. Niemodliñska 12", "Opole", 64112365, 602558101,"Chirurg", 208);
		lekarz[1] = new Lekarz("Tomasz","Kowalski", "Skoczów, ul. Miejska 1", "Opole", 73011305, 533766981,"Kardiolog", 210);
		lekarz[2] = new Lekarz("Artur","Buk", "Warszawa, ul. Poliñska 122/c", "Opole", 60050133, 766358901,"Pediatra", 301);
		Pacjent pac = new Pacjent("Sebastian","Gawlas", "Kaczyce, ul. J.Matejki 44", "Cieszyn", 94052909, 792778935);
		System.out.println(pac.getPacjent());
		System.out.println(lekarz[0]);
		
		Wizyta wiz = new Wizyta("24.02.2018", lekarz[0], pac);
		System.out.println(wiz.pokazWizyte());
	}

}
