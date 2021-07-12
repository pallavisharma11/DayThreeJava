import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String[] args){
        FibonacciSeries obj = new FibonacciSeries();
        obj.fibonacci();
    }
    
    void fibonacci(){
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a);
        System.out.print(",");
        System.out.print(b);
        System.out.print(",");
        
        for(int i = 1;i<=10;i++){
            c = a+b;
            a = b ;
            b = c;
            System.out.print(c);
        System.out.print(",");
        }
    }
    
}
