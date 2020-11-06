import java.util.*;

public class PokeTester {
    public static void main(String[] args) {
        PokeBowl poke1 = new SpicySalmonBowl();
        PokeBowl order1 = new ExtraTopping(poke1, "avocado");

        PokeBowl poke2 = new SpicySalmonBowl();
        PokeBowl order2InProcess = new ExtraTopping(poke2, "pineapple");
        PokeBowl order2 = new ExtraTopping(order2InProcess, "seaweed salad");

        // Printing price and description for the first order
        System.out.println("Ordering " + order1.getDescription());
        System.out.println("Total price = " + order1.getPrice());

        // Printing price and description for the second order
        System.out.println("Ordering " + order2.getDescription());
        System.out.println("Total price = " + order2.getPrice());
    }
}
