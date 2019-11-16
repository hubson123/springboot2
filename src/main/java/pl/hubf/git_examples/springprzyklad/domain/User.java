package pl.hubf.git_examples.springprzyklad.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
private String login;
private String password;
}
