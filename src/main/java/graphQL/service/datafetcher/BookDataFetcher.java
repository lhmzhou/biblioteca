package graphQL.service.datafetcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphQL.model.Book;
import graphQL.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookDataFetcher implements DataFetcher<Book>{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
		// TODO Auto-generated method stub
		String isbn = dataFetchingEnvironment.getArgument("id");
		return bookRepository.findById(isbn).get();
	}

}
