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
           
    }
  }

