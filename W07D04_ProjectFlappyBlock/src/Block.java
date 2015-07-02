import java.awt.Graphics;


public class Block {

	public int x;
	public int y;
	
	private static final int JUMP = 120;
	private static final int DOWN = 5;
	private static final int WIDTH = 40;
	private static final int HEIGHT = 60;
	
	
	public Block(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g){
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	public void jump(){
		y -= JUMP;
	}
	
	public void down(){
		y += DOWN;
	}
	
	
	
}
