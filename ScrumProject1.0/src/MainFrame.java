import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;


//this class will be used to build the main frame for the tabs 
public class MainFrame	extends JFrame 
{
	
	
	MainFrame()
	{
		super();
		setUpMainFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setFont(new Font("serif", Font.PLAIN, 30));
	}

	private void setUpMainFrame() 
	{
		
		JTabbedPane tabbedPane = new JTabbedPane();
		this.setTitle("Pirex");
		Container contentPane = this.getContentPane();
		
		
		//Search Page card
		SearchPage card1_SearchDocuments = new SearchPage();
		
		//load Documents card
		//will implement later
		LoadPage card2_LoadDocuments = new LoadPage();
		
		//summarize Documents
		JButton card3_SummDocuments = new JButton("Space holder Need to implement");
		
		tabbedPane.add("Search for Documents",card1_SearchDocuments);
		tabbedPane.add("Load Documents",card2_LoadDocuments);
		tabbedPane.add("Summarize Documents",card3_SummDocuments);
		contentPane.add(tabbedPane);
		
		
	}
}
