package aayush.springframework.SpringWebApp.bootstrap;

import aayush.springframework.SpringWebApp.model.Author;
import aayush.springframework.SpringWebApp.model.Book;
import aayush.springframework.SpringWebApp.model.Publisher;
import aayush.springframework.SpringWebApp.repositories.AuthorRepository;
import aayush.springframework.SpringWebApp.repositories.BookRepository;
import aayush.springframework.SpringWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author khaledHosseini = new Author("Khaled", "Hosseini");
        Book theKiteRunner = new Book("The Kite Runner", "ab231xu");
        khaledHosseini.getBooks().add(theKiteRunner);
        theKiteRunner.getAuthors().add(khaledHosseini);

        authorRepository.save(khaledHosseini);
        bookRepository.save(theKiteRunner);

        Publisher wileyEdge = new Publisher("Wiley Edge", "London, UK");
        wileyEdge.getBooks().add(theKiteRunner);
        theKiteRunner.setPublisher(wileyEdge);
        publisherRepository.save(wileyEdge);



        Author jKRowling = new Author("JK", "Rowling");
        Book chamberOfSecrets = new Book("Harry Potter and the Chamber of Secrets", "xt735pe");
        jKRowling.getBooks().add(chamberOfSecrets);
        chamberOfSecrets.getAuthors().add(jKRowling);
        wileyEdge.getBooks().add(chamberOfSecrets);
        chamberOfSecrets.setPublisher(wileyEdge);

        authorRepository.save(jKRowling);
        bookRepository.save(chamberOfSecrets);
        publisherRepository.save(wileyEdge);

        System.out.println ("Number of publishers in the repository = " + publisherRepository.count());
        System.out.println("Chamber of Secrets published by = " + chamberOfSecrets.getPublisher().getName());
        System.out.println ("Number of books in the repository = " + bookRepository.count());


    }
}
