import java.util.*;

class RestaurantMenu{
    public static void main(String args[]) {
        int menuitem;
        String order;
        Scanner or = new Scanner(System.in);
        System.out.println("\n\t\t\tSarfi Restaurant");
        System.out.println("\t---------------Menu---------------");
        System.out.println("\n");
        System.out.println("\t\t1.Beef Biryani:");
        System.out.println("\t\t2.Chinese Rice:");
        System.out.println("\t\t3.Chicken Handi:");
        System.out.println("\t\t4.Chicken Karahi:");
        System.out.println("\t\t5.Chicken Tikka:");
        System.out.println("\t\t6.Chicken Botti:");
        System.out.println("\t\t7.Haleem:");
        System.out.println("\t\t8.Special Lassi:");
        System.out.println("\n\tSelect menu from 1 to 8 for Price of Menu:");
        menuitem = or.nextInt();
        switch (menuitem) {
            case 1: {
                ;
                order = "\tBeef Biryani";
                System.out.println("Beef Biryani = 220Rs");
            }
                break;
            case 2: {
                order = "\tChinese Rice";
                System.out.println("Chinese Rice = 170Rs");
            }
                break;
            case 3: {
                order = "\tChicken Handi";
                System.out.println("Chicken Handi = 1600rs");
            }
                break;
            case 4: {
                order = "\tChicken Karahi";
                System.out.println("\tChicken Karahi = 1300Rs");
            }
                break;
            case 5: {
                order = "\tChicken Tikka";
                System.out.println("\tChicken Tikka = 330Rs");
            }
                break;
            case 6: {
                order = "\tChicken Botti";
                System.out.println("\tChicken Botti = 220Rs");
            }
                break;
            case 7: {
                order = "\tHaleem";
                System.out.println("\tHaleem = 170Rs");
            }
                break;
            case 8: {
                order = "\tSpecial Lassi";
                System.out.println("\tSpecial Lassi= 140Rs");
            }
                break;
            default: {
                order = "\tnot in menu";
                System.out.println("\tYou selected the item which is not in our menu: ");
            }
        }
        System.out.println("\t\t Thanks for coming in \"Sarfi Restaurant\":");
    }
}
