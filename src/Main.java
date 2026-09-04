import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] wylosowanaTablica = new int[6];
        Random random = new Random();
        for (int i = 0; i < wylosowanaTablica.length; i++) {
            wylosowanaTablica[i] = random.nextInt(1,50);
        }
        //wypisywanie tablicy
        System.out.println("tablica losowana:");
        for (int elementTablicy:wylosowanaTablica) {
            System.out.println(elementTablicy);
        }
    }
}