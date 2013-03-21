package inputprocessor;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

import explorer.Explorer;

public class ExplorerInputProcessor implements InputProcessor
{
	//Fields
	private Explorer explorer;	
	
	//Constructor
	public ExplorerInputProcessor(Explorer explorer)
	{
		this.explorer = explorer;
	}

	@Override
	public boolean keyDown(int keycode) 
	{
		switch(keycode)
		{
			case Keys.RIGHT:
				if (this.explorer.getState().equals(this.explorer.getIdleRight()))
				{
					this.explorer.setState(this.explorer.getWalkRight());
				}
				break;		
		}	
		return false;
	}

	@Override
	public boolean keyUp(int keycode) 
	{	
		switch(keycode)
		{
			case Keys.RIGHT:
				if (this.explorer.getState().equals(this.explorer.getWalkRight()))
				{
					this.explorer.setState(this.explorer.getIdleRight());
				}
				break;		
		}	
		return false;
	}

	@Override
	public boolean keyTyped(char character) 
	{
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) 
	{
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{	
		return false;
	}

	@Override
	public boolean scrolled(int amount) 
	{
		return false;
	}
}
