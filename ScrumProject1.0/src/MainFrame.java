import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

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
		this.setTitle("Pirex");
		Container contentPane = this.getContentPane();
		
		
		//Search For Documents Page
		
		contentPane.setLayout(new BorderLayout());
		SearchPage mySPage = new SearchPage();
		mySPage.setBorder(new EmptyBorder(0,10,10,10));
		contentPane.add(mySPage, BorderLayout.CENTER);
		contentPane.add(new pageOptions(),BorderLayout.NORTH);
		
		//Load Documents Page
		
		
		//Summarize Documents Page
		
	}
}
