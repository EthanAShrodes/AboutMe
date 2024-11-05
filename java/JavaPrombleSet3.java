import java.util.Scanner;
import java.util.Random;

public class JavaPrombleSet3 {
    //############################# Promble One ####################################
    /* 
    public static void main(String[] args) {
        
        int today = getDay();

     
        Scanner ui = new Scanner(System.in);
        System.out.print("\nEnter the number of days elapsed since today: ");
        int futureDay = ui.nextInt();
        ui.close();
        System.out.println("Today is "+dayToday(today)+" and the future day is " +dayInFuture(today,futureDay));

        
    }
    private static int getDay(){
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = ui.nextInt();
        //breaks code if i add this line
        //ui.close();
        return today;
    }
    private static String dayToday(int e) {
        if (e == 0) {
            return "Sunday";
        } else if (e == 1) {
            return "Monday";
        } else if (e == 2) {
            return "Tuesday";
        } else if (e == 3) {
            return "Wednesday";
        } else if (e == 4) {
            return "Thursday";
        } else if (e == 5) {
            return "Friday";
        } else if (e == 6) {
            return "Saturday";
        } else {
            return "not a number btw 0-6";
        }
    }
    private static String dayInFuture(int e,int futureDay) {
        
        int futDay = (e + futureDay) % 7;
        
        return dayToday(futDay);
    }
    */






    //############################# Promble Two ####################################
    /* 
public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    Integer int1 = ui.nextInt();
    System.out.print("Enter an Integer: ");
    Integer int2 = ui.nextInt();
    System.out.print("Enter an Integer: ");
    Integer int3 = ui.nextInt();

    System.out.println(decreasingOrder(int1,int2,int3));
}


private static String decreasingOrder(Integer int1,Integer int2,Integer int3) {
    if (int1 <= int2 && int2 <= int3) {
        return  int1 + " " + int2 + " " + int3;
    } else if (int1 <= int3 && int3 <= int2) {
        return int1 + " " + int3 + " " + int2;
    } else if (int2 <= int1 && int1 <= int3) {
        return int2 + " " + int1 + " " + int3;
    } else if (int2 <= int3 && int3 <= int1) {
        return int2 + " " + int3 + " " + int1;
    } else if (int3 <= int1 && int1 <= int2) {
        return int3 + " " + int1 + " " + int2;
    } else {
        return int3 + " " + int2 + " " + int1;
    }
}*/


    //############################# Promble Three ####################################
    /*// found from here https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/ number 3
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String theInt = ui.nextLine();
        System.out.println(checkPal(theInt));

        ui.close();
    }

    private static String checkPal(String theInt) {
        return isPal(0, theInt.length() - 1, theInt);
    }

    private static String isPal(int i, int j, String str) {
        if (i >= j) {
            return str + " is a palindrome.";
        }
        if (str.charAt(i) != str.charAt(j)) {
            return str + " is not a palindrome.";
        }
        return isPal(i + 1, j - 1, str);  
    }*/

    //############################# Promble four ####################################
    /*public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2), lizard (3) spock (4): ");
        //added lizard and spock
        int play = ui.nextInt();

        Random randy = new Random();
        int j = randy.nextInt(0,5);
        
        playGame(play, j);
        ui.close();
    }
    
    private static void playGame(int i, int j){
 
        if (i == 0) { 
            if (j == 2) {
                System.out.println("The computer is paper! You are scissor! you won!");
            } if (j == 1) {
                System.out.println("The computer is rock! You are scissor! you lost!");
            } if (j == 0) {
                System.out.println("The computer is scissor! You are scissor! tie!");
            } if (j == 3) {
                System.out.println("The computer is lizard! You are scissor! you won!");
            } if (j == 4) {
                System.out.println("The computer is spock! You are scissor! you lost!");
            }
        }
    
        if (i == 1) { 
            if (j == 0) {
                System.out.println("The computer is scissor! You are rock! you won!");
            } if (j == 2) {
                System.out.println("The computer is paper! You are rock! you lost!");
            } if (j == 1) {
                System.out.println("The computer is rock! You are rock! tie!");
            } if (j == 3) {
                System.out.println("The computer is lizard! You are rock! you won!");
            } if (j == 4) {
                System.out.println("The computer is spock! You are rock! you lost!");
            }
        }
    
        if (i == 2) { 
            if (j == 1) {
                System.out.println("The computer is rock! You are paper! you won!");
            } if (j == 0) {
                System.out.println("The computer is scissor! You are paper! you lost!");
            } if (j == 2) {
                System.out.println("The computer is paper! You are paper! tie!");
            } if (j == 3) {
                System.out.println("The computer is lizard! You are paper! you lost!");
            } if (j == 4) {
                System.out.println("The computer is spock! You are paper! you won!");
            }
        }
    
        if (i == 3) {
            if (j == 0) {
                System.out.println("The computer is scissor! You are lizard! you lost!");
            } if (j == 1) {
                System.out.println("The computer is rock! You are lizard! you lost!");
            } if (j == 2) {
                System.out.println("The computer is paper! You are lizard! you won!");
            } if (j == 3) {
                System.out.println("The computer is lizard! You are lizard! tie!");
            } if (j == 4) {
                System.out.println("The computer is spock! You are lizard! you won!");
            }
        }
    
        if (i == 4) { 
            if (j == 0) {
                System.out.println("The computer is scissor! You are spock! you won!");
            } if (j == 1) {
                System.out.println("The computer is rock! You are spock! you won!");
            } if (j == 2) {
                System.out.println("The computer is paper! You are spock! you lost!");
            } if (j == 3) {
                System.out.println("The computer is lizard! You are spock! you lost!");
            } if (j == 4) {
                System.out.println("The computer is spock! You are spock! tie!");
            }


        return;
    }
    }*/

