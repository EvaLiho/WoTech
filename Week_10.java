        System.out.print("\033[H\033[2J");
        System.out.flush();

CLEANS SCREEN

    public static void clear(){
        System.out.print("\033[H\033[2J");
       System.out.flush();
    }

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
  
  
