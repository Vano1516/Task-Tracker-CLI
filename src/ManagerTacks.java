import java.util.ArrayList;
import java.util.List;

public class ManagerTacks {
    List<Task> tasks = new ArrayList<>();
    public void addTask(String Description){
        Task task = new Task(Description);
        task.status = "todo";
        tasks.add(task);
    }
    public void deleteTask(int id){
        tasks.remove(id);
    }
    public void updateTask(int id, String newDescription){
        Task task = new Task(newDescription);
        tasks.get(id).description = newDescription;
        "".toLowerCase();
    }
    public void showTasks(String status){
        System.out.println("Вывод всех задач");
        int id = 0;
        for (Task i : tasks){
            if (i.status.equals(status))
                System.out.println(id +" - "+i.description);
            id++;
        }
    }
    public int findTaskID(String name){
        int id =0;
        for (Task i : tasks){
            if (i.description.equals(name)){
                return id ;
            }
            id++;
        }
        return -1;
    }
    public void changeStatus(String status, int id){
        tasks.get(id).status = status;
    }
}
