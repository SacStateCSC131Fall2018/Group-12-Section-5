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
		JButton B_CLEAR = new JButton("Clear");
		JTextField T_SEARCH = new JTextField();
		JLabel T_DISPLAY = new JLabel("Query: ");

		
		
		this.setLayout(new BorderLayout(20,20));
		//this.setPreferredSize(new Dimension(700,50));
		//this.setMaximumSize(new Dimension(7000,75));
		this.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		this.add(T_DISPLAY, BorderLayout.WEST);
		this.add(T_SEARCH, BorderLayout.CENTER);
		this.add(B_CLEAR, BorderLayout.EAST);
	}
}
