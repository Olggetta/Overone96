package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    private void save(User user) {
        userRepository.save(user);
    }


}
