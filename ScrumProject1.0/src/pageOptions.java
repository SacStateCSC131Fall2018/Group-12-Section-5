import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class pageOptions extends JPanel
{
	private ActionListener listener;
	
	pageOptions()
	{
		super();
		setupTabs();
	}

	private void setupTabs() 
	{
		
		Container topBar = new Container();
		topBar.setLayout(new GridLayout(1,3));
		
		JButton B_SEARCH, B_LOAD, B_SUMM;
		B_SEARCH = new JButton("Search for Documents");
		B_SEARCH.addActionListener(listener);
		
		B_LOAD = new JButton("Load Documents");
		B_LOAD.addActionListener(listener);
		
		B_SUMM = new JButton("Summarize Documents");
		B_SUMM.addActionListener(listener);
		
		topBar.add(B_SEARCH);
		topBar.add(B_LOAD);
		topBar.add(B_SUMM);
		
		this.setLayout(new BorderLayout());
		this.add(topBar,BorderLayout.WEST);
		//this.add(topBar);
	}

}
