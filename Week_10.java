        System.out.print("\033[H\033[2J");
        System.out.flush();

CLEANS SCREEN

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
___________________________________________________________________________________
Dynamic Arrays
___________________________________________________________________________________
  
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Initializing ARRAYLIST  
    ArrayList<String> shopsItems = new ArrayList<String>();
    
    // Create an element in the arraylist
    shopsItems.add("Table");
    shopsItems.add("Cupboard");

    printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items){
      for (String item : items){
        System.out.println(item);
      }
    }
  }
______________________________________________________________________________________
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> shopsItems = new ArrayList<String>();
    
    System.out.println("What would you like to add to the store? Type 'exit' to exit.");
    var scanner = new Scanner(System.in);
    
    while(true){
      var item = scanner.nextLine(); 
      if (item.equals("exit")){
        break;
      }
      addItem(shopsItems, item);
    }
    
    printArrayList(shopsItems);
  }

  public static void addItem(ArrayList<String> shopsItems, String item)  {
    shopsItems.add(item);
    System.out.println(item + " has been added to the store");
  }
  
  public static void printArrayList(ArrayList<String> shopsIitems){
      for (String item : shopsIitems){
        System.out.println(item);
      }
    }
  }
________________________________________________________________________________________

  // Remove an element from the arraylist
     System.out.println("What would you like to remove from the store?");
    var removeItem = scanner.nextLine();
    shopsItems.removeIf(item -> item.equals(removeItem));
    
    printArrayList(shopsItems);
________________________________________________________________________________________
  // FILTERING 
      var filteredArrayList = new ArrayList<String>();
    for(String item: shopsItems){
      if(item.length() <= 5){
        filteredArrayList.add(item);
      }
    }
    printArrayList(filteredArrayList);
_________________________________________________________________________________________
  
  // GROUP WORK EASY - add numbers to list and filrter out the ones that devide by 2

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    var listOfNumbers = new ArrayList<Integer>();

    System.out.println("Add a number to the list. Type '0' to exit.");
    var scanner = new Scanner(System.in);

    while(true){
      int number = scanner.nextInt(); 
      if (number==0 ){
        break;
      }
      addItem(listOfNumbers, number);
    }

    printArrayList(listOfNumbers);
    
      var filteredNumberList = new ArrayList<Integer>();
      
    for(int number: listOfNumbers){
      if(number % 2 == 0){
          filteredNumberList.add(number);
      }
    }
    printArrayList(filteredNumberList);
  }

  public static void addItem(ArrayList<Integer> listOfNumbers, int number)  {
      listOfNumbers.add(number);
    System.out.println(number + " has been added to the list");
  }

  public static void printArrayList(ArrayList<Integer> listOfNumbers){
      for (int number : listOfNumbers){
        System.out.println(number);
      }
    }
  }
________________________________________________________________________________________________________________________________________
        // GROUP WORK MEDIUM - add 100 random numbers to list and filrter out the ones that devide by 2

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    var listOfNumbers = new ArrayList<Integer>();

    addRandomNumber(listOfNumbers);
    
    var filteredNumberList = new ArrayList<Integer>();
      
    for(int number: listOfNumbers){
      if(number % 2 == 0){
          filteredNumberList.add(number);
      }
    }
    printArrayList(filteredNumberList);
  }

  public static void addRandomNumber(ArrayList<Integer> listOfNumbers) {
      Random random = new Random();
      for (int i = 0; i < 100; i++) {
          int randomNumber = random.nextInt(1000);
            listOfNumbers.add(randomNumber);
      }
  }
  public static void printArrayList(ArrayList<Integer> listOfNumbers){
      for (int number : listOfNumbers){
        System.out.println(number);
      }
    }
  }
