package TTT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickChess extends JPanel implements MouseListener {
	int selectedRow;
	int selectedCol;
	int xdim = 40;
	int ydim = 40;
	public static void main(String[] args) {
		JFrame window = new JFrame("Chess");
		ClickChess content = new ClickChess();
		window.setContentPane(content);
		window.pack();
		window.setLocation(100, 100);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setVisible(true);
	}
	ClickChess(){
		selectedRow = -1;
		addMouseListener(this);
		setPreferredSize(new Dimension(xdim*8,ydim*8));
		
		
	}
	public void paintComponent(Graphics g) {
		int col, row;
		int x,y;
		for ( row=0; row<8; row++) {
			for ( col=0; col<8; col++) {
				x=row*40;
				y=col*40;
				if (col%2 == row%2 ) {
					g.setColor(Color.WHITE);
				}else {
					g.setColor(Color.BLACK);
				}
				g.fillRect(x, y, xdim, ydim);
			}
		}
		if (selectedCol>=0) {
//			x = (int)selectedCol * xdim;
//			y = (int)selectedRow * ydim;
//			g.setColor(Color.cyan);
//			g.drawRect(x, y, xdim, ydim);
//			g.drawRect(x, y, xdim-1, ydim-1);
//            g.drawRect(x+1, y+1, xdim-3, ydim-3);
//            g.drawRect(x+2, y+2, xdim-5, ydim-5);
			  g.setColor(Color.CYAN);
	            y = selectedRow * 40;
	            x = selectedCol * 40;
	            //System.out.println(x,y);
	            g.drawRect(x, y, 39, 39);
	            g.drawRect(x+1, y+1, 37, 37);
	            g.drawRect(x+2, y+2, 35, 35);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int col = e.getX() / xdim;
		int row = e.getY() / ydim;
		if (row==selectedRow && col==selectedCol) {
			selectedCol=-1;
		}else {
			selectedRow=row;
			selectedCol=col;
		}
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
