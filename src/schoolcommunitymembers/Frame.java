//***************************************************************************
//File: Frame.java
//
//Purpose: The main frame creates a window and mounts the panels to them.
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

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	/******************************************************
	 * STEP 1: Variables
	 * 
	 * Notes: Create outside of class to be able to access
	 * 		  through other functions.
	 ******************************************************/
	
	// Member Variables ::OUTSIDE::
	private Panel m_PanelMain;
	
	// TheFrame Constructor
	public Frame()
	{
		/******************************************
		 * STEP 2: Customize
		 * 
		 * Notes: Panels will use grid layout or
		 * 		  flow layout depending on what is
		 * 		  instructed.
		 ******************************************/
		super("School Community Members");
		setLayout(new GridLayout(1,0));
		setSize(1300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/***********************************************
		 * STEP 3: Initialize
		 * 
		 * Notes: Initialize the Panels. Do this by calling
		 * 		  the Panel constructors.
		 ***********************************************/
		m_PanelMain = new Panel();
	
		/*************************************
		 * STEP 4: add();
		 * 
		 * Notes: Mount the panels on frame.
		 * ***********************************/
		add(m_PanelMain);
		
		/**************************************************
		 * STEP 5: Set Visibility
		 * 
		 * Notes: Let code run everything before setting
		 * 		  the visibility to true. This ensures the
		 * 		  everything was loaded prior to appearing
		 *		  on screen. Can be Used as a method of
		 *		  trouble shooting.
		 **************************************************/		
		
		setVisible(true);
	}
}
