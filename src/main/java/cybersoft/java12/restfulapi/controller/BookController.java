package cybersoft.java12.restfulapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	
	public Object getAllBook() {
		return null;
	}
	
	public Object addNewBook(Book book) {
		return null;
	}
	
	public Object updateBook(Book book, int id) {
		return null;
	}
	
	public Object deleteBook(int id) {
		return null;
	}
}
