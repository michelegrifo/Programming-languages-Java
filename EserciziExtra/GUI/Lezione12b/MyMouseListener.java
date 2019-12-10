import java.awt.event.*;

public class MyMouseListener implements MouseListener{
	@Override 
	public void mouseClicked(MouseEvent e){
		System.out.println("Clicked on ("+e.getX() + "," + e.getY() +")");
	}

	@Override
	public void mousePressed(MouseEvent e){
		System.out.println("Pressed on ("+ e.getX() + "," + e.getY() +")");
	}

	@Override
	public void mouseReleased(MouseEvent e){
		System.out.println("Released on("+ e.getX() + "," + e.getY() +")");
	}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseExited(MouseEvent e){}

}