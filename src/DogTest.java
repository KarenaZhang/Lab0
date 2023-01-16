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
    /**
     * default constructor
     */
    public DogTest(){

    }

    private Dog miumiu;

    /**
     * create a new object of the Dog class
     */
    @Before
    public void setUp() {

        miumiu = new Dog("Maltese", "miumiu", "white", 2);
    }

    /**
     * test the breed of object miumiu
     */
    @Test
    public void testBreed() {
        assertEquals("Maltese", miumiu.getBreed());

    }

    /**
     * test the name of object miumiu
     */
    @Test
    public void testName() {
        assertEquals("miumiu", miumiu.getName());
    }

    /**
     * test the color of object miumiu
     */
    @Test
    public void testColor() {
        assertEquals("white", miumiu.getColor());
    }

    /**
     * test the age of object miumiu
     */
    @Test
    public void testAge() {
        assertEquals(2, miumiu.getAge());
    }

}

