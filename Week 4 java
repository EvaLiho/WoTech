import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
     System.out.println("Write a number");
    int a = scanner.nextInt();
    System.out.println("Write another number");
     int b = scanner.nextInt();
    
    System.out.println("A + B = " + (a + b));
    
    scanner.close(); // closing the channel
    
    //scanner.nextLine(); // Waits for us to provide a string until pressed enter 
  }
----------------------------------------------------------------------------------------------------------------------
public class Main {
  public static void main(String[] args) {

    int amountOfTimesToDuck = 5;
    while (amountOfTimesToDuck != 0){
      System.out.println("Duck!");
      amountOfTimesToDuck = amountOfTimesToDuck - 1;
    }
    System.out.println("Goose!");
    
  }
}
---------------------------------------------------------------------------------------------------------------------
// "DIRTY" way
public class Main {
  public static void main(String[] args) {

    int i = 1;
    boolean isEven = false;
    
    while (i <= 5){
      String evenOrOdd = "";
      if (isEven == true){
        evenOrOdd = "even";
      }
      else {
        evenOrOdd = "odd";
      }
      System.out.println( i + " is " + evenOrOdd);
      i = i + 1;
      isEven = !isEven;
    }
    
  }
}
----------------------------------------------------------------------------------------------------------------------
public class Main {
  public static void main(String[] args) {

    int i = 1;
    boolean isEven = false;
    
    while (i <= 10){
      String result = "";
      if (i % 2 == 0){
        result = "even";
      }
      else {
        result = "odd";
      }
      System.out.println( i + " is " + result);
      i = i + 1;
     
    }
    
  }
}
-------------------------------------------------------------------------------------------------------------------
public class Main {
  public static void main(String[] args) {

    // for-loop for ( defined, condition, action after every loop) i is variable ONLY in for-loop
    for (int i = 1; i <= 10; i = i + 1) {
      System.out.println(i);
    }
}
}
---------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    int answer = 30;
    String result = "";
    
    // user guess input
    Scanner scanner = new Scanner(System.in);
     System.out.println("Guess the number");
    int x = scanner.nextInt();

    if (x == answer){System.out.println("Correct! The number is " + x);}
    
    while (x != answer){
      if (x < answer){
        result = "Too small";
      }
      else {
        result = "Too big";
      }
      System.out.println("Not correct! " + x + " is " + result);
      x = scanner.nextInt();
      }
    scanner.close();
    }
    }
-----------------------------------------------------------------------------------------------------------------------  
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String text = "_";
    
    // user guess input
    Scanner scanner = new Scanner(System.in);
     System.out.println("Choose the size of the triange");
    int x = scanner.nextInt();
    
    // for-loop for ( defined, condition, action after every loop)
    for (int i = 1; i <= x; i = i + 1) {
      System.out.println(text);
      text = text + "_";

      }
    scanner.close();
    }
    }
---------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*
        _ // 4 spaces and one underscore
       __ // 3 spaces and two underscores
      ___ // 2 spaces and three underscores
     ____ // 1 space and four underscores
    _____ // 0 spaces and five underscores
    // X = 5
    // spaces = X - i;
    // underscores = i;
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write a number!");
    int number = scanner.nextInt();

    String space = " ";
    String underScore = "_";
    for (int i = 1; i <= number; i++) { 
      int spacesCount = number - i;
      String lineResult = space.repeat(spacesCount); // Just 4 spaces
      String underscoresResult = underScore.repeat(i); // Just 1 underscore
      lineResult = lineResult + underscoresResult; // Combining 4 spaces and 1 underscore
      System.out.println(lineResult);
    }
    scanner.close();
  }
}
-------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number = 58;

    // 1. We have a number

    // 2. We ask for the user to guess the number
    // 3. If the guessed number is bigger, then we say "Too big"
    // 4. If the guessed number is smaller, then we say "Too small"
    // 5. If the guessed number is correct, then we say "Correct"
    // 2-5 line a loop, we stop the loop, when the user is correct

    while (true) {
      System.out.println("Please guess a number!");
      int guess = scanner.nextInt(); // A number that user provides

      if (number == guess) {
        System.out.println("Good job, you guessed correctly");
        break;
      } 
      if (number < guess) {
        System.out.println("Sorry, the number is too big");
        continue;
      }
      System.out.println("Sorry, the number is too small");
    }
    System.out.println("Guessing game is over!");
    scanner.close();
  }
}
------------------------------------------------------------------------------------------------------------------------
