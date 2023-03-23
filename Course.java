package com.course;
public  class Course {
	String courseName;
	String[] courseTypechoice= {"partTime","onsite"};
	String courseType="partTime";
	int Totalfees;
	String CompanyName;
	String courseTiming;
	Course c;
	int courseId;
	public Course(int courseId,int CourseTypeId) {
		this.courseId=courseId;
		courseType=courseTypechoice[CourseTypeId-1];
		setvalues();
	}
	public Course(String CourseType) {
		
	}
	public void print() {
		c.print();
	}
	public void setvalues() {
		if(courseId==1) {
			c=new C_sharp(courseType);
		}
		if(courseId==2) {
			c=new Java(courseType);
		}
		if(courseId==3) {
			c=new Python(courseType);
		}
	}
}
