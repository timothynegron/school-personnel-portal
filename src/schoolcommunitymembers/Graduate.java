//***************************************************************************
//File: Graduate.java
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

public class Graduate extends Students
{
	public Graduate()
	{
		super();
	}
	public Graduate(String fName, String lName, String status, String courseStudent)
	{
		this();
		super.setfName(fName);
		super.setlName(lName);
		super.setMatriculantStatus(status);
		super.setCoursesStudent(courseStudent);
	}
}
