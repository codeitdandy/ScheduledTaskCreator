package com.allTasks.TasksScheduleService;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Task;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task, Long>{

}
