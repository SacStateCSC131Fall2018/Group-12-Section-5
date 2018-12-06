import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoadPage extends JPanel
{
	LoadPage()
	{
		
		Container UpperSection = new Container();
		UpperSection.setLayout(new GridLayout(3,1));
		Container secondBar = new Container();
		//Container secondBar = new Container();
		
		labeledText(secondBar,"Text File Type: ");
		
		
		UpperSection.add(new SearchBar("Text File: ", "Browse"));
		UpperSection.add(secondBar);
		
		
		//UpperSection.add(new SearchBar("Text File: ", "Browse"));
		//UpperSection.add(new SearchBar("Text File: ", "Browse"));
		
		this.setLayout(new BorderLayout());
		this.add(UpperSection,BorderLayout.NORTH);
		
	}


	public void labeledText(Container barContents,String searchName)
	{
		//initiate the search bar layout 
		barContents.setLayout(new BorderLayout(20,20));
		
		//Text field
			JTextField T_SEARCH = new JTextField();
			barContents.add(T_SEARCH, BorderLayout.CENTER);
		

		//Query label
		JLabel T_DISPLAY = new JLabel(searchName);
		barContents.add(T_DISPLAY, BorderLayout.WEST);
		
	}

}