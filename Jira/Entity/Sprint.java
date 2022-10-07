package Jira.Entity;

import java.util.Date;
import java.util.List;

public class Sprint {

    private final Date startDate;
    private final Date endDate;
    private final String  sprintName;

    List<Task> tasks;

    public Sprint(Date startDate, Date endDate, String sprintName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.sprintName = sprintName;
    }

    
}
