package ba.bitcamp.homework21.task07;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task07 extends JFrame {

	private static final long serialVersionUID = 7599656446076786632L;

	private int size = 10;
	private JPanel panel = new MyPanel();
	private int coordX;
	private int coordY;
	
	private JSlider slider = new JSlider(0, 100, size);

	public Task07() {

		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				coordX = e.getX();
				coordY = e.getY();
			}
		});

		panel.add(slider);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				size = slider.getValue();
				
			}
		});
		
		add(panel);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 7");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task07();
	}

	private class MyPanel extends JPanel {

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawOval(coordX - size/2, coordY - size/2, size, size);
			repaint();
		}
	}

}
