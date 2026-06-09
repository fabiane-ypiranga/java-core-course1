package Oop;

/*
 * Classe que representa uma pessoa
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}