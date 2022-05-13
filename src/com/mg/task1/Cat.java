package com.mg.task1;

public class Cat extends Example {

    String name;

    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return this.name = name;
    }
}
