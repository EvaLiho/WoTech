import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
   
    String[] partyList = {"Oskars","Maria", "Anna"};
    
    System.out.println("Please write a name");

    boolean isInvited = false;
    
    Scanner scanner = new Scanner(System.in);    
    String name = scanner.nextLine();

    for (int i = 0; i < partyList.length; i++)
    if(partyList[i].equals(name)) {
      isInvited = true;
      }

      if (isInvited){
      System.out.println(name + " is invited");
      } else {System.out.println(name + " is not invited");
     
      }
      scanner.close();     
    }
  }

import java.util.Scanner; 
public class Main {                        
  public static void main(String[] args) { 

    int number1 = input();
    int number2 = input();
    
    int result = sum(number1, number2);
    System.out.println(result);
     
  }
  
  public static int input() {
    System.out.println("Please enter number: ");
    Scanner scanner = new Scanner(System.in); 
    return scanner.nextInt();
    
    }
    
  public static int sum(int number1, int number2) {
    return number1 + number2;
  }
  
}

import java.util.Scanner;
public class Main {                        
  public static void main(String[] args) { 
  
    System.out.println("Please enter a title: ");
    String title = getTitle();
    System.out.println("Please enter a paragtaph: ");
    String paragraph = getParagraph();
    int titleLength = title.length();
    String border = "=".repeat(titleLength);

    printBook(title, paragraph, border);
  }
  public static String getTitle() {
    Scanner scanner = new Scanner(System.in); 
    String title = scanner.nextLine(); 
    return title;
  }
  public static String getParagraph() {
      Scanner scanner = new Scanner(System.in); 
      String paragraph = scanner.nextLine(); 
      return paragraph;
  }
  public static void printBook(String title, String paragraph, String border){
    System.out.println(border);
    System.out.println(title);
    System.out.println(border);
    System.out.println(paragraph); 
    
  }
}
