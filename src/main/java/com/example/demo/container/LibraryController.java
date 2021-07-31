package com.example.demo.container;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LibraryRepo;
import com.example.demo.model.Library;

@RestController
public class LibraryController {

	@Autowired
	LibraryRepo repo;
	
	@PostMapping(path = "/saveBook")
	public Library addSeries(@RequestBody Library lib) {
		repo.save(lib);
		return lib;
	}
	
	@GetMapping(path = "/getBooks") // produces = "application/xml" to restrict the result to be in xml only
	public List<Library> getLibrary() {
		
		return repo.findAll();
	}
	
	
	@GetMapping(path = "/getById")
	public List<Library> getBookId(@RequestParam("bookId") int bookId) {
		
		return repo.findAllByBookId(bookId);
	}
 
 @GetMapping(path = "/getByType")
	public List<Library> getLibraryGenre(@RequestParam("bookId") String genre) {
		
		return repo.findAllByGenre(genre);
	}
 @PostMapping(path = "/update")
 public Library updateLibrary(@RequestParam("bookId") int bookId,@RequestBody Library lib) {
	repo.deleteById(bookId);
	lib.setBookId(bookId);
	repo.save(lib);
	return lib;
}
@DeleteMapping(path = "/deleteBook{bookId}")
public String deleteLibrary(@RequestParam("bookId") int bookId) {
	repo.deleteById(bookId);
	return "Deleted Successfully!";
}
 
}
