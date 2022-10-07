package Jira.Service;

import java.time.LocalDate;
import java.util.List;

import Jira.Entity.Sprint;
import Jira.Entity.Task;

public interface SprintService {
    
    public Sprint createSprint(String sprintName,LocalDate startDate, LocalDate endDate);
    public Sprint createNDaySprint(String sprintName,Byte noOfDays);
    public List<Task> getTasksBySprint(String sprintName);
    public List<Task> getTasksBySprintId(Integer sprintId);
    public Boolean addTask(Integer sprintId,Task task);
}
