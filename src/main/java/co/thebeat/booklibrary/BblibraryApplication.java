package co.thebeat.booklibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.thebeat.booklibrary.frontdesk.web.entities.Book;

@SpringBootApplication
public class BblibraryApplication {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setId("HJHYW343JJ");
		book1.setISBN("JFJDF_DFDFDF");
		
		Book book2 = new Book();
		book2.setId("JDJDJJDJD");
		book2.setISBN("FSFDF-FDFDFD-FDFDF");
		
		System.out.println(book1.getId());
		System.out.println(book1.getISBN());
		System.out.println(book2.getId());
		System.out.println(book2.getISBN());
	}
}
