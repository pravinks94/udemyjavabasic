 package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String args[]) {
		Student s1=new Student();
		
		System.out.println(s1.toString());
		//Ask how many users we want to add
	
		//Create n number of new students
		System.out.println("Enter number of students to enroll:");
		Scanner in =new Scanner(System.in);
		int numOfStud=in.nextInt();
		Student[] stud=new Student[numOfStud];
		for(int i=0;i<numOfStud;i++) {
			stud[i].enroll();
			stud[i].payTuition();
			stud[i].viewBalance();
			
		}
		for(int n=0;n<stud.length;n++) {
			stud[n].showInfo();
		}
	}

}
