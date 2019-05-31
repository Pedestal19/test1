package gabe.hosanna.spring5webapp.repositories;

import gabe.hosanna.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
