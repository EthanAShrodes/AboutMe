import java.util.Scanner;

public class JavaPrombleSetTwo {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        //###################################    PROBLEM 1     ################
        /* 
        System.out.println("Enter the coordinates of three points separeated by spaces");
        String points = ui.nextLine();
        String[] coords = points.split(" "); // method found here https://stackoverflow.com/questions/46505048/taking-a-users-input-string-and-splitting-it-in-java

        //method found here https://www.digitalocean.com/community/tutorials/java-convert-string-to-double
        double x1 = Double.parseDouble(coords[0]);
        double y1 = Double.parseDouble(coords[1]);
        double x2 = Double.parseDouble(coords[2]);
        double y2 = Double.parseDouble(coords[3]);
        double x3 = Double.parseDouble(coords[4]);
        double y3 = Double.parseDouble(coords[5]);
        double ans = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2 ;
        double ansAbs = Math.abs(ans);
        System.out.printf("The area of the triangle is %.1f\n", ansAbs);
        */
 /* 
        /*###################################    PROBLEM 2     ################

        System.out.println("give points (with spaces)");
        String points = ui.nextLine();
        String[] ab = points.split(" ");

        double x11 = Double.parseDouble(ab[0]);
        double y11 = Double.parseDouble(ab[1]);
        double x21 = Double.parseDouble(ab[2]);
        double y21 = Double.parseDouble(ab[3]);

        double x12 = Double.parseDouble(ab[4]);
        double y12 = Double.parseDouble(ab[5]);
        double x22 = Double.parseDouble(ab[6]);
        double y22 = Double.parseDouble(ab[7]);

        double x13 = Double.parseDouble(ab[8]);
        double y13 = Double.parseDouble(ab[9]);
        double x23 = Double.parseDouble(ab[10]);
        double y23 = Double.parseDouble(ab[11]);

        double x14 = Double.parseDouble(ab[12]);
        double y14 = Double.parseDouble(ab[13]);
        double x24 = Double.parseDouble(ab[14]);
        double y24 = Double.parseDouble(ab[15]);

        double x15 = Double.parseDouble(ab[16]);
        double y15 = Double.parseDouble(ab[17]);
        double x25 = Double.parseDouble(ab[18]);
        double y25 = Double.parseDouble(ab[19]);

        double m1 = (x11 + x21) / 2;
        double m2 = (y11 + y21) / 2;
        
        double m3 = (x12 + x22) / 2;
        double m4 = (y12 + y22) / 2;

        double m5 = (x13 + x23) / 2;
        double m6 = (y13 + y23) / 2;

        double m7 = (x14 + x24) / 2;
        double m8 = (y14 + y24) / 2;

        double m9 = (x15 + x25) / 2;
        double m10 = (y15 + y25) / 2;

        //      0 0 2 1 1 4 4 2 2 7 6 3 3 9 10 5 4 11 12 7
        System.out.print("\t\sa\t\sb\tMiddle Point\n");
        System.out.printf("\t(%s, %s)\t(%s, %s)\t(%.1f, %.1f)\n", ab[0], ab[1], ab[2], ab[3], m1, m2);
        System.out.printf("\t(%s, %s)\t(%s, %s)\t(%.1f, %.1f)\n", ab[4], ab[5], ab[6], ab[7], m3, m4);
        System.out.printf("\t(%s, %s)\t(%s, %s)\t(%.1f, %.1f)\n", ab[8], ab[9], ab[10], ab[11], m5, m6);
        System.out.printf("\t(%s, %s)\t(%s, %s)\t(%.1f, %.1f)\n", ab[12], ab[13], ab[14], ab[15], m7, m8);
        System.out.printf("\t(%s, %s)\t(%s, %s)\t(%.1f, %.1f)\n", ab[16], ab[17], ab[18], ab[19], m9, m10);
`       */
/* 
        //###################################    PROBLEM 3     ################
*/
        /* 
        System.out.println("Enter the number of minutes");
        int mins = ui.nextInt();
        int years = mins / 60 / 24 /365;
        int  days = (mins / 60 / 24) - (years * 365);

        System.out.printf("%d years and %d days\n", (int) years, (int) days);

        //      1000000000*/
 
        //###################################    PROBLEM 4     ################

        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double length = ui.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
        double volume = area * length;

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volume: %.2f\n", volume);





        ui.close();
    }


    
}
