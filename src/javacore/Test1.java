package javacore;

import java.util.List;
import java.util.ArrayList;

public class Test1 {

//    Write a function that takes a list of integers as input and returns a new list with each element converted to a string.

   public  static List<String> intToString(List<Integer> li)
    {
        List<String> list = new ArrayList<String>();
       for(int a : li)
       {
         String str =  Integer.toString(a);
         list.add(str);
       }

        return list;
    }

    public static void main(String[] args) {

        List<Integer> mi = new ArrayList<Integer>();
        mi.add(1);
        mi.add(2);
        mi.add(3);

        System.out.println(intToString(mi));



    }
}
