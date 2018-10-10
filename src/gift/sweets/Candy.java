package gift.sweets;


import gift.Special;

@Special(special = "Peach")
public class Candy extends Sweets {
    private String flavor;

    public Candy() {
        super("Candy", 5, 1);
        this.flavor = flavor;
    }
}