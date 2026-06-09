package Variables;

import Oop.Util.ConsoleColors;

/*
 * Demonstra conversão de tipos (type casting)
 */
public class TypeCasting {

    public static void main(String[] args) {

        System.out.println(ConsoleColors.PURPLE + "\n===== TYPE CASTING =====" + ConsoleColors.RESET);

        // ==========================
        // IMPLÍCITO (automático)
        // ==========================
        int number = 10;
        double converted = number;

        System.out.println(ConsoleColors.GREEN + "Implicit: int -> double = " + converted + ConsoleColors.RESET);

        // ==========================
        // EXPLÍCITO (manual)
        // ==========================
        double value = 9.8;
        int truncated = (int) value;

        System.out.println(ConsoleColors.YELLOW + "Explicit: double -> int = " + truncated + ConsoleColors.RESET);

        System.out.println(ConsoleColors.GREEN + "\n✔ Type casting demo finished!" + ConsoleColors.RESET);
    }
}