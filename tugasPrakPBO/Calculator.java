package tugasPrakPBO;
import java.util.Scanner;

//control statement
//calculator using if else
public class Calculator {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.print("Enter a number: ");
		int num1 = in.nextInt();
		System.out.print("Enter another number: ");
		int num2 = in.nextInt();
		System.out.print("Enter the operand: ");
		char input = in.next().charAt(0);
		if(input =='*') 
			answer = num1*num2;
		else if (input=='/')
			answer = num1/num2;
		else if (input=='%')
			answer = num1%num2;
		else if(input=='+')
			answer = num1+num2;
		else if(input=='-')
			answer = num1-num2;
		else
			System.out.println("Invalid Command");
		System.out.println("The result is "+answer);
		in.close();
	}
}
