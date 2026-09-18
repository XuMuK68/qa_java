package com.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@RunWith(Parameterized.class)
public class LionTest extends TestCase {

    @Parameterized.Parameter()
    public String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex,feline);
        switch (sex) {
            case "Самец":
                assertTrue(lion.doesHaveMane());
                break;
            case "Самка":
                assertFalse(lion.doesHaveMane());
                break;
        }

    }
}