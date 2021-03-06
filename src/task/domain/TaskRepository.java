package task.domain;

import java.sql.Date;
import java.util.Collection;

interface TaskRepository {

	void insertTask(Task task);
	
	void updateTask(Task task);
	
	void deleteTask(Task task);
	
	Task findTaskById(int id);
	
	Collection<Task> findAllTasksForUser(User user, Date olderThenDate);
}
