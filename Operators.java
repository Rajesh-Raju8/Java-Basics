
public class Operators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the First Number");
        int num1=sc.nextInt();
        System.err.println("Enter the Second Number");
        int num2=sc.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2); 

        int a=10,b=20;
        boolean result=a==b;
        System.out.println(result);
    }
}