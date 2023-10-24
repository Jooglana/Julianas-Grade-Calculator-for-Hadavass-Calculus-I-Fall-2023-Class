
// Import the Scanner object.
import java.util.Scanner;

public class HadavasGradeRevisited {
	// Write the main method here.
	public static void main(String[] args) {

		// Create the Scanner object.
		Scanner input = new Scanner(System.in);

		// Declare variables needed for the project.
		int attendance, testDropped;
		double examOne, examTwo, examThree, examFour, finalExam, schemeOne, schemeTwo = 0, finalGrade;
		double examOnePercent, examTwoPercent, examThreePercent, examFourPercent, finalExamPercent, attendancePercent;
		boolean isUsingSchemeTwo = false;

		// Ask the user for the Exam 1 grade and store it.
		System.out.print("Enter Exam 1 grade: ");
		examOne = input.nextDouble();
		System.out.println("");

		// Ask the user for the Exam 2 grade and store it.
		System.out.print("Enter Exam 2 grade: ");
		examTwo = input.nextDouble();
		System.out.println("");
		
		//Calculate the midterm grade based on test 1 and test 2.
		double midtermGrade = (examOne + examTwo) / 2;
		double midtermPoints = (examOne * 0.15) + (examTwo * 0.15);
		System.out.printf("By midterm, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
		System.out.println("This doesn't factor attendance in any way, nor does it factor a test being dropped in favor of the final exam (Scheme 2). \n");

		// Ask the user for the Exam 3 grade and store it.
		System.out.print("Enter Exam 3 grade: ");
		examThree = input.nextDouble();
		System.out.println("");

		// Ask the user for the Exam 4 grade and store it.
		System.out.print("Enter Exam 4 grade: ");
		examFour = input.nextDouble();
		System.out.println("");

		// Ask the user for the Final Exam grade and store it.
		System.out.print("Enter Final Exam grade: ");
		finalExam = input.nextDouble();
		System.out.println("");
		
		// Ask the user how many attendance points (0 - 12) that they earned.
		// Have the program check if its a valid number between 0 - 12 and if not, keep displaying an error till they put a valid number in.
		System.out.print("How many attendance points (0 - 12) have you earned? ");
		attendance = input.nextInt();
		System.out.println("");
		
		while (attendance < 0 || attendance > 12) {
			System.out.print("Invaild number! Try again.\nHow many attendance points (0 - 12) have you earned? ");
			attendance = input.nextInt();
			System.out.println("");
		}
		
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
		if (examOne < examTwo && examOne < examThree && examOne < examFour) {
			schemeTwo = examTwoPercent + examThreePercent + examFourPercent + finalExamPercent + attendancePercent;
			testDropped = 1;
		} else if (examTwo < examOne && examTwo < examThree && examTwo < examFour) {
			schemeTwo = examOnePercent + examThreePercent + examFourPercent + finalExamPercent + attendancePercent;
			testDropped = 2;
		} else if (examThree < examOne && examThree < examTwo && examThree < examFour) {
			schemeTwo = examOnePercent + examTwoPercent + examFourPercent + finalExamPercent + attendancePercent;
			testDropped = 3;
		} else {
			schemeTwo = examOnePercent + examTwoPercent + examThreePercent + finalExamPercent + attendancePercent;
			testDropped = 4;
		}

		// Compare which scheme gives the higher grade. (NOTE: If they are both equal, then the answer is Scheme One)
		if (schemeOne < schemeTwo) {
			finalGrade = schemeTwo;
			isUsingSchemeTwo = true;
		} else {
			finalGrade = schemeOne;
		}

		// Tell the user the grade calculated from each scheme and tell them which one is the highest and the one that will be used for the final grade.
		// If Scheme 2 is used, tell them which one of the four tests has been dropped.
		System.out.printf("Scheme One has a grade of %.2f%%, while Scheme Two has a grade of %.2f%%. \n", schemeOne, schemeTwo);
		System.out.println("Therefore, Scheme " + ((schemeOne >= schemeTwo) ? "1 " : "2 ") + "has an higher grade and therefor will be used for the final grade. ");
		System.out.print((isUsingSchemeTwo) ? "Test " + testDropped + " has been dropped as result of using Scheme 2. \n" : "");

		// Display the user their Final Grade.
		System.out.printf("After calculations, your final grade in the course is %.2f%%. ", finalGrade);

		// What do you have to do with the Scanner at the end of the program?
		input.close();

	}
}
