package screens;

import core.Game;
import processing.core.*;

public class SplashScreen extends BaseScreen {
	
	PApplet p = null;
	Game game = null;
	
	PImage logo_image;
	int logo_width = 350, logo_height = 500;
	
	public SplashScreen(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
		
		logo_image = p.loadImage("logo.jpg");
		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		p.background(0);
		
		p.image(
			this.logo_image, 
			p.width /2 - (logo_width/2),
			p.height /2 - (logo_height/2) -50,
			this.logo_width,
			this.logo_height
		);
		
		if ((p.frameCount / Math.round(p.frameRate)) >= 3) { // approximately after 3 seconds
			this.game.changeScreen(new Level1Screen(p, this.game));
		}

		p.fill(255);
		p.textSize(16);
		p.textAlign(PConstants.CENTER);
		p.text(
			"Created by Martin Shaw",
			p.width /2,
			p.height - 90
		);
		
	}

}
