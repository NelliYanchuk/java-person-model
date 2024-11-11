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
}
