package com.mycompany.familytaskmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    
    @Autowired
    private TaskRepository taskRepository;
    
    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskRepository.save(task);
    }
    
    @PutMapping
    public ResponseEntity<Task> updateTak(@PathVariable Long id, @RequestBody Task updatedTask){
        return taskRepository.findById(id)
                .map( task -> {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setDueDate(updatedTask.getDueDate());
                task.setAssignedToUserId(updatedTask.getAssignedToUserId());
                task.setCreatedByUserId(updatedTask.getCreatedByUserId());
                task.setStatus(updatedTask.getStatus());
                Task saved = taskRepository.save(task);
                return ResponseEntity.ok(saved);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
