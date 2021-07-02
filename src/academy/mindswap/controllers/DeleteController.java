package academy.mindswap.controllers;

import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.DeleteView;
import academy.mindswap.views.MainView;

public class DeleteController implements Controller {

    private DeleteView deleteView;
    private UserServiceImplementation userServiceImplementation;
    private LoginController loginController;
    private MainView mainView;

    @Override
    public void init() {
        deleteView.show();
        userServiceImplementation.deleteUser(loginController.getUserId());

    }

    public void setDeleteView(DeleteView deleteView) {
        this.deleteView = deleteView;
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
