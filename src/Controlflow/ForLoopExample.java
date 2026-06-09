package Controlflow;

import Oop.Util.ConsoleColors;

/*
 * Loop FOR - contagem estruturada
 */
public class ForLoopExample {

    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE + "\n===== FOR LOOP =====" + ConsoleColors.RESET);

        for (int i = 1; i <= 5; i++) {
            System.out.println(ConsoleColors.CYAN + "Count: " + i + ConsoleColors.RESET);
        }

        System.out.println(ConsoleColors.GREEN + "✔ Loop finished!" + ConsoleColors.RESET);
    }
}