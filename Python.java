package com.course;

public class Python extends Course {
	String courseName="Python";
	String courseType;
	int fees=6000;
	String CompanyName="";
	String courseTiming;
public Python(String CourseType) {
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
