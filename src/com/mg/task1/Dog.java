package com.mg.task1;

public class Dog implements Example {
    String name;

    @Override
    public String setName(String name) {
        return this.name = name;
    }
}
