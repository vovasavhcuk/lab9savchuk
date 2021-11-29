package com.company;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.io.IOException;
import java.util.Comparator;

public class Main {

    public static void main (String[] args) throws IOException {

        List <Paralelopiped>group=new ArrayList<>();
        ParalComparator paralComparator = new ParalComparator();
        System.out.print("Введите число объектов в коллекции: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Введите данные объекта: ");
        for (int i = 0; i < n; i++) {
            Paralelopiped parr=new Paralelopiped();
            parr.a=scanner.nextDouble();
            parr.b=scanner.nextDouble();
            parr.c=scanner.nextDouble();
            parr.pl = parr.getPl();
            group.add(parr);
        }
        System.out.println(group);
        for(int i = 0; i < group.size(); i++){
            String paral=group.get(i).PrintInfo();
            System.out.println(paral);
        }

        Collections.sort(group, paralComparator);

        System.out.println("\nОтсортированный массив:");
        for(int i = 0; i < group.size(); i++){
            String paral = group.get(i).PrintInfo();
            System.out.println(paral);
        }
    }
}
