import java.util.Scanner;

public class CountOfDighits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt(); 
        int count=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            count++;
            number=number/10;
        }
        System.err.println("The count of number of Digits in a number is : "+count);
    }
}
