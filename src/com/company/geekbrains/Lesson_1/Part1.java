package HWLesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Part1 {



    public Part1() {
    }

   public void changeIndexElementOfList(List<?> list, int a, int b){
        Collections.swap(list, a, b);

   }

   public <T> List<T> changeArrayToList(T[] arr){
       return Arrays.asList(arr);
   }

   public void changeIndexElementOfArrays(Object[] arr, int a, int b){

        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
   }


    }

