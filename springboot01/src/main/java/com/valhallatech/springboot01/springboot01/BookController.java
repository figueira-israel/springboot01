package com.valhallatech.springboot01.springboot01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		List<Book> myBookList = new ArrayList();
		myBookList.add(new Book(1l,"Lord of the Rings","Tolkien"));
		return myBookList;
	}
}
