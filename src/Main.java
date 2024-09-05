import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("witam panie");
        System.out.println("lekcja programowaniea");

        int wylosowana = (int)(Math.random()*100+1);//losuje liczbe
        System.out.println(wylosowana);

        //git init , git config  user.name user.email , git commit -m "jakas nazwa", git remote add origin ,
        // git push - u origin master
        //dzien2
        /*
        typy proste zawsze z małej litery, mają tylko wartość
        logiczny: boolean
        całkowite: byte, short, int, long
        rzeczywiste: float,double
        znakowy: char

        typy złożone zawsze pisane wielką literą
        obiekty które mją wląsności i metody
         */
        System.out.println("zgadnij liczbe zakresu 1-100");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaliczba = klawiatura.nextInt();//wczytywanie z kawiatury liczby całkowitej
        System.out.println("wpisano z klawiatury "+wpisanaliczba);
        if (wpisanaliczba == wylosowana) {//instrukcja warunkowa
            System.out.println("trafiona liczba");
        }else {
            System.out.println("Nie trafiono sprubuj ponownie");
        }
        String komunikat = wylosowana == wpisanaliczba ? "poprawnie":"niepoprawnie";//wyrażenie warunkowe
        System.out.println(komunikat);

        int roznica = wylosowana>wpisanaliczba? wylosowana:wpisanaliczba-wylosowana;
        roznica = roznica/10; // dzielenie całkowite bo winik  typu int
        switch (roznica){
            case 0:
                System.out.println("brawo good");
                break;
            case 1:
                System.out.println("blisko");
                break;
            case 2:
                System.out.println("dość blisko");
                break;
            default:
                System.out.println("sprubuj scescia innym razem");
        }//wyrazenie swich
        System.out.println(
                switch (roznica){
                    case 0 -> "brawo good";
                    case 1 -> "blisko";
                    case 2 -> "dość blisko";
                    default -> "słabo";
                }
        );
        //zgadywanie 10 razy
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("zgadnij liczbe pruba nr "+(+i+1));
            wpisanaliczba = klawiatura.nextInt();
            if (wpisanaliczba == wylosowana){
                System.out.println("wygrana");
                break;
            }else{
                if (wpisanaliczba>wylosowana){
                    System.out.println("za duzo");
                }else {
                    System.out.println("za mało");
                }
         */
        System.out.println("zgadnij liczbe");
        wpisanaliczba = klawiatura.nextInt();
        while (wpisanaliczba != wylosowana)  {
        if (wpisanaliczba>wylosowana){
            System.out.println("za duzo");
        }else {
            System.out.println("za mało");
        }
        System.out.println("zgadnij liczbe");
        wpisanaliczba = klawiatura.nextInt();
    }
    }
    }
