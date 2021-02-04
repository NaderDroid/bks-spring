package self.study.booksapi.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    User user = null;

    public UserService() {
        user = new User("ndroid" , "123" , true);
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
