import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameP extends JFrame{
	private JPanel center = new JPanel();
	private JPanel south = new JPanel();
	private JPasswordField t1 = new JPasswordField(20);
	private JButton b1 = new JButton("Show password");

	public JPasswordField getPasswordField(){
		return this.t1;
	}

	public MyFrameP(){
		super("Listener with builder");
		Container c = this.getContentPane();

		center.add(t1);
		/*b1.addActionListener(new MyListenerP(this)); injection*/
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				JOptionPane.showMessageDialog(null, new String (t1.getPassword()));
			}
		});
		
		south.add(b1);
		c.add(center, BorderLayout.CENTER);
		c.add(south, BorderLayout.SOUTH);

		setSize(300, 100);
		this.setLocationRelativeTo(null);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		MyFrameP f = new MyFrameP();
	}
}