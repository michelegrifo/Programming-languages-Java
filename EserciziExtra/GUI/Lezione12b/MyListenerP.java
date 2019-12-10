import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MyListenerP implements ActionListener{
	private MyFrameP window;
	
	public MyListenerP(MyFrameP window){
		this.window = window;
	}

	public void actionPerformed(ActionEvent event){
		JPasswordField text = window.getPasswordField();
		JOptionPane.showMessageDialog(null, new String(text.getPassword()));
	}

	

}