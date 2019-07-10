package TicTacToe;

public class TicTacToeGame {
    private char currentPlayerMark;

    public TicTacToeGame() {
        currentPlayerMark = 'X';
    }

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    public void changePlayer() {
        if (currentPlayerMark == 'X') {
            currentPlayerMark = 'O';
        }
    }
}