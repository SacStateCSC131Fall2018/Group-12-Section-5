import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoadPage extends JPanel
{
	LoadPage()
	{
		//Create upper section of Load Page//
		
		Container UpperSection = new Container();
		UpperSection.setLayout(new GridLayout(3,1));

		//adds the first bar
		UpperSection.add(new SearchBar("Text File: ", "Browse"),BorderLayout.NORTH);
		
		//adds the second bar
		UpperSection.add(new SearchBar("Text File Type: "),BorderLayout.NORTH);

		//adds the third bar containing the two text fields
		JPanel thirdBarFull =new JPanel();
		thirdBarFull.setLayout(new GridLayout(1,2));
		
		thirdBarFull.add(new SearchBar("Title: "));
		thirdBarFull.add(new SearchBar("Authhor: "));
		thirdBarFull.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		
		UpperSection.add(thirdBarFull);
		
		
		
		
		JPanel LeftButton = new JPanel();
		LeftButton.setLayout(new BorderLayout(10,10));
		
		//initiate the search bar layout 
		LeftButton.setLayout(new BorderLayout(10,10));
		LeftButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		

		//Query label
		JButton B_DISPLAY = new JButton("Process");
		LeftButton.add(B_DISPLAY, BorderLayout.WEST);
		
		JPanel LowerSection = new JPanel();
		LowerSection.setLayout(new BorderLayout(10,10));
		
		LowerSection.add(LeftButton,BorderLayout.NORTH);
		
		//add Text field to show proccess
		JPanel textWrap = new JPanel();
		
		JTextField T_PROCESSLOG = new JTextField();
		
		
		textWrap.setLayout(new BorderLayout());
		textWrap.add(T_PROCESSLOG, BorderLayout.CENTER);
		textWrap.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		LowerSection.add(textWrap, BorderLayout.CENTER);
		/*
		//Lower Section
		Container LowerSection = new Container();
		LowerSection.setLayout(new BorderLayout(10,10));
		
		//button above box
		JPanel leftButtonContainer = new JPanel();
		leftButtonContainer.setLayout(new BoxLayout(leftButtonContainer,BoxLayout.Y_AXIS));
		
		JButton leftButton = new JButton();
		leftButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		
		leftButtonContainer.add(leftButton);
		LowerSection.add(leftButtonContainer,BorderLayout.NORTH);
		*/
		
		this.setLayout(new BorderLayout());
		this.add(UpperSection,BorderLayout.NORTH);
		this.add(LowerSection, BorderLayout.CENTER);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}


	public Container createLabeledTextBox(String searchName)
	{
		Container barContents = new Container();
		//initiate the search bar layout 
		barContents.setLayout(new BorderLayout(20,20));
		
		//Text field
			JTextField T_SEARCH = new JTextField();
			barContents.add(T_SEARCH, BorderLayout.CENTER);
		

		//Query label
		JLabel T_DISPLAY = new JLabel(searchName);
		barContents.add(T_DISPLAY, BorderLayout.WEST);
		return barContents;
	}

}