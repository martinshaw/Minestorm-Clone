package screens;

import core.Game;
import processing.core.*;

public class Level1Screen extends BaseScreen {
	
	PApplet p = null; 
	Game game = null;
	
	public Level1Screen(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		p.background(0);

	}
}
