import java.util.Scanner;
 
public class Odczyt{
  public static void main(String[] args){
      int tab[] = {1,2,3,4,5};
      Scanner odczyt = new Scanner(System.in);
      int index = -1;
 
      System.out.println("Podaj indeks tablicy, kt�ry chcesz zobaczy�: ");
      index = odczyt.nextInt();
 
      try{
    	  System.out.println(tab[index]);
      } catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);  
      }
  }
}