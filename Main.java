package homeWorkThree;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Меняем два элемента массива местами

        String[] animalsList = new String[] {"dog", "cat", "fox", "cat", "monkey", "bear", "mouse", "mouse", "wolf", "tiger", "lion"};
        ArrayList<String> array = new ArrayList<>(Arrays.asList(animalsList));
        System.out.println(array);
        changeArray(animalsList, 3, 4);
        ArrayList<String> arrayTwo = new ArrayList<>(Arrays.asList(animalsList));
        System.out.println(arrayTwo);

        System.out.println();
        System.out.println();






        //Задача с фруктами

        //создаем коробки
        Box<Apple> boxWithApple = new Box<Apple>(1);
        Box<Orange> boxWithOrange = new Box<Orange>(1.5f);
        Box<Orange> boxWithOrangeTwo = new Box<Orange>(1.5f);

        //заполняем фруктами
        for (int i = 0; i < 3; i++) {
            boxWithApple.addFruit(new Apple());
            boxWithOrange.addFruit(new Orange());
            boxWithOrangeTwo.addFruit(new Orange());
        }

        boxWithApple.addFruit(new Apple());
        boxWithOrange.addFruit(new Orange());
        boxWithOrangeTwo.addFruit(new Orange());

        System.out.println("Apple box's weight is " + boxWithApple.getBoxWeight());
        System.out.println("Orange box's weight is " + boxWithOrange.getBoxWeight());
        System.out.println("Orange second box's weight is " + boxWithOrangeTwo.getBoxWeight());
        System.out.println("Boxes with apples and oranges are equils : " + boxWithApple.equals(boxWithOrange));

        System.out.println();
        System.out.println();
        boxWithOrange.addFruits(boxWithOrangeTwo);
        System.out.println("After mergining...");
        System.out.println("Orange box's weight is " + boxWithOrange.getBoxWeight());
        System.out.println("Orange second box's weight is " + boxWithOrangeTwo.getBoxWeight());


    }


    public static String[] changeArray(String[] array, int firstElement, int secondElement) {
        String tmp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = tmp;
        return array;
    }



}
