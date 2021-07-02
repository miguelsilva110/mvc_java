package academy.mindswap.controllers;

import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.EmailView;
import academy.mindswap.views.MainView;

public class EmailController implements Controller {

    private EmailView emailView;
    private UserServiceImplementation userServiceImplementation;
    private LoginController loginController;
    private MainView mainView;

    @Override
    public void init() {
        emailView.show();
        userServiceImplementation.editEmail(loginController.getUserId(), emailView.getNewEmail());
        mainView.show();
    }

    public void setEmailView(EmailView emailView) {
        this.emailView = emailView;
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
