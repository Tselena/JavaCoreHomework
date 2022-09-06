package LessonFive_AppData;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AppData data = new AppData();
        data.readFile("myFile.csv"); //D:\Мои документы\Программирование\УЧЕБА Гикбрейнс\JAVA Core\Lesson 5\JavaCoreHomeworkFive\src\myFile.csv
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCsv("myFile.csv", "newFile.csv");  //"D:\\Мои документы\\Программирование\\УЧЕБА Гикбрейнс\\JAVA Core\\Lesson 5\\JavaCoreHomeworkFive\\src\\myFile.csv", "D:\\Мои документы\\Программирование\\УЧЕБА Гикбрейнс\\JAVA Core\\Lesson 5\\JavaCoreHomeworkFive\\src\\newFile.csv"
    }
}
