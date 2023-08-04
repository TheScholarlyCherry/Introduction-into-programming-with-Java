package cps161_LU10;
import java.util.Scanner;
public class GradeBookPractice {
	private double [][] grades;
	private double [] studentAv;
	private double [] quizAv;
	private String [] studentName;
	private int numbOfStudents;
	private int numbOfQuiz;
	public static Scanner scan = new Scanner(System.in);
	public GradeBookPractice() {
		System.out.println("Enter number of students: ");
		numbOfStudents = scan.nextInt();
		System.out.println("Enter number of quizzes: ");
		numbOfQuiz = scan.nextInt();
		scan.nextLine();
		grades = new double [numbOfStudents][numbOfQuiz];
		studentAv = new double [numbOfStudents];
		quizAv = new double [numbOfQuiz];
		studentName = new String[numbOfStudents];
		fillGrades();
	}
	
	public void fillGrades() {
		for(int i = 0; i<numbOfStudents; i++) {
			System.out.println("Enter student name: ");
			studentName[i] = scan.nextLine();
			for(int j = 0; j<numbOfQuiz; j++) {
				System.out.println("Enter grade for quiz: " + (j + 1));
				grades[i][j] = scan.nextDouble();
			}
			scan.nextLine();
		}
	}
	
	public void fillStudentAverage() {
		double sum;
		double average;
		for (int i = 0; i<numbOfStudents; i++) {
			sum = 0;
			for(int j = 0; j<numbOfQuiz; j++) {
				sum = sum + grades[i][j];
			}
			average = sum / numbOfQuiz;
			studentAv[i] = average;
		}
	}
	
	public void fillQuizAverage() {
		double sum = 0;
		double average;
		for(int i = 0; i < numbOfQuiz; i++) {
			sum = 0;
			for(int j = 0; j < numbOfStudents; j++) {
				sum = sum + grades[j][i];
			}
			average = sum / numbOfStudents;
			quizAv[i] = average;
		}
	}
	
	public void display() {
		for(int i=0; i<numbOfStudents; i++) {
			for(int j = 0; j<numbOfQuiz; j++) {
			System.out.print(grades[i][j]+ " ");
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeBookPractice myBook = new GradeBookPractice();
		myBook.display();
	}

}
