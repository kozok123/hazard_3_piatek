import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] wylosowanaTablica = new int[6];
        Random random = new Random();
        //losowanie bez powtorzen
        int liczba ;
        boolean czyZawiera;
        for (int i = 0; i < wylosowanaTablica.length; i++) {
            liczba = random.nextInt(1,50);
            for (int j = 0; j<= i; j++) {
                if (wylosowanaTablica[j] == liczba) {
                    czyZawiera = true;
                    break;
                }
            }
            if (!czyZawiera) {
                wylosowanaTablica[i]=liczba;
            }
            czyZawiera = false;
        }
        //wypisywanie tablicy
        System.out.println("tablica losowana:");
        for (int elementTablicy:wylosowanaTablica) {
            System.out.println(elementTablicy);
        }

    }
}