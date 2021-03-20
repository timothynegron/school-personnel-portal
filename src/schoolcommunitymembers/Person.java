//***************************************************************************
//File: Person.java
//
//Purpose: To create the person class.
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

public class Person 
{
	// Attributes
	private String m_firstName;
	private String m_lastName;
	
	// Constructors
	public Person()
	{
		m_firstName = "None";
		m_lastName = "None";
	}
	public Person(String firstName, String lastName)
	{
		this();
		m_firstName = firstName;
		m_lastName = lastName;
	}
	
	// Setters & Getters
	public void setfName(String fName)
	{
		m_firstName = fName;
	}
	public void setlName(String lName)
	{
		m_lastName = lName;
	}
	public String getfName()
	{
		return m_firstName;
	}
	public String getlName()
	{
		return m_lastName;
	}
}
