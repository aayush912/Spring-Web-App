package aayush.springframework.SpringWebApp.repositories;


import aayush.springframework.SpringWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
