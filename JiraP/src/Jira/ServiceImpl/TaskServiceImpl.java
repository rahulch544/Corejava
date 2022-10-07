package Jira.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

import Jira.Constants.TaskStatus;
import Jira.Constants.TaskType;
import Jira.Entity.SubTask;
import Jira.Entity.Task;
import Jira.Entity.User;
import Jira.Service.TaskService;

public class TaskServiceImpl implements TaskService{

    private static final Map<Integer,Task> tasksMap = new HashMap<Integer,Task>();

    @Override
    public Task createTask(String description, User assignee,TaskType taskType) {
        // TODO Auto-generated method stub
        Task task = new Task(description, assignee,taskType);
        tasksMap.put(task.getTaskId(),task);
        return task;
    }

    @Override
    public Boolean updateTaskStatus(Integer taskId, TaskStatus taskStatus) {
        // TODO Auto-generated method stub
        Task task = tasksMap.get(taskId);
        task.setTaskStatus(taskStatus);
        return true;
    }

    @Override
    public Boolean addSubTask(Integer taskId, SubTask subTask) {
        // TODO Auto-generated method stub
        Task task = tasksMap.get(taskId);
        task.addSubTask(subTask);
        return true;
    }

    
}
