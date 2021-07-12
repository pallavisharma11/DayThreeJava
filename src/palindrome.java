import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args){
        
        
        palindrome obj = new palindrome();
        obj.pallidroneNumber();
    }
    
    void pallidroneNumber(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int temp = num1;
        int sum = 0;
        while(num1>0){
            int rem = num1%10;
            sum = sum*10 + rem;
            num1 = num1/10;
        }
        
        if(temp == sum){
            System.out.println("number is  pallindrone");
        }
        else{
            System.out.println("number is not pallindrone");
        }
        
        
    }
    
}
