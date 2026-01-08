package tw.brad.apis;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private List<Point> line;
	
	
	public MyDrawer() {
		setBackground(Color.YELLOW);
		
		line = new ArrayList<Point>();
		
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLUE);
		
		for (int i = 1; i< line.size(); i++) {
			Point p1 = line.get(i-1);
			Point p2 = line.get(i);
			g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		}
	}
	
	private class MyListener extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
			Point p = new Point(e.getX(), e.getY());
			line.add(p);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point p = new Point(e.getX(), e.getY());
			line.add(p);
			repaint();
		}
	}
	
	
}




