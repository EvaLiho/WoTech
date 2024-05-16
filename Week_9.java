// COPY OF ARRAY WITH BUILT IN METHOD

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    int[] originalArray = {1, 2, 3, 4, 5};
    int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
    
    printOutArray(copiedArray);
  }

  public static void printOutArray(int[] array){
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
}
________________________________________________________________________
  // MINESWEEPER

public class Main {
  public static void main(String[] args) {
    
    int size = 10;
    int[][] grid = new int[size][size];
    int bombColumn = 1;
    int bombRow = 1;

    grid[bombRow][bombColumn] = 5;            // LOCATION OF BOMB
    
    grid[bombRow - 1][bombColumn] = 1;        // TOP ROW 1
    grid[bombRow - 1][bombColumn - 1] = 1;
    grid[bombRow - 1][bombColumn + 1] = 1;
    
    grid[bombRow + 1][bombColumn] = 1;        // BOTTOM ROW 1
    grid[bombRow + 1][bombColumn - 1] = 1;
    grid[bombRow + 1][bombColumn + 1] = 1;

    grid[bombRow][bombColumn - 1] = 1;        // SIDES
    grid[bombRow][bombColumn + 1] = 1;
    
    printArray(grid, size);
  }

  public static void printArray(int[][] array, int size){
    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
_________________________________________________________________________
  // MINESWEEPER

public class Main {
  public static void main(String[] args) {
    
    int size = 10;
    int[][] grid = new int[size][size];
    int bombColumn = 9;
    int bombRow = 1;

    grid[bombRow][bombColumn] = 5;            // LOCATION OF BOMB

  if(bombRow != 0){ 
    grid[bombRow - 1][bombColumn] = 1;        // TOP ROW 1
    if(bombColumn != 0){
      grid[bombRow - 1][bombColumn - 1] = 1;
    }
    if(bombColumn != size - 1){ 
      grid[bombRow - 1][bombColumn + 1] = 1;
    }
  }
  
  if(bombRow != size - 1){ 
    grid[bombRow + 1][bombColumn] = 1;        // BOTTOM ROW 1
    if(bombColumn != 0){
       grid[bombRow + 1][bombColumn - 1] = 1;
    }
    if(bombColumn != size - 1){ 
      grid[bombRow + 1][bombColumn + 1] = 1;
    }
  }
  
  if(bombColumn != 0){
    grid[bombRow][bombColumn - 1] = 1;        // SIDES
  }
  if(bombColumn != size - 1){ 
    grid[bombRow][bombColumn + 1] = 1;
  }
    
  printArray(grid, size);
  }

  public static void printArray(int[][] array, int size){
    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
__________________________________________________________________
