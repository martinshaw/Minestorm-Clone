package utils;

import java.util.HashMap;
import java.util.Map;

public class SettingsManager {
	
	/*
	 * Will use dummy in-line setting definitions!
	 * Read from a JSON file or database connection in production games...
	 */
	
	Map<String, Object> map = new HashMap<String, Object>();
	
	public SettingsManager() {
		this.populate();
	}
	
	public void populate() {
		this.map = new HashMap<String, Object>();
		this.map.put("WINDOW_WIDTH", 1024);
		this.map.put("WINDOW_HEIGHT", 800);
		this.map.put("GAME_TITLE", "Game Template");
	}
	
	public Object get(String _key){
		return this.map.get(_key);
	}
	
	public void modify(String _key, Object _obj){
		this.map.put(_key, _obj);
	}

}