__________________________________________________________________________________________________________________________________________
        
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> shopsItems = new ArrayList<String>();

    
    shopsItems.add("Table");
    shopsItems.add("Cupboard");
    shopsItems.add("Chair");
    shopsItems.add("Couch");
    shopsItems.add("Coffee table");
    shopsItems.add("Glass table");

    
    printArrayList(shopsItems);
    System.out.println("__________________");
    
      var filteredArrayList = new ArrayList<String>();
    for(String item: shopsItems){
      if(item.contains("table")){                                // CONTAIN function for ArrayList
        filteredArrayList.add(item);
      }
    }
    printArrayList(filteredArrayList);
  
  }

    public static void printArrayList(ArrayList<String> items){
      for (String item : items){
        System.out.println(item);
      }
    }
  }
__________________________________________________________________________________________________________________
        
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> shopsItems = new ArrayList<String>();

    
    shopsItems.add("Table");
    shopsItems.add("Cupboard");
    shopsItems.add("Chair");
    shopsItems.add("Couch");
    shopsItems.add("Coffee table");
    shopsItems.add("Glass table");

    
    printArrayList(shopsItems);
    System.out.println("__________________");

    var filteredArrayList = shopsItems
      .stream()                                  //
      .filter(item -> item.contains("table"))    // if TRUE it returns item
      //.skip(3)                                    // skips 3 items  
      //.limit(2)                                    // takes 2 items
      .collect(Collectors.toList());             // collects all filtered items into a list

    System.out.println(filteredArrayList);
    //printArrayList(filteredArrayList);
  
  }

    public static void printArrayList(ArrayList<String> items){
      for (String item : items){
        System.out.println(item);
      }
    }
  }
________________________________________________________________________________________________________
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> shopsItems = new ArrayList<String>();

    shopsItems.add("Table");
    shopsItems.add("Cupboard");
    shopsItems.add("Chair");
    shopsItems.add("Couch");
    shopsItems.add("Coffee table");
    shopsItems.add("Glass table");

    printArrayList(shopsItems);
    System.out.println("__________________");

   shopsItems
      .stream() 
      .filter(x -> x.contains("table"))
      .forEach(x -> System.out.println("test "+x));                       // forEach function for STREAM
     }
    public static void printArrayList(ArrayList<String> items){
      for (String item : items){
        System.out.println(item);
      }
    }
  }
___________________________________________________________________________________________________
        import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<String> shopsItems = new ArrayList<String>();

    shopsItems.add("Table");
    shopsItems.add("Cupboard");
    shopsItems.add("Chair");
    shopsItems.add("Couch");
    shopsItems.add("Coffee table");
    shopsItems.add("Glass table");
    
    printArrayList(shopsItems);
    System.out.println("__________________");

   shopsItems
      .stream() 
      .filter(x -> x.contains("table"))
      .forEach(x -> print(x));
   }

    public static void printArrayList(ArrayList<String> items){
      for (String item : items){
        System.out.println(item);
      }
    }
    public static void print(String text){                                        // function to PRINT extra empty line
      System.out.println();
      System.out.println(text);
    }
  }
_______________________________________________________________________________
// GROUP WORK - EASY - Create an integer ArrayList, skip the first 5 numbers. 
// And then with the rest of them, print them out.
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    
    var listOfNumbers = new ArrayList<Integer>();

    addRandomNumber(listOfNumbers);
    
    var filteredList = listOfNumbers
      .stream() 
      .skip(5)
      .collect(Collectors.toList());             

    System.out.println(filteredList);
   }
  public static void addRandomNumber(ArrayList<Integer> listOfNumbers) {
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
          int randomNumber = random.nextInt(100);
            listOfNumbers.add(randomNumber);
      }
  }
}
____________________________________________________________________________________________
// GROUP WORK - Medium: Create an integer ArrayList, make sure they divide by 2,
// skip the first 5, limit to three and print them out from another function.    
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    
    var listOfNumbers = new ArrayList<Integer>();

    addRandomNumber(listOfNumbers);
    
    var filteredList = listOfNumbers
      .stream() 
      .filter(number -> number % 2 == 0)
      .skip(5)
      .collect(Collectors.toList());             

    System.out.println(filteredList);
   }
  public static void addRandomNumber(ArrayList<Integer> listOfNumbers) {
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
          int randomNumber = random.nextInt(100);
            listOfNumbers.add(randomNumber);
      }
  }
}

        
