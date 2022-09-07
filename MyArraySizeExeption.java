package HomeWorkTwo;

public class MyArraySizeExeption extends Exception{

    public MyArraySizeExeption(String message) {
        super(message);
        //System.out.println("Ошибка! Неправильная размерность массива");
    }
}
