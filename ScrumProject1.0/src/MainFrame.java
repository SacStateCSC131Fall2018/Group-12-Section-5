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
		Container contentPane = this.getContentPane();
		
		
		//Search Page card
		SearchPage card1_SearchDocuments = new SearchPage();
		
		//load Documents card
		//will impliment later
		JButton card2_LoadDocuments = new JButton();
		
		//summarize Documents
		//needs to be implemented
		JButton card3_SummDocuments = new JButton();
		
		tabbedPane.add("Search for Documents",card1_SearchDocuments);
		tabbedPane.add("Load Documents",card2_LoadDocuments);
		tabbedPane.add("Summarize Documents",card3_SummDocuments);
		this.add(tabbedPane);
		
		/*
		this.setTitle("Pirex");
		Container contentPane = this.getContentPane();
		
		//listens for tab presses
		lowerDisplay myDisplay = new lowerDisplay();
		
		contentPane.setLayout(new BorderLayout());
		
		myDisplay.setBorder(new EmptyBorder(0,10,10,10));
		contentPane.add(myDisplay, BorderLayout.CENTER);
		contentPane.add(new pageOptions(myDisplay),BorderLayout.NORTH);
		
		//Load Documents Page
		
		
		//Summarize Documents Page
		*/
		
		
	}
}
