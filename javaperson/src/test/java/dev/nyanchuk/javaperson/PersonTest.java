package dev.nyanchuk.javaperson;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        // Init a Person object before each test
        person = new Person("Maria", "Alvares", 1, 1990, "Spain", Gender.FEMALE);
    }

    @Test
    public void testConstructor() {
        assertEquals("Maria", person.getName());
        assertEquals("Alvares", person.getSurname());
        assertEquals(1, person.getId());
        assertEquals(1990, person.getBirthYear());
        assertEquals("Spain", person.getCountry());
        assertEquals(Gender.FEMALE, person.getGender());
    }

    @Test
    public void testSetName() {
        person.setName("Leo");
        assertEquals("Leo", person.getName());
    }

    @Test
    public void testSetSurname() {
        person.setSurname("Yanchuk");
        assertEquals("Yanchuk", person.getSurname());
    }

    @Test
    public void testSetId() {
        person.setId(2);
        assertEquals(2, person.getId());
    }

    @Test
    public void testSetBirthYear() {
        person.setBirthYear(2018);
        assertEquals(2018, person.getBirthYear());
    }

    @Test
    public void testSetCountry() {
        person.setCountry("Ukraine");
        assertEquals("Ukraine", person.getCountry());
    }

}
