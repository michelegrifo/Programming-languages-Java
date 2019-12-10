import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MyListener implements ActionListener{
	@Override 
	public void actionPerformed(ActionEvent event){
		JButton b = (JButton) event.getSource();
		JOptionPane.showMessageDialog(null,  b.getText() + " was pressed");
	}
}