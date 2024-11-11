package dev.nyanchuk.javaperson;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Person person1 = new Person("Maria", "Alvares", 1, 1990, "Spain", 'F');
        Person person2 = new Person("Leo", "Yanchuk", 2, 2018, "Ucraine", 'M');
        System.out.println("\nTwo Person objects are created.");

        person1.printPerson();
        person2.printPerson();
    }
}
