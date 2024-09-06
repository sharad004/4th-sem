public class calculateinterest {
    static int p, t, r;
    
    public static void main(String args[]){
        p=999;
        t=10;
        r=7;
        calculate();

    }
    static void calculate(){
       float interest;
        interest=(p*t*r)/100;
        System.out.print("interest="+ interest);

    }

}
