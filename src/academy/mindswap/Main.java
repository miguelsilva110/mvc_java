package academy.mindswap;

import academy.mindswap.controllers.*;
import academy.mindswap.service.UserServiceImplementation;
import academy.mindswap.views.*;

public class Main {

    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView();
        MainView mainView = new MainView();
        MainController mainController = new MainController();
        UserListView userListView = new UserListView();
        UserListController userListController = new UserListController();
        UserNameController userNameController = new UserNameController();
        UserNameView userNameView = new UserNameView();
        PasswordController passwordController = new PasswordController();
        PasswordView passwordView = new PasswordView();
        UserServiceImplementation userServiceImplementation = new UserServiceImplementation();
        EmailView emailView = new EmailView();
        EmailController emailController = new EmailController();
        DeleteController deleteController = new DeleteController();
        DeleteView deleteView = new DeleteView();

        deleteView.setDeleteController(deleteController);
        deleteController.setDeleteView(deleteView);
        deleteController.setUserServiceImplementation(userServiceImplementation);
        deleteController.setLoginController(loginController);
        deleteController.setMainView(mainView);
        mainController.setDeleteController(deleteController);

        emailController.setEmailView(emailView);
        emailView.setEmailController(emailController);
        emailController.setUserServiceImplementation(userServiceImplementation);
        emailController.setLoginController(loginController);
        emailController.setMainView(mainView);
        mainController.setEmailController(emailController);

        passwordController.setPasswordView(passwordView);
        passwordView.setPasswordController(passwordController);
        mainController.setPasswordController(passwordController);
        passwordController.setLoginController(loginController);
        passwordController.setMainView(mainView);
        passwordController.setUserServiceImplementation(userServiceImplementation);

        userNameController.setEditView(userNameView);
        userNameView.setEditController(userNameController);
        userNameController.setLoginController(loginController);
        loginController.setView(loginView);
        loginView.setController(loginController);
        loginController.setNextController(mainController);

        userServiceImplementation.createUsers();
        loginController.setUserServiceImplementation(userServiceImplementation);
        userNameController.setUserServiceImplementation(userServiceImplementation);
        userNameController.setMainView(mainView);
        userListController.setMainView(mainView);

        mainView.setMainController(mainController);
        mainController.setView(mainView);
        mainController.setUserListController(userListController);
        mainController.setUserNameController(userNameController);

        userListView.setUserListController(userListController);
        userListController.setUserListView(userListView);
        userListController.setUserServiceImplementation(userServiceImplementation);
        loginController.init();
    }
}

