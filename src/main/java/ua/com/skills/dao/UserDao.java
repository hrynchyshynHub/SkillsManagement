package ua.com.skills.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.skills.entity.User;

/**
 * Created by ваня on 03.01.2017.
 */
public interface UserDao extends JpaRepository<User, Integer>{
    User findBySecondName(String name);
}
