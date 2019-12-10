import java.awt.*;
import javax.swing.*;

class FirstGUI extends JFrame{
	private JPanel pan = new JPanel();
	private JLabel l1 = new JLabel("Label");
	private JButton b1 = new JButton("Button");
	private JCheckBox cb1 = new JCheckBox("Check");
	private JRadioButton r1 = new JRadioButton("Radio");
	private JTextField t1 = new JTextField("Text");

	public FirstGUI(){
    	super ("Window");
    	Container c = this.getContentPane();
    	c.add(pan);
		pan.add(l1);
		pan.add(b1);
		pan.add(cb1);
		pan.add(r1);
		pan.add(t1);
	
    	this.setSize(200, 200);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
	}

	public static void main(String[] args){
		FirstGUI f = new FirstGUI();
	}
}
