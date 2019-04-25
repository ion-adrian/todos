package net.comdava.taskscheduler.service.map;

import net.comdava.taskscheduler.model.Task;
import net.comdava.taskscheduler.service.CRUDService;

import java.util.Set;

public class TaskMapService extends BaseMapService<Task, Long> implements CRUDService<Task, Long> {
    @Override
    public Set<Task> findAll() {
        return super.findAll();
    }

    @Override
    public Task findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Task save(Task user) {
        return super.save(user.getId(), user);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Task task) {
        super.delete(task);
    }
}
