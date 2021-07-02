package academy.mindswap.views;

import academy.mindswap.controllers.LoginController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginView implements View {

    private LoginController controller;

    @Override
    public void show() {
        System.out.println("\n" + Messages.WELCOME);
        System.out.println("\n" + Messages.CREDENTIALS);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        scanCredentials(reader);
    }

    private void scanCredentials(BufferedReader reader) {
        String username = null;
        String password = null;

        try {
            System.out.print(Messages.USERNAME);
            username = reader.readLine();
            System.out.print(Messages.PASSWORD);
            password = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!controller.doAuthentication(username, password)) {
            System.out.println("\n"+ Messages.LOGIN_ERROR + "\n");
            scanCredentials(reader);
        }
    }

    public void setController(LoginController controller) {
        this.controller = controller;
    }
}
