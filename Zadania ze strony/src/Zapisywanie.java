import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
 
public class Zapisywanie {
    public static void main(String[] args) {
        RandomAccessFile strumieñ = null;
        int iloœæSczytanychBajtów = 0;
 
        try {
            strumieñ = new RandomAccessFile("daneBinarne.txt", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("B³¹d otwierania strumienia");
        }
 
        try {
            strumieñ = new RandomAccessFile("daneBinarne.txt", "rw");
            while (strumieñ.read() != -1)
                iloœæSczytanychBajtów++;
        } catch (IOException e) {
            System.out.println("B³¹d wejœcia-wyjœcia");
        }
 
        try {
            strumieñ.close();
        } catch (IOException e) {
            System.out.println("B³¹d zamykania strumeinia");
        }
 
        System.out.println("Iloœæ bajtów wynosi: " + iloœæSczytanychBajtów);
    }
 
}