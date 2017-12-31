package character;

import core.Game;
import processing.core.PApplet;
import processing.core.PConstants;

public class PlayerShip extends BaseCharacter {

	PApplet p;
	Game game;
	
	int x, y, w = 25, h = 40, rot = 0; 
	
	public PlayerShip(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
		
		// Set random position
		this.x = 150 + (int)(Math.random() * (((p.width - 150) - 150) + 1));
		this.y = 150 + (int)(Math.random() * (((p.height - 150) - 150) + 1));

		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		p.strokeJoin(PConstants.MITER);
		
		p.stroke(255);
		p.noFill();
//		p.rect(x, y, w, h);

		p.translate(x + (w/2), y + (h/2));
		  
		p.stroke(0,249,255);
		p.strokeWeight(2);
		p.rotate((p.radians(rot)));
		p.beginShape();
		p.vertex( x, y + ((h/3)*2) );
		p.vertex( x, y + h );
		p.vertex( x + ((w/3) *2), y + ((h/3)*2));
		p.vertex( x + (w/2), y );
		p.vertex( x + ((w/3)), y + ((h/3)*2));
		p.vertex( x + w, y + h );
		p.vertex( x + w, y + ((h/3)*2) );
		p.endShape();
			
	}
	
	public void moveBy(int x, int y, int rot){
		this.x += x;
		this.y += y;
		this.rot += rot;
	}
	

}
