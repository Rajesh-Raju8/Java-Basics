import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt(); 
        if(number<0)
        {
            System.err.println("Invalid Numn=ber");
        }
        else
        {
            for (int i = 1; i <=number; i++) {
                fact=fact*i;
            }
            System.err.println("The Factrial of given number is : "+fact);
        }
    
}
}