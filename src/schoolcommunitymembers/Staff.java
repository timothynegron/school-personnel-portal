//***************************************************************************
//File: Staff.java
//
//Purpose: To create the staff class.
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

public class Staff extends Employee
{
	// Attributes
	private String m_duties[] = new String[4];;
	
	// Constructors
	public Staff()
	{
		super();
		m_duties[0] = "None";
		m_duties[1] = "None";
		m_duties[2] = "None";
		m_duties[3] = "None";
	}
	public Staff(String fName, String lName, String deptName, String duty)
	{
		this();
		super.setfName(fName);
		super.setlName(lName);
		super.setDeptName(deptName);
		m_duties[0] = duty;
	}
	
	// Setters & Getters
	public void setdutiesStaff(String duty)
	{
		for(int i = 0; i < 4; i++)
		{
			if(m_duties[i] == "None")
			{
				m_duties[i] = duty;
				break;
			}
		}
	}
	public String[] getdutiesStaff()
	{
		return m_duties;
	}
}