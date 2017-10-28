package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void loopTest() {
        TicTacToe game = new TicTacToe();
        assertEquals(0, game.loop());
    }

    /*
    @Test
    public void sayHiTest() {
        TicTacToe game = new TicTacToe();
        assertEquals("Hi!", game.sayHi());
    }
    
    @Test
    public void startsGame() {
        
    }
    
    @Test
    public void gameIsOverTest() {
        
    }
    
    @Test
    public void gameIsNotOverTest() {
        
    }
    
    @Test
    public void winnerTest() {
        
    }
    
    @Test
    public void drawTest() {
        
    }
	*/
}