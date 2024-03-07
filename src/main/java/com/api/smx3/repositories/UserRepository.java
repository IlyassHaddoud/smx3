package com.api.smx3.repositories;

import com.api.smx3.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email,"ilyass1234");
        user.setFirstName("firstName");
        user.setLastName("lastName");
        return user;
    }
}
