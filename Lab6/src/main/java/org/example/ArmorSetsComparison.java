package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArmorSetsComparison {

    public static List<Armor> sortArmor(Armor[] armors, double budgetLimit, double minPrice){
        List<Armor> sortedArmor = new ArrayList<>();
        Arrays.sort(armors, Comparator.comparingDouble(Armor::getWeight));
        for(Armor armor: armors){
            if(armor.price < budgetLimit && armor.price > minPrice){
                sortedArmor.add(armor);
            }
        }
        if (sortedArmor.isEmpty()){
            System.out.println("None of the armors fit your demands!");
        }
        return sortedArmor;
    }
}
