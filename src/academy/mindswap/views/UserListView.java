package academy.mindswap.views;

import academy.mindswap.controllers.UserListController;
import academy.mindswap.models.User;

import java.util.List;

public class UserListView implements View {

    private UserListController userListController;
    private List<User> userList;

    @Override
    public void show() {
        this.userList = userListController.getUserList();
        System.out.println(this.userList);
    }


    public void setUserListController(UserListController userListController) {
        this.userListController = userListController;
    }
}
