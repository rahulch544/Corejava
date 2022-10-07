package Jira.Service;

import Jira.Constants.TaskStatus;
import Jira.Constants.TaskType;
import Jira.Entity.SubTask;
import Jira.Entity.Task;
import Jira.Entity.User;

public interface TaskService {
    public Task createTask(String description,User assignee,TaskType taskType);
    public Boolean updateTaskStatus(Integer taskId,TaskStatus status);
    public Boolean addSubTask(Integer taskId,SubTask subTask);
}
