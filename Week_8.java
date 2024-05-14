PLACE IN THE RACE:

 public class Main {
  public static void main(String[] args) {
    
    int[] arr = {8, 7, 5, 3, 2, 1};
    int number = 0;
    boolean thePlaceIsFound = false;
    
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < number){
        i = i + 1;
        System.out.println("Our place in the race: " + i);
        thePlaceIsFound = true;
        break;
      }
    }
    
    if(thePlaceIsFound == false){
      System.out.println("Our place in race: " + (arr.length + 1)); 
    }
  }
}
___________________________________________________________________________________
SAME WITH METHODS

public class Main {
  public static void main(String[] args) {
    
    int[] arr = {8, 7, 5, 3, 2, 1};
    int number = 0;
    int place = getThePlace(arr, number);
      System.out.println("Our place in race: " + place); 
    
  }
  public static int getThePlace(int[] arr, int number){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < number){
        return i+1;
      }
    }
    return arr.length +1;
  }
}
________________________________________________________________________________________

 IS PRIME NUMBER?

 public class Main {
  public static void main(String[] args) {

    for(int i = 0; i < 100; i++){
      boolean isAPrimeNumber = isPrime(i);
      System.out.println(i + "is a prime number - " + isAPrimeNumber);
    }
  }
  
  public static boolean isPrime(int number){
    for(int i= 2; i < number; i++){
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }
}
_____________________________________________________________________________________________

 TWO DIMENSIONAL ARRAY

public class Main {
  public static void main(String[] args) {
    int[][] array = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

for(int i = 0; i < array.length; i++){
  for(int j = 0; j < array[i].length; j++){
    System.out.print(array[i][j] + " ");
  }

}
 
}
}
______________________________________________________________________________________________
 public class Main {
  public static void main(String[] args) {
    int[][] array = new int[5][5];
   
    for (int i = 0; i < array.length; i++) {
      int[] row = array[i];
      for (int j = 0; j < row.length; j++) {
          row[j] = i;
     }
     }
   
    for(int i = 0; i < array. length; i++){
      for(int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + "|");
      }
    System.out.println(); // FOR A NEW ROW IN PRINT
    }
    }
    
}
