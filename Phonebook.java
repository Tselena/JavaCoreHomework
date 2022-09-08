package HomeWorkFour_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {

    private HashMap<String, HashSet<String>> phonebook = new HashMap<>(); //�����������, ��� �������� � ���� ��������� ����� ������ � ���� HashSet<String> �_�


    //��������� ������ � ����������
    public void addToPhonebook (String name, String phone) {
        HashSet<String> phones;

        if(phonebook.containsKey(name)){  //���� � ���������� ���� ���� (=���)
            phones = phonebook.get(name); //���������� �������� �� �����, �.�. ���������� ����� �� �����, ������� ��� ���� � ���������
        } else {                       //���
            phones = new HashSet<>(); //��������� ����� ������
        }
        phones.add(phone); //��������� �������
        phonebook.put(name, phones); //��������� � ��������� ���� � ��� ��������
    }

    public Set<String> getPhoneByName(String name) {
        return phonebook.get(name);
    }

}
