package cybersoft.java12.restfulapi.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cybersoft.java12.restfulapi.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	private List<Book> books;
	
	public BookRepositoryImpl() {
		books  = new LinkedList<>();
		books.add(new Book(1, "Clean Code", "Uncle Bob"));
		books.add(new Book(1, "Java Recipe", "Unknown"));
		books.add(new Book(1, "Spring Boot Up & Run", "DO NOT REMEMBER"));
	}

	@Override
	public List<Book> findAll() {
		return books;
	}

	@Override
	public Book findById(int id) {
		for(Book book : books)
			if(book.getId() == id)
				return book;
		return null;
	}

	@Override
	public void update(Book book, int id) {
		for(int i = 0; i < books.size(); i++)
			if(books.get(i).getId() == id) {
				book.setId(id);
				books.set(i, book);
				return;
			}
	}

	@Override
	public boolean add(Book book) {
		for(Book curBook : books)
			if(curBook.getId() == book.getId())
				return false;
		
		return books.add(book);
	}

	@Override
	public void deleteById(int id) {
		for(Book book : books)
			if(book.getId() == id) {
				books.remove(book);
				return;
			}
	}
	
	
}
