import java.awt.*;
import javax.swing.*;

public class LoadPage extends JPanel
{
	LoadPage()
	{
		Container UpperSection = new Container();
		UpperSection.setLayout(new GridLayout(3,1));
		
		UpperSection.add(new SearchBar("Text File: ", "Browse"));
		UpperSection.add(new SearchBar("Text File: ", "Browse"));
		UpperSection.add(new SearchBar("Text File: ", "Browse"));
		
		this.setLayout(new BorderLayout());
		this.add(UpperSection,BorderLayout.NORTH);
	}
}