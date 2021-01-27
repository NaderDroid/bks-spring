package self.study.booksapi.user;

public class UserService {
    User user = null;

    public UserService() {
        user = new User("ndroid" , "" , true);
    }

    public User getUserByUsername(String username){
        if (user.getUsername().equals(username)){
            return user;
        }
        else {
            return null;
        }
    }
}
