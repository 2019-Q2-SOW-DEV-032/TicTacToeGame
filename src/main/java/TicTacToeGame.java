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
        if (this.getCurrentPlayerMark() == 'X') {
            this.setCurrentPlayerMark('O');
        }else {
            this.setCurrentPlayerMark('X');
        }
    }

    public boolean isPlaceMark(int row, int column) {
        if ((row >= 0) && (row < 3)&& ((column >= 0) && (column < 3)) && (board[row][column] == '-')) {
            board[row][column] = currentPlayerMark;
            return true;
        }
        return false;
    }

    public boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0]!= '-' )&& (board[i][1]!= '-') && (board[i][2]!= '-')) {
                return ( (board[i][0] == board[i][1]) && (board[i][0] == board[i][2]));
            }
        }
        return false;
    }

    public boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if ((board[0][i]!= '-' )&& (board[1][i]!= '-') && (board[2][i]!= '-')) {
                return ( (board[0][i] == board[1][i]) && (board[0][i] == board[2][i]));
            }
        }
        return false;
    }
}