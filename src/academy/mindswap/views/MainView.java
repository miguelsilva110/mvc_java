package academy.mindswap.views;

import academy.mindswap.controllers.MainController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainView implements View {

    private MainController mainController;

    @Override
    public void show() {
        System.out.println(Messages.MENU);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = "";
        try {
            command = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainController.menuSelection(command);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
