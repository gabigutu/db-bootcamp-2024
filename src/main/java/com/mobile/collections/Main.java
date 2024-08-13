package com.mobile.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            mySet.add(i);
        }
        mySet.add(13);

        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        Set<String> mySetStr = new HashSet<>();
        mySetStr.add("Ana");
        mySetStr.add("Maria");
        mySetStr.add("Andrei");
        mySetStr.add("Mihai");
        mySetStr.add("Ana");

        Iterator<String> iteratorStr = mySetStr.iterator();
        while (iteratorStr.hasNext()) {
            System.out.print(iteratorStr.next() + ", ");
        }
        System.out.println();

        if (mySetStr.contains("Ana")) {
            System.out.println("Ana exista");
        } else {
            System.out.println("Ana nu exista");
        }

        if (mySetStr.contains("Gigi")) {
            System.out.println("Gigi exista");
        } else {
            System.out.println("Gigi nu exista");
        }

        Set<String> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add("Ana");
        myLinkedHashSet.add("Maria");
        myLinkedHashSet.add("Andrei");
        myLinkedHashSet.add("Mihai");
        myLinkedHashSet.add("Ana");

        Iterator<String> iteratorLinkedHashSet = myLinkedHashSet.iterator();
        while (iteratorLinkedHashSet.hasNext()) {
            System.out.print(iteratorLinkedHashSet.next() + ", ");
        }
        System.out.println();

        Set<Pet> pets = new TreeSet<>();
        pets.add(new Pet("Azorel", 1));
        pets.add(new Pet("Pisi", 2));
        pets.add(new Pet("Grivei", 1));
        pets.add(new Pet("Tom", 1));
        Iterator<Pet> iteratorPets = pets.iterator();
        while (iteratorPets.hasNext()) {
            System.out.print(iteratorPets.next() + ", ");
        }
        System.out.println();

        List<String> participantiCurs = new LinkedList<>();
        participantiCurs.add("Laur");
        participantiCurs.add("Bianca");
        participantiCurs.add("Ana");
        participantiCurs.add("Laur");
        Iterator<String> iteratorParticipanti = participantiCurs.iterator();
        while (iteratorParticipanti.hasNext()) {
            System.out.print(iteratorParticipanti.next() + ", ");
        }
        System.out.println();

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add("Persoana " + i);
            System.out.println("S-a asezat la coada " + "Persoana " + i);
        }
        for (int j = 0; j < 4; j++) {
            String cineAPlatit = queue.remove();
            System.out.println("A platit " + cineAPlatit);
        }


    }
}
