package com.company.geekbrains.Lesson_1.TaskWithBoxAndFruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruits>{
   private List<T> boxWithFruits;

    public Box() {
        this.boxWithFruits = new ArrayList<>();
    }

    public Box(T...fruits) {
        this.boxWithFruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight(){

        float boxWeight = 0.0f;

        if(boxWithFruits.size()==0) {
            boxWeight = 0.0f;
        }
        if (!(boxWithFruits.size()==0)){
            for (T fruits : boxWithFruits) {
                boxWeight += fruits.getWeight();
            }
        }
        return boxWeight;
    }

    public boolean avg(Box<?> boxWithAnyFruits){
        return Math.abs(this.getWeight() - boxWithAnyFruits.getWeight()) < 0.001;
    }

    public void addFruit(T fruit){
        boxWithFruits.add(fruit);
    }

    public void putAll(Box <? super T> boxWithAnything){
        if(this == boxWithAnything){
            return;
        }
        boxWithAnything.boxWithFruits.addAll(this.boxWithFruits);
        this.boxWithFruits.clear();
    }
}
