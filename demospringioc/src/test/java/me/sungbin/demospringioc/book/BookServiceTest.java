package me.sungbin.demospringioc.book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BookServiceTest {

    @Mock
    BookRepository bookRepository;

    @Test
    void save() {
        Book book = new Book();

        when(bookRepository.save(book)).thenReturn(book);

        BookService bookService = new BookService(bookRepository);
        Book result = bookService.save(book);

        assertNotNull(book.getCreated());
        assertEquals(book.getBookStatus(), BookStatus.DRAFT);
        assertNotNull(result);
    }
}