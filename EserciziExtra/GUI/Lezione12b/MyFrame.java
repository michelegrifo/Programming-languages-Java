import java.awt.*;
import javax.swing.*;


public class MyFrame extends JFrame{
	private JButton one = new JButton("One");	
	private JButton two = new JButton("Two");
	private JButton three = new JButton("Three");
	private JButton four = new JButton("Four");
	private JButton five = new JButton("Five");
	private MyListener lis = new MyListener();

	public MyFrame(){
		/*
		super("FlowLayout example");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());

		
		*super("GridLayout example");
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3 , 2));
		*/
		
		super("BorderLayout example");
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(one, BorderLayout.NORTH);
		c.add(two, BorderLayout.WEST);
		c.add(three, BorderLayout.CENTER);
		c.add(four, BorderLayout.EAST);
		c.add(five, BorderLayout.SOUTH);

		
		one.addActionListener(lis);
		two.addActionListener(lis);
		three.addActionListener(lis);
		four.addActionListener(lis);
		five.addActionListener(lis);

		this.setSize(300, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args){
		MyFrame f = new MyFrame();
	}
}