package cybersoft.java12.restfulapi.service;

import java.util.List;

import cybersoft.java12.restfulapi.model.Book;

public interface BookService {
	List<Book> findAll();
	Book findById(int id);
	void update(Book book, int id);
	boolean add(Book book);
	void deleteById(int id);
}