    //############################ Promble five #################################

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);


        Random randy = new Random();
        int j = randy.nextInt(0,52);
        playGame(j);
        ui.close();
    }
    
    private static void playGame(int i){
        
        if (i == 0) {
            System.out.println("The card you picked is Ace of Hearts");
        } else if (i == 1) {
            System.out.println("The card you picked is 2 of Hearts");
        } else if (i == 2) {
            System.out.println("The card you picked is 3 of Hearts");
        } else if (i == 3) {
            System.out.println("The card you picked is 4 of Hearts");
        } else if (i == 4) {
            System.out.println("The card you picked is 5 of Hearts");
        } else if (i == 5) {
            System.out.println("The card you picked is 6 of Hearts");
        } else if (i == 6) {
            System.out.println("The card you picked is 7 of Hearts");
        } else if (i == 7) {
            System.out.println("The card you picked is 8 of Hearts");
        } else if (i == 8) {
            System.out.println("The card you picked is 9 of Hearts");
        } else if (i == 9) {
            System.out.println("The card you picked is 10 of Hearts");
        } else if (i == 10) {
            System.out.println("The card you picked is Jack of Hearts");
        } else if (i == 11) {
            System.out.println("The card you picked is Queen of Hearts");
        } else if (i == 12) {
            System.out.println("The card you picked is King of Hearts");
        } else if (i == 13) {
            System.out.println("The card you picked is Ace of Diamonds");
        } else if (i == 14) {
            System.out.println("The card you picked is 2 of Diamonds");
        } else if (i == 15) {
            System.out.println("The card you picked is 3 of Diamonds");
        } else if (i == 16) {
            System.out.println("The card you picked is 4 of Diamonds");
        } else if (i == 17) {
            System.out.println("The card you picked is 5 of Diamonds");
        } else if (i == 18) {
            System.out.println("The card you picked is 6 of Diamonds");
        } else if (i == 19) {
            System.out.println("The card you picked is 7 of Diamonds");
        } else if (i == 20) {
            System.out.println("The card you picked is 8 of Diamonds");
        } else if (i == 21) {
            System.out.println("The card you picked is 9 of Diamonds");
        } else if (i == 22) {
            System.out.println("The card you picked is 10 of Diamonds");
        } else if (i == 23) {
            System.out.println("The card you picked is Jack of Diamonds");
        } else if (i == 24) {
            System.out.println("The card you picked is Queen of Diamonds");
        } else if (i == 25) {
            System.out.println("The card you picked is King of Diamonds");
        } else if (i == 26) {
            System.out.println("The card you picked is Ace of Clubs");
        } else if (i == 27) {
            System.out.println("The card you picked is 2 of Clubs");
        } else if (i == 28) {
            System.out.println("The card you picked is 3 of Clubs");
        } else if (i == 29) {
            System.out.println("The card you picked is 4 of Clubs");
        } else if (i == 30) {
            System.out.println("The card you picked is 5 of Clubs");
        } else if (i == 31) {
            System.out.println("The card you picked is 6 of Clubs");
        } else if (i == 32) {
            System.out.println("The card you picked is 7 of Clubs");
        } else if (i == 33) {
            System.out.println("The card you picked is 8 of Clubs");
        } else if (i == 34) {
            System.out.println("The card you picked is 9 of Clubs");
        } else if (i == 35) {
            System.out.println("The card you picked is 10 of Clubs");
        } else if (i == 36) {
            System.out.println("The card you picked is Jack of Clubs");
        } else if (i == 37) {
            System.out.println("The card you picked is Queen of Clubs");
        } else if (i == 38) {
            System.out.println("The card you picked is King of Clubs");
        } else if (i == 39) {
            System.out.println("The card you picked is Ace of Spades");
        } else if (i == 40) {
            System.out.println("The card you picked is 2 of Spades");
        } else if (i == 41) {
            System.out.println("The card you picked is 3 of Spades");
        } else if (i == 42) {
            System.out.println("The card you picked is 4 of Spades");
        } else if (i == 43) {
            System.out.println("The card you picked is 5 of Spades");
        } else if (i == 44) {
            System.out.println("The card you picked is 6 of Spades");
        } else if (i == 45) {
            System.out.println("The card you picked is 7 of Spades");
        } else if (i == 46) {
            System.out.println("The card you picked is 8 of Spades");
        } else if (i == 47) {
            System.out.println("The card you picked is 9 of Spades");
        } else if (i == 48) {
            System.out.println("The card you picked is 10 of Spades");
        } else if (i == 49) {
            System.out.println("The card you picked is Jack of Spades");
        } else if (i == 50) {
            System.out.println("The card you picked is Queen of Spades");
        } else if (i == 51) {
            System.out.println("The card you picked is King of Spades");
        }
    }

}






