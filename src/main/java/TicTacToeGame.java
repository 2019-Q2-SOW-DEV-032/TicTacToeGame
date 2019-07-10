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
        for (int row = 0; row < 3; row++) {
            if (checkWinningPattern(board[row][0], board[row][1], board[row][2]) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumnsForWin() {
        for (int column = 0; column < 3; column++) {
            if (checkWinningPattern(board[0][column], board[1][column], board[2][column])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalsForWin () {
        if (checkWinningPattern(board[0][0], board[1][1], board[2][2])) {
            return true;
        } else {
            if (checkWinningPattern(board[0][2], board[1][1], board[2][0])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinningPattern(char mark1, char mark2, char mark3) {
        return !(mark1 == '-') && ((mark1 != '-' && mark1 == mark2 && mark1 == mark3));
    }

    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    protected boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}