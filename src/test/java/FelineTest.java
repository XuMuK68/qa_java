package com.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class FelineTest extends TestCase {

    Feline feline = new Feline();


    @Test
    public void testEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void testGetKittens() {
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void testTestGetKittens() {
        int randomInt = (int)(Math.random()*10);
        assertEquals(randomInt, feline.getKittens(randomInt));
    }
}