package com.java.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Student st = new Student(null, "Marian", "Kowalski", "123");


        // Swoidwad22
        StudentDao studentDao = new StudentDao();
       // studentDao.saveStudentIntoDataBase(st);
       // System.out.println(studentDao.getAllStudentsFromDataBase());

        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz  co chcesz zrobić: \n  dodaj \n  listuj \n  exit");
        String odczyt;

        do {
            odczyt = scanner.nextLine();
            if (odczyt.equals("listuj")) {
                studentDao.getAllStudentsFromDataBase().stream().forEach(System.out::println);
            } else if (odczyt.equals("dodaj")) {
                System.out.println("podaj imie");
                String imie = scanner.nextLine();
                System.out.println("podaj nazwisko");
                String nazwisko = scanner.nextLine();
                System.out.println("podaj indeks");
                String indeks = scanner.nextLine();

                System.out.println("Podaj ilosc ocen: ");
                int iloscOcen = scanner.nextInt();
                List<Ocena> ocenaList = new ArrayList<>();
                for (int i = 0; i < iloscOcen; i++) {
                    System.out.println("Podaj nazwe przedmiotu");
                    Przedmiot przedmiot = Przedmiot.valueOf(scanner.next());

                    System.out.println("Podaj ocene");
                    int  ocena= scanner.nextInt();

                    ocenaList.add(new Ocena(null, ocena,przedmiot,null));
                }

                studentDao.saveStudentIntoDataBase(new Student(null, imie, nazwisko, indeks, null));
            } else {
                break;
            }
        } while (!odczyt.equals("exit"));
    }

}



