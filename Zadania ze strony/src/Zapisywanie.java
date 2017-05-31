import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
 
public class Zapisywanie {
    public static void main(String[] args) {
        RandomAccessFile strumie� = null;
        int ilo��SczytanychBajt�w = 0;
 
        try {
            strumie� = new RandomAccessFile("daneBinarne.txt", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("B��d otwierania strumienia");
        }
 
        try {
            strumie� = new RandomAccessFile("daneBinarne.txt", "rw");
            while (strumie�.read() != -1)
                ilo��SczytanychBajt�w++;
        } catch (IOException e) {
            System.out.println("B��d wej�cia-wyj�cia");
        }
 
        try {
            strumie�.close();
        } catch (IOException e) {
            System.out.println("B��d zamykania strumeinia");
        }
 
        System.out.println("Ilo�� bajt�w wynosi: " + ilo��SczytanychBajt�w);
    }
 
}