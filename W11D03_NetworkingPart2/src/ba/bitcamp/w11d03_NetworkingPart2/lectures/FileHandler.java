package ba.bitcamp.w11d03_NetworkingPart2.lectures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) throws FileNotFoundException,
			IOException {
		String fullPath = routeBuilder(route);

		StringBuilder sb = new StringBuilder();

		BufferedReader reader = new BufferedReader(new FileReader(new File(
				fullPath)));

		while (reader.ready()) {
			sb.append(reader.readLine());
		}
		return sb.toString();
	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}
}
