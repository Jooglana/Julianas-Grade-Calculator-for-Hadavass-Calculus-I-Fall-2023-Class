// Import the Scanner class.
import java.util.Scanner;

public class HadavasGradeVersion4 {
	
	// Method that tells the user the grade they need on the final exam to pass the class.
	public static void hadavasFinalGradeNeeded(double schemeOneGrade, double schemeTwoGrade) {
		
		// Create variables.
		double schemeOneFinalGradeNeededD = 0.00, schemeOneFinalGradeNeededC = 0.00, schemeOneFinalGradeNeededB = 0.00, schemeOneFinalGradeNeededA = 0.00;
		double schemeTwoFinalGradeNeededD = 0.00, schemeTwoFinalGradeNeededC = 0.00, schemeTwoFinalGradeNeededB = 0.00, schemeTwoFinalGradeNeededA = 0.00;
		boolean schemeOneDPossible = true, schemeOneCPossible = false, schemeOneBPossible = false, schemeOneAPossible = false;
		boolean schemeTwoDPossible = true, schemeTwoCPossible = false, schemeTwoBPossible = false, schemeTwoAPossible = false;
		int count = 0;
		
		// Determines what grade you need to get on the final exam when using scheme one to get an D,
		// and turns the schemeOnePassable boolean to false if the grade needed variable exceeds 100.0.
		do {
			if (schemeOneGrade + (schemeOneFinalGradeNeededD * 0.30) < 60.0) {
				count++;
				schemeOneFinalGradeNeededD = count * 0.01;
			}
		} while ((schemeOneGrade + (schemeOneFinalGradeNeededD * 0.30) < 60.0) && schemeOneFinalGradeNeededD <= 100.0);

		if (schemeOneFinalGradeNeededD > 100.0) {
			schemeOneDPossible = false;
		}
		
		// Runs only if Scheme One is passable with the currently entered grades. 
		if (schemeOneDPossible) {

			// Determines what grade you need to get on the final exam when using scheme one to get an C,
			// and turns the schemeOnePassable boolean to false if the grade needed variable exceeds 100.0.
			do {
				if (schemeOneGrade + (schemeOneFinalGradeNeededC * 0.30) < 70.0) {
					count++;
					schemeOneFinalGradeNeededC = count * 0.01;
				}
			} while ((schemeOneGrade + (schemeOneFinalGradeNeededC * 0.30) < 70.0) && schemeOneFinalGradeNeededC <= 100.0);

			if (schemeOneFinalGradeNeededC <= 100.0) {
				schemeOneCPossible = true;
			}

			// Runs only if getting a C is possible with the currently entered grades with Scheme One.
			if (schemeOneCPossible) {

				// Determines what grade you need to get on the final exam when using scheme one to get an B,
				// and turns the schemeOneBPossible boolean to false if the grade needed variable exceeds 100.0.
				do {
					if (schemeOneGrade + (schemeOneFinalGradeNeededB * 0.30) < 80.0) {
						count++;
						schemeOneFinalGradeNeededB = count * 0.01;
					}
				} while ((schemeOneGrade + (schemeOneFinalGradeNeededB * 0.30) < 80.0) && schemeOneFinalGradeNeededB <= 100.0);

				if (schemeOneFinalGradeNeededB <= 100.0) {
					schemeOneBPossible = true;
				}

				// Runs only if getting a B is possible with the currently entered grades with Scheme One.
				if (schemeOneBPossible) {

					// Determines what grade you need to get on the final exam when using scheme one to get an A, 
					// and turns the schemeOneAPossible boolean to false if the grade needed variable exceeds 100.0.
					do {
						if (schemeOneGrade + (schemeOneFinalGradeNeededA * 0.30) < 90.0) {
							count++;
							schemeOneFinalGradeNeededA = count * 0.01;
						}
					} while ((schemeOneGrade + (schemeOneFinalGradeNeededA * 0.30) < 90.0) && schemeOneFinalGradeNeededA <= 100.0);

					if (schemeOneFinalGradeNeededA <= 100.0) {
						schemeOneAPossible = true;
					}
				}
			}
		}
		
		count = 0; // Resets the variable to be used with Scheme Two.
		
		// Determines what grade you need to get on the final exam when using scheme one to get an D,
		// and turns the schemeOnePassable boolean to false if the grade needed variable exceeds 100.0.
		do {
			if (schemeTwoGrade + (schemeTwoFinalGradeNeededD * 0.45) < 60.0) {
				count++;
				schemeTwoFinalGradeNeededD = count * 0.01;
			}
		} while ((schemeTwoGrade + (schemeTwoFinalGradeNeededD * 0.45) < 60.0) && schemeTwoFinalGradeNeededD <= 100.0);

		if (schemeTwoFinalGradeNeededD > 100.0) {
			schemeTwoDPossible = false;
		}
		
		if (schemeTwoDPossible) {

			// Determines what grade you need to get on the final exam when using scheme two to get an C,
			// and turns the schemeTwoPassable boolean to false if the grade needed variable exceeds 100.0.
			do {
				if (schemeTwoGrade + (schemeTwoFinalGradeNeededC * 0.45) < 70.0) {
					count++;
					schemeTwoFinalGradeNeededC = count * 0.01;
				}
			} while ((schemeTwoGrade + (schemeTwoFinalGradeNeededC * 0.45) < 70.0) && schemeTwoFinalGradeNeededC <= 100.0);

			if (schemeTwoFinalGradeNeededC <= 100.0) {
				schemeTwoCPossible = true;
			}

			// Runs only if Scheme One is passable with the currently entered grades.
			if (schemeTwoCPossible) {

				// Determines what grade you need to get on the final exam when using scheme two to get an B, 
				// and turns the schemeTwoBPossible boolean to false if the grade needed variable exceeds 100.0.
				do {
					if (schemeTwoGrade + (schemeTwoFinalGradeNeededB * 0.45) < 80.0) {
						count++;
						schemeTwoFinalGradeNeededB = count * 0.01;
					}
				} while ((schemeTwoGrade + (schemeTwoFinalGradeNeededB * 0.45) < 80.0) && schemeTwoFinalGradeNeededB <= 100.0);

				if (schemeTwoFinalGradeNeededB <= 100.0) {
					schemeTwoBPossible = true;
				}

				// Runs only if getting a B is possible with the currently entered grades with Scheme One.
				if (schemeTwoBPossible) {

					// Determines what grade you need to get on the final exam when using scheme two to get an A,
					// and turns the schemeTwoAPossible boolean to false if the grade needed variable exceeds 100.0.
					do {
						if (schemeTwoGrade + (schemeTwoFinalGradeNeededA * 0.45) < 90.0) {
							count++;
							schemeTwoFinalGradeNeededA = count * 0.01;
						}
					} while ((schemeTwoGrade + (schemeTwoFinalGradeNeededA * 0.45) < 90.0) && schemeTwoFinalGradeNeededA <= 100.0);

					if (schemeTwoFinalGradeNeededA <= 100.0) {
						schemeTwoAPossible = true;
					}
				}
			}
		}
		
		// If a specific letter grade is not possible for a specific grade, the final grade needed for it variable is set to the highest value possible.
		if(!schemeOneDPossible) {
			schemeOneFinalGradeNeededD = 100.01;
		}
		if(!schemeOneCPossible) {
			schemeOneFinalGradeNeededC = 100.01;
		}
		if(!schemeOneBPossible) {
			schemeOneFinalGradeNeededB = 100.01;
		}
		if(!schemeOneAPossible) {
			schemeOneFinalGradeNeededA = 100.01;
		}
		if(!schemeTwoDPossible) {
			schemeTwoFinalGradeNeededD = 100.01;
		}
		if(!schemeTwoCPossible) {
			schemeTwoFinalGradeNeededC = 100.01;
		}
		if(!schemeTwoBPossible) {
			schemeTwoFinalGradeNeededB = 100.01;
		}
		if(!schemeTwoAPossible) {
			schemeTwoFinalGradeNeededA = 100.01;
		}

		// Printing based on if a scheme is passable, and if both are passable, then whichever has the lowest score required to pass the class.
		// Then also prints the score needed for an C, if its possible, an score needed for an B, if its possible, and an score needed for an A, if its possible.
		// It also tells the user if getting a 100% overall grade in class is possible.
		if (schemeTwoDPossible || schemeOneDPossible) {
			if (schemeOneFinalGradeNeededD == 0.00) {
				System.out.println("You automatically pass the class with a D, though it will not satisfy any prerequisite requirement for any class. ");
			} else {
				System.out.printf("You need atleast an %.2f%% on the final exam to pass the class with an D, though it will not satisfy any prerequisite requirement for any class. \n", (schemeOneFinalGradeNeededD <= schemeTwoFinalGradeNeededD) ? schemeOneFinalGradeNeededD : schemeTwoFinalGradeNeededD);
			}
			if (schemeTwoCPossible || schemeOneCPossible) {
				if (schemeOneFinalGradeNeededC == 0.00 && schemeOneFinalGradeNeededD == 0.00) {
					System.out.println("You automatically pass the class with a C! ");
				} else {
					System.out.printf("You need atleast an %.2f%% on the final exam to pass the class with an C. \n", (schemeOneFinalGradeNeededC <= schemeTwoFinalGradeNeededC) ? schemeOneFinalGradeNeededC : schemeTwoFinalGradeNeededC);
				}
				if (schemeTwoBPossible || schemeOneBPossible) {
					System.out.printf("You need atleast an %.2f%% on the final exam to get a B average overall. \n", (schemeOneFinalGradeNeededB <= schemeTwoFinalGradeNeededB) ? schemeOneFinalGradeNeededB : schemeTwoFinalGradeNeededB);
					if (schemeTwoAPossible || schemeOneAPossible) {
						System.out.printf("You need atleast an %.2f%% on the final exam to get a A average overall. \n", (schemeOneFinalGradeNeededA <= schemeTwoFinalGradeNeededA) ? schemeOneFinalGradeNeededA : schemeTwoFinalGradeNeededA);
						if (schemeOneFinalGradeNeededC == 0.00 || schemeTwoFinalGradeNeededC <= 33.34) {
							System.out.println("It is possible for you to earn a perfect score (100%) overall in the class! ");
						}
					} else {
						System.out.println("It is impossible to earn an A average grade overall regardless of any grade you get on the final exam or scheme that is used. ");
					}
				} else {
					System.out.println("It is impossible to earn an A or an B average grade overall regardless of any grade you get on the final exam or scheme that is used. ");
				}
			} else {
				System.out.println("It is impossible to pass the class with a C average, meaning any prerequisite requirements with this class are unable to be fulfilled. ");
			}
		} else {
			System.out.println("It is impossible to pass the class regardless of any grade you get on the final exam or scheme that is used. ");
		}
	}
	
