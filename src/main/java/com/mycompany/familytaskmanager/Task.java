package com.mycompany.familytaskmanager;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    String title;
    String description;
    LocalDateTime dueDate;
    Long assignedToUserId;
    Long createdByUserId;
    String status;
    
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    
    public LocalDateTime getDueDate() {return dueDate;}
    public void setDueDate(LocalDateTime dueDate) {this.dueDate = dueDate;}
    
    public Long getAssignedToUserId() {return assignedToUserId;}
    public void setAssignedToUserId(Long assignedToUserId) {this.assignedToUserId = assignedToUserId;}
    
    public Long getCreatedByUserId() {return createdByUserId;}
    public void setCreatedByUserId(Long createdByUserId) {this.createdByUserId = createdByUserId;}
    
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    
    public Task(){}
    
    public Task(Long id, String title, String description, LocalDateTime dueDate, Long assignedToUserId, Long createdByUserId, String status){
    this.id = id;
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
    this.assignedToUserId = assignedToUserId;
    this.createdByUserId = createdByUserId;
    this.status = status;
    }
    
    
}
