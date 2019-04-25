package net.comdava.taskscheduler.service;

import net.comdava.taskscheduler.model.Task;

import java.time.LocalDateTime;

public interface TaskService extends CRUDService<Task, Long> {
    Task findByTime(LocalDateTime startTime, LocalDateTime endTime);
}
