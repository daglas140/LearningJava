import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytPliku {

	public static void main(String[] args) throws FileNotFoundException {
		
		File plik = new File("text.txt");
		Scanner in = new Scanner(plik);
		String zdanie = in.nextLine();
		
		System.out.println(zdanie);
	}

}
