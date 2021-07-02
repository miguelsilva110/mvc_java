package academy.mindswap.controllers;

import academy.mindswap.utils.Messages;
import academy.mindswap.views.View;

public class MainController implements Controller {

    private View mainView;
    private UserListController userListController;
    private UserNameController userNameController;
    private PasswordController passwordController;
    private EmailController emailController;
    private DeleteController deleteController;

    @Override
    public void init() {
        mainView.show();
    }

    public void setView(View mainView) {
        this.mainView = mainView;
    }



    public void menuSelection(String input) {

        switch (input) {
            case "1":
                userListController.init();
                break;
            case "2":
                userNameController.init();
                break;
            case "3":
                emailController.init();
                break;
            case "4":
                passwordController.init();
                break;
            case "5":
                deleteController.init();
                break;
            default:
                System.out.println(Messages.NO_SUCH_COMMAND);
                break;
        }
    }

    public void setUserListController(UserListController userListController) {
        this.userListController = userListController;
    }

    public void setUserNameController(UserNameController userNameController) {
        this.userNameController = userNameController;
    }

    public void setPasswordController(PasswordController passwordController) {
        this.passwordController = passwordController;
    }

    public void setEmailController(EmailController emailController) {
        this.emailController = emailController;
    }

    public void setDeleteController(DeleteController deleteController) {
        this.deleteController = deleteController;
    }
}