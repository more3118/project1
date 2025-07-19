package com.project.apl.task;

import com.project.apl.task.Task;
import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

public interface TaskService extends Repository<Task, Long> {

    Page<Task> findAll(Pageable pageable);

    Task findByNameAndCountryAllIgnoringCase(String name, String country);

}