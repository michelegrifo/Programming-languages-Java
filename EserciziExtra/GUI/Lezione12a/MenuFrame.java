import java.awt.*;
import javax.swing.*;

public class MenuFrame extends JFrame{
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu1 = new JMenu("First menu");
	private JMenu menu2 = new JMenu("Other menu");
	private JMenu submenu = new JMenu("A submenu");
	private JMenuItem voiceMenu1 = new JMenuItem("First voice of menu");
	private JMenuItem voiceMenu2 = new JMenuItem("Second voice of menu");
	private JMenuItem voiceMenu3 = new JMenuItem("Voice of submenu");


	public MenuFrame(){
		super("MenuBar example");
		Container c = getContentPane();
		c.add(menuBar);
		menu1.add(voiceMenu1);
		menu2.add(voiceMenu2);
		submenu.add(voiceMenu3);
		menu2.add(submenu);

		menuBar.add(menu1);
		menuBar.add(menu2);

		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args){
		MenuFrame m = new MenuFrame();
	}
}