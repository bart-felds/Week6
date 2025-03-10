
import java.util.*;
public class Py {
    //Barrington Fields
//3/10/2025
//Concrete

    public static void main(String[]args){
        double m;
        double n;
        double Side1;
        double Side2;
        double Hypot;
        double ms;
        double ns;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer value for m");
        m = scan.nextDouble();
        System.out.println("Enter an integer value for n");
        n = scan.nextDouble();
        ms = (m * m);
        ns = (n * n);
        Side1 = ms - ns;
        Side2 = (2 * m * n);
        Hypot = (m * m) + (n*n);
        System.out.println("Side one is "+Side1+", the second side is "+Side2+" and the Hypotenuse is "+Hypot);


    }
}
