package mmorpg;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * Starts the game.
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class GameLauncher {

	public static final String gameName = "MMORPG!";
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(800, 600, false);
			appgc.setShowFPS(false);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
