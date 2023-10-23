// Import the Scanner object.
import java.util.Scanner;

public class HadavasGrade {
	// Write the main method here.
	public static void main(String[] args) {
		
		// Create the Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declare variables needed for the project.
		double hadavasRating = Math.random() * 4 + 1;
		int attendance, testDropped;
		double examOne, examTwo, examThree, examFour, finalExam, schemeOne, schemeTwo = 0, finalGrade; 
		double examOnePercent, examTwoPercent, examThreePercent, examFourPercent, finalExamPercent, attendancePercent;
		boolean valid = true;
		String passRate = "";
		boolean isUsingSchemeTwo = false;
		
		// Display Dr. Hadavas's ratemyprofessors.com score to the user. (Display double number between 1 - 5, don't worry if it never is 1.0 or 5.0.)
		System.out.println("Dr. Hadavas has been rated " + hadavasRating + " out of 5 on ratemyprofessors.com.");
		
		// If the score is 3.0 or over, tell the user they are likely to pass his class. If not, tell the user they are unlikely to pass the class.
		if(hadavasRating < 3.0) {
			passRate = " aren't likely ";
		} else {
			passRate = " are likely ";
		}
		
		System.out.println("You" + passRate + "to pass his Calculus 1 class.");
		
		// Ask the user for the Exam 1 grade and store it.
		System.out.print("Enter Exam 1 grade: ");
		examOne = input.nextDouble();
		
		// Ask the user for the Exam 2 grade and store it.
		System.out.print("Enter Exam 2 grade: ");
		examTwo = input.nextDouble();
		
		// Ask the user for the Exam 3 grade and store it.
		System.out.print("Enter Exam 3 grade: ");
		examThree = input.nextDouble();
		
		// Ask the user for the Exam 4 grade and store it.
		System.out.print("Enter Exam 4 grade: ");
		examFour = input.nextDouble();
		
		// Ask the user for the Final Exam grade and store it.
		System.out.print("Enter Final Exam grade: ");
		finalExam = input.nextDouble();
		
		// Ask the user how many attendance points (0 - 12) that they earned.
		// Have the program check if its a valid number between 0 - 12 and if not give the user one chance to correct their input.
		System.out.print("How many attendance points (0 - 12) have you earned? ");
		attendance = input.nextInt();
		if(attendance < 0 || attendance > 12) {
			System.out.print("Invaild number! Try again.\nHow many attendance points (0 - 12) have you earned? ");
			attendance = input.nextInt();
			if(attendance < 0 || attendance > 12) {
				valid = false;
			}
		}
		// Check the attendance value again, if its valid. the program may proceed, if not, display an error and end the program.
		if(!valid) {
			System.out.println("The calculation could not performed due to invalid entries. ");
		} else { 
			// Calculate the final grade using Scheme 1.
			examOnePercent = examOne * 0.15;
			examTwoPercent = examTwo * 0.15;
			examThreePercent = examThree * 0.15;
			examFourPercent = examFour * 0.15;
			finalExamPercent = finalExam * 0.30;
			attendancePercent = attendance;
			schemeOne = examOnePercent + examTwoPercent + examThreePercent + examFourPercent + finalExamPercent + attendancePercent;
			
			// Calculate the final grade using Scheme 2. (Try not to repeat code as much as possible.)
			finalExamPercent = finalExam * 0.45;
			if(examOne < examTwo && examOne < examThree && examOne < examFour) {
				schemeTwo = examTwoPercent + examThreePercent + examFourPercent + finalExamPercent + attendancePercent;
				testDropped = 1;
			} else if(examTwo < examOne && examTwo < examThree && examTwo < examFour) {
				schemeTwo = examOnePercent + examThreePercent + examFourPercent + finalExamPercent + attendancePercent;
				testDropped = 2;
			} else if(examThree < examOne && examThree < examTwo && examThree < examFour) {
				schemeTwo = examOnePercent + examTwoPercent + examFourPercent + finalExamPercent + attendancePercent;
				testDropped = 3;
			} else {
				schemeTwo = examOnePercent + examTwoPercent + examThreePercent + finalExamPercent + attendancePercent;
				testDropped = 4;
			}
			
			// Compare which scheme gives the higher grade. (NOTE: If they are both equal, then the answer is Scheme One)
			if(schemeOne < schemeTwo) {
				finalGrade = schemeTwo;
				isUsingSchemeTwo = true;
			} else {
				finalGrade = schemeOne;
			}
				
			// Tell the user the grade calculated from each scheme and tell them which one is the highest and the one that will be used for the final grade.
			// If Scheme 2 is used, tell them which one of the four tests has been dropped.
			System.out.println("Scheme One has a grade of " + schemeOne + "%, while Scheme Two has a grade of " + schemeTwo + "%. ");
			System.out.println("Therefore, Scheme " + ((schemeOne >= schemeTwo) ? "1 " : "2 " ) + "has an higher grade and therefor will be used for the final grade. ");
			System.out.print((isUsingSchemeTwo) ? "Test " + testDropped + " has been dropped as result of using Scheme 2. \n" : "");
		
			// Display the user their Final Grade.
			System.out.println("After calculations, your final grade in the course is " + finalGrade + "%. ");
			
			// What do you have to do with the Scanner at the end of the program?
			input.close();
		}	
	}
}
