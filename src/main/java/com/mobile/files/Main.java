package com.mobile.files;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Scrie-mi ceva: ");
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        System.out.println("Am citit: " + line);
//
//        System.out.println("Da-mi un int: ");
//        int a = scanner.nextInt(); // 4 bytes
//        System.out.println("Am citit: " + a);

        String fisier = "fisier.txt";
        try (Scanner scanner2 = new Scanner(new File("fisier.txt"))) {
            int a1 = scanner2.nextInt();
            double b = scanner2.nextDouble();
            System.out.println("a = " + a1);
            System.out.println("b = " + b);
            scanner2.nextLine(); // \n
            String line = scanner2.nextLine(); // mesaj de text\n
            System.out.println("line = " + line);
        } catch (FileNotFoundException e) {
            System.out.println("nu l-am gasit: " + fisier);
        }

        Student student = new Student("Gigel");
        try (
                FileOutputStream fos = new FileOutputStream("date.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(
            FileInputStream fis = new FileInputStream("date.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Student studentCitit = (Student) ois.readObject();
            System.out.println("Am citit: " + studentCitit);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
