package ua.com.skills.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.skills.dao.UserDao;
import ua.com.skills.entity.Role;
import ua.com.skills.entity.User;
import ua.com.skills.service.UserService;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by ваня on 03.01.2017.
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findBySecondName(username);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        user.setRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
        userDao.save(user);
    }

    @Override
    @Transactional
    public User findOne(int id) {
        return userDao.getOne(id);
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }
}
