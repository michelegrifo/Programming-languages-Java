import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrameK extends JFrame{
	public MyFrameK(){
		super("KeyAdapter example");
		this.addKeyListener(new KeyAdapter(){
			@Override 
			public void keyTyped(KeyEvent ev){
				char c = ev.getKeyChar();
				if(c != KeyEvent.CHAR_UNDEFINED)
					System.out.print(c);
			}
		});
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args){
		MyFrameK f = new MyFrameK();
	}

}