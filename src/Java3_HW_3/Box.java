package Java3_HW_3;

import java.util.ArrayList;
import java.util.*;

public class Box <T extends Fruit>{
    public List<T> list = new ArrayList<>();
    public T fruit;

    public Box(T fruit) {
        this.fruit = fruit;
        list.add(fruit);
    }

    public void addFruit(T fruit){
        list.add(fruit);
    }

    <T> double getWeight(){
        //float fruitWeight = 0f;
        //if (fruit instanceof Apple) fruitWeight = 1.0f;
        //if (fruit instanceof Orange) fruitWeight = 1.5f;
        return list.size()* fruit.fruitWeight;
    }
     boolean compareBoxes(Box<?> anotherBox){
        if (Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001){
            return true;
        }else return false;
    }

    public void pourOverFruits(Box<T> anotherBox){
        list.addAll(anotherBox.list);
    }
}
