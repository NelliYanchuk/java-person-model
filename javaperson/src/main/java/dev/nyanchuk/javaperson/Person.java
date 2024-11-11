package dev.nyanchuk.javaperson;

public class Person {

    String name;
    String surname;
    int id;
    int birthYear;
    String country;
    char gender;

    // Constructor
    public Person(String name, String surname, int id, int birthYear, String country, char gender) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.birthYear = birthYear;
        this.country = country;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getCountry() {
        return country;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Method to print all info about a person
    public void printPerson() {
        SleepOutput.sleepOutput(1000); // 1 sec
        System.out.println("\nName: " + name);
        SleepOutput.sleepOutput(500);
        System.out.println("Surname: " + surname);
        SleepOutput.sleepOutput(500);
        System.out.println("ID: " + id);
        SleepOutput.sleepOutput(500);
        System.out.println("Birth Year: " + birthYear);
        SleepOutput.sleepOutput(500);
        System.out.println("Country of Birth: " + country);
        SleepOutput.sleepOutput(500);
        System.out.println("Gender: " + gender);
    }
}
