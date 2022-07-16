package labs;

public class week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    int [] ageArray = {3, 9, 23, 64, 2, 8, 28, 93, 99};
    
    //Programmatically subtract the value of the first element in the array from the value in the last element of the array
    //(i.e. do not use ages[7] in your code). Print the result to the console.
     int ageDifference = ageArray[ageArray.length - 1] - ageArray[0];
    System.out.println(ageDifference);
    
    
    //Add a new age to your array and repeat the step above to ensure it is dynamic
    //A: see above array
    
    //Use a loop to iterate through the array and calculate the average age.
    //Print the result to the console.
    double totalAge = 0;
    for (int age : ageArray) {
    	totalAge += age;	
    }
    double averageAge = totalAge / ageArray.length;
    System.out.println(averageAge);
    
    //Create an array of String called names that contains the following values:
    //“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    String [] nameArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    //Use a loop to iterate through the array and calculate the average number of letters per name.
    //Print the result to the console
    int totalLetters = 0;
    for (String name : nameArray) {
    	totalLetters += name.length();
    	}
    double averageLetters = totalLetters / nameArray.length;
    System.out.println(averageLetters);
    
    //Use a loop to iterate through the array again and concatenate all the names together, separated by spaces.
    //Print the result to the console.
     String concatenatedNames = "";
    for (int i = 0; i < nameArray.length; i ++) {
    	concatenatedNames += nameArray[i];
    	concatenatedNames += " ";
    }
    System.out.println(concatenatedNames);
    
    //How do you access the last element of any array?
    //A: the last element of an array is accessed by array [array.length -1]
    
    //How do you access the first element of any array?
    //A: the first element of an array is always index 0 and accessed by array[0]
    
    //Create a new array of int called nameLengths.
    //Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
    int [] nameLengths = new int [nameArray.length];
    for (int i = 0; i < nameArray.length; i ++) {
    nameLengths[i] = nameArray[i].length();
    System.out.println(nameLengths[i]);
    }
    //Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
    //Print the result to the console.
    int sum = 0;
    for (int lengths : nameLengths) {
    	sum += lengths;
    }
    System.out.println(sum);
    
    
    //Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
    //(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
    //A: see line 113
    System.out.println(concatenateMe("Hello", 5));
    
    //Write a method that takes two Strings, firstName and lastName, and returns a full name
    //(the full name should be the first and the last name as a String separated by a space
    //A: see line 120
    System.out.println(makeFullName("Abigail", "Hughes"));
    
    //Write a method that takes an array of int and returns true
    //if the sum of all the ints in the array is greater than 100.
    //A: see line 124
    int [] arrayToSum = { 1, 2, 55, 89, 22};
    System.out.println(isSumGreaterThan100(arrayToSum));
    
    //Write a method that takes an array of double and returns the average of all the elements in the array.
    //A: see line 131
    double [] firstArray = {5, 20, 50, 21};
    System.out.println(returnArrayAverage(firstArray));
    
    //Write a method that takes two arrays of double and returns true if the average of the elements 
    //in the first array is greater than the average of the elements in the second array.
    //A: see line 138
    double [] secondArray = { 6.5, 8.9, 1, 2, 55, 89, 22};
    System.out.println(isFirstAverageGreater(firstArray, secondArray));
    
    //Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
    //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    //A: see line 151
    System.out.println(willBuyDrink(true, 10));
    
    //Create a method of your own that solves a problem.
    //In comments, write what the method does and why you created it.
    //A: This is a method that takes a string and a string array, tests whether the string is in a array and returns a greeting if so.
    //see line 157
    System.out.println(greetPerson("Sally", nameArray));    
    
	}
	
    public static String concatenateMe(String word, int n) {
    	String newWord = "";
    	for(int i = 1; i<= n; i++) {
				newWord += word;
    	}
	    return newWord;
    }
    public static String makeFullName( String firstName, String lastName) {
    	String fullName = firstName.concat(" ").concat(lastName);
    	return fullName;
    }
    public static boolean isSumGreaterThan100(int [] array) {
    	 int sum = 0;
    	 for (int num : array) {
    		 sum += num;
    	 }
    	 return sum > 100;  	
    }
    public static double returnArrayAverage(double [] array) {
    	double sum = 0;
		for (double each : array) {
			sum += each;
		}
		return sum / array.length;
    }
    public static boolean isFirstAverageGreater (double [] array, double [] arrayTwo) {
    	double sumFirst = 0;
		for (double each : array) {
			sumFirst += each;
		}
		double averageFirst = sumFirst / array.length;
	    double sumSecond = 0;
		for (double each : arrayTwo) {
			sumSecond += each;
		}	
			double averageTwo = sumSecond / arrayTwo.length;
		return averageFirst > averageTwo;		    	
    }
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	if (isHotOutside && moneyInPocket > 10.50) {
    		return true;
    	}
    	return false;
    }
    public static String greetPerson(String name, String [] array) {
    	for (String str : array) {
    		if( str.equals(name)) {
    			return "Hi, "+ name + ", how are you?";
    		}
    	}return "Name not found";
    }
    
}
