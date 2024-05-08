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
  
