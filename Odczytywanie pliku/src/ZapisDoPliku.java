import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZapisDoPliku {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("text.txt");
		zapis.println("To jest nowa zapisana linia");
		zapis.close();
	}

}
