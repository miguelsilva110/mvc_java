package academy.mindswap.service;

import academy.mindswap.models.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserServiceImplementation implements UserService {

    private LinkedList<User> users = new LinkedList<>();

   public void createUsers() {
       System.out.println("ESTOU A CRIAR USERS");
        users.add(new User("crazycatlady_21", 1, "cats_are_cool@gmail.com", "catsarelife"));
        users.add(new User("been_there_done_that", 2, "johnnyc82@gmail.com", "password"));
        users.add(new User("smverissimo90", 3, "smverissimo90@gmail.com", "1234"));
        users.add(new User("shaquille-oatmeal", 4, "shaqthebest@gmail.com", "psswd"));
        users.add(new User("chicksbeforeducks", 5, "camisanchez34@gmail.com", "quack"));
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return getUsers().stream()
                .filter(user -> user.getId()==id)
                .findFirst();
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }

    @Override
    public boolean editUsername(Integer id, String username) {
        getUser(id).get().setUsername(username);
        System.out.println("this user is now called: " + getUser(id).get().toString());
        return true;
    }

    @Override
    public boolean editPassword(Integer id, String password) {
        getUser(id).get().setPassword(password);
        return true;
    }

    @Override
    public boolean editEmail(Integer id, String email) {
        getUser(id).get().setEmail(email);
        return true;
    }

    @Override
    public boolean deleteUser(Integer id) {
        users.remove(getUser(id).get());
        return true;
    }

    @Override
    public String toString() {
        return "UserServiceImplementation{" +
                "users=" + users +
                '}';
    }
}
