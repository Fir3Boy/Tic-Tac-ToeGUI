package TTT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PolygonDraw extends JPanel implements MouseListener{
	public static void main(String[] args) {
		JFrame window = new JFrame("Draw");
		PolygonDraw content = new PolygonDraw();
		window.setContentPane(content);
		window.setLocation(100,100);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
	}
	ArrayList<Integer> x = new ArrayList<Integer>();
	ArrayList<Integer> y = new ArrayList<Integer>();
	
	PolygonDraw(){
		
		setPreferredSize(new Dimension(320,320));
		addMouseListener(this);
		
	}
	public void paintComponent(Graphics g) {
		
		if (x.size()<3 && y.size()<3 ) {
			g.setColor(Color.RED);
			g.drawString("MORE THAN 2", 100, 100);
		}else {
			int[] a = x.stream().mapToInt(Integer::intValue).toArray();
			int[] b = y.stream().mapToInt(Integer::intValue).toArray();
			g.setColor(getBackground());
			g.fillRect(0, 0, 320, 320);
			
			g.setColor(Color.cyan);
			g.fillPolygon(a, b, a.length);
			
			g.setColor(Color.BLACK);
			g.drawPolygon(a, b, a.length);
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int a = e.getX();
		x.add(a);
		int b = e.getY();
		y.add(b);
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
