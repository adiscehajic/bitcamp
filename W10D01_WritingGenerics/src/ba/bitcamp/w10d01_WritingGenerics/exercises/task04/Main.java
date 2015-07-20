package ba.bitcamp.w10d01_WritingGenerics.exercises.task04;

import java.util.LinkedList;

import ba.bitcamp.w10d01_WritingGenerics.exercises.task02.MyStack;

public class Main {

	public static void main(String[] args) {

		Application app1 = new Application("App1", 2012, 2.0, 15);
		Application app2 = new Application("App2", 2012, 2.0, 15);
		Application app3 = new Application("App3", 2012, 2.0, 15);
		
		MyStack<Application> listApp = new MyStack<Application>();
		//LinkedList<Application> listApp2 = new LinkedList<Application>();
		
		listApp.push(app1);
		listApp.push(app2);
		listApp.push(app3);

		Editor editor1 = new Editor("Notepad", 1999, 2.0, 10, "Text", true);
		Editor editor2 = new Editor("Workpad", 2015, 5.2, 15, "Text", false);

		VideoGame game1 = new VideoGame("Fifa", 1998, 1.0, 500, "Sport", "EA",
				10000000);
		VideoGame game2 = new VideoGame("Fifa2010", 2010, 1.0, 1500, "Sport",
				"EA", 10000000);
		VideoGame game3 = new VideoGame("Fifa2015", 2015, 1.0, 2500, "Sport",
				"EA", 10000000);

		LinkedList<Editor> listEditor = new LinkedList<Editor>();
		listEditor.add(editor1);
		listEditor.add(editor2);

		MyStack<VideoGame> stackOne = new MyStack<VideoGame>();

		stackOne.push(game1);
		stackOne.push(game2);
		stackOne.push(game3);

		LinkedList<VideoGame> list = new LinkedList<VideoGame>();
		list.add(game1);
		list.add(game2);
		
		
		listApp.pushAll(listEditor);
		System.out.println(listApp);
		
		
		

	}
}
