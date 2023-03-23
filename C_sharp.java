package com.course;

public class C_sharp extends Course {
	String courseName="c#";
	String courseType="";
	int fees=5000;
	String CompanyName="";
	String courseTiming="10 am to 12 pm";
	public C_sharp(String CourseType) {
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
