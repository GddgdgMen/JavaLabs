package org.example;

public class Main {
    public static void main(String[] args) {

        Armor[] armors = {
                new LeatherArmor("Leather cap", 125.3, 2.3),
                new LeatherArmor("Leather tunic", 214.8, 5.7),
                new LeatherArmor("Leather leggings", 187.6, 4.2),
                new LightMetalArmor("Chainmail helm", 170.3, 3.7),
                new LightMetalArmor("Chainmail vest", 256.8, 7.2),
                new LightMetalArmor("Chainmail leggings", 212.4, 5.4),
                new HeavyMetalArmor("Steel helmet", 199.9, 4.6),
                new HeavyMetalArmor("Steel breastplate", 305.9, 10.6),
                new HeavyMetalArmor("Steel leggings", 245.2, 7.1)};


                System.out.println(ArmorSetsComparison.sortArmor(armors, 275.3, 160.5));
    }
}
