package Jira.Entity;

import Jira.Constants.SubTaskStatus;

public class SubTask {
    private static Integer subTaskIdGenrator=0;

    private final Integer subTaskId;
    String subTaskDescription;
    SubTaskStatus status;
    User assignee;

    public SubTask(String subTaskDescription,User assignee) {
        this.subTaskId = ++subTaskIdGenrator;
        this.subTaskDescription = subTaskDescription;
        this.assignee = assignee;
        this.status = SubTaskStatus.OPEN;
    }

    public Integer getSubTaskId() {
        return this.subTaskId;
    }


    public String getSubTaskDescription() {
        return this.subTaskDescription;
    }

    public void setSubTaskDescription(String subTaskDescription) {
        this.subTaskDescription = subTaskDescription;
    }

    public SubTaskStatus getStatus() {
        return this.status;
    }

    public void setStatus(SubTaskStatus status) {
        this.status = status;
    }

    public User getAssignee() {
        return this.assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }


    @Override
    public String toString() {
        return "{" +
            " subTaskId='" + getSubTaskId() + "'" +
            ", subTaskDescription='" + getSubTaskDescription() + "'" +
            ", status='" + getStatus() + "'" +
            ", assignee='" + getAssignee() + "'" +
            "}";
    }

}
