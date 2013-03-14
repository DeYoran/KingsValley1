package screens;
import nl.am1a.kingsvalley1.KingsValley;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;

import explorer.Explorer;

public class PlayScreen implements Screen{

	//Fields
	private KingsValley game;
	private Explorer explorer;
	
	//Constructor
	public PlayScreen(KingsValley game)
	{
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		this.explorer.Update(delta);
		this.game.getBatch().begin();
			this.explorer.Draw(delta);
		this.game.getBatch().end();
	}

	@Override
	public void resize(int width, int height) {		
	}

	@Override
	public void show() {
		Gdx.app.log("show", "Ik wordt een keer aangeroepen");
		this.explorer = new Explorer(this.game, new Vector2(200f,400f), 2f);
	}

	@Override
	public void hide() {		
	}

	@Override
	public void pause() {		
	}

	@Override
	public void resume() {		
	}

	@Override
	public void dispose() {		
	}

}
