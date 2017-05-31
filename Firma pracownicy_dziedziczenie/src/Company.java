
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tworzymy obiekt klasy boss
		Boss szef = new Boss();
		szef.departament = "IT";
		szef.premia = 10000;
		szef.name = "Jan";
		szef.surname = "Kowalski";
		szef.age = 41;
		szef.salary = 8000;
		System.out.println("Szef ma na imie: " + szef.name);
		System.out.println("Jego nazwisko to: " + szef.surname);
		System.out.println("Wynagrodzenie + premia: " + (szef.salary + szef.premia));
		System.out.println("Premia miesieczna: " + szef.premia);
		System.out.println("Wiek: " + szef.age);
		System.out.println("Jest szefem departamentu: " + szef.departament);
	}

}
