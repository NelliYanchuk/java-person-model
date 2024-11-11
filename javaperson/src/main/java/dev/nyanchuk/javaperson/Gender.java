package dev.nyanchuk.javaperson;

public enum Gender {
    MALE('M'),
    FEMALE('F'),
    OTHER('O');

    public char getGen() {
        return gen;
    }

    private char gen;

    Gender(char gender) {
      this.gen = gender;
    } 
  
}