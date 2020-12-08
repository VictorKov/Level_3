package com.company.geekbrains.Lesson_1.Part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Part1 {



    public Part1() {
    }

   public void changeIndexElementOfList(List<?> list, int a, int b){
        Collections.swap(list, a, b);

   }

   public static <T> List<T> changeArrayToList(T[] arr){
       return new ArrayList<>(Arrays.asList(arr));
   }

   public static void changeIndexElementOfArrays(Object[] arr, int a, int b){

        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
   }


    }

