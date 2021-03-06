package core;

import processing.core.*;
import screens.*;
import utils.*;

public class Game extends PApplet {
	
	public BaseScreen currentScreen;
	public SettingsManager settings = new SettingsManager();
	
	public static void main(String[] args) {
		PApplet.main(new String[] {core.Game.class.getName()});	
	}
	
	
	public void settings(){
		size(
			(int) settings.get("WINDOW_WIDTH"),
			(int) settings.get("WINDOW_HEIGHT")
		);
		smooth();
    }

    public void setup(){
    	frameRate(60);
    	background(0);
    	changeScreen(new Level1Screen(this, this));
    }

	public void draw(){		
		currentScreen.move();
    	currentScreen.draw();

		surface.setTitle((String) settings.get("GAME_TITLE"));
    }
	
	public void keyPressed() {
		currentScreen.keyPressed();
	}
    
	public void changeScreen(BaseScreen _screen){
		this.currentScreen = _screen;
	}

}
