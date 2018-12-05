import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
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
		
		//tabbed pane for the 3 pages Search load and summarize
		JTabbedPane tabbedPane = new JTabbedPane();
		
		Container contentPane = this.getContentPane();
		
		//Search Page card
		SearchPage card1_SearchDocuments = new SearchPage();
		
		//load Documents card
		//will implement later
		LoadPage card2_LoadDocuments = new LoadPage();
		
		//summarize Documents
		SummPage card3_SummDocuments = new SummPage();
		
		
		
		tabbedPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		tabbedPane.add("Search for Documents",card1_SearchDocuments);
		tabbedPane.add("Load Documents",card2_LoadDocuments);
		tabbedPane.add("Summarize Documents",card3_SummDocuments);
		contentPane.add(tabbedPane);
		
		setUpMenu(this);
		
	}
	
	private void setUpMenu(JFrame frame)
	{
		//This is the menu items and the JmenuItem is the submenu items
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");    
		
			JMenuItem item2 = new JMenuItem("Open");
			fileMenu.add(item2);
			fileMenu.addSeparator();
			
		
			JMenuItem item = new JMenuItem("Export");
			fileMenu.add(item);
			menuBar.add(fileMenu);

		
		JMenu editMenu = new JMenu("Edit");
		
			JMenu authorSubMenu = new JMenu("Author");
				JMenuItem item3 = new JMenuItem("Name");
				authorSubMenu.add(item3);
				
			JMenu opusSubmenu = new JMenu("Opus");
				JMenuItem item4 = new JMenuItem("Add opus");
				opusSubmenu.add(item4);
				JMenuItem item5 = new JMenuItem("Remove opus");
				opusSubmenu.add(item5);
			
			editMenu.add(authorSubMenu);
			editMenu.add(opusSubmenu);
		menuBar.add(editMenu);
		
		
		JMenu optionsMenu = new JMenu("Options");
			JMenuItem item6 = new JMenuItem("Sources");
			optionsMenu.add(item6);
		menuBar.add(optionsMenu);
		
		
		frame.setJMenuBar(menuBar);
	}
	
}
