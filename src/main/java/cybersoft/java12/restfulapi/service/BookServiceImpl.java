package cybersoft.java12.restfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.java12.restfulapi.model.Book;
import cybersoft.java12.restfulapi.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Book> findAll() {
		return repository.findAll();
	}

	@Override
	public Book findById(int id) {
		return repository.findById(id);
	}

	@Override
	public void update(Book book, int id) {
		repository.update(book, id);
		
	}

	@Override
	public boolean add(Book book) {
		return repository.add(book);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

}
