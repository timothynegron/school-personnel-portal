//***************************************************************************
//File: Employee.java
//
//Purpose: To create the employee class.
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

public class Employee extends Person
{
	// Attributes
	private String m_deptName;
	private static int m_eID = 0;
	
	// Constructors
	public Employee()
	{
		super();
		m_eID++;
		m_deptName = "None";
	}
	public Employee(String deptName)
	{
		this();
		m_deptName = deptName;
	}
	public Employee(String firstName, String lastName, String deptName)
	{
		this();
		m_deptName = deptName;
		super.setlName(lastName);
		super.setfName(firstName);
	}
	
	// Setters & Getters
	public void setDeptName(String deptName)
	{
		m_deptName = deptName;
	}
	public String getDeptName()
	{
		return m_deptName;
	}
	public int getEmployeeID()
	{
		return m_eID;
	}	
}
