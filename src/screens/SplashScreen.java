package screens;

import core.Game;
import processing.core.*;

public class SplashScreen extends BaseScreen {
	
	PApplet parent = null;
	Game game = null;
	
	int backgroundShade = 50;
	PImage logo_image;
	int logo_width = 350, logo_height = 350;
	
	public SplashScreen(PApplet _parent, Game _game) {
		this.parent = _parent;
		this.game = _game;
		
		logo_image = this.parent.loadImage("logo.png");
		
	}

	@Override
	public void move() {
		backgroundShade += 2;
	}

	@Override
	public void draw() {
		if (backgroundShade <= 255)	this.parent.background(backgroundShade);	
		
		this.parent.image(
			this.logo_image, 
			this.parent.width /2 - (logo_width/2),
			this.parent.height /2 - (logo_height/2) -50,
			this.logo_width,
			this.logo_height
		);
		
		if ((this.parent.frameCount / Math.round(this.parent.frameRate)) >= 4) { // approximately after 4 seconds
			this.game.changeScreen(new Level1Screen(this.parent, this.game));
		}
		 
	}

}
