import java.util.Scanner;
import java.util.Arrays;

public class ArraysRay {
    public static void main(String[] args) {
        /*
         *  Primitive - doubles, char, ints, booleans
         *  non-primitive - Strings, Lists, Arrays, ArraysList, Objects, maps, Json, HUmans
         *  
         *  Sequences- multiple pieces of data spliced together
         *      - String
         *      - Arrays
         *      - ArrayLists
         *      - Maps, Json, List, Collections, Tuples
         *      - Linked List
         */
         //array data type is immutable as in cannot change length or data after

         // Pythonic -> listy =[0,1,2,3,4,5,6,7,8,9]
         //         -> Backpack = [0,1,"two", 3, 14, "FO", goldenRings]
         int[] listy = {0,1,2,3,4,5,6,7,8,9};
         int[] numbers = {0,1,2,3,4,5};
         //int[] objectName = {} you jest said this arry is filled with int 
         double [] doubleNumbers = {0,1,2,3.14,4,5};
         String[] words = {"Hello"," ","World","4"};
         char[] alpha = {'a','b','c'};

         //Grocery List
         //figure out how many items we need first
         //predefine how may items are in the list
         String[] cart = new String[5];
         double[] cost = new double[5];
         //System.out.println(listy+"\n"+numbers+"\n"+doubleNumbers+"\n"+words+"\n"+alpha+"\n"+cart+"\n"+cost+"\n");

         /*for (int=0;i<cart.length;i++){
            cart[i] = ui.nextLine();
         }*/
         
         //null pointer expection is when you are pointing at something null

        /*  System.out.println("\n"+listy);
         for(int i=0; i<listy.length;i++){
            System.out.print(listy[i]+"\s");
         }
         System.out.println("\n"+cart);
         for(int i=0; i<cart.length;i++){
            System.out.print(cart[i]+"\s");
         }
         System.out.println("\n"+cost);
         for(int i=0; i<cost.length;i++){
            System.out.print(cost[i]+"\s");
         }*/

         //add an item
         //pythonic -> cart,append("args");
         
         cart[0] = "eggs";cart[1] = "Tortilla Chips";cart[2] = "Strawberries";cart[3] = "SPAM";cart[4] = "Mac n Cheese";
         printHorizontal(cart);

         //add cost to the cost array
         Scanner ui = new Scanner(System.in);
         for(int i = 0; i<cost.length;i++){
            cost[i] = ui.nextDouble();
         }
         

         //cart and cost are parallel arrays - item 1 in both list are related 
         printHorizontal(cart);
         //System.out.println(ArraysRay.toString(cost));

         //to remove an item from an Array
         cart[2]="Attack Helicopter";

         /*
          * 
            // Method to resize an array
        public static int[] resizeArray(int[] original, int newSize) {
            // Create a new array with the desired size
            int[] newArray = new int[newSize];
            // Copy elements from original array to new array
            // Limit the copying to the minimum of original length and new size
            for (int i = 0; i < Math.min(original.length, newSize); i++) {
                newArray[i] = original[i];
            }
            return newArray;
            }
          */

         String[] newCart = new String[cart.length+1];    // you could Memory Leak
         //now move the old cart to the new
         for(int i=0;i<cart.length;i++){
            newCart[i]=cart[i];
         }
         printVertical(newCart);


         //ArrayIndexOutofBounds error - fixed with algorithm above 
         newCart[5]="Blueberry Pomegranate Sparking water";



         //Gride of numbers -> nest Arrays
         /*
          *     [[1, 2],
                [3, 4]]
          */
          int[][] grid = {
            {1,2},
            {3,4}
          };
          //item row 2 col 2
          int r2c2 = grid[1][1];

          //if you want to print all of the items
          for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                System.out.println(grid[r][c]);
            }
            
          }
         
         
         

    }
    
    private static void printHorizontal(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printHorizontal(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printVertical(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printVertical(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\s");
        }
        System.out.println();
    }
    
}
