// Hadavas Calculus I Grade Calculator Version 5.0 - Full Edition

// Import the Scanner class, the File class, and the PrintWriter class.
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class HadavasGradeVersion5 {
	
	// Method that tells the user the grade they need on the final exam to pass the class.
	public static double[] hadavasFinalGradeNeeded(double schemeOneGrade, double schemeTwoGrade) {
		
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
		
		// Create array. 
		double[] gradesNeeded = {(schemeOneFinalGradeNeededD <= schemeTwoFinalGradeNeededD) ? schemeOneFinalGradeNeededD : schemeTwoFinalGradeNeededD, (schemeOneFinalGradeNeededC <= schemeTwoFinalGradeNeededC) ? schemeOneFinalGradeNeededC : schemeTwoFinalGradeNeededC, (schemeOneFinalGradeNeededB <= schemeTwoFinalGradeNeededB) ? schemeOneFinalGradeNeededB : schemeTwoFinalGradeNeededB, (schemeOneFinalGradeNeededA <= schemeTwoFinalGradeNeededA) ? schemeOneFinalGradeNeededA : schemeTwoFinalGradeNeededA};
		return gradesNeeded; // Returns the array.
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
	
	// Method to create an report file.
	public static void createReportFile(double schemeOne, double schemeTwo, int testDropped, double[] finalGradesNeeded, String filename) {
		
		try (PrintWriter output = new PrintWriter(filename)) { // Try with resources catch block to catch exceptions with PrintWriter.
			
			// Printing to file.
			output.println("Report for Juliana's Hadavas Calculus I Grade Calculator for Fall 2023 - Full Edition! Version 5.0 \n");
			
			if (finalGradesNeeded[0] != 100.01) { // Determines if a D is possible.
				if (finalGradesNeeded[0] == 0.00) { // Determines if a D score is already attained before the final exam.
					output.println("You automatically pass the class with a D, though it will not satisfy any prerequisite requirement for any class. ");
				} else {
					output.printf("You need atleast an %.2f%% on the final exam to pass the class with an D, though it will not satisfy any prerequisite requirement for any class. \n", finalGradesNeeded[0]);
				}
				if (finalGradesNeeded[1] != 100.01) { // Determines if a C is possible.
					if (finalGradesNeeded[0] == 0.00 && finalGradesNeeded[1] == 0.00) { // Determines if a C score is already attained before the final exam.
						output.println("You automatically pass the class with a C! ");
					} else {
						output.printf("You need atleast an %.2f%% on the final exam to pass the class with an C. \n", finalGradesNeeded[1]);
					}
					if (finalGradesNeeded[2] != 100.01) { // Determines if a B is possible.
						output.printf("You need atleast an %.2f%% on the final exam to get a B average overall. \n", finalGradesNeeded[2]);
						if (finalGradesNeeded[3] != 100.01) { // Determines if a A is possible.
							output.printf("You need atleast an %.2f%% on the final exam to get a A average overall. \n", finalGradesNeeded[3]);
						} else {
							output.println("It is impossible to earn an A average grade overall regardless of any grade you get on the final exam or scheme that is used. ");
						}
					} else {
						output.println("It is impossible to earn an A or an B average grade overall regardless of any grade you get on the final exam or scheme that is used. ");
					}
				} else {
					output.println("It is impossible to pass the class with a C average, meaning any prerequisite requirements with this class are unable to be fulfilled. ");
				}
			} else {
				output.println("It is impossible to pass the class regardless of any grade you get on the final exam or scheme that is used. ");
			}
			
			// Print to file.
			output.printf("\nScheme One has a grade of %.2f%%, while Scheme Two has a grade of %.2f%%. \n", schemeOne, schemeTwo);
			output.println("Therefore, Scheme " + ((schemeTwo > schemeOne) ? "2 " : "1 ") + "has an higher grade and therefor will be used for the final grade. ");
			output.print((schemeTwo > schemeOne) ? "Test " + testDropped + " has been dropped as result of using Scheme 2. \n" : "");
			
			// Lowers the number of both the schemes to 100.0 if its above 100.0.
			if(schemeTwo > 100.0) {
				schemeTwo = 100.0;
			}
			if (schemeOne > 100.0) {
				schemeOne = 100.0;
			}
			
			output.printf("After calculations, your final grade in the course is %.2f%%, ", (schemeTwo > schemeOne) ? schemeTwo : schemeOne);
			
			if (((schemeTwo > schemeOne) ? schemeTwo : schemeOne) >= 70.0) { // If the grade is an C or higher, this line runs.
				output.printf("meaning you %s ", printFinalLetterGradePass((schemeTwo > schemeOne) ? schemeTwo : schemeOne));
			} else if (((schemeTwo > schemeOne) ? schemeTwo : schemeOne) >= 60.0) { // If the grade is an D, this line runs.
				output.print("meaning you passed with an D, but didn't complete any prerequisite requirements that this class would fulfill. ");
			} else { // If the grade is an F, this line runs.
				output.print("meaning you failed to pass the class unfortunately. :( ");
			}
			
			output.println("\n\nNote that all calculations with decimals may slightly be off by approx. 0.01, meaning that it would have a little effect of the appearance of your grade. \n");
			
			output.println("End of report file.");
			
			System.out.println("Report successfully created. \n"); // Printing to console.
			
		} catch (Exception ex) {
			System.out.println("Error: Unable to generate the report. \n"); // Error message
		}
		
	}
	
	// Main Method
	public static void main(String[] args) {
		
		// Create the Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Introduction prompt.
		System.out.println("Welcome to Juliana's Hadavas Calculus I Grade Calculator for Fall 2023 - Full Edition! Version 5.0 \n");
		System.out.println("Follow the onscreen instructions to use the program. ");
		System.out.println("If you used the provided save file properly, the values will be loaded first before you are asked for them. ");
		System.out.println("If you have any issues, refer to the supplied limited documentation, submit a bug report to Github, and or contact me on Discord. ");
		System.out.print("Press enter to start. ");
		input.nextLine(); // Waits until the user enters anything.
		
		System.out.println(""); // Line spacing.
		
		// Creates the StoredGrades file object.
		File storedGrades = new File("StoredGrades.txt");

		// Declare variables needed for the project.
		int attendancePoints, testDropped = 0, currentTest = 2;
		double examOne, examTwo, examThree, examFour, finalExam, schemeOne, schemeTwo, finalGrade, midtermGrade;
		double examOnePercent, examTwoPercent, examThreePercent, examFourPercent, finalExamPercent, midtermPoints;
		boolean isUsingSchemeTwo, easterEgg = false;
		String doCreateReportFile = "", doCreateSaveFile = "", reportFilename = "";
		
		// Try-catch with resources block to handle exception.
		try (Scanner save = new Scanner(storedGrades)) { // Creates an Scanner Object that reads from a file.
			
			// Grabs data from the specified text file.
			String examOneLine = save.nextLine();
			String[] examOneLineArr = examOneLine.split("= ");
			examOne = Double.parseDouble(examOneLineArr[1]);
			String examTwoLine = save.nextLine();
			String[] examTwoLineArr = examTwoLine.split("= ");
			examTwo = Double.parseDouble(examTwoLineArr[1]);
			String examThreeLine = save.nextLine();
			String[] examThreeLineArr = examThreeLine.split("= ");
			examThree = Double.parseDouble(examThreeLineArr[1]);
			String examFourLine = save.nextLine();
			String[] examFourLineArr = examFourLine.split("= ");
			examFour = Double.parseDouble(examFourLineArr[1]);
			String attendanceLine = save.nextLine();
			String[] attendanceLineArr = attendanceLine.split("= ");
			attendancePoints = Integer.parseInt(attendanceLineArr[1]);
			String finalExamLine = save.nextLine();
			String[] finalExamLineArr = finalExamLine.split("= ");
			finalExam = Double.parseDouble(finalExamLineArr[1]);
			
		} catch (Exception e) { // Creates an PrintWriter object.
			System.out.println("Error while attempting to access save grades. Either the file doesn't exist, was moved, renamed, or is unreadable due to invalid data entries. \n"); // Error prompt
			
			// Default values for when an error occurs.
			examOne = -1;
			examTwo = -1;
			examThree = -1;
			examFour = -1;
			finalExam = -1;
			attendancePoints = -1;
		}
		
		// Determines using the save file what was the last test the user took, and if they have their total attendance points yet.
		if ((examOne < 0 || examOne > 100.0) && (examTwo < 0 || examTwo > 100.0) && (examThree < 0 || examThree > 100.0) && (examFour < 0 || examFour > 110.0) && (finalExam < 0 || finalExam > 100.0)) {
			currentTest = 0; // Runs if there is no changes to the default settings or all saved values are invalid.
		} else if ((examTwo < 0 || examTwo > 100.0) && (examThree < 0 || examThree > 100.0) && (examFour < 0 || examFour > 110.0) && (finalExam < 0 || finalExam > 100.0)) {
			currentTest = 1; // Runs if the Exam One is the only saved value.
		} else if ((examThree < 0 || examThree > 100.0) && (examFour < 0 || examFour > 110.0) && (finalExam < 0 || finalExam > 100.0)) {
			currentTest = 2; // Runs if Exam One and Two are the only saved values.
		} else if ((examFour < 0 || examFour > 110.0) && (finalExam < 0 || finalExam > 100.0)) {
			currentTest = 3; // Runs if Exam One, Two, and Three are the only saved values.
		} else if ((finalExam < 0 || finalExam > 100.0) && (attendancePoints < 0 || attendancePoints > 12)) {
			currentTest = 4; // Runs if Exams 1-4 are the only saved values.
		} else if (finalExam < 0 || finalExam > 100.0) {
			currentTest = 5; // Runs if the only non-saved value is the Final Exam.
		} else if ((examOne > 0.00 && examOne < 100.0) && (examTwo > 0.00 && examTwo < 100.0) && (examThree > 0.00 && examThree < 100.0) && (examFour > 0.00 && examFour < 110.0) && (finalExam > 0.00 && finalExam < 100.0) && (attendancePoints < 0 || attendancePoints > 12)) {
			currentTest = 6; // Runs if there is a saved value for everything.
		} else {
			// Prompt for if the program can't figure out what test the user last took.
			currentTest = 0;
		}
		
		if (currentTest == 0) { // Runs to ask the user an prompt.
			do {
				System.out.print("What is the last test you completed? \nType 0 if you haven't taken a test yet. \nType 1 if you only taken Exam 1. \nType 2 if you only taken Exams 1-2. \nType 3 if you only taken Exams 1-3. \nType 4 if you taken Exams 1-4 but don't know your total attendance points yet. \nType 5 if you have taken Exams 1-4 and know your total attendance points. \nType 6 if you have taken all of the exams (including the final for the class). \nYour Selection: ");
				while (!input.hasNextInt()) { // Checks to see if the user input is an integer.
					System.out.print("\nEither it is not a numerical value, or it is a decimal number. \nEnter your test value with WHOLE numbers only: ");
					input.next();
				}
				currentTest = input.nextInt();
				if (currentTest < 0 || currentTest > 6) { // Checks to see if the number is between 0 - 6 inclusive.
					System.out.println("Invaild number! Enter a number between 0 - 5! \n");
				}
			} while (currentTest < 0 || currentTest > 6);
			System.out.println(""); // Line Spacing.
		}

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
		
		// Calculates the midterm grade based on test 1 and test 2 only if the last test the user took was Test 2.
		if (currentTest == 2) {
			midtermGrade = (examOne + examTwo) / 2;
			midtermPoints = (examOne * 0.15) + (examTwo * 0.15);
			System.out.printf("By Test 2, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
			System.out.println("This doesn't factor attendance in any way, nor does it factor a test being dropped in favor of the final exam (Scheme 2). \n");
		}
		
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
		
		// Calculates the midterm grade based on test 1, test 2, and test 3 only if the last test the user took was Test 3.
		if (currentTest == 3) {
			midtermGrade = (examOne + examTwo + examThree) / 3;
			midtermPoints = (examOne * 0.15) + (examTwo * 0.15) + (examThree * 0.15);
			System.out.printf("By Test 3, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
			System.out.println("This doesn't factor attendance in any way, nor does it factor a test being dropped in favor of the final exam (Scheme 2). \n");
		}
		
		// Ask the user for the Exam 4 grade and store it if the stored value is a negative or above 110.0.
		// The user must enter a valid grade between 0 - 110.0 otherwise they will receive an error and have to put in another value.
		if (examFour < 0 || examFour > 110.0) {
			do {
				System.out.print("Enter Exam 4 grade: ");
				while (!input.hasNextDouble()) {
					System.out.print("\nThat is not a numerical value! \nEnter an grade for Exam 4: ");
					input.next();
				}
				examFour = input.nextDouble();
				if (examFour < 0 || examFour > 110.0) {
					System.out.println("Invalid grade! Enter a grade between 0 - 110.0. \n");
				}
			} while (examFour < 0 || examFour > 110.0);
		} else {
			System.out.println("Using the value saved for Exam Four. ");
		}
		
		System.out.println(""); // For Line Spacing.
		
		// Calculates the midterm grade based on test 1, test 2, test 3, and test 4 only if the last test the user took was Test 4 and not all attendance point days have passed yet.
		if (currentTest == 4) {
			midtermGrade = (examOne + examTwo + examThree + examFour) / 4;
			midtermPoints = (examOne * 0.15) + (examTwo * 0.15) + (examThree * 0.15) + (examFour * 0.15);
			System.out.printf("By Test 4, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
			System.out.println("This doesn't factor attendance in any way, nor does it factor a test being dropped in favor of the final exam (Scheme 2). \n");
		}

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
		
		// Calculates the current grade average based on test one, two, three, four, and your attendance points if Exams 1-4 have been taken and the user has their attendance value.
		if (currentTest == 5) {
			midtermGrade = ((examOne + examTwo + examThree + examFour) - 10 + attendancePoints) / 4;
			midtermPoints = ((examOne * 0.15) - 2.5) + ((examTwo * 0.15) - 2.5) + ((examThree * 0.15) - 2.5) + ((examFour * 0.15) - 2.5) + attendancePoints;
			System.out.printf("Going into the final exam, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
			System.out.println("This does factor your attendance points, but it does not factor a test being dropped in favor of the final exam (Scheme 2). \n");
		}
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
		// Calls the hadavasFinalGradeNeeded which tells the user the grade they need on the final exam to pass the class.
		// It also saves those values for later in case the user wants to create a report file after execution.
		double[] savedGradesNeeded = hadavasFinalGradeNeeded(schemeOne, schemeTwo); 
		
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
		System.out.println("\n\nNote that all calculations with decimals may slightly be off by approx. 0.01, meaning that it would have a little effect of the appearance of your grade. \n");
		
		// Do while loop until the user enters an "y" or an "n";
		do {
			
			// Prompt
			System.out.print("Would you like to save your grades (y/n)? \nIf you save, your old save file will be completely overwritten! \nYour selection: ");
			doCreateSaveFile = input.next();
			
			if (!doCreateSaveFile.equals("y") && !doCreateSaveFile.equals("n")) { // Runs if the user puts invalid input.
				System.out.println("Invalid input! Try again! \n");
			}
			
		} while (!doCreateSaveFile.equals("y") && !doCreateSaveFile.equals("n"));
		
		// Do only if "y" is the answer.
		if (doCreateSaveFile.equals("y")) {
			try(PrintWriter output = new PrintWriter(storedGrades)) { // Creates an PrintWriter object.
				
				// Printing to file.
				output.printf("Exam One Grade = %.2f%n", examOne);
				output.printf("Exam Two Grade = %.2f%n", examTwo);
				output.printf("Exam Three Grade = %.2f%n", examThree);
				output.printf("Exam Four Grade = %.2f%n", examFour);
				output.printf("Earned Attendance Points = %d%n", attendancePoints);
				output.printf("Final Exam Grade = %.2f%n", finalExam);
				output.print("Use this file to store your grades! \nA space must between the value and the equals. \nFOR ALL EXAM VALUES: \nChange the values to a negative or above 100.0 (above 110 for Exam 4) if you wish to manually enter a value during the program execution. \nIf the values below are less than 0 or above 100.0 (above 110 for Exam 4), then an value will be asked for during the program execution. \nFOR THE ATTENDANCE VALUE: \nThe attendance value value must be a number between 0 - 12 in order to for the saved value to be used, otherwise put a invalid number to ask for the number during execution. \nTHIS MUST BE A WHOLE NUMBER! ");
				
				// Printing to console.
				System.out.println("Save successfull. \n");
				
			} catch (Exception ex) { // Catches exceptions.
				System.out.println("An error occured while trying to save your data and the process couldn't be completed. \n"); // Error Prompt
			}
		} else { // Do only if "n" is the answer.
			System.out.println("\nNo save was selected. \n"); // Printing to console.
		}
		
		// Do while loop until the user enters an "y" or an "n";
		do {
			
			// Prompt
			System.out.print("Would you like to create a report file with the grade you need on the final exam to pass the class with an certain letter grade and the calculated final grade (y/n)? ");
			doCreateReportFile = input.next();
			
			if (!doCreateReportFile.equals("y") && !doCreateReportFile.equals("n")) { // Runs if the user puts invalid input.
				System.out.println("Invalid input! Try again! \n");
			}
			
		} while (!doCreateReportFile.equals("y") && !doCreateReportFile.equals("n"));
		
		// Do only if "y" is the answer.
		if (doCreateReportFile.equals("y")) {
			
			// Asks the user for a filename and adds ".txt" to it.
			System.out.print("An txt file will be generated in the same directory as this program containing your report. \nWithout including any file extensions, invalid filename characters, or spaces, what would you like to name you report file? \nPlease note that this will overwrite any files in the same directory with the same name you provided. \nFilename: ");
			reportFilename = input.next();
			reportFilename += ".txt";
			System.out.println("");	// Line spacing.
			createReportFile(schemeOne, schemeTwo, testDropped, savedGradesNeeded, reportFilename); // Calls the createReportFile method.
			
		} else { // Do only if "n" is the answer.
			System.out.println("\nNo report file was selected. \n");
		}
		
		// What do you have to do with the Scanner at the end of the program?
		input.close();
		
		System.out.print("Thank you for using my program! "); // Goodbye message.

	}
}