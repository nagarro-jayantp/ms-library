package org.example.controller;

import java.util.List;
import org.example.data.BookDto;
import org.example.data.BookPriceDto;
import org.example.ports.api.BookServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

  @Autowired
  private BookServicePort bookServicePort;

  @PostMapping("/add")
  public BookDto addBook(@RequestBody BookDto bookDto) {
    return bookServicePort.addBook(bookDto);
  }

  @PutMapping("/update")
  public BookDto updateBook(@RequestBody BookDto bookDto) {
    return bookServicePort.updateBook(bookDto);
  }

  @GetMapping("/get/{id}")
  public BookDto getBookByID(@PathVariable long id) {
    return bookServicePort.getBookById(id);
  }

  @GetMapping("/get")
  public List<BookDto> getAllBooks() {
    return bookServicePort.getBooks();
  }

  @DeleteMapping("/delete/{id}")
  public void deleteBookByID(@PathVariable long id) {
    bookServicePort.deleteBookById(id);
  }

  @GetMapping("/getPrice/{id}")
  public BookPriceDto getBookPriceById(@PathVariable long id) {
    return bookServicePort.getBookPriceById(id);
  }
}
