package ba.bitcamp.w11D01_Networking.exercises.url;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URLExamples {

	public static void main(String[] args) {
		URL url1 = null;

		try {
			url1 = new URL(
					"http://cdn.grumpycats.com/wp-content/uploads/2013/12/12.27.2013-1.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL");
			e.printStackTrace();
			System.exit(1);
		}

		ImageIcon imageIcon = new ImageIcon(url1);
		JFrame frame = new JFrame();
		frame.add(new JLabel(imageIcon));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// Another example

		try {
			BufferedImage image = ImageIO.read(url1);
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		}

		try {
			// Selects url of picture
			URLConnection con = url1.openConnection();
			System.out.println(con.getContentType());
			InputStream in = con.getInputStream();
			File file = new File("output.jpeg");
			FileOutputStream fileWrite = new FileOutputStream(file);

			// Creating an array of bytes that will contain picture bytes
			byte[] data = new byte[1024];
			int bytesRead;

			// Writing an array of bytes in the fileoutputstream
			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}
			fileWrite.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
