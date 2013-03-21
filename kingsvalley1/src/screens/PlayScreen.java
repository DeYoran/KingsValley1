package screens;
import image.Image;
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
	private Image arrow_right, arrow_left;
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
			this.arrow_right.Draw(delta);
			this.arrow_left.Draw(delta);
		this.game.getBatch().end();
	}

	@Override
	public void resize(int width, int height)
	{		
	}

	@Override
	public void show() {		
				
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		boolean isAndroid = true;
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
		this.explorer = new Explorer(this.game, new Vector2(0f,0f), 1f);
		this.arrow_right = new Image(this.game,
									 new Vector2(w/2f - 64f * 2f, -h/2f),
									 "data/arrows/Arrow-Right.png");
		this.arrow_left = new Image(this.game, 
									new Vector2(-w/2f, -h/2f),
									"data/arrows/Arrow-Left.png");
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
