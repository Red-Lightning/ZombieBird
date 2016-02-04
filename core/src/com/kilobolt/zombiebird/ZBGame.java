package com.kilobolt.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobolt.zbHelpers.AssetLoader;
import com.kilobolt.zombiebird.com.kilobolt.screen.GameScreen;

public class ZBGame extends Game {

	@Override
	public void create () {
		Gdx.app.log("ZBGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
