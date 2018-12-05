import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu extends JFrame
{
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem mi;


public Menu(JFrame frame)
{
    //super(title);
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    buildMenu();
}

void buildMenu()
{
		   menu = new JMenu("File");

           mi = new JMenuItem("New");
           menu.add(mi);
           menuBar.add(menu);

     /*      mi = new JMenuItem("List Files");
           menu.add(mi);
           menubar.add(menu);
           menu.addSeparator();

           mi = new JMenuItem("Save As");
           menu.add(mi);
           menubar.add(menu);
           menu.addSeparator();

           mi = new JMenuItem("Close");
           menu.add(mi);
           menubar.add(menu);

    	   menu = new JMenu("Tools");

           mi = new JMenuItem("Sort");
           menu.add(mi);
           menubar.add(menu);

           mi = new JMenuItem("Search");
           menu.add(mi);
           menubar.add(menu);

           mi = new JMenuItem("Edit");
           menu.add(mi);
           menubar.add(menu);
           mi = new JMenuItem("Copy");
           menu.add(mi);
           menubar.add(menu);
           mi = new JMenuItem("Paste");
           menu.add(mi);
           menubar.add(menu);
           */
}
}