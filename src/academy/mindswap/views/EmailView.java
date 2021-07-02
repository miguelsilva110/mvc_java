package academy.mindswap.views;

import academy.mindswap.controllers.EmailController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailView implements View {

    private EmailController emailController;
    private String newEmail;

    @Override
    public void show() {
        this.newEmail = "";
        System.out.println(Messages.NEW_EMAIL);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            this.newEmail = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setEmailController(EmailController emailController) {
        this.emailController = emailController;
    }

    public String getNewEmail() {
        return this.newEmail;
    }
}
