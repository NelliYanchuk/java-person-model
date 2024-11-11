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

}
