package ba.bitcamp.w07d03_BasicComponents.lectures;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPicker extends JPanel {

	private static final long serialVersionUID = -4531809447646005929L;

	private int red;
	private int green;
	private int blue;
	private JButton click;

	public ColorPicker(int width, int height) {

		initButton(width, height);

		int sliderHeight = height / 7;
		Dimension sliderDimension = new Dimension(width - 50, sliderHeight);
		
		JSlider redSlider = new JSlider(0, 255);
		initSlider(redSlider, "Red", sliderDimension);

		JSlider greenSlider = new JSlider(0, 255);
		initSlider(greenSlider, "Green", sliderDimension);

		JSlider blueSlider = new JSlider(0, 255);
		initSlider(blueSlider, "Blue", sliderDimension);

		// Labels
		JLabel redLabel = new JLabel("Red");
		JLabel greenLabel = new JLabel("Green");
		JLabel blueLabel = new JLabel("Blue");

		add(click);
		add(redLabel);
		add(redSlider);
		add(greenLabel);
		add(greenSlider);
		add(blueLabel);
		add(blueSlider);

	}

	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider)	e.getSource();
				
				switch (name) {
				case "Red":
					red = changed.getValue();
					break;
				case "Green":
					green = changed.getValue();
					break;
				case "Blue":
					blue = changed.getValue();
					break;
				}
				updateButton();
			}
		});
	}

	private void updateButton() {
		click.setBackground(new Color(red, green, blue));
		click.setForeground(new Color(255 - red, 255 - green, 255 - blue));
	}
		
	private void initButton(int width, int height){
		click = new JButton("Click me");
		click.setFont(new Font("Serif", Font.BOLD, 30));
		click.setPreferredSize(new Dimension(width, height / 2));
		click.setOpaque(true);
		click.setBorderPainted(false);
		click.addActionListener(new ActionListener() {
			// Creating copying when button is pressed.
			public void actionPerformed(ActionEvent e) {
				Clipboard clip = Toolkit.getDefaultToolkit()
						.getSystemClipboard();
				String copy = String.format("%d, %d, %d", red, green, blue);
				clip.setContents(new StringSelection(copy), null);
				
			}
		});
		updateButton();
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Color Picker");
		ColorPicker cp = new ColorPicker(500, 500);

		window.add(cp);

		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
