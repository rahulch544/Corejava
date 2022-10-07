package Jira.ServiceImpl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Jira.Entity.Sprint;
import Jira.Entity.Task;
import Jira.Service.SprintService;

public class SprintServiceImpl implements SprintService {

   private static final Map<Integer,Sprint> sprintMap = new HashMap<Integer,Sprint>();

    @Override
    public Sprint createSprint(String sprintName, LocalDate startDate, LocalDate endDate) {
        // TODO Auto-generated method stub
        Sprint sprint = new Sprint(sprintName, startDate, endDate);
        sprintMap.put(sprint.getSprintId(), sprint);
        
        System.out.println("Initial Mappings are: " + sprintMap); 
        
        // Using keySet() to get the set view of keys 
        System.out.println("The set is: " + sprintMap.keySet()); 
        return sprint;
    }

    @Override
    public Sprint createNDaySprint(String sprintName, Byte noOfDays) {
        // TODO Auto-generated method stub
        LocalDate todays = LocalDate.now();
        LocalDate Nthday = LocalDate.now().plusDays(noOfDays);
        Sprint sprint = new Sprint(sprintName, todays, Nthday);
        sprintMap.put(sprint.getSprintId(), sprint);

        return sprint;
    }

    @Override
    public List<Task> getTasksBySprint(String sprintName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Task> getTasksBySprintId(Integer sprintId) {
        // TODO Auto-generated method stub
        if(sprintMap.containsKey(sprintId))
            return sprintMap.get(sprintId).getTasks();
        throw new IllegalArgumentException("Invalid sprint id is given as input");   
    }

    @Override
    public Boolean addTask(Integer sprintId, Task task) {
        // TODO Auto-generated method stub
        Sprint sprint = sprintMap.get(sprintId);
        System.out.println("Sprint to which task is getting added "+ sprint.getSprintName());

//        if(sprint.getEndDate().compareTo(LocalDate.now()) <0){
//            throw new IllegalArgumentException("Adding to completed sprint");
//        }
//        if(sprint.getStartDate().compareTo(LocalDate.now()) >0){
//            throw new IllegalArgumentException("Adding to completed sprint");
//        }
        sprint.addTask(task);

        return true;
    }

    
}
