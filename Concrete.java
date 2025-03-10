import java.util.*;


public class Concrete {
//Barrington Fields
//3/10/2025
//Concrete

public static void main(String[]args){
        double Amount;
        double D;
        double H;
        double Needed;
        double V;
        double Cost;
        D = 3;
        H = 5;
        V = 3.14 * (D/2 * D/2) * H;
        Scanner Input  = new Scanner(System.in);
    System.out.println("Hello Builder, how many poles do you need?");
    Amount = Input.nextDouble();
    Needed = Amount * V;
    Cost = (Needed/27) * 12.98;
    System.out.println("The amount of concrete that is needed will take up  " + Needed + " cubic yards, the cost of all of it will be $" + Cost );
}
}
