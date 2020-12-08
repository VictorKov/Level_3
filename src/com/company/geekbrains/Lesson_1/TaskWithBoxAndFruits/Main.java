package com.company.geekbrains.Lesson_1.TaskWithBoxAndFruits;

public class Main {

    public static void main(String[] args) {
        /*3. Большая задача:
        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        g. Не забываем про метод добавления фрукта в коробку.*/


        Box<Apple> boxWithApple = new Box<>();
        Box<Orange> boxWithOrange = new Box<>();
        Box<Apple> boxWithApple1 = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOrange1 = new Box<>(new Orange(), new Orange());

        System.out.println(boxWithApple1.getWeight());
        System.out.println(boxWithOrange1.getWeight());
        System.out.println();

        boxWithApple.addFruit(new Apple());
        boxWithApple.addFruit(new Apple());
        boxWithOrange.addFruit(new Orange());
        System.out.println(boxWithApple.getWeight());

        System.out.println(boxWithApple.avg(boxWithOrange));
        System.out.println(boxWithApple1.avg(boxWithOrange1));

        System.out.println();

        boxWithApple.putAll(boxWithApple1);
        System.out.println(boxWithApple1.getWeight());


    }
}
