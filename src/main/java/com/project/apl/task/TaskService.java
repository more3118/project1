package com.project.apl.task;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

public interface TaskService extends Repository<Task, Long> {

    Page<Task> findAll(Pageable pageable);

    Task findByNameAndAssignedToAllIgnoringCase(String name, String assignedTo);

}