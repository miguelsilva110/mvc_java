package academy.mindswap.controllers;

import academy.mindswap.models.User;
import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.View;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class LoginController implements Controller {

    private View view;
    private List<User> users;
    private Controller nextController;
    private UserServiceImplementation userServiceImplementation;
    private int userId;
    private String username;
    private String password;
    private String email;

    @Override
    public void init() {
        this.users = userServiceImplementation.getUsers();
        view.show();
        nextController.init();
    }


    public boolean doAuthentication(String username, String password) {
        Optional<User> authenticatedUser = users.stream()
                .filter(user -> user.getUsername().equals(username))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();
        this.userId = authenticatedUser.get().getId();
        this.username = authenticatedUser.get().getUsername();
        this.password = authenticatedUser.get().getPassword();
        this.email = authenticatedUser.get().getEmail();
        return authenticatedUser.isPresent();
    }

    public int getUserId() {
        return this.userId;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public void setUserServiceImplementation(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }

}
