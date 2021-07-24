package cybersoft.java12.restfulapi.repository;

import java.util.List;

import cybersoft.java12.restfulapi.model.Book;

public interface BookRepository {
	List<Book> findAll();
	Book findById(int id);
	void update(Book book, int id);
	boolean add(Book book);
	void deleteById(int id);
}
