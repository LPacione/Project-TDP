package com.neet.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.neet.managers.GameInputProcessor;
import com.neet.managers.GameKeys;


public class Game implements ApplicationListener{

	public static int WIDHT;
	public static int HEIGHT;
	
	
	public void create() {
		
		WIDHT=Gdx.graphics.getWidth();
		HEIGHT=Gdx.graphics.getHeight();
		
		Gdx.input.setInputProcessor(new GameInputProcessor());	
		
	}

	
	public void resize(int width, int height) {
		
		
	}

	
	public void render() {
		
		//Clear screen to black
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		GameKeys.update();
		
	}

	
	public void pause() {
		
		
	}

	
	public void resume() {
		
		
	}

	
	public void dispose() {
		
		
	}

}
