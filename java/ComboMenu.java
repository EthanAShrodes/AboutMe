import java.util.Scanner;


public class ComboMenu {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        Double TotalOverall = 0.0;
        for (int i =0; true; i++){
            System.out.println("Would you like a sandwich?\nOur options are: \n\ttofu: $5.75\n\tchicken: $5.25\n\tbeef: $6.25");
            System.out.println("please the type the of sandwich you would like (i.e. tofu)");
            String wich = ui.nextLine();
            System.out.println(wichedOrder(wich));
            String wasttime1 = ui.nextLine();
            System.out.print("\033[H\033[2J");

            System.out.println("Would you also like some Fies?\nSizes are:");
            System.out.println("\tsmall: $1");
            System.out.println("\tmedium: $1.75");
            System.out.println("\tlarge $2.25");
            System.out.println("please type the type of fries you would like (i.e. small)");
            String fiys = ui.nextLine();        
            System.out.println(friesOrder(fiys));
            String wasttime2 = ui.nextLine();
            System.out.print("\033[H\033[2J");
            
            System.out.println("Would you also like a Drink?\nSizes are:");
            System.out.println("\tsmall: $1");
            System.out.println("\tmedium: $1.50");
            System.out.println("\tlarge $2.00");
            System.out.println("please type the type the of drink you would like (i.e. small)");
            String drank = ui.nextLine();
            System.out.println(drinkOrder(drank));
            String wasttime3 = ui.nextLine();
            System.out.print("\033[H\033[2J");

            System.out.println("Would you like some ketchup packets(enter the amount)\n0.25$ per pack");
            Double pack = ui.nextDouble();
            System.out.println(packOrder(pack));
            String wasttime4 = ui.nextLine();
            System.out.print("\033[H\033[2J");

            System.out.println("Checking for discount");
            checkForDis(wich, fiys, drank);
            String wasttime5 = ui.nextLine();
            System.out.print("\033[H\033[2J");

            System.out.printf(totalPrice(wich, fiys, drank, pack));

            System.out.print("Would you like to order again?(yes/no)");
            String res = ui.nextLine();
            if (res.equals("yes") || res.equals("Yes")){
                break;
            }
            
        }


        ui.close();
    }
    private static String wichedOrder(String e){
        if (e.equals("tofu") || e.equals("Tofu")){
            return "you ordered a Tofu Sandwich for $5.75";
        } if (e.equals("chicken") || e.equals("Chicken")){
            return "you ordered a Chicken Sandwich for $5.25";
        } if (e.equals("beef") || e.equals("Beef")){
            return "you ordered a Beef Sandwich for $6.25";
        } else {
            return "no sandwich ordered";
        }
    }

    private static String friesOrder(String e){
         if (e.equals("small") || e.equals("Small")){
            return "you ordered small fries for $1";
        } if (e.equals("medium") || e.equals("Medium")){
           return "you ordered medium fries for $1.75";
        } if (e.equals("large") || e.equals("Large")){
            return "you ordered large fries for $2.25";
        } else {
            return "no fires ordered";}
        }

    private static String drinkOrder(String e){
        if (e.equals("small") || e.equals("Small")){
            return "you ordered a small drink for $1";
        } if (e.equals("medium") || e.equals("Medium")){
            return "you ordered a medium drink for $1.50";
        } if (e.equals("large") || e.equals("Large")){
            Scanner iu = new Scanner(System.in);
            System.out.println("Would you like to upgrade to a child size for $0.38 more(yes/no)");
            String child = iu.nextLine();
            
            if (child.equals("yes") || child.equals("Yes")){
                return "you ordered a child drink for 2.38";
            }else {return "you ordered a large for $2.00";}
        } else {
            return "no drink ordered";}
    }
    
    private static Double packOrder(Double e){
        Double dollar = e * 0.25;
        return dollar;

    }

    private static String checkForDis(String sand, String fires, String drink){
        if (sand.equals("no sandwich ordered")|| fires.equals("no fires ordered") || drink.equals("no drink ordered") ){
            return "you qualify for a $1 discount";
        }else {return "You don't qualify";}
    }

    private static String totalPrice(String sand, String fires, String drink, Double pack ){
        //found method to have if statment have make permant cchanges to variables and not make it local
        //https://stackoverflow.com/questions/58838701/using-a-variable-that-is-changed-within-an-if-statement
        Double sandWhich = 0.0;
        if (sand.equals("tofu") || sand.equals("Tofu")){
            sandWhich = 5.75;
        } else if (sand.equals("chicken") || sand.equals("Chicken")){
            sandWhich = 5.25;
        } else if (sand.equals("beef") || sand.equals("Beef")){
            sandWhich = 6.25;
        } else {
            sandWhich = 0.0;
        }

        Double fries = 0.0;
        if (fires.equals("small") || fires.equals("Small")) {
            fries = 1.00;
        } else if (fires.equals("medium") || fires.equals("Medium")) {
            fries = 1.75;
        } else if (fires.equals("large") || fires.equals("Large")) {
            fries = 2.25;
        } else {
            fries = 0.0;
        }

        Double drank = 0.0;
        if (drink.equals("small") || drink.equals("Small")) {
            drank = 1.00;
        } else if (drink.equals("medium") || drink.equals("Medium")) {
            drank = 1.50;
        } else if (drink.equals("large") || drink.equals("Large")) {
            drank = 2.00;
        } else {
            drank = 0.0;
        }
        
        Double dis = 0.0;
        String discount = checkForDis(sand, fires, drink);
        if (discount.equals("you qualify for a $1 discount")) {
            dis = 1.0;
        }
            

        Double packet = pack * 0.25;

        Double subtotal = ( sandWhich + fries + drank + packet - dis);

        Double salesTax = subtotal * 0.07;

        Double total = subtotal + salesTax;

        
        // return "Sandwhich: $%.2f"+sandWhich+
        // "\nFries: $%.2f"+fries+
        // "\nDrink: $%.2f"+drank+
        // "\nPackets: $%.2f"+packet+
        // "\nDiscount: $%.2f"+dis+
        return String.format("Sandwhich: $%.2f\nFries: $%.2f\nDrink: $%.2f\nPackets: $%.2f\nDiscount: $%.2f\n\tSubtotal: $%.2f\n\tSales: $%.2f\n\tTotal: $%.2f\n%s\n",sandWhich,fries,drank,packet,dis, subtotal, salesTax, total, dis);
        
        }


}
        

        