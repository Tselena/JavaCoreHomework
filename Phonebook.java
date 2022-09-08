package HomeWorkFour_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {

    private HashMap<String, HashSet<String>> phonebook = new HashMap<>(); //оказывается, тип значений в паре элементов можно задать в виде HashSet<String> о_О


    //Добавляем записи в справочник
    public void addToPhonebook (String name, String phone) {
        HashSet<String> phones;

        if(phonebook.containsKey(name)){  //если в справочник есть ключ (=имя)
            phones = phonebook.get(name); //возвращаем значение по ключу, т.е. присвоение будет по ключу, который уже есть в коллекции
        } else {                       //или
            phones = new HashSet<>(); //добавляем новый объект
        }
        phones.add(phone); //добавляем телефон
        phonebook.put(name, phones); //добавляем в коллекцию ключ и его значение
    }

    public Set<String> getPhoneByName(String name) {
        return phonebook.get(name);
    }

}
