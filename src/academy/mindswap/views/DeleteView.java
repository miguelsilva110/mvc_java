package academy.mindswap.views;

import academy.mindswap.controllers.DeleteController;
import academy.mindswap.utils.Messages;

public class DeleteView implements View {

    private DeleteController deleteController;

    @Override
    public void show() {
        System.out.println(Messages.USER_DELETED);
        System.exit(0);
    }

    public void setDeleteController(DeleteController deleteController) {
        this.deleteController = deleteController;
    }
}
