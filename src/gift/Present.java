package gift;

public class Present {

    private double totalPrice;
    private double totalWeight;

    public Present() {
        this.totalPrice = 0;
        this.totalWeight = 0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public int setTotalPrice(int amount, double price) {
        this.totalPrice += amount * price;
        return amount;
    }

    public void setTotalWeight(int amount, double weight) {
        this.totalWeight += amount * weight;
    }
}