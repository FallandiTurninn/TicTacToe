package is.ru.hugb;

/**
 * An interface to be used in future game rendering
 **/
public interface GameRender {

	/**
	* Setup the game render
	**/
	public void setup();

	/**
	* Render the game with said state
	**/
	public void render(int state);

}
			
