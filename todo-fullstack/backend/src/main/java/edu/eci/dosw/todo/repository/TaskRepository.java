package edu.eci.dosw.todo.repository;
 
import edu.eci.dosw.todo.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}