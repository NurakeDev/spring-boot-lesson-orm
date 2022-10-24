package nurakedevgroup.springbootlessonorm.service;

import nurakedevgroup.springbootlessonorm.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User getOne(Long id);

    User update(Long id, User user);

    User save(User user);
}
