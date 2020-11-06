import java.util.*;

public class SpicySalmonBowl implements PokeBowl {
    private String name;
    private double price;

    public SpicySalmonBowl() {
        this.name = "Spicy Salmon Poke Bowl";
        this.price = 13.00;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return name;
    }
}