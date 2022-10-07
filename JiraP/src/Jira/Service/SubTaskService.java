package Jira.Service;

import Jira.Constants.SubTaskStatus;
import Jira.Entity.SubTask;
import Jira.Entity.User;

public interface SubTaskService {
    
    public SubTask createSubTask(String description,User assignee);
    public Boolean updateSubTaskStatus(Integer subTaskId,SubTaskStatus status);
}
