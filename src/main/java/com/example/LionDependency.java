package com.example;

import java.util.List;

public interface LionDependency {

    int getKittens();

    List<String> getFood(String animalKind) throws Exception;
}