package Jira.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {

    private static Integer sprintIdGenrator=0;

    private final Integer sprintId;
    private final String  sprintName;
    private final LocalDate startDate;
    private final LocalDate endDate;
 

    List<Task> tasks ;

    public Sprint(String sprintName,LocalDate startDate, LocalDate endDate ) {
        this.sprintId = ++sprintIdGenrator;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sprintName = sprintName;
        this.tasks =  new ArrayList<Task>();
    }


    public Integer getSprintId() {
        return this.sprintId;
    }


    public LocalDate getStartDate() {
        return this.startDate;
    }


    public LocalDate getEndDate() {
        return this.endDate;
    }


    public String getSprintName() {
        return this.sprintName;
    }


    public List<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    @Override
    public String toString() {
        return "Sprint [sprintId=" + sprintId + ", sprintName=" + sprintName + ", startDate=" + startDate + ", endDate="
                + endDate + ", tasks=" + tasks + "]";
    }



    
}
