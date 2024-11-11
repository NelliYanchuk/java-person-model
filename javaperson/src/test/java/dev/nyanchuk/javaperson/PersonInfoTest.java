package dev.nyanchuk.javaperson;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonInfoTest {

    private PersonInfo personInfo;
    private Person person;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        personInfo = new PersonInfo();
        person = new Person("Maria", "Alvares", 1, 1990, "Spain", Gender.FEMALE);
        System.setOut(new PrintStream(outputStreamCaptor)); // Redirect console output to outputStreamCaptor
    }

    @Test
    public void testPrintPersonInfo() {
        personInfo.printPersonInfo(person);

        // Get output as a string
        String output = outputStreamCaptor.toString();

        // Check each line
        assertTrue(output.contains("Name: Maria"));
        assertTrue(output.contains("Surname: Alvares"));
        assertTrue(output.contains("ID: 1"));
        assertTrue(output.contains("Birth Year: 1990"));
        assertTrue(output.contains("Country of Birth: Spain"));
        assertTrue(output.contains("Gender: F"));
    }
}
