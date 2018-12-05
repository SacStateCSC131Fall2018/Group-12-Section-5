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
		//setUpMenu(this);
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
		
		setUpMenu(this);
		
	}
	
	private void setUpMenu(JFrame frame)
	{
		//Menu menu = new Menu(frame);
		//Container c1 = new Container();
		//c1.add(menu);
		//frame.add(c1);
		
		JMenuBar menuBar = new JMenuBar();

		// Edit Menu
		JMenu fileMenu = new JMenu("File");    
		
			JMenuItem item = new JMenuItem("New");
			fileMenu.add(item);
			fileMenu.addSeparator();
			
			JMenuItem item2 = new JMenuItem("Open");
			fileMenu.add(item2);
			fileMenu.addSeparator();
			
		
			menuBar.add(fileMenu);

		
		
		
		
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
		
		JMenu optionsMenu = new JMenu("Options");
		menuBar.add(optionsMenu);
		
		frame.setJMenuBar(menuBar);
	}
}
