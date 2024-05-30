FILE MAIN
  
// CLASS - description of an object

public class Main {
  public static void main(String[] args) {
    Person person = new Person();    // creating a new instance
    person.name = "Oskars";
    person.surname = "Klaumanis";

    Person person2 = new Person();
    person2.name = "Elchin";
    person2.surname = "Datorium";
    
    System.out.println(person.name);
    System.out.println(person2.name);
  
  }
}

FILE PERSON

  // for new class we need to create new file 
// public - we can access these in main class
// usuallu a DTO (data transfer object- a description) or service

public class Person {
  
  public String name;    
  public String surname;
  
  // this is a CONSTRUCTOR - returns a Person, no data type needed
  // Constructor always launches when you create a new instance of a class -> new Pwerson(name, surname)
  // you van provide default values for the construtor
  public Person(String inputName, String inputSurname){
    name = inputName;
    surname = inputSurname;
  }

  public Person (){      // method overloading - same name, different parameters
    
  }
}
____________________________________________________________________________________________
  FILE MAIN
  
public class Main {
  public static void main(String[] args) {
    var book = new Book("The Hobbit", "J.R.R. Tolkien", 310); // reference of the object book

    System.out.println(book.title);
    System.out.println(book.author);           
    System.out.println(book.pages);  

    var book2 = new Book();

    System.out.println(book2.title);
    System.out.println(book2.author);           
    System.out.println(book2.pages);  
  }
}

  FILE BOOK
  
public class Book {
  public String title;
  public String author;
  public int pages;

  public Book(String title, String author, int pages){
    this.title = title;
    this.author = author;
    this.pages = pages;
  }
  public Book(){
  }
}  
_____________________________________________________________________________________________

  TEAMWORK

  FILE MAIN

  
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

FILE PLANT

  public class Plant {
  public String name;
  public Double size;
  public int age;

  public Plant(String name, Double size, int age){
    this.name = name;
    this.size = size;
    this.age = age;
  }
  public Plant(){
  }
}
_________________________________________________________________________________________________________________________
MAIN FILE

  // NO MORE STATIC except in main once
public class Main {
  public static void main(String[] args) {      // main method
    Student.studentCount = 10;

    
    Student student = new Student();
    student.name = "john";
    Student student2 = new Student();

    System.out.println(student2.name);
    System.out.println(Student.studentCount);    // static can be with class
    // Main.main(args); -> "stack overflow"
  }
}

STUDENT FILE
  public class Student{
  public static int studentCount = 0;    // default is 0 so it is not needed
  public String name;    // non-static property
  public int age;        
  
}
___________________________________________________________________________________________________________________
   FILE MAIN

public class Main {
  public static void main(String[] args) {   

    Square square1 = new Square(3);
    var square1Perimeter = square1.getPerimeter();  // var is not mandatory
    System.out.println(square1Perimeter);

    Square square2 = new Square(5);
    System.out.println(square2.getPerimeter());  

    Square square3 = new Square(3);
    var square3Area = square3.getArea();  // var is not mandatory
    System.out.println(square3Area);
  }
}

FILE SQUARE
public class Square{
  public int sideLength;
  public Square(int sideLength){
    this.sideLength = sideLength;
  }

  public int getPerimeter(){
    return sideLength * 4;
  }

  public int getArea(){
    return sideLength * sideLength;
}
}
______________________________________________________________________________________________________________
  FILE MAIN
  public class Main {
    public static void main(String[] args) {
        var fork = new Fork(4, "Silver");

        System.out.println("The fork made out of " + fork.material + " has " +  fork.spikeCount + " spikes in total. And the sharpness is " + fork.sharpness);

        System.out.println("The fork is made out of " + fork.material);

        System.out.println("The fork has " + fork.spikeCount + " spikes in total.");

        System.out.println("And the sharpness is " + fork.sharpness);

        // we will create a stabbing machine. 

        for(int i = 0; i < 100; i++){
            fork.stab();
        }
        System.out.println("The sharpness after 100 stabs is " + fork.sharpness);
    }
}
FILE FORK
  //Fork has 3 or 4  spikes
//Fork has a material (silver, or plastic, wood)
//Fork has sharpness in the spikes. 0
//A fork can stab and whenever a fork stabs, it gets more dull
//Sharpness is gonna decrease by 0.1

public class Fork{
  public int spikeCount;
  public String material;
  public int sharpness = 1000;

  //new Fork(3, "wood")
  public Fork(int spikeCount, String material){
    this.spikeCount = spikeCount;
    this.material = material;
  }

  public void stab(){
    sharpness = sharpness - 1;
  }
}
____________________________________________________________________________________________________
  TEAMWORK

  MAIN FILE
  //Choose an item of your choosing and create a class.
//Define 3 different properties (same as yesterday)
//Define a function (action that you can do with this item) which would
//change one of the properties value


public class Main {
    public static void main(String[] args) {
        
        Tree tree = new Tree("Willow", 24.5);

        System.out.println("This tree is a " + tree.treeName + " tree and it is " +  tree.treeHeight + "m high ");


        for(int i = 0; i < 1000; i++){
            tree.autumn();
        }
        System.out.println("When Autumn comes and leaves start to fall it will have " + tree.leaves +" leaves left");
    }
}
TREE FILE
  public class Tree{
  public String treeName;
  public Double treeHeight;
  public int leaves = 10000;

  public Tree(String treeName, Double treeHeight){
    this.treeName = treeName;
    this.treeHeight = treeHeight;
  }

  public void autumn(){
    leaves = leaves - 1;
  }
}




  
