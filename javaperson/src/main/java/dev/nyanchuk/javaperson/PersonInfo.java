package dev.nyanchuk.javaperson;

public class PersonInfo {

    public void printPersonInfo(Person person) {

        // Method to print all info about a person
        SleepOutput.sleepOutput(1000); // 1 sec
        System.out.println("\nName: " + person.name);
        SleepOutput.sleepOutput(500);
        System.out.println("Surname: " + person.surname);
        SleepOutput.sleepOutput(500);
        System.out.println("ID: " + person.id);
        SleepOutput.sleepOutput(500);
        System.out.println("Birth Year: " + person.birthYear);
        SleepOutput.sleepOutput(500);
        System.out.println("Country of Birth: " + person.country);
        SleepOutput.sleepOutput(500);
        System.out.println("Gender: " + person.gender);
    }
}
