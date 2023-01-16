/*******
 Name: Keke Zhang
 Assignment: Lab 0
 Date: 14/Jan/2023
 Notes:BookTest
 *******/


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
    /**
     * default constructor
     */
    public BookTest(){

    }

    private Book littlePrince;
    /**
     * create a new object of the Person class
     * create a new object of the Book class
      */
    @Before
    public void setUp() {
        Person Antoine = new Person("Antoine", "Saint-Exupery", 1900);
        littlePrince = new Book("littlePrince", Antoine, 10.0f);
    }

    /**
     * test the title of object littlePrince
     */
    @Test
    public void testTitle() {
        assertEquals("littlePrince", littlePrince.getTitle());

    }
    /**
     * test the author's first name of object littlePrince
     */
    @Test
    public void testAuthorFirst() {
        assertEquals("Antoine", littlePrince.getAuthor().getFirstName());
    }
    /**
     * test the author's last name of object littlePrince
     */
    @Test
    public void testAuthorLast() {
        assertEquals("Saint-Exupery", littlePrince.getAuthor().getLastName());
    }
    /**
     * test the price of object littlePrince
     */
    @Test
    public void testPrice() {
        assertEquals(10.0, littlePrince.getPrice(),0.000001);
    }

}
