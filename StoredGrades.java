// Use this file to store your grades!
// Do not touch anything but where you are specifically told to do so, otherwise you risk breaking it!
// If you break it and do not know what to do, replace the file with a fresh one and start over!
public class StoredGrades {
	
	// Save your test scores for future calculations below. 
	// Change the values to a negative or above 100.0 if you wish to manually enter a value during the program execution.
	// If the values below are less than 0 or above 100.0, then an value will be asked for during the program execution.
	// A space must between the value and the equals and a semicolon right after the value.
	double Exam_One_Grade = -1;
	double Exam_Two_Grade = -1;
	double Exam_Three_Grade = -1;
	double Exam_Four_Grade = -1;
	double Final_Exam_Grade = -1;
	// This value must be a number between 0 - 12 in order to for the saved value to be used. 
	// Otherwise put a invalid number to ask for the number during execution.
	int Attendance_Points = -1;
	
	// DO NOT MESS WITH ANYTHING BELOW THIS UNLESS YOU KNOW WHAT YOUR DOING!
	
	// Method to return Exam One Grade.
	public double getExamOneGrade() {
		return Exam_One_Grade;
	}
	
	// Method to return Exam Two Grade.
	public double getExamTwoGrade() {
		return Exam_Two_Grade;
	}
	
	// Method to return Exam Three Grade.
	public double getExamThreeGrade() {
		return Exam_Three_Grade;
	}
	
	// Method to return Exam Four Grade.
	public double getExamFourGrade() {
		return Exam_Four_Grade;
	}
	
	// Method to return Final Exam Grade.
	public double getFinalExamGrade() {
		return Final_Exam_Grade;
	}
	
	// Method to return the Attendance value.
	public int getAttendance() {
		return Attendance_Points;
	}
	

}
