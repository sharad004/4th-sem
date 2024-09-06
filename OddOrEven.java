import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        System.out.println("Enter the number to check");
        int num=read.nextInt();
        

        if(num==0)
        System.out.println("The number i");
        else if(num%2==0)
        System.out.println("The number is even");

        else
        System.out.println("The number is odd");
    
    }
    
}
