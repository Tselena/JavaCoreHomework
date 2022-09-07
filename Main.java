package HomeWorkTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] array = createArray(4);
        Checker arrayChecker = new Checker();
        arrayChecker.checkArray(array);

        System.out.println();
        System.out.println();
        arrayChecker.summizeData();

    }



        private static String[][] createArray(int size) {

            Scanner keyboard = new Scanner(System.in);
            String[][] array = new String[size][size];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("¬ведите значение в €чейку массива array[" + i + "][" + j + "]:");
                    array[i][j] = keyboard.nextLine();
                }
            }

            keyboard.close();

            System.out.println();
            System.out.println();
            System.out.println("—оздан следующий двумерный массив данных: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            return array;
        }
}
