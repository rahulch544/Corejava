package Jira.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

import Jira.Constants.SubTaskStatus;
import Jira.Entity.SubTask;
import Jira.Entity.User;
import Jira.Service.SubTaskService;

public class SubTaskServiceImpl implements SubTaskService {

    private final static Map<Integer, SubTask> subTasksMap = new HashMap<Integer, SubTask>();
    
    @Override
    public SubTask createSubTask(String description, User assignee) {
        // TODO Auto-generated method stub
        SubTask subtask = new SubTask(description, assignee);
        subTasksMap.put(subtask.getSubTaskId(), subtask);
        return subtask;
    }

    @Override
    public Boolean updateSubTaskStatus(Integer subTaskId, SubTaskStatus status) {
        // TODO Auto-generated method stub
        SubTask subtask = subTasksMap.get(subTaskId);
        if(subtask.getStatus() != status){
            subtask.setStatus(status);
            return true;
        }
        return false;
    }
    
}