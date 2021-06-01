package tugasPrakPBO;
import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args ) {
	Scanner input = new Scanner(System.in);
	int day=0,x=0,month,year;
	String name="",s="";
	
	//interface
	System.out.print("Enter the number of the month(1-12): ");
	month = input.nextInt();
	if(month<1 || month >12) 
		System.out.println("Invalid Input");
	else {
	System.out.print("Enter the year: ");
	year = input.nextInt();
	
	//naming the month
		switch(month) {
		case 1:
			name = "January";
			break;
		case 2: 
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		}
		
	//determine if the inputted month is odd or even
	int oddeven = month % 2;
	String result = (oddeven == 0) ? "even" : "odd" ;
	
	//determine if the year is a leap year or not
	if(year%400==0)
		x=1; //leap year
	else if (year%100==0)
		x=0; //not leap year
	else if (year%4==0)
		x=1;
	
	//determine number of day in the month
	switch(month) {
	case 1,3,5,7,8,10,12:
		day = 31;
		break;
	case 4,6,9,11:
		day=30;
	case 2:
		if (x==1) 
			day=29;
		else {
			day=28;
			s = " not";}
		break;
	}
	
	//output
	System.out.println("\n"+name + ", "+year);
	System.out.println(name+" is an "+result+" month");
	System.out.println("Year "+year+" is"+s+" a leap year");
	System.out.println(name+" has "+day+" days");
	
	input.close();
		}
	}
}
