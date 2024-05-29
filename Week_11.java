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
