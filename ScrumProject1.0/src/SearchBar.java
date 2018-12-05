import java.awt.*;
import java.awt.event.*;
import java.util.jar.Attributes.Name;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SearchBar extends JPanel 
{
	private ActionListener listener;

	//constructor
	public SearchBar() 
	{
		super();
		setupSearchBar("Query: ", "Clear");
	}
	public SearchBar(String Name, String ButtonToClear) 
	{
		super();
		setupSearchBar(Name,ButtonToClear);
	}

	private void setupSearchBar(String searchName,String ButtonToClear ) 
	{

		
		//initiate the search bar layout 
		this.setLayout(new BorderLayout(20,20));
		this.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		
		//Text field
			JTextField T_SEARCH = new JTextField();
			T_SEARCH.addActionListener(listener);
			this.add(T_SEARCH, BorderLayout.CENTER);
				
				
		//Clear button needs to be able implemented 
		JButton B_CLEAR = new JButton(ButtonToClear);
		this.add(B_CLEAR, BorderLayout.EAST);
		B_CLEAR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				T_SEARCH.setText("");
			}

		});
		

		//Query label
		JLabel T_DISPLAY = new JLabel(searchName);
		this.add(T_DISPLAY, BorderLayout.WEST);
		
		
	}
}
