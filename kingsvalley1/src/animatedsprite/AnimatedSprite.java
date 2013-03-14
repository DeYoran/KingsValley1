package animatedsprite;
import explorer.Explorer;

public class AnimatedSprite {
	
	
	private Explorer explorer;

	//Constructor
	public AnimatedSprite(Explorer explorer)
	{
		this.explorer = explorer;
	}
	
	//Update
	public void Update(float delta)
	{
		
	}
	
	public void Draw(float delta)
	{
		this.explorer.getGame().getBatch().draw(this.explorer.getTexture(),
				  this.explorer.getPosition().x,
				  this.explorer.getPosition().y,
				  this.explorer.getTexture().getWidth()/8,
				  this.explorer.getTexture().getHeight(),
				  54,
				  0,
				  18,
				  32,
				  false,
				  false);
	}

}
