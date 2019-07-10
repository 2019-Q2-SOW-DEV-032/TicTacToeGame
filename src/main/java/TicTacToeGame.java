package TicTacToe;

public class TicTacToeGame {
    private char currentPlayerMark;
    public char[][] board;

    public TicTacToeGame() {
        currentPlayerMark = 'X';
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = '-';
            }
        }
    }

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }
    public void setCurrentPlayerMark(char mark) {
        this.currentPlayerMark = mark;
    }

    public void changePlayer() {
        if (currentPlayerMark == 'X') {
            currentPlayerMark = 'O';
        }else {
            currentPlayerMark = 'X';
        }
    }

    public boolean isPlaceMark(int row, int col) {
        if (board[row][col] == '-') {
            board[row][col] = currentPlayerMark;
        }
        return true;
    }
}