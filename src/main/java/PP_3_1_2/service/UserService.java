package PP_3_1_2.service;

import PP_3_1_2.model.User;
import java.util.List;

public interface UserService {
    void saveUser (User user);

    void deleteUser (long id);

    void updateUser (User updatedUser);

    List<User> getAllUsers ();

    User getUser (long id);
}
