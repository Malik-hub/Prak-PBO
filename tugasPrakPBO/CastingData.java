package tugasPrakPBO;

public class CastingData {
	public static void main (String [] args)
	{
		byte a = 50;
		int b = 5;
		float c = 2;
		
		int d = (int) (a*b/c);
		int e = (int) (a*b)/251;
		
		System.out.println("a = " +a+ " b = "+b+" c = "+c+" d = "+d);
		System.out.println("e = "+e);
	}
	
	/*
	 * example local variable
	 * 
	public void someMethod()
	{
		if(gameOver && score>highscore)
		{
			String name;
			System.out.println("Please enter your name: ");
			name=reader.next();
		}
		
		System.out.println("Thank you "+name+" , ");
		System.out.println("your high score has been saved");
	}
	
	* example global variable 
	
	public void someMethod()
	{
		String name;
		if(gameOver && score>highScore)
		{
			System.out.println("Please enter your name:");
			name = reader.next();
		}
		System.out.println("Thank you "+name+" , ");
		System.out.println("your high score has been saved");
	}
	*/
}
