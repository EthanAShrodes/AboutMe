//import for libraries and module


public class Pokemon {
    //global variables for the class
    //private -> because other files do not need to access these variable
    private String name,ht,wt,attack1Name,attack2Name,id,type,picture;
    private int hp,attack1damage,attack2damage;


    //Constructors - what is needed to have an object of this class
    //no-arg Constructor 
    public Pokemon(){
        this.id="";
        this.type="";
        this.hp=0;
        this.name="";
        this.ht="";
        this.wt="";
        this.attack1Name="";
        this.attack1damage=0;
        this.attack2Name="";
        this.attack2damage=0;
        this.picture="";

    }

    public Pokemon(String id, String type, int hp, String name, String ht, String wt, String a1n, int a1d, String a2n, int a2d, String pic){
        //this.fieldVariableName = localVariableNameFromConstructor;
        this.id=id;
        this.type=type;
        this.hp=hp;
        this.name=name;
        this.ht=ht;
        this.wt=wt;
        this.attack1Name=a1n;
        this.attack1damage=a1d;
        this.attack2Name=a2n;
        this.attack2damage=a2d;
        this.picture=pic;
    }

    //getters and setters aka accessors and mutators
    public String getName(){
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String newId) {
        this.id = newId;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String newType) {
        this.type = newType;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int newHP) {
        this.hp = newHP;
    }
    public String getHT(){
        return this.ht;
    }
    public void setHt(String newHT) {
        this.ht = newHT;
    }
    public String getWT(){
        return this.wt;
    }
    public void setWt(String newWt) {
        this.wt = newWt;
    }
    public String getA1N(){
        return this.attack1Name;
    }
    public void setA1N(String newA1N) {
        this.attack1Name = newA1N;
    }
    public int getA1D(){
        return this.attack1damage;
    }
    public void setA1D(int newA1D) {
        this.attack1damage = newA1D;
    }
    public String getA2N(){
        return this.attack2Name;
    }
    public void setA2N(String newA2N) {
        this.attack2Name = newA2N;
    }
    public int getA2D(){
        return this.attack2damage;
    }
    public void setA2D(int newA2D) {
        this.attack2damage = newA2D;
    }
    public String getPic(){
        return this.picture;
    }
    public void setPic(String newPic) {
        this.picture = newPic;
    }

    

    //methods for the object

    //toString method - anytime you print the object, this is what will appear 
    // toString method to display Pokémon information
    @Override   //decorator - over writing the toString f(x) from the super class 
    public String toString() {
        return "Index: " + id +
               "\nName: " + name +
               "\nType: " + type +
               "\nHP: " + hp +
               "\nHeight: " + ht + " m" +
               "\nWeight: " + wt + " kg" +
               "\nAttack 1: " + attack1Name + " (Power: " + attack1damage + ")" +
               "\nAttack 2: " + attack2Name + " (Power: " + attack2damage + ")";
    }
    
}
