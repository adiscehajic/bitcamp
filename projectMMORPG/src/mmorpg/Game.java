package mmorpg;

import org.newdawn.slick.*;
import org.newdawn.slick.AppletGameContainer.Container;
import org.newdawn.slick.state.*;

/**
 * Creates the states - panels on frame and sets menu panel on first position.
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class Game extends StateBasedGame {

	// Declaring constants for the states.
	public static final int MENU = 0;
	public static final int PLAY = 1;

	/**
	 * Constructor that adds two states on frame.
	 * 
	 * @param gameName
	 *            - Title of the game.
	 */
	public Game(String gameName) {
		super(gameName);
		this.addState(new Play(PLAY));
		this.addState(new Menu(MENU));
	}

	/**
	 * Creating states and entering into first state.
	 */
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(MENU).init(gc, this);
		this.getState(PLAY).init(gc, this);
		this.enterState(MENU);
	}
}
