package enigma.tokoturing.controller;

import enigma.tokoturing.model.User;
import enigma.tokoturing.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    // C2RUD
    @PostMapping
    public User create(@RequestBody User request) {
        return userService.create(request);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Integer id) {
        return userService.getOne(id);
    }

    @PutMapping
    public User update(@RequestBody User request) {
        return userService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
         userService.delete(id);
    }

}
