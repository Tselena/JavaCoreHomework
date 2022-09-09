package homeWorkThree;

import java.util.ArrayList;

public class Box<T> {

    private float boxWeight = 0.0f;

    ArrayList<T> fruits = new ArrayList();

    public <T> Box (float boxWeight) {
        this.boxWeight = boxWeight;
    }

    //добавление фрукта
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    //считаем вес
    public float getBoxWeight() {
        return fruits.size() * boxWeight;
    }

    public void addFruits(Box<T> boxFruit){
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
    }
    
}
