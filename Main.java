package HomeWorkFour_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
                
        String[] animalsList = new String[] {"dog", "cat", "fox", "cat", "monkey", "bear", "mouse", "mouse", "wolf", "tiger", "lion"};
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(animalsList));

        //Вывести список уникальных слов
        Set<String> uniqueWordsList = new TreeSet<>(Arrays.asList(animalsList));
        System.out.println(uniqueWordsList);

        //Посчитать, сколько раз встречается каждое слово
        HashMap<String, Integer> repetedWord = new HashMap<>();
        for (String word : animalsList)
        {
            if (!repetedWord.containsKey(word))
            {
                repetedWord.put(word, 0);
            }
            repetedWord.put(word, repetedWord.get(word) + 1);
        }

        for (String word : repetedWord.keySet())
        {
            System.out.println(word + " - " + repetedWord.get(word));
        }


        System.out.println();
        System.out.println();

        System.out.println("А теперь телефонный справочник");

        Phonebook newPhonebook = new Phonebook();
        newPhonebook.addToPhonebook("Stepan", "7777777");
        newPhonebook.addToPhonebook("Lidia", "1112224");
        newPhonebook.addToPhonebook("Vasili", "5234567");
        newPhonebook.addToPhonebook("Stepan", "5555555");
        newPhonebook.addToPhonebook("Olga", "1111111");

        System.out.println("Stepan's phone number is " + newPhonebook.getPhoneByName("Stepan"));
        System.out.println("Lidia's phone number is "+ newPhonebook.getPhoneByName("Lidia"));
        System.out.println("Yuri's phone number is " + newPhonebook.getPhoneByName("Yuri"));


    }
}
