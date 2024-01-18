package com.example.vtys.service;
import java.util.List;

import com.example.vtys.entity.Task;

public interface TaskService {
    List<Task> getAllTasks();
	
	Task saveTask(Task Task);
	
	Task getTaskById(Long id);
	
	void updateTask(Long id,Task Task);
	
	void deleteTask(Long id);
}
