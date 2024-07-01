package enigma.tokoturing.service;

import enigma.tokoturing.model.User;

import java.util.List;
// C2RUD
public interface UserService {
    User create(User request);
    List<User> getAll();
    User getOne(Integer id);
    User update(User request);
    void delete(Integer id);
}
