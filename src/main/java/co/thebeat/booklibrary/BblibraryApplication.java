package co.thebeat.booklibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.thebeat.booklibrary.frontdesk.web.entities.Book;

@SpringBootApplication
public class BblibraryApplication {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.id = "HJHYW343JJ";
		book1.ISBN = "JFJDF_DFDFDF";
		
		Book book2 = new Book();
		book2.id = "JDJDJJDJD";
		book2.ISBN = "FSFDF-FDFDFD-FDFDF";
		
		System.out.println(book1.id);
		System.out.println(book1.ISBN);
		System.out.println(book2.id);
		System.out.println(book2.ISBN);
	}
}
