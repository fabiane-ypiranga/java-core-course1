package Variables;

import Oop.Util.ConsoleColors;

/*
 * Demonstração de variáveis em Java
 * (texto, número inteiro e decimal)
 */
public class HelloVariables {

    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE + "\n===== VARIABLES DEMO =====" + ConsoleColors.RESET);

        // ==========================
        // VARIÁVEIS BÁSICAS
        // ==========================
        String name = "Fabiane";
        int age = 25;
        double height = 1.65;

        // ==========================
        // SAÍDA FORMATADA
        // ==========================
        System.out.println(ConsoleColors.CYAN + "Name   : " + name + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "Age    : " + age + " years" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "Height : " + height + " m" + ConsoleColors.RESET);

        System.out.println(ConsoleColors.GREEN + "\n✔ Variables loaded successfully!" + ConsoleColors.RESET);
    }
}