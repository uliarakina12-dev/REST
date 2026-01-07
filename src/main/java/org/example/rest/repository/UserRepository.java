package org.example.rest.repository;

import org.example.rest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {

        if ("user".equals(user) && "pass".equals(password)) {
            return Arrays.asList(Authorities.READ);
        } else if ("admin".equals(user) && "admin".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else {
            return Collections.emptyList();
        }
    }
}
