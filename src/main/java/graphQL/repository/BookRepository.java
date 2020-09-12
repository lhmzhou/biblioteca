package graphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import graphQL.model.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}
