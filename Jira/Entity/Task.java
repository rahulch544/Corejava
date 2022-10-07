package Jira.Entity;

import java.util.List;

import Jira.Constants.TaskType;

public class Task {
    
    private Integer id;
    String taskDescription;
    User assignee;
    TaskType taskType;
    List<SubTask> subTasks;
}
