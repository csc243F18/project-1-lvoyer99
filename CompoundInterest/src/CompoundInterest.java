import java.text.NumberFormat;
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		//Scanner var for user input
		Scanner userInput = new Scanner(System.in);
		
		//Enter Principle
		System.out.println("Enter principle amount: ($___)");
        double principle = userInput.nextDouble();
        
        //Enter Rate
        System.out.println("Enter rate at which the principle is to be compounded: (___%)");
        double rate = userInput.nextDouble();
        
        //Enter Time in Years
        System.out.println("Enter the time in years the principle is to be compounded: (___)");
        double time = userInput.nextDouble();
        
        //Close input
        userInput.close();
        
        //Calculate compound interest
        double CI = principle * (Math.pow((1 + rate / 100), time));
        
        //Print amount with formatted price
        System.out.println("Your compound interest amount is:" + '\n' + formatPrice(CI));
	}
	
	
	//Added function to format price
	private static String formatPrice(final double priceAsDouble) 
	{
	    NumberFormat formatter = NumberFormat.getCurrencyInstance();
	    if (Math.round(priceAsDouble * 100) % 100 == 0) {
	        formatter.setMaximumFractionDigits(0);
	    }
	    return formatter.format(priceAsDouble);
	}
}
