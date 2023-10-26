public class Sports_equip {
    private String name;
    private double price;
    private int amount;
    private double ratings;
    private boolean shipment;

    public Sports_equip(String name, double price, int amount, double ratings, boolean shipment) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.ratings = ratings;
        this.shipment = shipment;
    }

    public double getPrice() {
        return price;
    }

    public double getRatings() {
        return ratings;
    }

    public String toString() {
        return "Name of the product: " + name + " price: " + price + " amount of units left: " + amount
                + " user ratings: " + ratings + " ships to your location:" + shipment +".\n";
    }
}
