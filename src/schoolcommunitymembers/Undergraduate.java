//***************************************************************************
//File: Undergraduate.java
//
//Purpose: To create the student class.
//
//Written By: Timothy Negron
//
//Compilers: Eclipse
//		   
//Update Information
//------------------
//
//****************************************************************************

package schoolcommunitymembers;

public class Undergraduate extends Students
{
	public Undergraduate()
	{
		super();
	}
	public Undergraduate(String fName, String lName, String status, String courseStudent)
	{
		this();
		super.setfName(fName);
		super.setlName(lName);
		super.setMatriculantStatus(status);
		super.setCoursesStudent(courseStudent);
	}
}
