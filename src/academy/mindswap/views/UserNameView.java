package academy.mindswap.views;

import academy.mindswap.controllers.UserNameController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserNameView implements View{
    private UserNameController userNameController;
    private String newUsername;

    @Override
    public void show() {
        this.newUsername = "";
        System.out.println("\n" + Messages.NEW_USERNAME);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
             this.newUsername = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setEditController(UserNameController userNameController) {
        this.userNameController = userNameController;
    }

    public String getNewUsername() {
        return this.newUsername;
    }
}
