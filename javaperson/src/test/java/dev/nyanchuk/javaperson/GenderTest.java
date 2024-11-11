package dev.nyanchuk.javaperson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenderTest {

    @Test
    void testGetGen() {
        assertEquals('M', Gender.MALE.getGenderValue());
        assertEquals('F', Gender.FEMALE.getGenderValue());
        assertEquals('O', Gender.OTHER.getGenderValue());
    }
}
