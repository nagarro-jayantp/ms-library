package org.example.service;

import java.util.List;
import org.example.data.BookDto;
import org.example.data.BookPriceDto;
import org.example.ports.api.BookServicePort;
import org.example.ports.spi.BookDataPort;

public class BookServiceImpl implements BookServicePort {

  private BookDataPort bookDataPort;

  public BookServiceImpl(BookDataPort bookDataPort) {
    this.bookDataPort = bookDataPort;
  }

  @Override
  public BookDto addBook(BookDto bookDto) {
    return bookDataPort.addBook(bookDto);
  }

  @Override
  public void deleteBookById(Long bookId) {
    bookDataPort.deleteBookById(bookId);
  }

  @Override
  public BookDto updateBook(BookDto bookDto) {
    return bookDataPort.updateBook(bookDto);
  }

  @Override
  public List<BookDto> getBooks() {
    return bookDataPort.getBooks();
  }

  @Override
  public BookDto getBookById(Long bookId) {
    return bookDataPort.getBookById(bookId);
  }

  @Override
  public BookPriceDto getBookPriceById(Long bookId) {
    return bookDataPort.getBookPriceById(bookId);
  }


}
