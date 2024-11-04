import java.util.Scanner;

public class GANui {
    public static void main(String[] args) {
        /* 
         * ask the user for a numner btwm 0-10
         * if the value is hight than 7 say so 
         * if the value is lower than 7 say so
         * if the value is 7 say horray you got it
         * 
         * ONce you compete this version
         *  crete a new file caleld gan2.java
         *  make it so you generate (random module) the answer instead of 7
         */

         //model section - "global" vataiables and objects creation
         int secret = 7; 
         Scanner ui = new Scanner(System.in);

         //Controller - this is where use input 
         System.out.println("give a number btwn 0-10");
         String ans = ui.nextLine();
        

         //It would be nice to learn our user input ..... BEcasue we have suspicious users
         // #1 thing to check for is formating -ie, is it a whole number
         if (ans.contains(".")){
            System.out.println("only whole numbers please");
         }else if (ans.isEmpty() || ans.isBlank()){
            System.out.println("typle something please");
             // the regex loop throught each digit to check if not 0-9
         }else if (ans.matches("[^0-9]+")){     //import to learn regex // the regex loop throught each digit to check if not 0-9
            System.out.println("no letters");
         }else{
                //calculation
             int cleanAns = Integer.parseInt(ans);     //converts / parses a string back to an integer
                System.out.println("Your number is less than 7");
             if (cleanAns>7){
                System.out.println("Your number is more than 7");
             }else if (cleanAns==7){
                System.out.println("your number is 7");
             }else{
                System.out.println("your number is not between 1-10");
             }
             }

         //View section where you output to the terminal

         ui.close();
    }
    
}
