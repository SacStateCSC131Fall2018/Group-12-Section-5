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

		
		//Upper Layout//
		Container contentPaneUpper = new Container();
		contentPaneUpper.setLayout(new BorderLayout(10,10));
		
		//add Search bar
		SearchBar S_BAR = new SearchBar();
		contentPaneUpper.add(S_BAR,BorderLayout.NORTH);
		
		//add Search result Display
		JTextArea searchResults = new JTextArea();
		searchResults.setEditable(false);
		contentPaneUpper.add(searchResults,BorderLayout.CENTER);
		
		//add search result count
		JLabel numberOfResults = new JLabel("0 Files Found");
		contentPaneUpper.add(numberOfResults,BorderLayout.SOUTH);
		
		
		
		//Lower Layout//
			//file contents used to display selected files contents
		JTextArea fileContents = new JTextArea();
		fileContents.setEditable(false);
		
		//Make text Scrollable
		JScrollPane fileContentsScroll = new JScrollPane(fileContents);
		fileContentsScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);;
		
		//Full page layout//
		this.setLayout(new GridLayout(2,1,10,10));
		this.add(contentPaneUpper);
		this.add(fileContentsScroll);
		
		
	}
}