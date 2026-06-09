package Oop;

import Oop.Util.ConsoleColors;
import java.util.Scanner;

public class Main {

    // ==========================
    // MÉTODOS DE UI
    // ==========================

    public static void printSection(String title) {
        System.out.println();
        System.out.println(ConsoleColors.PURPLE + "==============================");
        System.out.println("   " + title.toUpperCase());
        System.out.println("==============================" + ConsoleColors.RESET);
    }

    public static void printSuccess(String msg) {
        System.out.println(ConsoleColors.GREEN + "✔ " + msg + ConsoleColors.RESET);
    }

    public static void printError(String msg) {
        System.out.println(ConsoleColors.RED + "✖ " + msg + ConsoleColors.RESET);
    }

    public static void printInfo(String msg) {
        System.out.println(ConsoleColors.CYAN + "ℹ " + msg + ConsoleColors.RESET);
    }

    // ==========================
    // MAIN
    // ==========================

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==========================
        // PERSON
        // ==========================
        printSection("Person");

        Person person = new Person("Fabiane", 25);

        System.out.println("Before birthday: " + person);

        person.makeBirthday();

        printSuccess("Birthday completed!");

        System.out.println("After birthday: " + person);

        // ==========================
        // CAR
        // ==========================
        printSection("Car");

        Car car = new Car("Honda Civic", 2022);

        System.out.println(car);

        car.accelerate();

        // ==========================
        // ACCOUNT / MINI BANK
        // ==========================
        Account account = new Account("Fabiane", 1000);

        printSection("Mini Bank System");

        int option;

        do {

            System.out.println();
            printInfo("1 - Ver saldo");
            printInfo("2 - Depositar");
            printInfo("3 - Sacar");
            printInfo("0 - Sair");

            System.out.print("Escolha: ");
            option = scanner.nextInt();

            // VER SALDO
            if (option == 1) {
                printSuccess("Saldo: R$ " + account.getBalance());
            }

            // DEPOSITAR
            else if (option == 2) {
                System.out.print("Valor: ");
                double value = scanner.nextDouble();

                account.deposit(value);
                printSuccess("Depósito realizado!");
            }

            // SACAR
            else if (option == 3) {
                System.out.print("Valor: ");
                double value = scanner.nextDouble();

                if (account.withdraw(value)) {
                    printSuccess("Saque realizado!");
                } else {
                    printError("Saldo insuficiente!");
                }
            }

            // OPÇÃO INVÁLIDA
            else if (option != 0) {
                printError("Opção inválida!");
            }

        } while (option != 0);

        printSection("Fim do Sistema");
        printSuccess("Obrigado por usar o Mini Bank!");

        scanner.close();
    }
}