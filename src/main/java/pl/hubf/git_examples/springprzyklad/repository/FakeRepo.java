package pl.hubf.git_examples.springprzyklad.repository;
import org.springframework.stereotype.Repository;
import pl.hubf.git_examples.springprzyklad.domain.User;
import java.util.Arrays;
import java.util.List;
@Repository
public class FakeRepo implements useracceess{

    @Override
    public List<User> readAllUsers() {
        return   Arrays.asList(
                new User("admin","admin"),
                new User("renon","123"),
                new User("user","321")
        );
    }
}
