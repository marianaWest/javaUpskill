package Aula12.TA.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("test time array list: " + testTime(arrayList));
        System.out.println("test time linked list: " + testTime(linkedList));
    }

    private static long testTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        //inserçao de elementos no inicio da lista
        list.add(0);
        for (int i = 0; i != 100000; i++) {
            list.add(0, i);
        }             return System.currentTimeMillis() - startTime;

    }
}

// array list: 363 / linked list: 4
// array has to rearrange the entire list

