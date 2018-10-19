package gift.sweets;

public class Sweets {

    private String name;
    private double weight;
    private double price;
    private int amount;


    public Sweets (String name, double weight, double price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
