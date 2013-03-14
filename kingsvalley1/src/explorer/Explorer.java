package explorer;
import animatedsprite.AnimatedSprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import nl.am1a.kingsvalley1.KingsValley;

public class Explorer {
	
	//Fields
	private KingsValley game;
	private Vector2 position;
	private float speed;
	private Texture texture;
	private AnimatedSprite state;
	private ExplorerWalkRight walkRight;
	
	
	//Properties
	public Vector2 getPosition()
	{
		return this.position;
	}
	public void setPosition(Vector2 position)
	{
		this.position = position;
	}
	public float getSpeed()
	{
		return this.speed;
	}
	public Texture getTexture()
	{
		return this.texture;
	}
	public KingsValley getGame()
	{
		return this.game;
	}
	
	//Constructor
	public Explorer(KingsValley game, Vector2 position, float speed)
	{
		this.game = game;
		this.position = position;
		this.speed = speed;	
		this.texture = new Texture("data/explorer.png");
		this.walkRight = new ExplorerWalkRight(this);
		this.state = this.walkRight;
	}
	
	
	//Update
	public void Update(float delta)
	{
		this.state.Update(delta);
	}
	
	
	//Draw
	public void Draw(float delta)
	{
		this.state.Draw(delta);		
	}
}
