package screens;

import java.util.ArrayList;

import character.BaseCharacter;
import character.PlayerShip;
import core.Game;
import processing.core.*;

public class Level1Screen extends BaseScreen {
	
	PApplet p = null; 
	Game game = null;
	
	PlayerShip player;
	ArrayList<BaseCharacter> characters = new ArrayList<BaseCharacter>();
	
	public Level1Screen(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
		
		// Create Player Ship
		this.player = new PlayerShip(_parent, _game);
		
		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		p.background(0);
		
		player.move();
		player.draw();
		
		for (BaseCharacter c: characters){
			c.move();
			c.draw();
		}

	}

	@Override
	public void keyPressed() {
		if (p.key == PConstants.CODED) {
			if (p.keyCode == PConstants.UP) { player.moveBy(0, -2, 0); }
			if (p.keyCode == PConstants.DOWN) { player.moveBy(0, 2, 0); }
			if (p.keyCode == PConstants.LEFT) { player.moveBy(0, 0, -2); }
			if (p.keyCode == PConstants.RIGHT) { player.moveBy(0, 0, 2); }
		}
		
	}
}
