package mmorpg;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Represents first panel which starts when the game is started. It contains
 * button for starting the game and button for the exiting the game. If the
 * button for starting game is pressed it opens panel for playing the game.
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class Menu extends BasicGameState {

	private Image playNow;
	private Image exitGame;

	public Menu(int state) {
	}

	/**
	 * Importing images.
	 */
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		playNow = new Image("res/start.png");
		exitGame = new Image("res/exit.png");
	}

	/**
	 * Setting the frame and drawing images.
	 */
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.setBackground(Color.white);

		playNow.draw(325, 100);
		exitGame.draw(325, 325);
	}

	/**
	 * Setting action on clicking on images.
	 */
	public void update(GameContainer gc, StateBasedGame sbg, int arg2)
			throws SlickException {
		int posX = Mouse.getX();
		int posY = Mouse.getY();

		if ((posX > 325 && posX < 475) && (posY > 350 && posY < 500)) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(Game.PLAY);
			}
		}

		if ((posX > 325 && posX < 475) && (posY > 125 && posY < 275)) {
			if (Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
	}

	/**
	 * Returns the id of the panel.
	 */
	public int getID() {
		return 0;
	}
}
