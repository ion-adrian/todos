package net.comdava.taskscheduler.service;

import net.comdava.taskscheduler.model.User;

public interface UserService extends CRUDService<User, Long> {
    User findByName(String firstNmae,String lastName);
}
