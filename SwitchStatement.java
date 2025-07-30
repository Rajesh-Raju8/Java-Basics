import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number"); 
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the operator");
        int operator=sc.next().charAt(0);

        switch(operator)
        {
            case '+' :System.out.println(num1+num2);
                break;
            case '-' :System.out.println(num1-num2);
                break;
            case '*':System.out.println(num1*num2);
                break;
            case '/' :System.out.println(num1/num2);
                break;
            case '%' :System.out.println(num1%num2);
                break;
            default:System.out.println("Invalid operator");
                break;
        }
        


        System.out.println("Enter the day");
        int day=sc.nextInt();

        switch(day)
        {
            case 1 :System.out.println("Sunday");
                break;
            case 2 :System.out.println("Monday");
                break;
            case 3 :System.out.println("Tuesday");
                break;
            case 4 :System.out.println("Wednesday");
                break;
            case 5 :System.out.println("Thursday");
                break;
            case 6 :System.out.println("Friday");
                break;
            case 7 :System.out.println("Saturday");
                break;
            default:System.out.println("Invalid day");
                break;
        }
        System.out.println("enter the month");
		int month =sc.nextInt();
		switch(month)
		{
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :  System.out.println("number of days is 31");
		break;
		case 2 : System.out.println("number of days is 28");
		break;
		default : System.out.println("number of days is 30");
		break;
		}
		sc.close();
    


    }
}
