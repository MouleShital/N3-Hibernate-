package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
	
		//to return total number of books
		System.out.println("Total no. of books: "+service.getCount());

		//to return the specific book id
		System.out.println("All books: "+service.getBookByIds(3));
		
		//to return the price range of a book
		System.out.println("Price range between 300 to 700: "+service.getPrice(300f, 700f));
		
		//to return the author name
		System.out.println("Book with specific Author: "+service.getBooksAuthor("Yashwanth"));
		
		//to return all the books
		System.out.println("All books: "+service.getAll());
	}

}
