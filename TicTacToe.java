import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    boolean gameOver = false;
    Scanner scanner = new Scanner(System.in);
    var player = "Player X";
    char playerMark = 'X';
    char[][] board = {{ ' ', ' ', ' ' },
                      { ' ', ' ', ' ' },
                      { ' ', ' ', ' ' }};

    System.out.println("Type row (0,1,2) + enter and column (0,1,2) + enter to place your mark");
    System.out.println("Let`s start the game!");
    print(board);

    while (gameOver == false) {
      System.out.println();
      System.out.println(player + ", what is Your move?");
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      System.out.println();

      if (board[row][col] == ' ') {
        board[row][col] = playerMark;
        print(board);
        gameOver = isGameOver(board, playerMark);
        
        if(player == "Player X"){
          player = "Player O";
          playerMark = 'O';
        } else {
          player = "Player X";
          playerMark = 'X';
        }
      } 
      else {
        System.out.println("Impossible move, try again");
      }
    }
  }

  public static void print(char[][] board) {
    System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
    System.out.println("--  --  --");
    System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
    System.out.println("--  --  --");
    System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
  }

  public static boolean isGameOver(char[][] board, char playerMark) {
    if ((board[0][0] == playerMark && board[0][1] == playerMark && board[0][2] == playerMark) || // ROWS
        (board[1][0] == playerMark && board[1][1] == playerMark && board[1][2] == playerMark) ||
        (board[2][0] == playerMark && board[2][1] == playerMark && board[2][2] == playerMark) ||

        (board[0][0] == playerMark && board[1][0] == playerMark && board[2][0] == playerMark) || // COLUMNS
        (board[0][1] == playerMark && board[1][1] == playerMark && board[2][1] == playerMark) ||
        (board[0][2] == playerMark && board[1][2] == playerMark && board[2][2] == playerMark) ||

        (board[0][0] == playerMark && board[1][1] == playerMark && board[2][2] == playerMark) || // DIAGONALS
        (board[0][2] == playerMark && board[1][1] == playerMark && board[2][0] == playerMark)) {
        
      System.out.println("Plyaer " + playerMark + " wins!");
      return true;
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == ' ') {
          return false;
        }
      }
    }
    System.out.println("Game over, it is a tie!");
    return true;
  }

}