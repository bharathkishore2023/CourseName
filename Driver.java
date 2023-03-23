package com.course;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the course id: \n 1.C# 2.Java \n 3.python");
		int courseId=sc.nextInt();
		System.out.println("Enter the course TypeId \n 1.partTime \n 2.onsite");
		int coursetype=sc.nextInt();
		Course c=new Course(courseId,coursetype);
		c.print();
	}
}
