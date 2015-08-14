package mmorpg;

import mmorpg_chat.Client;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Represents second panel that contains map and the players.
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class Play extends BasicGameState {

	// Declaring static variables for position of the player.
	public static float positionX = 0;
	public static float positionY = 0;

	// Declaring variables.
	private Image worldMap;
	private boolean quit = false;

	private float shiftX = positionX + 400;
	private float shiftY = positionY + 300;

	private Player player = new Player(Client.username);

	// private TiledMap map;

	/**
	 * Constructor.
	 * 
	 * @param state
	 */
	public Play(int state) {
	}

	/**
	 * Adding map and player on panel.
	 */
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		worldMap = new Image("res/world.png");
		player.drawMan();
		// map = new TiledMap("res/map.tmx");
	}

	/**
	 * Drawing map and player on the map.
	 */
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.setBackground(Color.blue);
		worldMap.draw(positionX, positionY);
		// map.render(0, 0);
		g.drawString(Client.username, shiftX, shiftY - 25);
		player.getMan().draw(shiftX, shiftY);
		g.drawString("X: " + (int) (positionX - 400) + " Y: "
				+ (int) (positionY - 300), 400, 50);

		// Calling method quit.
		quit(g, quit);
	}

	/**
	 * Enables to stop, quit and resume the game.
	 * 
	 * @param g
	 * @param quit
	 */
	public void quit(Graphics g, boolean quit) {
		if (quit) {
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 250, 150);
			g.drawString("Quit Game (Q)", 250, 200);
			if (!quit) {
				g.clear();
			}
		}
	}

	/**
	 * Updating the frame.
	 */
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		Input input = gc.getInput();

		// Calling method moving that moves player.
		if (!quit) {
			player.moving(gc, delta);
		}

		actionEscapeKey(input);

		quit = pauseMenu(sbg, input, quit);

		// int objectLayer = map.getLayerIndex("Tile Layer 1");
		// map.getTileId(0, 0, objectLayer);
	}

	/**
	 * Sets action on ESC key. If the ESC key is pressed it opens menu with
	 * options to resume game, quit game or to go to main menu.
	 * 
	 * @param input
	 */
	public void actionEscapeKey(Input input) {
		if (input.isKeyDown(Input.KEY_ESCAPE)) {
			quit = true;
		}
	}

	/**
	 * Sets action on R, M and Q keys. If the R key is pressed it resumes the
	 * game, if the Q key is pressed it quits the game and if the M key is
	 * pressed it opens main panel.
	 * 
	 * @param sbg
	 * @param input
	 * @param quit
	 * @return
	 */
	public boolean pauseMenu(StateBasedGame sbg, Input input, boolean quit) {
		if (quit) {
			if (input.isKeyDown(Input.KEY_R)) {
				quit = false;
			}
			if (input.isKeyDown(Input.KEY_M)) {
				sbg.enterState(Game.MENU);
			}
			if (input.isKeyDown(Input.KEY_Q)) {
				System.exit(0);
			}
		}
		return quit;
	}

	/**
	 * Returns the id of the panel.
	 */
	public int getID() {
		return 1;
	}
}
