
//import first!
import java.util.Scanner;

class Notes {
	public static void main(String[] args) {

		//Input
		Scanner in = new Scanner(System.in);

		// in.nextInt();
		// in.nextDouble();
		// in.nextBoolean();
		// in.nextLine(); //NOT NEXTSTRING

		//Input should be stored

		int num;

		System.out.print("Input an integer: ");
		num = in.nextInt();
		in.nextLine(); //clear the scanner - do after nextInt, nextDouble and nextBoolean

		System.out.println(num);

		//Double

		System.out.print("Input a number: ");
		double num2 = in.nextDouble();
		in.nextLine(); //clear the scanner - do after nextInt, nextDouble and nextBoolean

		System.out.println(num2);

		//Boolean

		System.out.print("Input a boolean: ");
		boolean flag = in.nextBoolean();
		in.nextLine(); //clear the scanner - do after nextInt, nextDouble and nextBoolean

		System.out.println(flag);

		System.out.print("Input an integer: ");
		num = in.nextInt();
		in.nextLine(); //clear the scanner - do after nextInt, nextDouble and nextBoolean

		System.out.println(num);

		//combining strings with other data types
		//concatenate by putting them side by side
		System.out.println("num is " + num);
		System.out.println(5 + 5 + " is a number");
		System.out.println("num is " + 5 + 5); //num is 55
		System.out.println("num is " + (5 + 5)); //num is 10

	}
}
