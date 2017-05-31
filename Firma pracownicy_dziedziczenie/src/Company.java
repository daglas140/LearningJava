
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tworzymy tablice pracowników
		Employer[] pracownicy = new Employer[3];
		Boss[] szefowie = new Boss[2];
		pracownicy[0] = new Employer("Sebastian", "Gawlas", 23,2003,5,2,5000);
		pracownicy[1] = new Employer("Jan", "Kowalski", 31, 2000,2,20,7500);
		pracownicy[2] = new Employer("Bartosz", "Inny", 28,2016,8,12,3500);

		szefowie[0] = new Boss("Marcin", "Nowak", 37, 1990,5,6,10000,2000,"IT");
		szefowie[1] = new Boss("Piotr", "Szelf", 40,1990,5,6,10000,5000,"Prezes");
		//wyswietlamy wszystkich pracowników
		for (Employer e : pracownicy) {
			System.out.println("Pan: " + e.getName() + " " + e.getSurname() + " zarabia: " + e.getSalary() + " zł");
		}
		for (Boss b : szefowie) {
			System.out.println("Pan: " + b.getName() + " " + b.getSurname() + " zarabia: " + b.getBossSalary() + " zł");
		}
 	}

}
