import java.util.Scanner;


public class JavaPrombleSetOne {
    public static void main(String[] args) {


        Scanner ui = new Scanner(System.in);

        /* ###################################    PROBLEM 1     ################################################
        System.out.print("Enter miles: ");
        double miles = ui.nextDouble();

        double kilo = miles * 1.6;

        System.out.println(+miles+" miles is "+kilo+" kiometers");
*/       
        /* ###################################    PROBLEM 2     ################################################
        System.out.print("Enter the amount of water in kilograms: ");
        double water = ui.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double init = ui.nextDouble();
        System.out.print("Enter the final temperature: ");
        double fina = ui.nextDouble();
        double par = init * fina;
        double res = water * par * 4184;
        System.out.print("The energy needed is "+res+"\n");
*/
        /* ###################################    PROBLEM 3     ################################################
        System.out.print("Enter investment amount: ");
        double amount = ui.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = ui.nextDouble();
        System.out.print("Enter number of years: ");
        double years = ui.nextDouble();
        double res = amount * Math.pow( ( ( ( rate / 100 ) / 12 ) + 1 ), years * 12);
        System.out.printf("Future value is %.2f%n",res);
        System.out.println("\n");
*/            
        /* ###################################    PROBLEM 4     ################################################        
        System.out.print("Enter the driving distance: ");
        double distance = ui.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = ui.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = ui.nextDouble();
        double res = ( distance / mpg) * ppg;
        System.out.printf("The cost of driving is $%.2f%n", res);
        \t tab
        \n newline
*/
        /* ###################################    PROBLEM 5     ################################################
        //reisting the urge to do it in one line
        System.out.print("    J\n");
        System.out.print("J  aaa\t  v\t     vaaa\n");
        System.out.print("J  J aaa\tv v\ta a\n");
        System.out.print("J   aaa\t\t v\taaaa\n");
*/
 /// ###################################    PROBLEM 6     ################################################
        System.out.print("Enter your first name: ");
        String first = ui.nextLine();
        System.out.print("Enter your last name: ");
        String last = ui.nextLine();
        System.out.print("Enter your street address: ");
        String street = ui.nextLine();
        System.out.print("Enter your city: ");
        String city = ui.nextLine();
        System.out.print("Enter your state: ");
        String state = ui.nextLine();
        System.out.print("Enter your ZIP: ");
        String zip = ui.nextLine();
        System.out.print("Enter enter your amount owed: ");
        String owed = ui.nextLine();
        System.out.print("Enter your payment amount: ");
        String amount = ui.nextLine();
        System.out.print("Enter your payment date: ");
        String date = ui.nextLine();

        System.out.print("\t\t\t\tXYZ Community Hospital\n");
        System.out.print("================================================================================\n");
        System.out.print("Name\t\t\tAddress\t\t\tPayment Information\n");
        System.out.print("last\nfirst\taddressLine\tCity,state\tzip\tamount owed\tPaymentAmt\tPayment Date\n");
        System.out.print("================================================================================\n");
        System.out.println(" "+first+"\t"+last+"\t"+street+"\t"+city+","+state+"\t"+zip+"\t"+owed+"\t"+amount+"\t"+date+" ");
        ui.close();
    }
}