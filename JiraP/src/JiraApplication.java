

import Jira.Constants.SubTaskStatus;
import Jira.Constants.TaskType;
import Jira.Entity.Sprint;
import Jira.Entity.SubTask;
import Jira.Entity.Task;
import Jira.Entity.User;
import Jira.Service.SprintService;
import Jira.Service.SubTaskService;
import Jira.Service.TaskService;
import Jira.ServiceImpl.SprintServiceImpl;
import Jira.ServiceImpl.SubTaskServiceImpl;
import Jira.ServiceImpl.TaskServiceImpl;

public class JiraApplication {
    
    public static void main(String[] args) {
        System.out.println("Adding user Details");
        User rchamant = new User("Rahul");
        System.out.println("rchamant details: " +rchamant);

        System.out.println("*********************");
        System.out.println("Creating new Task");
        TaskService taskService = new TaskServiceImpl();

        Task task1 = taskService.createTask("Task1",rchamant,TaskType.TASK);
        System.out.println("Task1 "+task1);
        
        System.out.println("*********************");
        System.out.println("Creating new Sprint");

        SprintService sprintService = new SprintServiceImpl();

        Sprint octSprint = sprintService.createNDaySprint("OCT_SPRINT", (byte) 30);

        System.out.println("octSprint "+octSprint);

        System.out.println("octSprintTasks "+ sprintService.getTasksBySprintId(1));
        
        System.out.println("*********************");
        System.out.println("Adding Task to Sprint");
        
        System.out.println(sprintService.addTask(octSprint.getSprintId(), task1));
       
        
        System.out.println("OctSprint Tasks "+ sprintService.getTasksBySprintId(octSprint.getSprintId()));

        System.out.println("*********************");
        System.out.println("Creating Sub Task");
        
        SubTaskService subTaskService = new SubTaskServiceImpl();
        
        SubTask subTask  =  subTaskService.createSubTask("task1_subtask1",rchamant);
        
        System.out.println("*********************");
        System.out.println("Adding Sub task to Task");
        System.out.println("before adding subtask task contents");
        System.out.println("*********************");
        System.out.println("SubTask Tasks "+ sprintService.getTasksBySprintId(octSprint.getSprintId()));

        System.out.println("After adding subtask task contents");
        System.out.println("*********************");
        System.out.println(taskService.addSubTask(task1.getTaskId(),subTask));

        System.out.println("octSprintTasks "+ sprintService.getTasksBySprintId(1));
        
       
        subTaskService.updateSubTaskStatus(subTask.getSubTaskId(),SubTaskStatus.IN_PROGRESS);
        
        System.out.println("After updating subtask task contents");
        System.out.println("*********************");
        System.out.println("octSprintTasks "+ sprintService.getTasksBySprintId(1));
        
        
        
    }
}   
