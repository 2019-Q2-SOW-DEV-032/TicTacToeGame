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

    @Test
    public void test_placeMark_whenPlayerPlaceMarkInAnEmptyPosition_thenTheGameAllowsToMarkThatPosition(){
        assertTrue(ticTacToeGame.isPlaceMark(1,2) );
    }

    @Test
    public void test_placeMark_whenPlayerPlaceMarkInInvalidPosition_thenTheGameNotAllowsTheMarkInAThatPosition(){
        assertFalse(ticTacToeGame.isPlaceMark(1,8) );
    }

    @Test
    public void test_checkRowsForWin_whenSimilarThreeMarksInARow_thenItsAWin(){
        ticTacToeGame.board[0][0] = 'x';
        ticTacToeGame.board[0][1] = 'x';
        ticTacToeGame.board[0][2] = 'x';
        assertTrue(ticTacToeGame.checkRowsForWin());
    }

    @Test
    public void test_checkRowsForWin_whenDisSimilarThreeMarksInARow_thenItsNotAWin(){
        ticTacToeGame.board[0][0] = 'X';
        ticTacToeGame.board[0][1] = 'O';
        ticTacToeGame.board[0][2] = 'X';
        assertFalse(ticTacToeGame.checkRowsForWin());
    }

    @Test
    public void test_checkColumnsForWin_whenSimilarThreeMarksInACol_thenItsAWin(){
        ticTacToeGame.board[0][0] = 'X';
        ticTacToeGame.board[1][0] = 'X';
        ticTacToeGame.board[2][0] = 'X';
        assertTrue(ticTacToeGame.checkColumnsForWin());
    }

    @Test
    public void test_checkDiagonalsForWin_whenSimilarThreeMarksInADiagonal_thenItsAWin(){
        ticTacToeGame.board[0][0] = 'O';
        ticTacToeGame.board[1][1] = 'O';
        ticTacToeGame.board[2][2] = 'O';
        assertTrue(ticTacToeGame.checkDiagonalsForWin());
    }

    @Test
    public void test_checkForWin_whenSimilarThreeMarksInARowOrColOrDiagonal_thenItsAWin(){
        ticTacToeGame.board[0][0] = 'O';
        ticTacToeGame.board[1][1] = 'X';
        ticTacToeGame.board[2][2] = 'O';
        assertFalse(ticTacToeGame.checkForWin());
    }

}