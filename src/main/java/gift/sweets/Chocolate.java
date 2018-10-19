package gift.sweets;

import gift.Special;

@Special(special = "Milk")
public class Chocolate extends Sweets{

    private String type;

    public Chocolate() {
        super("Chocolate", 60, 10);
        this.type = type;
    }
}