package gabe.hosanna.spring5webapp.repositories;

import gabe.hosanna.spring5webapp.model.Author;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
