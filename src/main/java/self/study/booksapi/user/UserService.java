package self.study.booksapi.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    User user = null;

    public UserService() {
        user = new User("ndroid" , "$2y$12$.E1z9w2VpmqEUuC0MNQE7OLXu1uAPLF6nQrnbTPwgq9jQV4HGA2Vi" , true);
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
