/*******
 Name: Keke Zhang
 Assignment: Lab 0
 Date: 14/Jan/2023
 Notes:DogTest
 *******/


/**
 * This class represents a dog. A dog has a breed, an name, a color and age.
 */
public class Dog {
    private String breed;
    private String name;
    private String color;
    private int age;

    /**
     * Construct a Dog object that has the provided breed, name, color and age.
     *
     * @param breed  the breed of this dog
     * @param name the name to be given to this dog
     * @param color the color of this dog
     * @param age  the color of this dog
     */

    public Dog(String breed, String name, String color, int age) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    /**
     * Return the breed of this dog.
     *
     * @return the breed of this dog
     */

    public String getBreed() {
        return this.breed;
    }

    /**
     * Return the name of this dog.
     *
     * @return the name of this dog
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the color of this dog.
     *
     * @return the color of this dog
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Return the age of this dog.
     *
     * @return the age of this dog
     */
    public int getAge() {
        return this.age;
    }

}