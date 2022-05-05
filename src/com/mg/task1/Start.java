package com.mg.task1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Start {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();


        System.out.println("----------Psy----------");
        Dog dog1 = new Dog();
        dog1.setName("Puszek");
        System.out.println(dog1.name);
        list.add(dog1);

        Dog dog2 = new Dog();
        dog2.setName("Mietek");
        System.out.println(dog2.name);
        list.add(dog2);

        Dog dog3 = new Dog();
        dog3.setName("Czesiek");
        System.out.println(dog3.name);
        list.add(dog3);

        System.out.println("----------Koty----------");

        HashMap<Integer, Object> map = new HashMap<>();

        Cat cat1 = new Cat();
        cat1.setName("Czarny");
        System.out.println(cat1.name);
        map.put(1, cat1);

        Cat cat2 = new Cat();
        cat2.setName("Rudy");
        System.out.println(cat2.name);
        map.put(2, cat2);

        Cat cat3 = new Cat();
        cat3.setName("Niebieski");
        System.out.println(cat3.name);
        map.put(3, cat3);

        System.out.println("----------Samoloty----------");

        HashSet<Object> set = new HashSet<>();

        Plane plane1 = new Plane();
        plane1.setName("Boeing");
        System.out.println(plane1.name);
        set.add(plane1);

        Plane plane2 = new Plane();
        plane2.setName("Concorde");
        System.out.println(plane2.name);
        set.add(plane2);

        Plane plane3 = new Plane();
        plane3.setName("Airbus");
        System.out.println(plane3.name);
        set.add(plane3);

        System.out.println("----------- Wydruk z tablicy ArrayList: ----------");

        for (Object l: list) {
            System.out.println(((Dog)l).name);
        }

        System.out.println("----------- Wydruk z Hash Mapy: ----------");

        for (Object m : map.values()){
            System.out.println(((Cat)m).getName());
        }

        System.out.println("----------- Wydruk z Hash Setu: ----------");
        for (Object s : set){
            System.out.println(((Plane)s).name);
        }
        // reverse order, LinkedHash - order from the beginning
    }
}


