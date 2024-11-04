public class Main {
    public static void main(String[] args) {
        String strObj = new String();
        String strObj2 = "bob";

        //DataType objName = new Constructor();
        Pokemon testPokemon = new Pokemon("32","null",200,"testmon","17in","10lbs","test1",100,"test2",50,"selfie");
        Pokemon myPokeMan = new Pokemon("32","Electric",200,"Debuggadon","17in","10lbs","Stack OverFlow",100,"Syntax Error",50,"selfie");
        Pokemon myPokeMan2 = new Pokemon("152","Electric",40,"Fobman","5cm","5grams","Lock",10,"Alarm",30,"selfie");
        System.out.println(myPokeMan);
        System.out.println("\n===================");
        System.out.println(myPokeMan2);
        System.out.println("\n===================");
        System.out.println(testPokemon);

        //reset name of Pokemon
        testPokemon.setName("Snorlax");
        System.out.println(testPokemon.getName());
        testPokemon.setA1D(40);
        System.out.println(testPokemon.getA1D());
        testPokemon.setA1N("attack");
        System.out.println(testPokemon.getA1N());

        System.out.println("\n===================");
        System.out.println(testPokemon);


    }
}
