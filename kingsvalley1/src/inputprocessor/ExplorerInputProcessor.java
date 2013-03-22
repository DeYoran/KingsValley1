package inputprocessor;


import screens.PlayScreen;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class ExplorerInputProcessor implements InputProcessor
{
	//Fields
	private PlayScreen screen;	
	
	//Constructor
	public ExplorerInputProcessor(PlayScreen screen)
	{
		this.screen = screen;
	}

	@Override
	public boolean keyDown(int keycode) 
	{
		switch(keycode)
		{
			case Keys.RIGHT:
				if (this.screen.getExplorer().getState().equals(this.screen.getExplorer().getIdleRight()) ||
					this.screen.getExplorer().getState().equals(this.screen.getExplorer().getIdleLeft()) ||
					this.screen.getExplorer().getState().equals(this.screen.getExplorer().getWalkLeft()))
				{
					this.screen.getExplorer().setState(this.screen.getExplorer().getWalkRight());
				}
				break;	
			case Keys.LEFT:
				if (this.screen.getExplorer().getState().equals(this.screen.getExplorer().getIdleLeft()) ||
					this.screen.getExplorer().getState().equals(this.screen.getExplorer().getIdleRight())||
					this.screen.getExplorer().getState().equals(this.screen.getExplorer().getWalkRight()))
				{
					this.screen.getExplorer().setState(this.screen.getExplorer().getWalkLeft());
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
				if (this.screen.getExplorer().getState().equals(this.screen.getExplorer().getWalkRight()))
				{
					this.screen.getExplorer().setState(this.screen.getExplorer().getIdleRight());
				}
				break;
			case Keys.LEFT:
				if (this.screen.getExplorer().getState().equals(this.screen.getExplorer().getWalkLeft()))
				{
					this.screen.getExplorer().setState(this.screen.getExplorer().getIdleLeft());
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
		int x = 1200;
		int y = 600;
		if ( screenX > x  && screenX < x + 100  && screenY > y && screenY < y + 100)
		{
			this.screen.getExplorer().setState(this.screen.getExplorer().getWalkRight());
		}		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		int x = 1200;
		int y = 600;
		if ( screenX > x  && screenX < x + 100  && screenY > y && screenY < y + 100)
		{
			this.screen.getExplorer().setState(this.screen.getExplorer().getIdleRight());
		}	
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) 
	{
		int x = 1200;
		int y = 600;
		if ( screenX > x  && screenX < x + 10  && screenY > y && screenY < y + 100)
		{
			this.screen.getExplorer().setState(this.screen.getExplorer().getIdleRight());
		}
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
