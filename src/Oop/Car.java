package Oop;

/*
 * Classe que representa um carro
 */
public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void accelerate() {
        System.out.println(model + " is accelerating...");
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }
}