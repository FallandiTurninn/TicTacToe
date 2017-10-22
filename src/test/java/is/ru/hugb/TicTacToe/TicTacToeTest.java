package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void sayHiTest() {
        TicTacToe game = new TicTacToe();
        assertEquals("Hi!", game.sayHi());
    }
}