package pl.hubf.git_examples.springprzyklad.repository;

import pl.hubf.git_examples.springprzyklad.domain.User;

import java.util.List;

public interface useracceess {
    List<User> readAllUsers();
}
