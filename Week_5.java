public class Main {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      System.out.println(arr[0]) ; 
    }
  }

public class Main {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};

    for(int i=0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    
  }
}
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[5];
    
    for(int i = 0; i < numbers.length; i++){ 
      numbers[i] = scanner.nextInt();
    }
    
    int maxNumber = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxNumber) {
        maxNumber = numbers[i];
      }
    }
    
    System.out.println("Largest number is " + maxNumber);

    int minNumber = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < minNumber) {
        minNumber = numbers[i];
      }
    }
    
    System.out.println("Smallest number is " + minNumber);
        
scanner.close();
  }
}
