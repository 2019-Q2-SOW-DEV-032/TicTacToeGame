package TicTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeGameTest {
    private TicTacToeGame ticTacToeGame;

    @Before
    public void setUp() throws Exception{
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void test_checkIfPlayerXPlaceFirstMove(){
        assertEquals('X', ticTacToeGame.getCurrentPlayerMark());
    }

    @Test
    public void test_WhenFirstPlayerIsX_thenNextPlayerIsO(){
        ticTacToeGame.changePlayer();
        assertEquals('O',ticTacToeGame.getCurrentPlayerMark());
    }

    @Test
    public void test_WhenCurrentPlayerIsO_thenNextPlayerIsX(){
        ticTacToeGame.setCurrentPlayerMark('O');
        ticTacToeGame.changePlayer();
        assertEquals('X',ticTacToeGame.getCurrentPlayerMark());
    }

    @Test
    public void test_makeSureThatTheBoardIsEmpty_BeforeTheGameIsStarted(){
        for (int row=0;row<3;row++) {
            for (int column=0;column<3;column++) {
                assertEquals('-', ticTacToeGame.board[row][column]);
            }
        }
    }

}