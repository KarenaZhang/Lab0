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

    private Book littlePrince;

    @Before
    public void setUp() {
        Person Antoine = new Person("Antoine", "Saint-Exupery", 1900);
        littlePrince = new Book("littlePrince", Antoine, 10.0f);
    }

    @Test
    public void testTitle() {
        assertEquals("littlePrince", littlePrince.getTitle());

    }

    @Test
    public void testAuthorFirst() {
        assertEquals("Antoine", littlePrince.getAuthor().getFirstName());
    }
    @Test
    public void testAuthorLast() {
        assertEquals("Saint-Exupery", littlePrince.getAuthor().getLastName());
    }

    @Test
    public void testPrice() {
        assertEquals(10.0, littlePrince.getPrice(),0.000001);
    }

}
