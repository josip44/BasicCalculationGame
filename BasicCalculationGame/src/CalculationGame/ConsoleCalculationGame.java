package CalculationGame;

import java.util.Scanner;

public class ConsoleCalculationGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int first_number = scanner.nextInt();
		
		System.out.println("Enter your second number: ");
		int second_number = scanner.nextInt();
		
		System.out.println("Operations Available Are: ");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		System.out.println("5 - Percentage");
		
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		
		System.out.println("Your Choices Are");
		System.out.println("First number " + first_number);
		System.out.println("Second number " + second_number);
		System.out.println("Choice " + choice);
		
		if(choice == 1) {
			System.out.println("Result is "+(first_number + second_number));
		} else if(choice == 2) {
			System.out.println("Result is "+(first_number - second_number));
		} else if(choice == 3) {
			System.out.println("Result is "+(first_number * second_number));
		} else if(choice == 4) {
			System.out.println("Result is "+(first_number / second_number));
	    } else if(choice == 5) {
	    	System.out.println("Result is "+(first_number % second_number));
	    } else {
	    	System.out.println("Invalid Choice!");
	    }
		

   }

}