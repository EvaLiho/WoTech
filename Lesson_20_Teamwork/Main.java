
public class Main {
  public static void main(String[] args) {
    var plant1 = new Plant("Peace Lily", 25.5, 3);

    System.out.println("My "+plant1.name + " is " + plant1.size + "cm high and is " + plant1.age + " years old");
 
    var plant2 = new Plant();
    plant2.name = "Cactus";
    plant2.size = 12.7;
    plant2.age = 15;
    
    System.out.println("My "+plant2.name + " is " + plant2.size + "cm high and is " + plant2.age + " years old");

    var plant3 = new Plant("Ficus", 75.9, 6);

    System.out.println("My "+plant3.name + " is " + plant3.size + "cm high and is " + plant3.age + " years old");
    
  }
}

// Create a class for an object that you can find on your table or for something you own - 
//For example: Vehicle
//Brand
//Year
//Color
//OwnersName

//Initialize 3 different objects out of this class, and print it out.