package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void setBlockStateTest() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        assertEquals(true, game.setBlockState(0));
    }

    @Test
    public void setBlockStateFailedTest() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        game.setBlockState(0);
        assertEquals(false, game.setBlockState(0));
    }

    @Test
    public void getBlockStateTest() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        game.setBlockState(0);
        assertEquals(1, game.getBlockState(0));
    }

    @Test
    public void getStateTest() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        assertEquals(0, game.getState());
    }

    @Test
    public void getStateXWinnerTest1() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        game.setBlockState(0);
        game.setBlockState(3);
        game.setBlockState(1);
        game.setBlockState(4);
        game.setBlockState(2);
        assertEquals(1, game.getState());
    }

    @Test
    public void getStateXWinnerTest2() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        game.setBlockState(2);
        game.setBlockState(3);
        game.setBlockState(5);
        game.setBlockState(4);
        game.setBlockState(8);
        assertEquals(1, game.getState());
    }

    @Test
    public void getStateXWinnerTest3() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        game.setBlockState(0);
        game.setBlockState(1);
        game.setBlockState(4);
        game.setBlockState(2);
        game.setBlockState(8);
        assertEquals(1, game.getState());
    }

        @Test
    public void getStateTieTest() {
        TicTacToe game = new TicTacToe(3);
        game.setup();
        game.setBlockState(0);
        game.setBlockState(1);
        game.setBlockState(2);
        game.setBlockState(3);
        game.setBlockState(5);
        game.setBlockState(4);
        game.setBlockState(6);
        game.setBlockState(8);
        game.setBlockState(7);
        assertEquals(3, game.getState());
    }

}