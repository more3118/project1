POST http://localhost:8080/api/tasks > Create New Task

// Create a Task
{
       "name": "Build Java App",
       "category": "Test",
       "assignedTo": "Shreyas",
       "completed": false
   }



GET http://localhost:8080/api/tasks  >Get all tasks

GET http://localhost:8080/api/tasks/assignedTo/Shreyas > Get Tasks Assigned to Shreyas

PUT http://localhost:8080/api/tasks/1 > Updates the Task

{
 "name": "Updated Task Name",
 "category": "Updated Category",
 "assignedTo": "Shreyas",
 "completed":true
}

DEL http://localhost:8080/api/tasks/1 Deletes the task 





