package com.allTasks.TasksScheduleService;

import java.text.ParseException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Service;

import com.allTasks.Utiliy.DateUtility;
import com.allTasks.Utiliy.UtilityTask.Priority;

import model.Task;



@Service
public class TaskCreatorScheduler {
	
	@Autowired
	private TaskRepository taskRepository;
	
	
	
	@Scheduled(initialDelay=0,fixedDelay=10000)
	public void firstJob() throws ParseException {
	    
		Task task =new Task();
		task.setTitle("Incoming Task Challenge");
		task.setDescription("Tasks to be Added ");
		task.setPriority(Priority.getPriority().toString());
		task.setStatus("OnGoing");
		task.setDueDate(DateUtility.getRandomDate());
		task.setResolvedDate("Not Resolved");
		taskRepository.save(task);
	}

}
