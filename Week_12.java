MAIN FILE
  
// Getting user input, sending the input to task manager, and displaying the result

import java.util.Scanner;

// MAIN class ise the UI - frontend
// scanner and printl is used ONLY in the main class

public class Main {
  
  public static Task_Manager taskManager = new Task_Manager();
  
  public static void main(String[] args) {
    createTask();
    showTasks();
    
  }
  
  public static void createTask(){
    Scanner scanner = new Scanner(System.in);  
    
    System.out.println("Please input the name of the task.");
    var name = scanner.nextLine();
    System.out.println("Please input the description.");
    var description = scanner.nextLine();
    scanner.close();
    var task = new Task(name, description);
    taskManager.addTask(task);
  }

  public static void showTasks(){
    var tasks = taskManager.getTasks();
    for(var task:tasks){
      System.out.println("This is a task");
      System.out.println(task.name);
      System.out.println(task.description);
      System.out.println(task.isDone);
    }
  }
}

TASK FILE

  // Template for a task - name, date, description, status etc

public class Task{
  public String name;
  public String description;
  public boolean isDone;

  // new Task - name and description
  public Task(String name, String description){
    this.name = name;
    this.description = description;
  }
}

TASK_MANAGER FILE
  
  // Add tasks to the task manager
// MVP: (Minimum Viable Priduct)
// list of tasks, set as done by Task name
// BONUS: list of done tasks, list of undone tasks (filter)
// Get a random quote to stop procrastinating

import java.util.ArrayList;

public class Task_Manager {

  private ArrayList<Task> tasks = new ArrayList<Task>();

  // Becayse we want to use the default constructor we don´t need to ass a custom
  // constructor

  public void addTask(Task task) {
    tasks.add(task);
  }

  // GETTER - fun that returns a value
  public ArrayList<Task> getTasks() {
    return tasks;
  }

}
