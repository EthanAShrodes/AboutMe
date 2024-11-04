import java.util.Scanner;

public class Condish {
    public static void main(String[] args) {
        
        
        //if something
        //elif something  else if
        //else  

        int x = 5;
    
        //at any point there are 3 or more possible answers, use this structure
    
        //there are os 3 possible answer
    
        if (x==4) {
    
            System.out.println(true);
    
        } else if (x==8) {
    
            System.out.println("it equals 8");
    
        } else{
    
            System.out.println(x);
    
        }
        //only 2 possible answer
        if (4==4){
            System.out.println("they are the same");
        }else{
            System.out.println("they are not the same");
        }

        //only 1 possible answer
        if(x==4){System.out.println("do something");}

        
        /*
         * logical operator as in logic math as in inquealites
         *  > and < are the greater than and less than 
         * >= <= are the greater than or equal to and the less..
         * .queals() to check if two objects are the same - non-primitive
         * == checks if equal to - for primitive
         * = one sign is assigning
         * != this means not euqal -for primitive
         * ! this means "BANG"
         * !hunter.euqals.(morgan) - for non-primitive
         * 
         */

         boolean y = true; 
         if(y){
            System.out.println("this means y is ture");
         }else{
            System.out.println("this means y is false");
         }

         /*
          * compound Conditional Operators
            && -(and) means both to the left and right are true
            || - (or) means only one needs to be true
          */
      
          //build a conditional statment that if you put in an int, it will tell you 
            // the letter grade the student earned
        //ie    input is 75 and output is a C

        Scanner ui = new Scanner(System.in);
        System.out.print("Put in your %");
        double grade = ui.nextDouble();
        if (grade>=90){
            System.out.println("You got an A");
        }else if (grade>=80 || grade<90) {
    
            System.out.println("You got an B");
    
        } else if (grade>=70) {
    
            System.out.println("you got an D");
    
        } else if (grade>=60) {
            System.out.println("you got an D");
        } else {
            System.out.println("you got an F");
        }
        
        String masterUsername="hunterTheHunter";
        String masterPassword="123456";

        //if not masterUsername equals hunterTheGather
        if (!masterUsername.equals("hunterTheGather")){
            System.out.println("The Hunter has arrived with food");
        }else {
            System.out.println("The Hunter is still hunting");
        }

         ui.close();
}}
