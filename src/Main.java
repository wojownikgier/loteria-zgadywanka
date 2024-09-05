import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("witam panie");
        System.out.println("lekcja programowaniea");

        int wylosowana = (int)(Math.random()*10+1);//losuje liczbe
        System.out.println(wylosowana);

        //git init , git config  user.name user.email , git commit -m "jakas nazwa", git remote add origin ,
        // git push - u origin master
        //dzien2
        /*
        typy proste zawsze z małej liczby . maja tylko wartość
        logiczny: boolean
        całkowite: byt shory long , int
        liczby rzeciwiste: float duuble
        znakowy: char

        typy złozone wasze wielka litera,
        okiety które maja własnosci i metody
         */
        System.out.println("zgadnij liczbe zakresu 1-10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaliczba = klawiatura.nextInt();//wczytywamoe z klawiatury
        System.out.println("wpisano z klawiatury"+wpisanaliczba);
        4
    }
}