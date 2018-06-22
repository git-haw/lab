package top.haw.service;


import top.haw.model.User1;

import java.util.List;

/**
 * Created by haw on 17-8-30.
 */
public interface UserService1 {
    User1 add(User1 obj);
    void delete(Long id);
    User1 update(User1 obj);
    User1 get(Long id);
    List<User1> getAll();
}
