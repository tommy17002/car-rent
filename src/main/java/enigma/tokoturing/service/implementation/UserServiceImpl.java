package enigma.tokoturing.service.implementation;

import enigma.tokoturing.model.User;
import enigma.tokoturing.repository.UserRepository;
import enigma.tokoturing.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User create(User request) {
        return userRepository.save(request);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getOne(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User update(User request) {
        // get User
        User user = this.getOne(request.getId());
        // ganti name
        user.setName(request.getName());
        // ganti birthPlace
        user.setBirthPlace(request.getBirthPlace());
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
