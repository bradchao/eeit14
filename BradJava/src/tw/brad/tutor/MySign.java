package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.apis.MyDrawer;

public class MySign extends JFrame{
	private MyDrawer myDrawer;
	private JButton clear, undo, redo, color;
	
	public MySign() {
		super("MySign");
		
		myDrawer = new MyDrawer();
		setLayout(new BorderLayout());
		add(myDrawer, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		color = new JButton("Color");
		top.add(clear); top.add(undo);top.add(redo);
		top.add(color);
		add(top, BorderLayout.NORTH);
		
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initEvent();
	}
	
	private void initEvent() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
	}
	
	private void changeColor() {
		Color color = JColorChooser.showDialog(null, "Change Color", myDrawer.getColor());
		if (color != null) {
			myDrawer.changeColor(color);
		}
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}
