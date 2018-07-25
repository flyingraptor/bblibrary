package co.thebeat.booklibrary.frontdesk.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookWebService {
	
    @RequestMapping("/book")
    public void addBook() {
    	System.out.println("Hello from the server!!");
    }
}
