import java.util.ArrayList;

public class ALMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int[] ia ={1,5,9,7,4,8,2,3,60,9};
        
        arrList = createArrayList(ia);
        System.out.println(minIntAL(arrList));
    }

    private static int minIntAL(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        
        for (int y = 0;y<=arrList.size();y++){
            if(min<arrList.get(y)){
                min=arrList.get(y);
            }
        }
        
        return 0;
    }

    private static int maxIntAL(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arrList.size();i++){
            if(max<arrList.get(i)){
                max=arrList.get(i);
            }
        }
        return 0;
    }

    private static int aveIntAL(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();


        return 0;
    }

    private static int sumIntAL(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int total = 0;
        for(int i=0;i<arrList.size();i++){
            total+=arrList.get(i);
        }
        return 0;
    }
    
    private static double stdDev(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();

        int mean = aveIntAL(arrList);
        int totalDev =0;
        for(int i=0;i<arrList.size();i++){
            totalDev = (int)Math.pow(arrList.get(i)-mean, 2);

        }

        return (int)Math.sqrt(totalDev/arrList.size());
    }

    //count the number of occurences of the item in the ArrayList 
    private static int count(ArrayList<Integer> arrList, int item){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        return 0;
    }

    /*private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        return 0;
    }*/

    private static int mode(ArrayList<Integer> arrList){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        return 0;
    }

    //do NOT use array,asList or whatever that cheat code is 
    /*private static ArrayList<Integer> createArrayList(int[] iarr){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        return 0;
    }*/
    
    
}
