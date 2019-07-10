User Story:
------------

As a user, I can play a Tic Tac Toe game and I can win when am able to draw three X’s or three O’s in a row.
Also, If all nine squares are filled and neither of us has three in a row, then my game is a draw.

Acceptance Criteria:
---------------------

X always goes first.
Players cannot play on a played position.
Players alternate placing X’s and O’s on the board until either:
One player has three in a row, horizontally, vertically or diagonally
All nine squares are filled.
If a player is able to draw three X’s or three O’s in a row, that player wins.
If all nine squares are filled and neither player has three in a row, the game is a draw.

1. GIVEN player 1 start the game
   WHEN player 1 choose the position of his move
   THEN X will be displayed in the respective position

2. GIVEN player 2 start the game
   WHEN player 2 choose the position of his move
   THEN O will be displayed in the respective position

3. GIVEN a player choose the position of his move
   WHEN makes his move in three consecutive place
   THEN the game is over and the player has won the game

4. GIVEN a player choose the position of his move
   WHEN makes his move in the last empty spot
   THEN the game is over and its a draw

Steps to run the project:
---------------------------

Check out the maven project from GitHub
Build the maven project.
Compile and Run the TicTacToeGame class.
To view the coverage results, then click on "Run with test coverage".