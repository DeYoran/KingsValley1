package screens;
import nl.am1a.kingsvalley1.KingsValley;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;

import explorer.Explorer;

public class PlayScreen implements Screen{

	//Fields
	private KingsValley game;
	private Explorer explorer;
	private OrthographicCamera camera;
	
	//Constructor
	public PlayScreen(KingsValley game)
	{
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		this.explorer.Update(delta);
		this.game.getBatch().setProjectionMatrix(camera.combined);
		this.game.getBatch().begin();
			this.explorer.Draw(delta);
		this.game.getBatch().end();
	}

	@Override
	public void resize(int width, int height) {		
	}

	@Override
	public void show() {		
				
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		boolean isAndroid = false;
		if (isAndroid )
		{
			w = w/2f;
			h = h/2f;
		}
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, w, h);
		camera.position.set(0f, 0f, 0f);
		camera.update();
		Gdx.app.log("show", "Ik wordt een keer aangeroepen");
		this.explorer = new Explorer(this.game, new Vector2(-w/2f,0f), 2f);
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
