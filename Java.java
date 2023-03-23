package com.course;

public class Java extends Course {
	String courseName="Java";
	String courseType;
	int fees=4000;
	String CompanyName="ABCD";
	String courseTiming="6pm to 8pm";
public Java(String CourseType) {
	super(CourseType);
	courseType=CourseType;
	}
@Override
public void print() {
	System.out.println("courseName:"+courseName+"\n courseType: "+courseType);
	if(!courseTiming.equals("")) System.out.println("courseTiming:"+courseTiming);
	if(!CompanyName.equals(""))System.out.println("companyname:"+CompanyName);
	System.out.println( "TotalFees:"+getTotalFee());
	}

	public int getTotalFee() {
		int fee=(fees*10)/100;
		if(courseType.equals("onsite")) {
			return fees+fee;
		}
		return fees-fee;
	}
}
