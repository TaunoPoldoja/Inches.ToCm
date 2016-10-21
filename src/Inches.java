import java.util.Scanner;

public class Inches {
    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");
        inch = in.nextInt();
        final double CM_PER_INC = 2.54;
        cm = inch * CM_PER_INC;
        // cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

    }
}
