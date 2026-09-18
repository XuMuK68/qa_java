package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {
        when(feline.getKittens()).thenReturn(2);
        var lion = new Lion("Самец", feline);
        assertEquals(2,lion.getKittens());
    }

    @Test
    public void testException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неопределенный", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}