package com.mobile.thread_synchronized_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Integer> myList;
    static List<Integer> mySynchronizedList;

    public static void main(String[] args) throws InterruptedException {
        myList = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            myList.add(i); // [0; 100]
        }
        mySynchronizedList = Collections.synchronizedList(myList);

//        for (int k = 0; k < 10; k++) {
//            for (int i = 0; i <= 100; i++) {
//                myList.set(i, myList.get(i) + 1);
//            }
//        }


        MyThread[] myThreads = new MyThread[10];

        for (int i = 0; i < 10; i++) {
            myThreads[i] = new MyThread(myList.get(i));
            myThreads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            myThreads[i].join();
        }


        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }

        // [0; 999] =  5050
        // 6060
        System.out.println("Sum = " + sum);


    }


}
