package self.study.booksapi.book;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/v1/books")
public class BookController {

    @GetMapping(path = "/{bookid}")
    public ResponseEntity<Book> getBook(@PathVariable String bookid){
        Book book = new Book(bookid , UUID.randomUUID().toString() , "Nader is amazing" , "Nader" ,
                "2010-10-10");
        return new ResponseEntity<>(book , HttpStatus.OK);
    }
}