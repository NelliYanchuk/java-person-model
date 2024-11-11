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

}
