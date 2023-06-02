package PP_3_1_2.dao;



import PP_3_1_2.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser (User user);

    void deleteUser (long id);

    void updateUser (User updatedUser);

    List <User> getAllUsers ();

    User getUser (long id);
}
