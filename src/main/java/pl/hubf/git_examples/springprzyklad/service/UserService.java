package pl.hubf.git_examples.springprzyklad.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hubf.git_examples.springprzyklad.domain.User;
import pl.hubf.git_examples.springprzyklad.repository.useracceess;
import java.util.Collections;
import java.util.List;

@Service
public class UserService{
    private useracceess repo;
    @Autowired
    public UserService(useracceess repo) {
        this.repo = repo;
    }
    public List<User> getAllUsers() {
        return repo.readAllUsers();
    }
}
