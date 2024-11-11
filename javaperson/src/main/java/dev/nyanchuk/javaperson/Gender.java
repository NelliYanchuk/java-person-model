package dev.nyanchuk.javaperson;

public enum Gender {
    MALE('M'),
    FEMALE('F'),
    OTHER('O');

    private char gen;

    Gender(char gender) {
        this.gen = gender;
    }

    public char getGen() {
        return gen;
    }

}