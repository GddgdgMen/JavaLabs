import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {

    public static void main(String[] args) {

        SportsEquip[] equipment = new SportsEquip[5];
        equipment[0] = new SportsEquip("Yonex 07 EZONE 98",8698.90, 3, 4.7, false);
        equipment[1] = new SportsEquip("Yonex 07 VCORE 98 ", 8999.04, 3, 4.5, false);
        equipment[2] = new SportsEquip("Babolat Pure Strike VS", 8898.85, 5, 4.8, true);
        equipment[3] = new SportsEquip("Wilson Blade 100L", 8568.18, 6, 4.3, true);
        equipment[4] = new SportsEquip("Head Graphene 360+ Gravity MP", 8198.81, 2, 4.3, false);
        Arrays.sort(equipment, Comparator.comparing(SportsEquip::getRatings).reversed());
        System.out.printf("Ratings from highest: %s",  Arrays.toString(equipment) + "\n");
        Arrays.sort(equipment, Comparator.comparing(SportsEquip::getPrice));
        System.out.printf("Price from lowest: %s", Arrays.toString(equipment) + "\n");

    }
}