import java.time.Instant;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tworzymy tablice pracowników
		Employer[] pracownicy = new Employer[5];
		pracownicy[0] = new Employer("Sebastian", "Gawlas", 23,2003,5,2,5000);
		pracownicy[1] = new Employer("Jan", "Kowalski", 31, 2000,2,20,7500);
		pracownicy[2] = new Employer("Bartosz", "Inny", 28,2016,8,12,3500);

		pracownicy[3] = new Boss("Marcin", "Nowak", 37, 1990,5,6,10000, 2000, "IT");
		pracownicy[4] = new Boss("Piotr", "Szelf", 40,1990,5,6,10000,5000,"Finacial");
		//wyswietlamy wszystkich pracowników
		for (Employer e : pracownicy) {
			System.out.println("Pan: " + e.getName() + " " + e.getSurname() + " zarabia: " + e.getSalary() + " zł");
		}

		System.out.println(((Boss)pracownicy[4]).getDepartament());
		if (pracownicy[3] instanceof Boss){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
 	}

}
