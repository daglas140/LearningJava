import java.util.ArrayList;
import java.util.List;
 
public class Test{
    public static void main(String[] args){
        //tworzymy listy
        List<String> lista = new ArrayList<String>();
        List<Uczniowie>dziennik = new ArrayList<Uczniowie>();

        //dodajemy elementy typu Object - czyli dowolne, my dodamy ci�gi znak�w
        lista.add("Asia");
        lista.add("Basia");
        lista.add("Krzysiek");
        lista.add("Wojtek");

        //Tworzymy obiekty,które testowo dodam do listy
        Uczniowie uczen1 = new Uczniowie();
        Uczniowie uczen2 = new Uczniowie(1,"Jan", "Kowalski");
        Uczniowie uczen3 = new Uczniowie(2, "Jakub", "Mazowiecki");

        //Dodajemy obiekty do listy
        dziennik.add(uczen1);
        dziennik.add(uczen2);
        dziennik.add(uczen3);

        //sprawdzamy rozmiar listy
        System.out.println("Rozmiar listy LISTA to: "+lista.size());
        System.out.println("Rozmiar listy DZIENNIK to:" + dziennik.size());
 
        //usuwamy obiekt "Asia" i sprawdzamy rozmiar
        lista.remove("Asia");
        System.out.println("Rozmiar listy to: "+lista.size());
 
        //usuwamy obiekt zajmuj�cy 2 miejsce, czyli o indeksie 1 - u nas "Krzysiek"
        lista.remove(1);
        System.out.println("Rozmiar listy to: "+lista.size());
 
        //na koniec przypiszmy pierwszy element listy zmiennej imie i wy�wietlmy go
        //musimy u�y� rzutowania, poniewa� inaczej pr�bowaliby�my przypisa� Object do String
        String imie = (String)lista.get(0);
        System.out.println("Pierwszy element listy to: "+ imie);

        System.out.println(dziennik.toString());

 
    }
}