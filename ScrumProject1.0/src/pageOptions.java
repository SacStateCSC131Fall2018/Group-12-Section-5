import javax.swing.*;
import java.awt.*;

public class pageOptions extends JPanel{
	pageOptions()
	{
		super();
		setupTabs();
	}

	private void setupTabs() {
		
		Container topBar = new Container();
		topBar.setLayout(new GridLayout(1,3));
		
		JButton B_SEARCH, B_LOAD, B_SUMM;
		B_SEARCH = new JButton("Search for Documents");
		B_LOAD = new JButton("Load Documents");
		B_SUMM = new JButton("Summarize Documents");
		
		topBar.add(B_SEARCH);
		topBar.add(B_LOAD);
		topBar.add(B_SUMM);
		
		this.setLayout(new BorderLayout());
		this.add(topBar,BorderLayout.WEST);
		//this.add(topBar);
	}

}
