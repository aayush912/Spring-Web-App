package aayush.springframework.SpringWebApp.repositories;

import aayush.springframework.SpringWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
