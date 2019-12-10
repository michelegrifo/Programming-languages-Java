import java.awt.*;
import javax.swing.*;

public class JTB extends JFrame{
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JToolBar toolbar;

	public JTB(){
		btn1 = new JButton("ONE");
		btn2 = new JButton("TWO");
		btn3 = new JButton("THREE");
		btn4 = new JButton("FOUR");

		toolbar = new JToolBar(JToolBar.VERTICAL);
		
		toolbar.add(btn1);
		toolbar.addSeparator();
		toolbar.add(btn2);
		toolbar.addSeparator();
		toolbar.add(btn3);
		toolbar.addSeparator();
		toolbar.add(btn4);
		toolbar.addSeparator();
		
		JPanel pan = new JPanel();
		pan.setPreferredSize(new Dimension(300, 300));
		pan.setBackground(Color.WHITE);
		this.getContentPane().add(pan);
		this.getContentPane().add(toolbar, BorderLayout.WEST);

	}
	
	static void createAndShowGUI(){
		JTB f = new JTB();
		f.setTitle("JToolBar example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args){
		createAndShowGUI();
	} 

}