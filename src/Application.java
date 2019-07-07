
public class Application {

	public static void main(String[] args) {
		//ages array.
		int[] ages = new int [9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 90; //added age testing to see if the difference works.
		// getting the difference between the first array and last array.
		int difference = ages[ages.length - 1] - ages[0];
		System.out.println(difference);
		//loop to get the average of the ages array.
		double sum = 0;
		for (int age : ages) {
			sum += age;
			System.out.println(sum / ages.length);
		}
		//names array.
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//loop to get the amount of character in each string in names array
		double sum1 = 0; 
		for (int i = 0; i < names.length; i ++) {
			sum1 += names[i].length();
			System.out.println(sum1 / names.length);
		} 
		//loop to iterate through the names array and concatenate each name.
		for(String name : names) {
			System.out.print(name + " ");
			
		}
		// nameLengths array.
		int[] nameLengths = new int[names.length];
		//loop to get the length of each name in the names array and place it into nameLengths array.
		for (int i = 0; i < nameLengths.length; i ++) {
			nameLengths[i] = names[i].length();
			System.out.println(names[i].length());
		}
		//loop to get sum of nameLengths array.
		double sum2 = 0;
		for (int name : nameLengths) {
			sum2 += name;
		}
		System.out.println(sum2 / nameLengths.length);
		//created array to test method
		double[] numbers = new double[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		//created array to test method
		double[] numbers2 = new double[5];
		numbers2[0] = 1;
		numbers2[1] = 1;
		numbers2[2] = 1;
		numbers2[3] = 1;
		numbers2[4] = 1;
		//method testers
		System.out.println(average(numbers));
		System.out.println(compareArrayAverage(numbers, numbers2));
		System.out.println(compareArrayAverage(numbers2, numbers));
		System.out.println(arguments("Hello", 3));
		System.out.println(createFullName("David", "Beck"));
		System.out.println(total(ages));
		System.out.println(willBuyDrink(true, 20.00));
		System.out.println(compareArraySum(ages, nameLengths));
		System.out.println(arraySum(ages));
	}
	//method that takes a string and a number and makes the string print out the total number placed in parameter.
	public static String arguments(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i ++) {
			result += word + " ";
		}return result;
	}
		//method to concatenate a full name without a middle name.
    public static String createFullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
    //total method returns true if the sum of an array is greater than 100 using the method arraySum to help with this method.
    public static boolean total(int[] array) {    	
		if (arraySum(array) > 100) {
			return true;
		}
			return false;		 	
	}
    // average method to get an average of array.
    public static double average(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		double average = sum / array.length;
		return average;
	}
    // compareArrayAverage returns true if first array is greater than second array.
    public static boolean compareArrayAverage(double[] array, double[] array1) {
    	if (average(array) > average(array1)) {
    		return true;
    	}
    	    return false;
    }
    // willBuyDrink Method
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	if  (isHotOutside && moneyInPocket > 10.50) {
    		return true;
    	}
    		return false;
    }
    // I created this method so I can have an int sum of any given int array.
    public static int arraySum(int[] array1) {
    	int sum = 0;
		for (int length : array1) {
			sum += length;
		}	return sum;
    }
    // I created this method to compare to sums of two arrays to 100 and have it return true if sum is greater than 100.
    public static boolean compareArraySum(int[] array, int[] array1) {
    	if (arraySum(array) + arraySum(array1) > 100) {
    		return true;
    	}
    		return false;
    }		
	
	

}
