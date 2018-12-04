import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainFrame	extends JFrame 
{
	MainFrame()
	{
		super();
		setUpMainFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setUpMainFrame() 
	{
		this.setTitle("Pirex");
		Container contentPane = this.getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		SearchPage mySPage = new SearchPage();
		mySPage.setBorder(new EmptyBorder(0,10,10,10));
		contentPane.add(mySPage, BorderLayout.CENTER);
		
	}
}
