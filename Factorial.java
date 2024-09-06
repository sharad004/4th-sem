import java.util.Scanner;

public class Factorial {
   
    static int factorial(int a){
        if(a==0 || a==1)
            return 1;
    
        else{
            return(a*factorial(a-1));
        }
    }
    public static void main(String[] args) {
        int a, fact;
        Scanner umanga=new Scanner(System.in);
        System.out.println("Enter a number");
        a=umanga.nextInt();
        fact=factorial(a);
        System.out.println("The factorial is:"+fact);
        umanga.close();
    }

    
}
