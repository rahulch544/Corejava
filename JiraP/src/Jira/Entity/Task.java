package Jira.Entity;

import java.util.ArrayList;
import java.util.List;

import Jira.Constants.TaskStatus;
import Jira.Constants.TaskType;

public class Task {
    private static Integer taskIdGenerator=0;

    private final Integer taskId;
    String taskDescription;
    User assignee;
    TaskType taskType;
    TaskStatus taskStatus;

    List<SubTask> subTasks;

    public Task(String taskDescription, User assignee, TaskType taskType) {
        this.taskId = ++taskIdGenerator;
        this.taskStatus = TaskStatus.OPEN;
        this.taskDescription = taskDescription;
        this.assignee = assignee;
        this.taskType = taskType;
        this.subTasks = new ArrayList<>();
    }

    public Integer getTaskId() {
        return this.taskId;
    }


    public String getTaskDescription() {
        return this.taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public User getAssignee() {
        return this.assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public TaskType getTaskType() {
        return this.taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public List<SubTask> getSubTasks() {
        return this.subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public void addSubTask(SubTask subTask){
        this.subTasks.add(subTask);
    }

    @Override
    public String toString() {
        return "Task [taskId=" + taskId + ", taskDescription=" + taskDescription + ", assignee=" + assignee
                + ", taskType=" + taskType + ", taskStatus=" + taskStatus + ", subTasks=" + subTasks + "]";
    }

    public static void setTaskIdGenerator(Integer taskIdGenerator) {
        Task.taskIdGenerator = taskIdGenerator;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
        
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    

}
