package dev.nyanchuk.javaperson;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        PersonInfo personInfo = new PersonInfo();

        Person person1 = new Person("Maria", "Alvares", 1, 1990, "Spain", Gender.FEMALE);
        Person person2 = new Person("Leo", "Yanchuk", 2, 2018, "Ucraine", Gender.MALE);

        personInfo.printPersonInfo(person1);
        personInfo.printPersonInfo(person2);

    }
}