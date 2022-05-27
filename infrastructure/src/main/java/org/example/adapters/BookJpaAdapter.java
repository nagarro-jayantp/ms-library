package org.example.adapters;

import java.util.List;
import java.util.Optional;
import org.example.data.BookDto;
import org.example.data.BookPriceDto;
import org.example.entity.Book;
import org.example.mappers.BookMapper;
import org.example.ports.spi.BookDataPort;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookJpaAdapter implements BookDataPort {

  @Autowired
  private BookRepository bookRepository;

  @Override
  public BookDto addBook(BookDto bookDto) {
    Book book = BookMapper.INSTANCE.bookDtoToBook(bookDto);
    Book savedBook = bookRepository.save(book);
    return BookMapper.INSTANCE.bookToBookDto(savedBook);
  }

  @Override
  public void deleteBookById(Long bookId) {
    bookRepository.deleteById(bookId);
  }

  @Override
  public BookDto updateBook(BookDto bookDto) {
    return addBook(bookDto);
  }

  @Override
  public List<BookDto> getBooks() {
    List<Book> bookList = bookRepository.findAll();

    return BookMapper.INSTANCE.bookListToBookDtoList(bookList);
  }

  @Override
  public BookDto getBookById(Long bookId) {
    Optional<Book> book = bookRepository.findById(bookId);
    return book.map(BookMapper.INSTANCE::bookToBookDto).orElse(null);
  }

  @Override
  public BookPriceDto getBookPriceById(Long bookId) {
    Optional<Book> book = bookRepository.findById(bookId);
    return book.map(BookMapper.INSTANCE::bookToBookPriceDto).orElse(null);
  }
}
