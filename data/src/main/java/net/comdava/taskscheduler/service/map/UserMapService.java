package net.comdava.taskscheduler.service.map;

import net.comdava.taskscheduler.model.User;
import net.comdava.taskscheduler.service.CRUDService;

import java.util.Set;

public class UserMapService extends BaseMapService<User, Long> implements CRUDService<User, Long> {

    @Override
    public Set<User> findAll(){
        return super.findAll();
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User save(User user) {
        return super.save(user.getId(), user);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(User user){
        super.delete(user);
    }
}
