/*******
 Name: Keke Zhang
 Assignment: Lab 0
 Date: 14/Jan/2023
 Notes:DogTest
 *******/


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Dog class.
 */
public class DogTest {

    private Dog miumiu;

    @Before
    public void setUp() {

        miumiu = new Dog("Maltese", "miumiu", "white", 2);
    }

    @Test
    public void testBreed() {
        assertEquals("Maltese", miumiu.getBreed());

    }

    @Test
    public void testName() {
        assertEquals("miumiu", miumiu.getName());
    }
    @Test
    public void testColor() {
        assertEquals("white", miumiu.getColor());
    }

    @Test
    public void testAge() {
        assertEquals(2, miumiu.getAge());
    }

}

