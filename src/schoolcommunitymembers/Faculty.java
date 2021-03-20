//***************************************************************************
//File: Faculty.java
//
//Purpose: To create the faculty class.
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

public class Faculty extends Employee
{
	// Attributes
	public static final int MAX_NUM_COURSES = 4;
	public String m_coursesFaculty[] = new String[MAX_NUM_COURSES];
	
	// Constructors
	public Faculty()
	{
		super();
		m_coursesFaculty[0] = "Available Slot";
		m_coursesFaculty[1] = "Available Slot";
		m_coursesFaculty[2] = "Available Slot";
		m_coursesFaculty[3] = "Available Slot";
	}
	public Faculty(String m_coursesFaculty[])
	{
		this();
		m_coursesFaculty[0] = m_coursesFaculty[0];
	}
	public Faculty(String fName, String lName, String deptName, String course)
	{
		this();
		super.setDeptName(deptName);
		super.setfName(fName);
		super.setlName(lName);
		m_coursesFaculty[0] = course;
	}
	
	// Setters & Getters
	public void setCoursesFaculty(String courseFaculty)
	{
		for(int i = 0; i < MAX_NUM_COURSES; i++)
		{
			if(m_coursesFaculty[i] == "Available Slot")
			{
				m_coursesFaculty[i] = courseFaculty;
				break;
			}
			else
			{
				System.out.println("No Slots Available");
			}
		}
	}
	public String[] getCoursesFaculty()
	{
		return m_coursesFaculty;
	}
}
