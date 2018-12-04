import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SearchBar extends JPanel 
{
	//constructor
	public SearchBar() 
	{
		super();
		setupSearchBar();
	}

	private void setupSearchBar() {
		
		//initiate the search bar layout 
		this.setLayout(new BorderLayout(20,20));
		this.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		
		//Clear button needs to be able implemented 
		JButton B_CLEAR = new JButton("Clear");
		this.add(B_CLEAR, BorderLayout.EAST);
		
		//Text field
		JTextField T_SEARCH = new JTextField();
		this.add(T_SEARCH, BorderLayout.CENTER);
		
		//Query label
		JLabel T_DISPLAY = new JLabel("Query: ");
		this.add(T_DISPLAY, BorderLayout.WEST);
		
		
		
	}
}
