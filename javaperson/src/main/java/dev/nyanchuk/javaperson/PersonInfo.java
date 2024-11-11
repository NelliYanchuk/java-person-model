package dev.nyanchuk.javaperson;

public class PersonInfo {

    public void printPersonInfo(Person person) {
        SleepOutput.sleepOutput(1000); // 1 sec
        System.out.println("\nName: " + person.getName());
        SleepOutput.sleepOutput(500);
        System.out.println("Surname: " + person.getSurname());
        SleepOutput.sleepOutput(500);
        System.out.println("ID: " + person.getId());
        SleepOutput.sleepOutput(500);
        System.out.println("Birth Year: " + person.getBirthYear());
        SleepOutput.sleepOutput(500);
        System.out.println("Country of Birth: " + person.getCountry());
        SleepOutput.sleepOutput(500);
        System.out.println("Gender: " + person.getGender().getGenderValue());
    }
}
