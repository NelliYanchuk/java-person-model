package dev.nyanchuk.javaperson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenderTest {

    @Test
    void testGetGen() {
        assertEquals('M', Gender.MALE.getGen());
        assertEquals('F', Gender.FEMALE.getGen());
        assertEquals('O', Gender.OTHER.getGen());
    }

    @Test
    void testSetGen() {
        // Test set gen character
        Gender gender = Gender.MALE;
        gender.setGen('X');
        assertEquals('X', gender.getGen());

        // Restore original value
        gender.setGen('M');
    }
}
