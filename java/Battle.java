import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        //Build pokemon
        Pokemon pika = new Pokemon("32","Electric",200,"Debuggadon","17in","10lbs","Stack OverFlow",100,"Syntax Error",50,"selfie");
        Pokemon myPokeMan = new Pokemon("152","Electric",40,"Fobman","5cm","5grams","Lock",10,"Alarm",30,"selfie");

        //WElcome to the battle
        System.out.println("A wild battle appears! ");
        //Your pokemon: <poke name> HP: <poke hp>
        System.out.println("Your Pokemon: "+myPokeMan.getName()+"\n\tHP: "+myPokeMan.getHp());
        System.out.println("YouOpponent's Pokemon: "+pika.getName()+"\n\tHP: "+pika.getHp());
    
        //Battle loop
        while(pika.getHp()>=0 || myPokeMan.getHp()>=0){
            //introduce the attack options 
            System.out.println("\nChoose an attack for "+myPokeMan.getName());

            System.out.println("1. "+myPokeMan.getA1N()+"\t\tDamage: "+myPokeMan.getA1D());
            System.out.println("2. "+myPokeMan.getA2N()+"\tDamage: "+myPokeMan.getA2D());
            int choice = ui.nextInt();

            //Attack Switch statement - this is a conditional loop aka glorified if statement loop
            int damage = 0;
            switch(choice){
                case 1:
                    damage = myPokeMan.getA1D();
                    System.out.println(myPokeMan.getName()+" used: "+myPokeMan.getA1N());
                    break;
                case 2:
                    damage = myPokeMan.getA2D();
                    System.out.println(myPokeMan.getName()+" used: "+myPokeMan.getA2N());
                    break;
                default: 
                    System.out.println("You lose a turn");
                    continue;
            }
            
            //apply damage
            pika.setHp(pika.getHp() - damage);
            System.out.println("YouOpponent's Pokemon: "+pika.getName()+"\n\tHP: "+pika.getHp());

            //Check if pokemon has not fainted
            if(pika.getHp()<=0){
                System.out.println(pika.getName() + " Fainted!");
                break;
            }




        }
      
        



        //Opponent's turn -repeat from above

        ui.close();
    }
}
