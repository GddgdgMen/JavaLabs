package org.example;

public abstract class Armor {
    public String armorPiece;
    public Double price;
    public Double weight;

    public Armor(String armorPiece, Double price, Double weight){
        this.armorPiece = armorPiece;
        this.price = price;
        this.weight = weight;
    }

    public String getMaterial() {
        return armorPiece;
    }

    public Double getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    public String toString(){
        return String.format("Armor piece: %s,\n price: %f,\n weight is %f;\n", getMaterial(), getPrice(), getWeight());
    }

}
