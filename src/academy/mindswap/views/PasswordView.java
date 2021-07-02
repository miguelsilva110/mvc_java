package academy.mindswap.views;

import academy.mindswap.controllers.PasswordController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordView implements View {

    private PasswordController passwordController;
    private String newPassword;
    @Override
    public void show() {
        this.newPassword = "";
        System.out.println(Messages.NEW_PASSWORD);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            this.newPassword = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPasswordController(PasswordController passwordController) {
        this.passwordController = passwordController;
    }

    public String getNewPassword() {
        return newPassword;
    }
}
