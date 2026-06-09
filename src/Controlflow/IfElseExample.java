package Controlflow;

import Oop.Util.ConsoleColors;

/*
 * Estrutura de decisão: if / else
 */
public class IfElseExample {

    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE + "\n===== IF / ELSE =====" + ConsoleColors.RESET);

        int age = 18;

        System.out.println(ConsoleColors.CYAN + "Age: " + age + ConsoleColors.RESET);

        if (age >= 18) {
            System.out.println(ConsoleColors.GREEN + "✔ Adulto (allowed)" + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.RED + "✖ Menor (not allowed)" + ConsoleColors.RESET);
        }
    }
}