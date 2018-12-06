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

		//adds the first bar
		UpperSection.add(new SearchBar("Text File: ", "Browse"),BorderLayout.NORTH);
		
		//adds the second bar
		UpperSection.add(new SearchBar("Text File: "),BorderLayout.NORTH);

		//adds the third bar containing the two text fields
		Container thirdBarFull =new Container();
		thirdBarFull.setLayout(new GridLayout(1,2));
		thirdBarFull.add(new SearchBar("Text File: "));
		thirdBarFull.add(new SearchBar("Text File: "));
	  
		UpperSection.add(thirdBarFull);
		
		this.setLayout(new BorderLayout());
		this.add(UpperSection,BorderLayout.NORTH);
		
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