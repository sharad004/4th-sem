public class Example {
    public static void main(String[] args) {
        byte b;
        int i=355;
        double d=423.150;
        b=(byte)i;
        System.out.println("i= "+i+" b=" +b);
        b=(byte)d;
        System.out.println("conversion of double to byte:d= "+d+" b="+b);
    }
    
}
