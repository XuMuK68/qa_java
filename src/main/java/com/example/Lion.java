package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private final LionDependency lionDependency;

    public Lion(String sex, LionDependency lionDependency) throws Exception {
        this.lionDependency = lionDependency;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return lionDependency.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return lionDependency.getFood("Хищник");
    }
}