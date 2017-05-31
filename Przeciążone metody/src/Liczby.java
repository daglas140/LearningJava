
public class Liczby {
	int dodaj(int a, int b){
		System.out.println("Zwracany typ int");
		return a+b;
	}
	double dodaj(int a, double b){
		System.out.println("Zwracany typ double");
		return a+b;
	}
	double dodaj(double a, double b){
		System.out.println("Zwracany typ double");
		return a+b;
	}
	String dodaj(String a, String b){
		System.out.println("Zwracany typ String");
		return a+b;
	}
}
