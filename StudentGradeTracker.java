package studentgradetracker;

import java.util.Scanner;

public class StudentGradeTracker {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numStudents = scanner.nextInt();

	        //arrays to store student names and grades
	        String[] studentNames = new String[numStudents];
	        int[] studentGrades = new int[numStudents];

	        for (int i = 0; i < numStudents; i++) {
	            System.out.print("Enter name for student " + (i + 1) + ": ");
	            studentNames[i] = scanner.next();
	            System.out.print("Enter grade for " + studentNames[i] + ": ");
	            studentGrades[i] = scanner.nextInt();
	        }

	        // Calculate average, highest, and lowest grades
	        int sum = 0;
	        int highestGrade = Integer.MIN_VALUE;
	        int lowestGrade = Integer.MAX_VALUE;

	        for (int grade : studentGrades) {
	            sum += grade;
	            if (grade > highestGrade) {
	                highestGrade = grade;
	            }
	            if (grade < lowestGrade) {
	                lowestGrade = grade;
	            }
	        }

	        double averageGrade = (double) sum / numStudents;

	        //displays the result
	        System.out.println("\nGrades Summary:");
	        System.out.println("Average Grade: " + averageGrade);
	        System.out.println("Highest Grade: " + highestGrade);
	        System.out.println("Lowest Grade: " + lowestGrade);

	        scanner.close();
	    }
	}
	
