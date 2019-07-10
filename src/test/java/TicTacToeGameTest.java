package TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeGameTest {

    @Test
    public void test_checkIfPlayerXPlaceFirstMove(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertEquals('X', ticTacToeGame.getCurrentPlayerMark());
    }
}