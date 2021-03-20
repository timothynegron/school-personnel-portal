//***************************************************************************
//File: Tester.java
//
//Purpose: To run main. Create the interface.
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

import javax.swing.SwingUtilities;

public class Tester
{

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new Frame();
			}
		});
	}
}
