import java.text.NumberFormat;
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter principle amount: ($___)");
        double principle = userInput.nextDouble();
        System.out.println("Enter rate at which the principle is to be compounded: (___%)");
        double rate = userInput.nextDouble();
        System.out.println("Enter the time in years the principle is to be compounded: (___)");
        double time = userInput.nextDouble();
        
        userInput.close();
        
        /* Calculate compound interest */
        double CI = principle * (Math.pow((1 + rate / 100), time));
         
        System.out.println("Your compound interest amount is:" + '\n' + formatPrice(CI));
	}
	
	private static String formatPrice(final double priceAsDouble) 
	{
	    NumberFormat formatter = NumberFormat.getCurrencyInstance();
	    if (Math.round(priceAsDouble * 100) % 100 == 0) {
	        formatter.setMaximumFractionDigits(0);
	    }
	    return formatter.format(priceAsDouble);
	}
}
