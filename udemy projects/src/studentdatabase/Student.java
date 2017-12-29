package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentID;
	private String courses="";
	private int tuitionBalance=0;
	private int costOfCourse=600;
	private static int id=1001;
	
	//Constructor:prompt user to enter student details
	public Student() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName=in.next();
		System.out.println("Enter student last name:");
		this.lastName=in.next();
		System.out.println("\n1.Fresher\n2.Sophmore\n3.Junior\n4.Senior\nEnter student grade year:");
		this.gradeYear=in.nextInt();
		in.close();
		setStudentID();
	}
	
	//Generate an ID
	public void setStudentID() {
		id++;
		this.StudentID=gradeYear+""+id;
	}
	
			
	//Enroll in courses
	public void enroll() {
		do {
			System.out.println("Enter course to enroll (Q to quit):");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n"+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}
			else {
				break;
			}
			in.close();
		}while(1 !=0);
	}
			
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is $"+tuitionBalance);
	}
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment $");
		Scanner in =new Scanner(System.in);
		int payment=in.nextInt();
		in.close();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for the payment $"+payment);
		viewBalance();
	}
			
	//View Status
	public void showInfo() {
		System.out.println("Name:"+firstName+" "+lastName);
		System.out.println("Grade Year"+gradeYear);
		System.out.println("Student ID:"+StudentID);
		System.out.println("Courses enrolled:\n"+courses);
		System.out.println("Tuition Balance:$"+tuitionBalance);
	}
	public String toString() {
		return "Name:"+firstName+" "+lastName+"\nGrade Year"+gradeYear+"Student ID"+StudentID+"\nCourses Enrolled:"+courses+"\nBalance:$"+tuitionBalance;
	}
}
