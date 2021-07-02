package academy.mindswap.controllers;

import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.MainView;
import academy.mindswap.views.UserNameView;

public class UserNameController implements Controller {
    private UserNameView userNameView;
    private UserServiceImplementation userServiceImplementation;
    private LoginController loginController;
    private MainView mainView;

    @Override
    public void init() {
        userNameView.show();
        userServiceImplementation.editUsername(loginController.getUserId(), userNameView.getNewUsername());
        mainView.show();
    }

    public void setEditView(UserNameView userNameView) {
        this.userNameView = userNameView;
    }

    public void setUserServiceImplementation(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }
}
