import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>listaWylosowana = new ArrayList<>();
        Random random = new Random();
        //losowanie listy bez powtorzen
        int liczba ;
        while (listaWylosowana.size()<6) {
            liczba = random.nextInt(1, 50);
            if (listaWylosowana.contains(liczba)){
                continue;
            }
            listaWylosowana.add(liczba);

        }
        //wypisywanie tablicy
        System.out.println("Wylosowana lista::");

        System.out.println(listaWylosowana);


    }
}