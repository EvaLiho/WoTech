public class Main {
  public static void main(String[] args) {
  

    // winter, spring, summer, autumn
    // jacket, t-shirt, swimming suite, rain coat

    double temp = -10;
    
    if (temp <= 5 ) {
      System.out.println("Super warm");
    }
    else if (temp > 5 && temp < 15) {
      System.out.println("Warm");
    }
    else if (temp >= 15 && temp <30) {
      System.out.println("Normal");
    }
    else if (temp >= 30) {
      System.out.println("Cooling");
    }
    else {
      System.out.println("Not a season");
    }
    
  }


}
