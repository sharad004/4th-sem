import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        Scanner umanga= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= umanga.nextInt();

        if(a==0)
        System.out.println("The number is neither positive nor negative.");
        else if(a>0)
        System.out.println("The number is positive");
        else
        System.out.println("The number is negative");
    }
}
