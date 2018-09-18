package com.neet.managers;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;



public class GameInputProcessor extends InputAdapter{

	public boolean keyDown(int k) {
		if(k==Keys.RIGHT)
			GameKeys.setKey(GameKeys.right, true);
		if(k==Keys.LEFT)
			GameKeys.setKey(GameKeys.left, true);
		if(k==Keys.SPACE)
			GameKeys.setKey(GameKeys.space, true);
		if(k==Keys.ESCAPE)
			GameKeys.setKey(GameKeys.escape, true);
		return true;
	}
	
	public boolean KeyUp(int k) {
		if(k==Keys.RIGHT)
			GameKeys.setKey(GameKeys.right, false);
		if(k==Keys.LEFT)
			GameKeys.setKey(GameKeys.left, false);
		if(k==Keys.SPACE)
			GameKeys.setKey(GameKeys.space, false);
		if(k==Keys.ESCAPE)
			GameKeys.setKey(GameKeys.escape, false);
		return true;
		
	}
}
