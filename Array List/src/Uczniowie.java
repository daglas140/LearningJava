/**
 * Created by Daglas on 2017-06-08.
 */
public class Uczniowie {
    private String imie, nazwisko;
    private int numerWdzienniku;
    public Uczniowie(){
        imie = "Brak";
        nazwisko = "Brak";
        numerWdzienniku = 0;
    }

    public Uczniowie(int numerWdzienniku, String imie, String nazwisko){
        this.numerWdzienniku = numerWdzienniku;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getNumerWdzienniku() {
        return numerWdzienniku;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String toString(){
        return (getNumerWdzienniku() + " " + getImie() + " " + getNazwisko());
    }
}
