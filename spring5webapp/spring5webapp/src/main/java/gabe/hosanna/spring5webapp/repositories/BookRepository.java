package gabe.hosanna.spring5webapp.repositories;

import gabe.hosanna.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
