package me.sungbin.demospring53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {

//    @Autowired
//    @Qualifier("sungbinBookRepository")
//    BookRepository bookRepository;

//    @Autowired
//    List<BookRepository> bookRepositories;

    @Autowired
    BookRepository myBookRepository;

    @PostConstruct
    public void setup() {
        System.out.println(myBookRepository.getClass());
    }

//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

//    @Autowired(required = false)
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
