package com.mobile.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Consumer<Integer> integerConsumer = (nr) -> {
            System.out.println("Consum " + nr);
        };

        Stream intStream = Stream.of(8, 7 , 1, 4, 6, 7, 9, 1, 3, 7);
        System.out.println(" === Without distinct: === ");
        intStream.forEach(integerConsumer);

        intStream = Stream.of(8, 7 , 1, 4, 6, 7, 9, 1, 3, 7);
        System.out.println(" === With distinct: === ");
        intStream.distinct().forEach(integerConsumer); // method chaining

        System.out.println(" === With distinct and even filtering: === ");
        Predicate<Integer> integerEvenPredicate = (nr) -> {
            return nr % 2 == 0;
        };
        intStream = Stream.of(8, 7 , 1, 4, 6, 7, 9, 1, 3, 7);
        intStream.distinct().filter(integerEvenPredicate).forEach(integerConsumer);

        System.out.println("--------- ----------");
        List<Integer> myListInteger = new ArrayList<>();
        for (int i = 1000; i >= 0; i--) {
            myListInteger.add(i);
        }

        Stream<Integer> myListStream = myListInteger.stream();
        myListStream.filter((nr) -> nr % 13 == 0).sorted((a, b) -> Math.random() < 0.5 ? 1: -1).forEach((nr) -> {
            System.out.print(nr + ", ");
        });

    }
}
