import java.awt.*;
import javax.swing.*;

public class SummPage extends JPanel {
	// This is the constructor for the summary page
	public SummPage() 
	{
		super();
		setupSummPage();
	}
	public void setupSummPage()
	{	
	this.setLayout(new BorderLayout(10,10));
	JTextArea fileContents = new JTextArea();
	fileContents.setEditable(false);

	//Make text Scrollable
	JScrollPane summeryPageSumm = new JScrollPane(fileContents); 
	
	// Modifies the scroll bar..
	summeryPageSumm.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	summeryPageSumm.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	this.add(summeryPageSumm);
	}
}
 
