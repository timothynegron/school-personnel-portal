//***************************************************************************
//File: PanelMain.java
//
//Purpose: The main panel file create a class that is designed to construct
//		a JPanel that will contain JTextFields and JButtons and implements
//		the ActionListener interface.
//
//Written By: Timothy Negron
//
//Compilers: Eclipse
//		   
//Update Information
//------------------
//
//***************************************************************************

package schoolcommunitymembers;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener
{
	/******************************************************
	 * STEP 1: Attributes
	 * 
	 * Notes: Create outside of class to be able to access
	 * 		  through other functions.
	 ******************************************************/
	
	//First Row
	private JLabel m_fullNameLBL, m_blankLBL1;
	private TextField m_fNameTF, m_lNameTF;
	
	//Second Row
	private JButton m_facultyBTN;
	private JTextField m_facultyDeptTF,m_facultyCourseTF;//,m_facultyIDTF;
	private JLabel m_blankLBL2;
	
	//Third Row
	private JButton m_staffBTN;
	private JTextField m_staffDeptTF, m_staffDutiesTF;//, m_staffIDTF;
	private JLabel m_blankLBL3;
	
	//Fourth Row
	private JButton m_studentsBTN;
	private JTextField m_matriculantTF, m_studentCourseTF;//, m_studentIDTF;
	private JLabel m_blankLBL4;
	
	//Fifth Row
	private JButton m_createBTN, m_removeBTN, m_updateBTN, m_displayBTN;
	
	//Sixth Row
	private JLabel fNameLBL, lNameLBL, dataLBL, idLBL; //LBL = Label
	
	//Seventh Row
	private JLabel cORdLBL1, cORdLBL2, cORdLBL3, cORdLBL4; //cORd = course or duty
	
	//Other Attributes
	private static int iFac, iStud, iStaff, iGrad, iUnder;
	public Faculty [] FacultyGroup;
	public Students [] StudentGroup;
	public Staff [] StaffGroup;
	public Undergraduate [] undergraduateGroup;
	public Graduate [] graduateGroup;
	public static final String CREATE = "CREATE";
	public static final String REMOVE = "REMOVE";
	public static final String UPDATE = "UPDATE";
	public static final String DISPLAY = "DISPLAY";
	public static final String FDN = "Faculty Department Name";
	public static final String SDN = "Staff Department Name";
	public static final String MS = "Matriculant Status";
	
	//***************************************************************************
	//Method: PanelMain()
	//
	//Purpose: To construct the main panel.
	//			   
	//***************************************************************************
	
	public Panel()
	{
		//New Objects only in Constructors???
		FacultyGroup = new Faculty[100];
		StaffGroup = new Staff[100];
		StudentGroup = new Students[100];
		
		/******************************************
		 * STEP 2: Customize
		 * 
		 * Notes: Panels will use Flow layout
		 * 		unless instructed to use a different
		 * 		kind of layout such as Grid layout.
		 ******************************************/
		
		//Configuring Layout
		setLayout(new GridLayout(7,0));
		
		/***********************************************
		 * STEP 3: Initialize
		 * 
		 * Notes: Create the attributes.
		 ***********************************************/
		
		//Creating First Row
		m_fullNameLBL = new JLabel("             First & Last Name:");
		m_fullNameLBL.setHorizontalAlignment(JLabel.CENTER);
		m_fullNameLBL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_fNameTF = new TextField("First Name");
		m_fNameTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_lNameTF = new TextField("Last Name");
		m_lNameTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_blankLBL1 = new JLabel();
		
		//Creating Second Row
		m_facultyBTN = new JButton("Faculty Member:");
		m_facultyBTN.setHorizontalAlignment(JLabel.RIGHT);
		m_facultyBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_facultyBTN.addActionListener(this);
		m_facultyDeptTF = new JTextField(FDN);
		m_facultyDeptTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_facultyCourseTF = new JTextField("Faculty Course");
		m_facultyCourseTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_blankLBL2 = new JLabel();
		m_facultyCourseTF.setEnabled(false);
		m_facultyDeptTF.setEnabled(false);
		
		//Creating Third Row 
		m_staffBTN = new JButton("Staff Member:");
		m_staffBTN.setHorizontalAlignment(JLabel.RIGHT);
		m_staffBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_staffBTN.addActionListener(this);
		m_staffDeptTF = new JTextField(SDN);
		m_staffDeptTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_staffDutiesTF = new JTextField("Staff Duties");
		m_staffDutiesTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_blankLBL3 = new JLabel();
		m_staffDeptTF.setEnabled(false);
		m_staffDutiesTF.setEnabled(false);
		
		//Creating Fourth Row
		m_studentsBTN = new JButton("Student:");
		m_studentsBTN.setHorizontalAlignment(JLabel.RIGHT);
		m_studentsBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_studentsBTN.addActionListener(this);
		m_matriculantTF = new JTextField(MS);
		m_matriculantTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_studentCourseTF = new JTextField("Student Course");
		m_studentCourseTF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 23));
		m_blankLBL4 = new JLabel();
		m_matriculantTF.setEnabled(false);
		m_studentCourseTF.setEnabled(false);
		
		//Creating Fifth Row
		m_createBTN = new JButton(CREATE);
		m_removeBTN = new JButton(REMOVE);
		m_updateBTN = new JButton(UPDATE);
		m_displayBTN = new JButton(DISPLAY);
		m_createBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_removeBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_updateBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_displayBTN.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		m_createBTN.addActionListener(this);
		m_removeBTN.addActionListener(this);
		m_updateBTN.addActionListener(this);
		m_displayBTN.addActionListener(this);
		
		//Creating Sixth Row
		fNameLBL = new JLabel("First Name");lNameLBL = new JLabel("Last Name");
		dataLBL = new JLabel("Dept or Student Status");idLBL = new JLabel("ID Number"); 
		fNameLBL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		lNameLBL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		dataLBL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		idLBL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		
		//Creating Seventh Row
		cORdLBL1 = new JLabel("Course or Duty");cORdLBL2 = new JLabel("Course or Duty");
		cORdLBL3 = new JLabel("Course or Duty");cORdLBL4 = new JLabel("Course or Duty");
		cORdLBL1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		cORdLBL2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		cORdLBL3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		cORdLBL4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 23));
		
		/*************************************
		 * STEP 4: add();
		 * 
		 * Notes: Mount to panel.
		 * ***********************************/
		
		//Adding First Row
		add(m_fullNameLBL); add(m_fNameTF); add(m_lNameTF); add(m_blankLBL1);
		
		//Adding Second Row
		add(m_facultyBTN); add(m_facultyDeptTF); add(m_facultyCourseTF); add(m_blankLBL2);
		
		//Adding Third Row
		add(m_staffBTN); add(m_staffDeptTF); add(m_staffDutiesTF); add(m_blankLBL3);
		
		//Adding Fourth Row
		add(m_studentsBTN);	add(m_matriculantTF); add(m_studentCourseTF); add(m_blankLBL4);
		
		//Adding Fifth Row
		add(m_createBTN); add(m_removeBTN); add(m_updateBTN); add(m_displayBTN);
		
		//Adding Sixth Row
		add(fNameLBL); add(lNameLBL); add(dataLBL); add(idLBL); add(idLBL);
		
		//Adding Seventh Row
		add(cORdLBL1); add(cORdLBL2); add(cORdLBL3); add(cORdLBL4);
	}
	
	//***************************************************************************
	//Method: actionPerformed()
	//
	//Purpose: To respond to users click on any button displayed on the frame.
	//			   
	//***************************************************************************
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton btnCLICKED = (JButton)e.getSource();
				
		if(btnCLICKED.equals(m_facultyBTN))
		{
			System.out.println("Clicked Faculty");
			m_facultyDeptTF.setEnabled(true);
			m_facultyCourseTF.setEnabled(true);
			othersFalseStaStu();
		}
		else if(btnCLICKED.equals(m_staffBTN))
		{
			System.out.println("Clicked Staff");
			m_staffDeptTF.setEnabled(true);
			m_staffDutiesTF.setEnabled(true);
			othersFalseFacStu();
		}
		else if(btnCLICKED.equals(m_studentsBTN))
		{
			m_studentCourseTF.setEnabled(true);
			m_matriculantTF.setEnabled(true);
			othersFalseFacStaff();
		}
		else if(btnCLICKED.equals(m_createBTN))
		{
			createMethod();
		}
		else if(btnCLICKED.equals(m_removeBTN))
		{

			removeMethod();
		}
		else if(btnCLICKED.equals(m_updateBTN))
		{
			updateMethod();
		}
		else if(btnCLICKED.equals(m_displayBTN))
		{
			displayMethod();
		}
	}
	
	//***************************************************************************
	//Method: createMethod()
	//
	//Purpose: To extract data from JTextFields and insert the data into a group
	// 		array Object.
	//			   
	//***************************************************************************


	public void createMethod()
	{
		//Get data from textfield and assign to new string variable
		String fName = m_fNameTF.getText();
		String lName = m_lNameTF.getText();
		String facultyDept = m_facultyDeptTF.getText();
		String facultyCourse = m_facultyCourseTF.getText();
		String staffDept = m_staffDeptTF.getText();
		String staffDuty = m_staffDutiesTF.getText();
		String studentStatus = m_matriculantTF.getText();
		String studentCourse = m_studentCourseTF.getText();
		
		//Use data from textfield to determine what action to perform
		if(!facultyDept.equals(FDN))
		{
			FacultyGroup[iFac] = new Faculty(fName, lName, facultyDept, facultyCourse);
			iFac++;
			System.out.println("Faculty Member Created");
		}
		else if(!staffDept.equals(SDN))
		{
			StaffGroup[iStaff] = new Staff(fName, lName, staffDept, staffDuty);
			iStaff++;
			System.out.println("Staff Member Created");
		}
		else if(!studentStatus.equals(MS))
		{
//			if(studentStatus == "U")
//			{
//				System.out.println("Undergraduate Student Created");
//				undergraduateGroup[iUnder] = new Ograduate(fName, lName, studentStatus, studentCourse);
//			}
//			else
//			{
//				System.out.println("Graduate Student Created");
//				graduateGroup[iGrad] = new Oundergraduate(fName, lName, studentStatus, studentCourse);
//			}
			StudentGroup[iStud] = new Students(fName, lName, studentStatus, studentCourse);
			iStud++;
			System.out.println("Student Created");
		}
	}
	
	//***************************************************************************
	//Method: removeMethod()
	//
	//Purpose: To extract data from JTextFields and make a decision of weather to
	//		set array object to null.
	//			   
	//***************************************************************************
	
	public void removeMethod()
	{
		//Get data from textfield and assign to new string variable
		String fName = m_fNameTF.getText();
		String lName = m_lNameTF.getText();
		String facultyDept = m_facultyDeptTF.getText();
		String facultyCourse = m_facultyCourseTF.getText();
		String staffDept = m_staffDeptTF.getText();
		String staffDuty = m_staffDutiesTF.getText();
		String studentStatus = m_matriculantTF.getText();
		String studentCourse = m_studentCourseTF.getText();

		//Scan through every Group member and check if equal if equal set to null
		if(!facultyDept.equalsIgnoreCase(FDN))
		{
			for(int check = 0; check < FacultyGroup.length; check++)
			{
				//If equal to null don't enter
				//Which means that the object must have an address
				if(FacultyGroup[check] != null) 
					if(fName.equalsIgnoreCase(FacultyGroup[check].getfName()))
						if(lName.equalsIgnoreCase(FacultyGroup[check].getlName()))
							if(facultyDept.equalsIgnoreCase(FacultyGroup[check].getDeptName()))
							{
								FacultyGroup[check] = null;
								System.out.println("Faculty Member Removed");
							}
			}
		}
		else if(!staffDept.equalsIgnoreCase(SDN))
		{
			for(int check = 0; check < StaffGroup.length; check++)
			{
				if(StaffGroup[check] != null) 
					if(fName.equalsIgnoreCase(StaffGroup[check].getfName()))
						if(lName.equalsIgnoreCase(StaffGroup[check].getlName()))
							if(staffDept.equalsIgnoreCase(StaffGroup[check].getDeptName()))
							{
								StaffGroup[check] = null;
								System.out.println("Staff Member Removed");
							}
						
					
				
			}
		}
		else if(!studentStatus.equalsIgnoreCase(MS))
		{
			for(int check = 0; check < StudentGroup.length; check++)
			{
				if(StudentGroup[check] != null)
					if(fName.equalsIgnoreCase(StudentGroup[check].getfName()))
						if(lName.equalsIgnoreCase(StudentGroup[check].getlName()))
							if(studentStatus.equalsIgnoreCase(StudentGroup[check].getMatriculantStatus()))
							{
								StudentGroup[check] = null;
								System.out.println("Student Removed");
							}
			}
		}
	}
	
	//***************************************************************************
	//Method: updateMethod()
	//
	//Purpose: To extract data from JTextFields and decide from which group does
	//		it need to update information and to update that information.
	//
	//***************************************************************************
	
	public void updateMethod()
	{
		//Get data from textfield and assign to new string variable
		String fName = m_fNameTF.getText();
		String lName = m_lNameTF.getText();
		String facultyDept = m_facultyDeptTF.getText();
		String facultyCourse = m_facultyCourseTF.getText();
		String staffDept = m_staffDeptTF.getText();
		String staffDuty = m_staffDutiesTF.getText();
		String studentStatus = m_matriculantTF.getText();
		String studentCourse = m_studentCourseTF.getText();
		
		//Check every Group and if equal, update information
		if(!facultyDept.equals(FDN))
		{
			for(int check = 0; check < FacultyGroup.length; check++)
			{
				if(FacultyGroup[check] != null)
					if(fName.equalsIgnoreCase(FacultyGroup[check].getfName()))
						if(lName.equalsIgnoreCase(FacultyGroup[check].getlName()))
							if(facultyDept.equalsIgnoreCase(FacultyGroup[check].getDeptName()))
							{
								FacultyGroup[check].setCoursesFaculty(facultyCourse);
								System.out.println("Updated Faculty Member Courses");
							}
			}
		}
		else if(!staffDept.equalsIgnoreCase(SDN))
		{
			for(int check = 0; check < StaffGroup.length; check++)
			{
				if(StaffGroup[check] != null)
					if(fName.equalsIgnoreCase(StaffGroup[check].getfName()))
						if(lName.equalsIgnoreCase(StaffGroup[check].getlName()))
							if(staffDept.equalsIgnoreCase(StaffGroup[check].getDeptName()))
							{
								StaffGroup[check].setdutiesStaff(staffDuty);
								System.out.println("Updated Staff Member Duties");
							}
			}
		}
		else if(!studentStatus.equalsIgnoreCase(MS))
		{
			for(int check = 0; check < StudentGroup.length; check++)
			{
				if(StudentGroup[check] != null)
					if(fName.equalsIgnoreCase(StudentGroup[check].getfName()))
						if(lName.equalsIgnoreCase(StudentGroup[check].getlName()))
							if(studentStatus.equalsIgnoreCase(StudentGroup[check].getMatriculantStatus()))
							{
								StudentGroup[check].setCoursesStudent(studentCourse);
								System.out.println("Updated Student Courses");
							}
			}
		}
	}
	
	//***************************************************************************
	//Method: displayMethod()
	//
	//Purpose: To extract data from JTextFields and determine what information
	//		to display on the JLabels.
	//			   
	//***************************************************************************
	
	public void displayMethod()
	{
		//Get data from textfield and assign to new string variable
		String fName = m_fNameTF.getText();
		String lName = m_lNameTF.getText();
		String facultyDept = m_facultyDeptTF.getText();
		String facultyCourse = m_facultyCourseTF.getText();
		String staffDept = m_staffDeptTF.getText();
		String staffDuty = m_staffDutiesTF.getText();
		String studentStatus = m_matriculantTF.getText();
		String studentCourse = m_studentCourseTF.getText();
		
		//Check group and if equal set text of display label
		if(!facultyDept.equals(FDN))
		{
			for(int check = 0; check < FacultyGroup.length; check++)
			{
				//If equal to null don't enter
				//Which means that the object must have an address
				if(FacultyGroup[check] != null) 
					if(fName.equalsIgnoreCase(FacultyGroup[check].getfName())) 
						if(lName.equalsIgnoreCase(FacultyGroup[check].getlName())) 
							if(facultyDept.equalsIgnoreCase(FacultyGroup[check].getDeptName()))
							{

								String [] c = FacultyGroup[check].getCoursesFaculty();
							
								fNameLBL.setText(FacultyGroup[check].getfName());
								lNameLBL.setText(FacultyGroup[check].getlName());
								dataLBL.setText(FacultyGroup[check].getDeptName());
								idLBL.setText(Integer.toString(FacultyGroup[check].getEmployeeID()));
								cORdLBL1.setText(c[0]);
								cORdLBL2.setText(c[1]);
								cORdLBL3.setText(c[2]);
								cORdLBL4.setText(c[3]);
								
								System.out.println("Displaying Faculty Member");
							}
			}
		}
		else if(!staffDept.equals(SDN))
		{
		
			for(int check = 0; check < StaffGroup.length; check++)
			{
				if(StaffGroup[check] != null)
					if(fName.equals(StaffGroup[check].getfName()))
						if(lName.equals(StaffGroup[check].getlName()))
							if(staffDept.equals(StaffGroup[check].getDeptName()))
							{						
								String [] c = StaffGroup[check].getdutiesStaff();
						
								fNameLBL.setText(StaffGroup[check].getfName());
								lNameLBL.setText(StaffGroup[check].getlName());
								dataLBL.setText(StaffGroup[check].getDeptName());
								idLBL.setText(Integer.toString(StaffGroup[check].getEmployeeID()));
								cORdLBL1.setText(c[0]);
								cORdLBL2.setText(c[1]);
								cORdLBL3.setText(c[2]);
								cORdLBL4.setText(c[3]);
								
								System.out.println("Displaying Staff Member");
							}
			}
		}
		else if(!studentStatus.equals(MS))
		{
			for(int check = 0; check < StudentGroup.length; check++)
			{
				if(StudentGroup[check] != null)
					if(fName.equals(StudentGroup[check].getfName()))
						if(lName.equals(StudentGroup[check].getlName()))
							if(studentStatus.equals(StudentGroup[check].getMatriculantStatus()))
							{
								String [] c = StudentGroup[check].getCoursesStudent();
							
								fNameLBL.setText(StudentGroup[check].getfName());
								lNameLBL.setText(StudentGroup[check].getlName());
								dataLBL.setText(StudentGroup[check].getMatriculantStatus());
								idLBL.setText(Integer.toString(StudentGroup[check].getStudentID()));
								cORdLBL1.setText(c[0]);
								cORdLBL2.setText(c[1]);
								cORdLBL3.setText(c[2]);
								cORdLBL4.setText(c[3]);
								
								System.out.println("Displaying Student");
							}
			}
		}
	}
	
	//***************************************************************************
	//Method: othersFalseStaStu()
	//
	//Purpose: Sets other JTextfields to null. Also resets the text of the other
	//		JTextFields. This helps ensure the create, remove, update, and display
	//		buttons function properly.
	//			   
	//***************************************************************************
	
	public void othersFalseStaStu()
	{
		//Staff Fields
		m_staffDeptTF.setEnabled(false);
		m_staffDutiesTF.setEnabled(false);
		m_staffDeptTF.setText(SDN);
		m_staffDutiesTF.setText("Staff Duties");
		
		//Student Fields
		m_matriculantTF.setEnabled(false);
		m_studentCourseTF.setEnabled(false);
		m_matriculantTF.setText(MS);
		m_studentCourseTF.setText("Student Course");
	}
	
	//***************************************************************************
	//Method: othersFalseFacStu()
	//
	//Purpose: Sets other JTextfields to null. Also resets the text of the other
	//		JTextFields. This helps ensure the create, remove, update, and display
	//		buttons function properly.
	//			   
	//***************************************************************************
	
	public void othersFalseFacStu()
	{
		//Faculty Fields
		m_facultyDeptTF.setEnabled(false);
		m_facultyCourseTF.setEnabled(false);
		m_facultyDeptTF.setText(FDN);
		m_facultyCourseTF.setText("Faculty Course");
		
		//Student Fields
		m_matriculantTF.setEnabled(false);
		m_studentCourseTF.setEnabled(false);
		m_matriculantTF.setText(MS);
		m_studentCourseTF.setText("Student Course");
	}
	
	//***************************************************************************
	//Method: othersFalseFacStaff()
	//
	//Purpose: Sets other JTextfields to null. Also resets the text of the other
	//		JTextFields. This helps ensure the create, remove, update, and display
	//		buttons function properly.
	//
	//***************************************************************************
	
	public void othersFalseFacStaff()
	{
		//Faculty Fields
		m_facultyDeptTF.setEnabled(false);
		m_facultyCourseTF.setEnabled(false);
		m_facultyDeptTF.setText(FDN);
		m_facultyCourseTF.setText("Faculty Course");
		
		//Staff Fields
		m_staffDeptTF.setEnabled(false);
		m_staffDutiesTF.setEnabled(false);
		m_staffDeptTF.setText(SDN);
		m_staffDutiesTF.setText("Staff Duties");
	}
}