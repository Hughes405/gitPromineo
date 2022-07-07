package labWeek1;

public class week1VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int planeSeats = 8;
		
		//create a variable to hold the cost of groceries at a checkout
		double groceryCost = 4.98;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'c';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isItHot = false;	
		
		//create a variable to hold a customer's first name
		String custFirstName= " Tom";
		
		//create a variable to hold a street address
		String stAddress = "45th and Broadway, NY";
		
		//print all variables to the console
		System.out.println("There are "+  planeSeats +  "  seats left on the plane.");
		System.out.println(groceryCost + " is the price for groceries.");
		System.out.println("Tom's middle initial is " + middleInitial);
		System.out.println(isItHot + ", it is not hot.");
		System.out.println("The customer's first name is " + custFirstName + ".");
		System.out.println(stAddress + " is where Tom lives.");
		
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		planeSeats -= 2;
		
		//impulse candy bar purchase, add 2.15 to the grocery total
				
		groceryCost += 2.15;		
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'b';
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		isItHot =! isItHot;
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = custFirstName + " " + middleInitial + " " + "Smith";
				
		//print a new line to the console that introduces the customer an says they live a the address variable
		System.out.print("Hi, my name is " + fullName + "and I live at " + stAddress);
		
	}

}
