package org.example.ports.spi;

import java.util.List;
import org.example.data.BookDto;
import org.example.data.BookPriceDto;

public interface BookDataPort {
  BookDto addBook(BookDto bookDto);

  void deleteBookById(Long bookId);

  BookDto updateBook(BookDto bookDto);

  List<BookDto> getBooks();

  BookDto getBookById(Long bookId);

  BookPriceDto getBookPriceById(Long bookId);
}
