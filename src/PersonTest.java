/*******
 Name: Keke Zhang
 Assignment: Lab 0
 Date: 14/Jan/2023
 Notes:PersonTest
 *******/

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {
    /**
     * default constructor
     */
    public PersonTest(){

    }

    private Person john;
    /**
     * create a new object of the Person class
     */
    @Before
    public void setUp() {

        john = new Person("john", "doe", 1989);
    }
    /**
     * test the first name of object john
     */
    @Test
    public void testFirst() {
        assertEquals("john", john.getFirstName());

    }
    /**
     * test the last name of object john
     */
    @Test
    public void testSecond() {
        assertEquals("doe", john.getLastName());
    }

    /**
     * test the year of birth of object john
     */
    @Test
    public void testYearOfBirth() {
        assertEquals(1989, john.getYearOfBirth());
    }

}
