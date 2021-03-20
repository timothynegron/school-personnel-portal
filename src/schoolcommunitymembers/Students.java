//***************************************************************************
//File: Students.java
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

public class Students extends Person
{
	// Attributes
	public static final int MAX_NUM_COURSES = 4;
	private static int sID = 0;
	private String m_matriculantStatus;
	private String m_coursesStudents[]= new String[MAX_NUM_COURSES];;
	
	// Constructors
	public Students()
	{
		super();
		sID++;
		m_matriculantStatus = "None";
		for(int i = 0; i < MAX_NUM_COURSES; i++)
		{
			m_coursesStudents[i] = "Available Slot";
		}
	}
	public Students(String fName, String lName, String matriculantStatus, String course)
	{
		this();
		m_matriculantStatus = matriculantStatus;
		m_coursesStudents[0] = course;
		super.setfName(fName);
		super.setlName(lName);
	}
	
	
	// Setters & Getters
	public void setMatriculantStatus(String status)
	{
		m_matriculantStatus = status;
	}
	public void setCoursesStudent(String courseStudent)
	{
		for(int i = 0; i < MAX_NUM_COURSES; i++)
		{
			if(m_coursesStudents[i] == "Available Slot")
			{
				m_coursesStudents[i] = courseStudent;
				break;
			}
			else
			{
				System.out.println("No Slots Available");
			}
		}
	}
	public String[] getCoursesStudent()
	{
		return m_coursesStudents;
	}
	public String getMatriculantStatus()
	{
		return m_matriculantStatus;
	}
	public int getStudentID()
	{
		return sID;
	}
}
