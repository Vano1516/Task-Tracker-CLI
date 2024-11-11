import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerTacks tasks = new ManagerTacks();
        int choise = -1;
        Scanner in = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            System.out.println("");

            input = in.next();

            switch (input){
                case "add":
                    String inputFull = in.next();
                    tasks.addTask(inputFull);
                    System.out.println("Task added successfully ID:"+ tasks.findTaskID(inputFull) );
                    break;

                case "delete":
                    tasks.deleteTask(Integer.parseInt(in.next()));
                    break;
                case "update":
                    int id = Integer.parseInt(in.next());
                    String description = in.next();
                    tasks.updateTask(id,description);
                    System.out.println("Task is updated");
                    break;
                case "list":
                    String mark = in.next();
                    switch (mark){
                        case "done":
                            tasks.showTasks("done");

                            break;
                        case "todo":
                            tasks.showTasks("todo");
                            break;
                        case "in-progress":
                            tasks.showTasks("in-progress");
                            break;
                    }

                    break;
                case "mark-in-progress":

                    tasks.changeStatus("mark-in-progress", Integer.parseInt(in.next()));
                    System.out.println("Status is changed");
                    break;
                case "mark-done":
                    tasks.changeStatus("mark-done", Integer.parseInt(in.next()));
                    System.out.println("Status is changed");
                    break;

                default:
                    System.out.println("неверно введенная команда");


            }
        }
        System.out.println("Выход из цикла");

//new information
    }
}