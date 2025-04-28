package com.mycompany.familytaskmanager;
import java.time.LocalTime;
/**
 *
 * @author anita
 */
public class Submission {
    int id;
    int taskId;
    int submittedByUserId;
    LocalTime timestamp;
    String comment;
    
    public Submission(int id, int taskId, int submittedByUserId, LocalTime timestamp, String comment){
        this.id = id;
        this.taskId = taskId;
        this.submittedByUserId = submittedByUserId;
        this.timestamp = timestamp;
        this.comment = comment;
    }
}
