import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner inputReceiver = new Scanner(System.in);
		System.out.print("In: ");
		String input = inputReceiver.nextLine();
		System.out.println(input);
		// inputReceiver.close();
	}

	public static void q2() {
		//Write question 2 code here
		
		Scanner inputReceiver = new Scanner(System.in);
		System.out.print("In: In: ");
		int input1 = inputReceiver.nextInt();
		inputReceiver.nextLine();
		int input2 = inputReceiver.nextInt();
		inputReceiver.nextLine();
		System.out.println(input1 / input2);
		System.out.println(input1 % input2);
		// inputReceiver.close();
	}

	public static void q3() {
		//Write question 3 code here
		
		Scanner inputReceiver = new Scanner(System.in);
		System.out.print("In: ");
		String input = inputReceiver.nextLine();
		System.out.println(input + " was the text you wrote");
		// inputReceiver.close();
	}

	public static void q4() {
		//Write question 4 code here
		
		Scanner inputReceiver = new Scanner(System.in);
		System.out.print("In: ");
		int input = inputReceiver.nextInt();
		inputReceiver.nextLine();
		System.out.println(input * 5);
		// inputReceiver.close();
	}

	public static void q5() {
		//Write question 5 code here
		
		Scanner inputReceiver = new Scanner(System.in);
		System.out.print("In: ");
		boolean input = inputReceiver.nextBoolean();
		inputReceiver.nextLine();
		System.out.println(input + " is a boolean");
		// inputReceiver.close();
	}

	public static void q6() {
		//Write question 6 code here
		
		Scanner inputReceiver = new Scanner(System.in);
		System.out.print("In: ");
		double input = inputReceiver.nextDouble();
		inputReceiver.nextLine();
		System.out.println(input  - 3.2);

		// inputReceiver.close();
	}

}
/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18043951)
# Instructions  

  ## Questions
1. Get a String using "In: " as the prompt.  Output the string.
2. Get two integers from user input using "In: " as the prompt.  Output the quotient (rounded down) and the remainder on separate lines.
3. Get a String using "In: " as the prompt.  Output the String + " was the text you wrote" on the same line.
4. Get an integer from user input using "In: " as the prompt.  Output the result of the integer times by 5.
5. Get a boolean using "In: " as the prompt.  Output the boolean followed by " is a boolean"
6. Get a double using "In: " as the prompt.  Output the double - 3.2.
*/