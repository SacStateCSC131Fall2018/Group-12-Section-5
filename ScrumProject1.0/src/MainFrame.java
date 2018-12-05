import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


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
	
	
	private void setUpIcon(JFrame frame)
	{
		File jpegFile = new File("comm.png");
		BufferedImage image = null;
		
		try {
			image = ImageIO.read(jpegFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		frame.setIconImage(image);
		frame.setBackground(Color.blue);
		frame.setTitle("PIREX");
	}

	private void setUpMainFrame() 
	{
		setUpIcon(this);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		Container contentPane = this.getContentPane();
		
		//Search Page card
		SearchPage card1_SearchDocuments = new SearchPage();
		
		//load Documents card
		//will implement later
		LoadPage card2_LoadDocuments = new LoadPage();
		
		//summarize Documents
		SummPage card3_SummDocuments = new SummPage();
		
		tabbedPane.add("Search for Documents",card1_SearchDocuments);
		tabbedPane.add("Load Documents",card2_LoadDocuments);
		tabbedPane.add("Summarize Documents",card3_SummDocuments);
		contentPane.add(tabbedPane);
		
		
	}
}
