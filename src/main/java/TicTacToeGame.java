package TicTacToe;

public class TicTacToeGame {
    public char currentPlayerMark;

    public TicTacToeGame() {
        currentPlayerMark = 'X';
    }

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }
}