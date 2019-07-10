package TicTacToe;

public class TicTacToeGame {
    private char currentPlayerMark;
    private char board;

    public TicTacToeGame() {
        currentPlayerMark = 'X';
        board = '-';
    }

    public char getBoard() {
        return board;
    }

    public void setBoard(char placeMark) {
        this.board = placeMark;
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
}