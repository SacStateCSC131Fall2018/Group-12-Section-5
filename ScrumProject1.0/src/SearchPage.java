import java.awt.*;
import javax.swing.*;

public class SearchPage extends JPanel 
{
	public SearchPage() 
	{
		super();
		setUpSearchWindow();
	}

	private void setUpSearchWindow() 
	{
		Container contentPaneUpper;//contentPaneLower;
		
		setSize(500,500);
		
		contentPaneUpper = new Container();
		contentPaneUpper.setLayout(new BorderLayout(10,10));
		
		//contentPaneLower = getContentPane();
		this.setLayout(new GridLayout(2,1,10,10));
		
		SearchBar S_BAR = new SearchBar();
		contentPaneUpper.add(S_BAR,BorderLayout.NORTH);
		contentPaneUpper.add(new JTextArea(),BorderLayout.CENTER);
		contentPaneUpper.add(new JLabel("0 Files Found"),BorderLayout.SOUTH); 
		
		this.add(contentPaneUpper);//,BorderLayout.NORTH);
		this.add(new JTextField());//,BorderLayout.SOUTH);
		
		
	}
}