package com.project.apl.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Create Task
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    // Get All Tasks
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    // Get Task by ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/assignedTo/{assignedTo}")
    public ResponseEntity<List<Task>> getTasksByAssignedTo(@PathVariable String assignedTo) {
        List<Task> tasks = taskService.getTasksByAssignedTo(assignedTo);
        if (tasks.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tasks);
    }
    // Update Task
        @PutMapping("/{id}")
        public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
            try {
                Task updatedTask = taskService.updateTask(id, task);
                return ResponseEntity.ok(updatedTask);
            } catch (RuntimeException e) {
                return ResponseEntity.notFound().build();
            }
        }

    // Delete Tasks
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}