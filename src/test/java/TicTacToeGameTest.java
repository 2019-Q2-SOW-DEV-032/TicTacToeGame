package TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeGameTest {

    @Test
    public void test_checkIfPlayerXPlaceFirstMove(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertEquals('X', ticTacToeGame.getCurrentPlayerMark());
    }

    @Test
    public void test_WhenFirstPlayerIsX_thenNextPlayerIsO(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.changePlayer();
        assertEquals('O',ticTacToeGame.getCurrentPlayerMark());
    }
}