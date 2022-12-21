package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	private static int id = 1000;

	Scanner in = new Scanner(System.in);

	// constructor: prompt user to enter student's name and year
	public Student() {
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}

	// generate an ID
	private void setStudentID() {
		// grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// enroll in courses
	public void enroll() {
		// get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			String course = in.nextLine();

			if (!course.equals("q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				System.out.println("BREAK!");
			}
		} while (1 != 0);

//		System.out.println("ENROLLED AND TUITION BALANCE: ");
//		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}

	// view balance
	public void viewBalance() {
		System.out.println("Your balance is: $");
	}

	// pay tuition

	// show status

}
