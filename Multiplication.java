import java.util.Scanner;

public class Multiplication {
   static void mul(int a){
    for(int i=1; i<=10; i++){
        System.out.println(a+"*"+i+"="+(a*i));
    }
   }
   public static void main(String[] args) {
    int a;
    Scanner umanga=new Scanner(System.in);
    System.out.println("Enter a number:");
    a= umanga.nextInt();
    mul(a);
    umanga.close();
   }
}