	// Method to attain letter grade, and put it in a string.
	public static String printFinalLetterGradePass(double grade) {
		
		// Create variables.
		char letterGrade;
		
		// Determines which letter grade it is based on the grade.
		if(grade >= 90.0) {
			letterGrade = 'A';
		} else if(grade >= 80.0) {
			letterGrade = 'B';
		} else {
			letterGrade = 'C';
		} 
		
		// Returns the string with the letter grade.
		return "passed the class with a " + letterGrade + "!";
		
	}
	
	// Main Method
	public static void main(String[] args) {

		// Create the Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Creates the StoredGrades object.
		StoredGrades storage = new StoredGrades();

		// Declare variables needed for the project.
		int attendancePoints, testDropped;
		double examOne, examTwo, examThree, examFour, finalExam, schemeOne, schemeTwo, finalGrade;
		double examOnePercent, examTwoPercent, examThreePercent, examFourPercent, finalExamPercent;
		boolean isUsingSchemeTwo, easterEgg = false;

		// Grabs the stored values from the StoredGrades file using "get" Methods.
		
		examOne = storage.getExamOneGrade();
		examTwo = storage.getExamTwoGrade();
		examThree = storage.getExamThreeGrade();
		examFour = storage.getExamFourGrade();
		finalExam = storage.getFinalExamGrade();
		attendancePoints = storage.getAttendance();

		// Ask the user for the Exam 1 grade and store it if the stored value is a negative or above 100.0.
		// The user must enter a valid grade between 0 - 100.0 otherwise they will receive an error and have to put in another value.
		if (examOne < 0 || examOne > 100.0) {
			do {
				System.out.print("Enter Exam 1 grade: ");
				while (!input.hasNextDouble()) {
					System.out.print("\nThat is not a numerical value! \nEnter an grade for Exam 1: ");
					input.next();
				}
				examOne = input.nextDouble();
				if(examOne < 0 || examOne > 100.0) {
					System.out.println("Invalid grade! Enter a grade between 0 - 100.0. \n");
				}
			} while (examOne < 0 || examOne > 100.0);
		} else {
			System.out.println("Using the value saved for Exam One. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		// Ask the user for the Exam 2 grade and store it if the stored value is a negative or above 100.0.
		// The user must enter a valid grade between 0 - 100.0 otherwise they will receive an error and have to put in another value.
		if (examTwo < 0 || examTwo > 100.0) {
			do {
				System.out.print("Enter Exam 2 grade: ");
				while (!input.hasNextDouble()) {
					System.out.print("\nThat is not a numerical value! \nEnter an grade for Exam 2: ");
					input.next();
				}
				examTwo = input.nextDouble();
				if (examTwo < 0 || examTwo > 100.0) {
					System.out.println("Invalid grade! Enter a grade between 0 - 100.0. \n");
				}
			} while (examTwo < 0 || examTwo > 100.0);
		} else {
			System.out.println("Using the value saved for Exam Two. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		// Ask the user for the Exam 3 grade and store it if the stored value is a negative or above 100.0.
		// The user must enter a valid grade between 0 - 100.0 otherwise they will receive an error and have to put in another value.
		if (examThree < 0 || examThree > 100.0) {
			do {
				System.out.print("Enter Exam 3 grade: ");
				while (!input.hasNextDouble()) {
					System.out.print("\nThat is not a numerical value! \nEnter an grade for Exam 3: ");
					input.next();
				}
				examThree = input.nextDouble();
				if (examThree < 0 || examThree > 100.0) {
					System.out.println("Invalid grade! Enter a grade between 0 - 100.0. \n");
				}
			} while (examThree < 0 || examThree > 100.0);
		} else {
			System.out.println("Using the value saved for Exam Three. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		// Ask the user for the Exam 4 grade and store it if the stored value is a negative or above 100.0.
		// The user must enter a valid grade between 0 - 100.0 otherwise they will receive an error and have to put in another value.
		if (examFour < 0 || examFour > 100.0) {
			do {
				System.out.print("Enter Exam 4 grade: ");
				while (!input.hasNextDouble()) {
					System.out.print("\nThat is not a numerical value! \nEnter an grade for Exam 4: ");
					input.next();
				}
				examFour = input.nextDouble();
				if (examFour < 0 || examFour > 100.0) {
					System.out.println("Invalid grade! Enter a grade between 0 - 100.0. \n");
				}
			} while (examFour < 0 || examFour > 100.0);
		} else {
			System.out.println("Using the value saved for Exam Four. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		//Calculate the current grade average based on test one, two, three and four.
		double midtermGrade = (examOne + examTwo + examThree + examFour) / 4;
		double midtermPoints = (examOne * 0.15) + (examTwo * 0.15) + (examThree * 0.15) + (examFour * 0.15);
		System.out.printf("After Test 4, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
		System.out.println("This doesn't factor attendance in any way, nor does it factor a test being dropped in favor of the final exam (Scheme 2). \n");

		// Ask the user how many attendance points (0 - 12) that they earned, if the value saved is invalid.
		// Have the program check if its a valid number between 0 - 12 and if not, keep displaying an error till they put a valid number in.
		if (attendancePoints < 0 || attendancePoints > 12) {
			do {
				if (attendancePoints == 69) {
					easterEgg = true;
				}
			System.out.print("How many attendance points (0 - 12) have you earned? ");
			while (!input.hasNextInt()) {
				System.out.print("\nEither it is not a numerical value, or it is a decimal number. \nEnter your attendance points with WHOLE numbers only: ");
				input.next();
			}
			attendancePoints = input.nextInt();
			if (attendancePoints < 0 || attendancePoints > 12) {
				System.out.println("Invaild number! Enter a number between 0 - 12! \n");
			}
			} while (attendancePoints < 0 || attendancePoints > 12);
		} else {
			System.out.println("Using the value saved for attendance. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		// Calculate the final grade using Scheme 1 minus the final exam grade.
		examOnePercent = examOne * 0.15;
		examTwoPercent = examTwo * 0.15;
		examThreePercent = examThree * 0.15;
		examFourPercent = examFour * 0.15;
		schemeOne = examOnePercent + examTwoPercent + examThreePercent + examFourPercent + attendancePoints;

		// Calculate the final grade using Scheme 2 minus the final exam grade.
		if (examOne < examTwo && examOne < examThree && examOne < examFour) {
			schemeTwo = examTwoPercent + examThreePercent + examFourPercent + attendancePoints;
			testDropped = 1;
		} else if (examTwo < examOne && examTwo < examThree && examTwo < examFour) {
			schemeTwo = examOnePercent + examThreePercent + examFourPercent + attendancePoints;
			testDropped = 2;
		} else if (examThree < examOne && examThree < examTwo && examThree < examFour) {
			schemeTwo = examOnePercent + examTwoPercent + examFourPercent + attendancePoints;
			testDropped = 3;
		} else {
			schemeTwo = examOnePercent + examTwoPercent + examThreePercent + attendancePoints;
			testDropped = 4;
		}
		
		if (easterEgg) { // Runs if the user activates the easter egg.
			
			System.out.println("You found the easter egg by typing in a funny number for the attendance value. "); // Printing
			double score = (Math.random() * 4) + 1; // Generate a random number between 1.0 - 5.0.
			System.out.printf("Dr. Hadavas has been rated %.1f on ratemyprofessors.com\n", score); // Printing.
			System.out.printf("You %s to pass the class. \n", (score < 4.5) ? "aren't likely" : "are likely"); // Printing based on condition.
			System.out.print("Press enter to continue. "); // Printing
			input.nextLine(); // Continues the program when the user is ready.
			input.nextLine(); 
			System.out.println("");  // For Line Spacing.
			
		}
		
		hadavasFinalGradeNeeded(schemeOne, schemeTwo); // Calls the hadavasFinalGradeNeeded which tells the user the grade they need on the final exam to pass the class.
		
		System.out.println(""); // For Line Spacing.
		
		// Ask the user for the Final Exam grade and store it if the stored value is a negative or above 100.0.
		// The user must enter a valid grade between 0 - 100.0 otherwise they will receive an error and have to put in another value.
		if (finalExam < 0 || finalExam > 100.0) {
			do {
				System.out.print("Enter Final Exam grade: ");
				while (!input.hasNextDouble()) {
					System.out.print("\nThat is not a numerical value! \nEnter an grade for the Final Exam: ");
					input.next();
				}
				finalExam = input.nextDouble();
				if (finalExam < 0 || finalExam > 100.0 ) {
					System.out.println("Invalid grade! Enter a grade between 0 - 100.0. \n");
				}
			} while (finalExam < 0 || finalExam > 100.0);
		} else {
			System.out.println("Using the value saved for the Final Exam. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		// Adds the final exam grade to both schemes.
		finalExamPercent = finalExam * 0.30;
		schemeOne += finalExamPercent;
		finalExamPercent = finalExam * 0.45;
		schemeTwo += finalExamPercent;
		
		// Compare which scheme gives the higher grade. (NOTE: If they are both equal, then the answer is Scheme One)
		finalGrade = Math.max(schemeOne, schemeTwo);
		isUsingSchemeTwo = (finalGrade == schemeTwo && finalGrade != schemeOne) ? true : false;
		
		// If the final grade is higher than 100.0, then this lowers it to 100.0.
		if (finalGrade > 100.0) {
			finalGrade = 100.0;
		}
		
		// Tell the user the grade calculated from each scheme and tell them which one is the highest and the one that will be used for the final grade.
		// If Scheme 2 is used, tell them which one of the four tests has been dropped.
		System.out.printf("Scheme One has a grade of %.2f%%, while Scheme Two has a grade of %.2f%%. \n", schemeOne, schemeTwo);
		System.out.println("Therefore, Scheme " + ((isUsingSchemeTwo) ? "2 " : "1 ") + "has an higher grade and therefor will be used for the final grade. ");
		System.out.print((isUsingSchemeTwo) ? "Test " + testDropped + " has been dropped as result of using Scheme 2. \n" : "");

		// Display the user their final grade along with their letter grade if they pass the class with the printFinalLetterGradePass method.
		System.out.printf("After calculations, your final grade in the course is %.2f%%, ", finalGrade);
		
		if (finalGrade >= 70.0) { // If the grade is an C or higher, this line runs.
			System.out.printf("meaning you %s ", printFinalLetterGradePass(finalGrade));
		} else if (finalGrade >= 60.0) { // If the grade is an D, this line runs.
			System.out.print("meaning you passed with an D, but didn't complete any prerequisite requirements that this class would fulfill. ");
		} else { // If the grade is an F, this line runs.
			System.out.print("meaning you failed to pass the class unfortunately. :( ");
		}
		
		// Displays a warning message to the user.
		System.out.println("\n\nNote that all calculations with decimals may slightly be off by approx. 0.01, meaning that it would have a little effect of the appearance of your grade.");
		
		// What do you have to do with the Scanner at the end of the program?
		input.close();

	}
}