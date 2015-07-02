package ba.bitcamp.w07d01.lectures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private static final long serialVersionUID = 8116418407672994835L;

	private PointArray points;
	private Color activeColor;
	private int pointSize = Point.FIRST;

	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK };

	private static int[] pointsSize = new int[] { Point.FIRST, Point.SECOND,
			Point.THIRD };

	public PaintPanel(int height, int width) {

		super();

		points = new PointArray();
		setSize(width, height);
		setBackground(Color.WHITE);

		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);

			color.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];

				}
			});
			add(color);
			addMouseMotionListener(new MouseHandler());
		}

		for (int i = 0; i < pointsSize.length; i++) {
			JButton sizes = new JButton("Size "
					+ Integer.toString(pointsSize[i]));
			sizes.setName(Integer.toString(i));

			sizes.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					String label = clicked.getName();
					int index = Integer.parseInt(label);
					pointSize = pointsSize[index];

				}
			});

			add(sizes);
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.getLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());

		}

	}

	private class MouseHandler implements MouseMotionListener {

		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(), e.getY(), pointSize,
					activeColor);
			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			}

			points.addPoint(newPoint);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
