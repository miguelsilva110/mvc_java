package academy.mindswap.controllers;

import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.MainView;
import academy.mindswap.views.PasswordView;

public class PasswordController implements Controller {

    private PasswordView passwordView;
    private UserServiceImplementation userServiceImplementation;
    private LoginController loginController;
    private MainView mainView;
    @Override
    public void init() {
        passwordView.show();
        userServiceImplementation.editPassword(loginController.getUserId(), passwordView.getNewPassword());
        mainView.show();
    }

    public void setPasswordView(PasswordView passwordView) {
        this.passwordView = passwordView;
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
