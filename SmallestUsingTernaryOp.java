//greatest between 3 numbers
import java.util.Scanner;

public class SmallestUsingTernaryOp {
    public static void main(String[] args) {
        int a1, a2, a3;

        Scanner bc= new Scanner(System.in);
        System.out.println("Enter the first number");
        a1=bc.nextInt();

        System.out.println("Enter second number");
        a2=bc.nextInt();

        System.out.println("Enter third number");
        a3=bc.nextInt();

        bc.close();

        int greatest=a1 > a2 ?(a1 > a3 ? a1 : a3):(a2 > a3? a2 : a3);
        System.out.println("The greatest number is " +greatest);
    }
}