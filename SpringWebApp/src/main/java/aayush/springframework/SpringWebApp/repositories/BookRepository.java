package aayush.springframework.SpringWebApp.repositories;

import aayush.springframework.SpringWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
