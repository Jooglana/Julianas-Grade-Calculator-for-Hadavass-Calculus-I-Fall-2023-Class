
public class HadavasGradeLite {
	
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
	
	// Method to determine if an string can be parsed into a integer.
	public static boolean canParseInt(String s) {
		try { // Tests the string if it can be parsed into a integer.
			Integer.parseInt(s);
			return true; // If no exception occurs, return true.
		} catch (NumberFormatException e) {
			return false; // If an exception occurs, return false.
		}
	}
	
	// Method to determine if an string can be parsed into a double.
	public static boolean canParseDouble(String s) {
        try { // Tests the string if it can be parsed into a double.
            Double.parseDouble(s);
            return true; // If no exception occurs, return true.
        } catch (NumberFormatException e) {
            return false; // If an exception occurs, return false.
        }
    }
	
	// Main Method
	public static void main(String[] args) {

		// Declare variables needed for the project.
		int attendancePoints, testDropped = 0;
		double examOne, examTwo, examThree, examFour, finalExam, schemeOne, schemeTwo, finalGrade;
		double examOnePercent, examTwoPercent, examThreePercent, examFourPercent, finalExamPercent;
		boolean isUsingSchemeTwo, valid = false, finalExamValid = false;;
		int argsLength = args.length;

		if (argsLength == 1 && args[0].equals("help")) { // This section runs if the user only supplied one argument and it's "help".

			System.out.println("To use the program, after the program name in the command line (HadavasGradeLite.java), \nput <Exam 1 Score> <Exam 2 Score> <Exam 3 Score> <Exam 4 Score> <Attendance Points> <Final Exam Score>. ");
			System.out.println("Additionally, if you just want to find out what you need on the final exam to pass or get a certain letter grade, do not put anything for the final exam. ");
			
		} else if (argsLength == 1 && args[0].equals("ratemyprofessors.com")) { // Runs if the user enters the easter egg.
			
			double score = (Math.random() * 4) + 1; // Generate a random number between 1.0 - 5.0.
			System.out.printf("Dr. Hadavas has been rated %.1f on ratemyprofessors.com\n", score); // Printing.
			System.out.printf("You %s to pass the class. \n", (score < 4.5) ? "aren't likely" : "are likely"); // Printing based on condition.
			
		} else if (argsLength == 5 || argsLength == 6) { // Runs if the user supplies 5 or 6 arguments.
			
			// If there's a final exam value, check to see if it's a number.
			// If the final exam value exists and its not a number, make finalExamValid variable false.
			// If it is a number, then finalExamValid is true.
			// If there isn't a value for the final exam, then it is automatically true.
			if (argsLength == 6) {
				if (canParseDouble(args[5])) {
					finalExamValid = true;
				} else {
					finalExamValid = false;
				}
			} else {
				finalExamValid = true;
			}
			
			// Checks if the numbers supplied are actually numbers.
			if (canParseDouble(args[0]) && canParseDouble(args[1]) && canParseDouble(args[2]) && canParseDouble(args[3]) && canParseInt(args[4]) && finalExamValid) {
				valid = true;

				// Pulls the values supplied via arguments when initiating the program.
				examOne = Double.parseDouble(args[0]);
				examTwo = Double.parseDouble(args[1]);
				examThree = Double.parseDouble(args[2]);
				examFour = Double.parseDouble(args[3]);
				attendancePoints = Integer.parseInt(args[4]);

				// If any of the exam grades are lower than 0 and higher than 100.0 and or if the attendance value is higher than 12 or less than 0, then the value valid is set to false.
				if ((examOne < 0 || examOne > 100.0) || (examTwo < 0 || examTwo > 100.0) || (examThree < 0 || examThree > 100.0) || (examFour < 0 || examFour > 100.0) || (attendancePoints < 0 || attendancePoints > 12) && valid) {
					valid = false;
				}
				if (valid) { // Only runs if the values given from the user are valid.

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

					if (argsLength == 5) { // Runs only if the user supplied 5 arguments.

						// Calculate the current grade average based on test one, two, three and four.
						double midtermGrade = (examOne + examTwo + examThree + examFour) / 4;
						double midtermPoints = (examOne * 0.15) + (examTwo * 0.15) + (examThree * 0.15) + (examFour * 0.15);
						System.out.printf("After Test 4, your grade is %.2f%% and have earned %.2f points overall. \n", midtermGrade, midtermPoints);
						System.out.println("This doesn't factor attendance in any way, nor does it factor a test being dropped in favor of the final exam (Scheme 2). \n");

						hadavasFinalGradeNeeded(schemeOne, schemeTwo); // Calls the hadavasFinalGradeNeeded which tells the user the grade they need on the final exam to pass the class.

					} else { // Runs only if the user supplied 6 arguments.
						
						finalExam = Double.parseDouble(args[5]); // Pulls the final exam grade the user supplied in the arguments.
						
						if (finalExam < 0 || finalExam > 100.0) { // Changes the value valid to false if the final exam grade is less than 0 or higher than 100.0.
							valid = false;
						}

						if (valid) { // Only runs if the values given from the user are valid.

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

							// Display the user their final grade along with their letter grade if they pass
							// the class with the printFinalLetterGradePass method.
							System.out.printf("After calculations, your final grade in the course is %.2f%%, ", finalGrade);

							if (finalGrade >= 70.0) { // If the grade is an C or higher, this line runs.
								System.out.printf("meaning you %s \n", printFinalLetterGradePass(finalGrade));
							} else if (finalGrade >= 60.0) { // If the grade is an D, this line runs.
								System.out.println("meaning you passed with an D, but didn't complete any prerequisite requirements that this class would fulfill. ");
							} else { // If the grade is an F, this line runs.
								System.out.println("meaning you failed to pass the class unfortunately. :( ");
							}
						} else {
							System.out.println("An invalid final exam score was entered, meaning no calculations were able to be performed. Please try again. ");
						}
					}
					if (valid) { // Only runs if the values given from the user are valid.
						// Displays a warning message to the user if the user supplied 5 or 6 arguments.
						System.out.println("\nNote that all calculations with decimals may slightly be off by approx. 0.01, meaning that it would have a little effect of the appearance of your grade.");
					}
				} else { // Runs when the user supplies an invalid grade.
					System.out.println("An invalid exam grade or attentdance value was entered, meaning no calculations were able to be performed. Please try again. \nGrades must be 0 - 100.0 and and attendance points must be 0 - 12.");
				}
			} else { // Runs if the user supplied a value that isn't a number when attempting to use the calculator.
				System.out.println("To use the calculator, please enter numbers only! The attendance value must not be a decimal! ");
			}
		} else { // Runs if the user supplied an invalid amount of arguments.
			System.out.println("Invalid arguments! Please try again. If you need help with using the program, type \"help\" as the argument. ");
		}
	}
}