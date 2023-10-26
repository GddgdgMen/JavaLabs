import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {

    public static void main(String[] args) {

        Sports_equip[] equipment = new Sports_equip[5];
        equipment[0] = new Sports_equip("Yonex 07 EZONE 98",8698.90, 3, 4.7, false);
        equipment[1] = new Sports_equip("Yonex 07 VCORE 98 ", 8999.04, 3, 4.5, false);
        equipment[2] = new Sports_equip("Babolat Pure Strike VS", 8898.85, 5, 4.8, true);
        equipment[3] = new Sports_equip("Wilson Blade 100L", 8568.18, 6, 4.3, true);
        equipment[4] = new Sports_equip("Head Graphene 360+ Gravity MP", 8198.81, 2, 4.3, false);
        Arrays.sort(equipment, Comparator.comparing(Sports_equip::getRatings).reversed());
        System.out.printf("Ratings from highest: %s",  Arrays.toString(equipment) + "\n");
        Arrays.sort(equipment, Comparator.comparing(Sports_equip::getPrice));
        System.out.printf("Price from lowest: %s", Arrays.toString(equipment) + "\n");

    }
}