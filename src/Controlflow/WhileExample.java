package Controlflow;

import Oop.Util.ConsoleColors;

/*
 * Loop WHILE - repetição com condição
 */
public class WhileExample {

    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE + "\n===== WHILE LOOP =====" + ConsoleColors.RESET);

        int i = 1;

        while (i <= 29) {
            System.out.println(ConsoleColors.CYAN + "Count: " + i + ConsoleColors.RESET);
            i++;
        }

        System.out.println(ConsoleColors.GREEN + "✔ While loop finished!" + ConsoleColors.RESET);
    }
}