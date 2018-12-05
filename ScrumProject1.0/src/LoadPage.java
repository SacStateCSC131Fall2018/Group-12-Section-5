import java.awt.*;
import javax.swing.*;

public class LoadPage extends JPanel
{
	LoadPage()
	{
		
		Container UpperSection = new Container();
		UpperSection.setLayout(new GridLayout(3,1));
		
	    UpperSection.add(new SearchBar("Text File: ", "Browse"));
	  
	    
	    Container pane = new Container();
	    pane.setLayout(new BorderLayout(10,10));
	    
	    pane.add(new Button("Left"), BorderLayout.WEST);
	    
	    pane.add(new Button("Center"), BorderLayout.CENTER);
	    
	    
	    UpperSection.add(pane);
	    
	    
	    
	    
	    
	    
	    //UpperSection.setLayout(border); //border layout for the container
	    //UpperSection.add(new testPanel, BorderLayout.CENTER);
	  
	//	UpperSection.add(new SearchBar("Text File: ", "Browse"));
		
		this.setLayout(new BorderLayout());
		this.add(UpperSection,BorderLayout.NORTH);
		
	}
}