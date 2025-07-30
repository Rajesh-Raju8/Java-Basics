import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt(); 
        int rev=0;
        while(number!=0){
            rev=rev*10+number%10;
            number/=10;
        }
        System.err.println("The Reverse of a given Number is : "+rev);
    }
}
