package com.company.geekbrains.Lesson_1.Part_1;

import com.company.geekbrains.Lesson_1.Part_1.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Part1 changeElement = new Part1();


        Integer[] arrInt = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        System.out.println(list);

        changeElement.changeIndexElementOfList(list,1,4);

        System.out.println(list);
        System.out.println();

        System.out.println(Arrays.toString(arrInt));

        changeElement.changeIndexElementOfArrays(arrInt,1,2);

        System.out.println(Arrays.toString(arrInt));

        changeElement.changeArrayToList(arrInt);



    }


}
