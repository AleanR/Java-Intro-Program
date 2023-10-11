//NAME: Alean Rodriguez
//DATE: 01/16/2022 (Date the program was created/last modified)
//ASSIGNMENT #1
//PROGRAM: Assignment1_AleanRodriguez
//DESCRIPTION: This program will show not only the first assignment of the but as well as my major, career goals, and hobbies.


public class assign1 {
	
	public static void main(String[] args) {
	// This is the first part of the assignment. It includes all of the criteria in which I need to state my Name, Date of creation, Assignment, Program name, and the Description of the assignment.
		System.out.println("Name: Alean Rodriguez");
	
		System.out.println("Student ID: 4000198511");
	
		System.out.println("Major: Computer Science");
		
		System.out.println("Career Goal: Bachelor of Science in Computer Science");
	
		System.out.println("Computer Programming Experience: An Introductory Course in C++ at MDC");
	
		System.out.println("Hobbies: Playing Videogames\n \t Playing the Ukelele\n \t Watching Netflix\n");
	// This will be the second part of the assignment. This requires the student to display two variables, 1: The Actual letter 'D' % 2: The Unicode number of the letter 'D'.
		
		char CharacterofD = 'D'; //This is the alphabetic character of the letter D initialized into a char variable.
		
		char unicode = 68; // Using the Unicode number, I am able to print out the letter D using the number 68.
		
	//The statements below print out the variables above and putting them into one line.
		
		System.out.print(CharacterofD);
		
		System.out.print("\t"); // Spacing out the two D's.
		
		System.out.println(unicode);
		
		System.out.println("\n"); // This is to make the output more readable.
		
	//This will be the third part of the assignment and will work towards initializing "totalValue" using the given statements.
		
		int totalValue = 0; //Declaring totalValue
		
		byte valueOne = 1; //These variables represent the given variables to add together.
		short valueTwo = 2;
		
		totalValue = valueOne + valueTwo; // Final Expression
		
		System.out.println(totalValue);
		
		
	}
}
