package org.example.mappers;

import java.util.List;
import org.example.data.BookDto;
import org.example.data.BookPriceDto;
import org.example.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

  BookDto bookToBookDto(Book book);

  Book bookDtoToBook(BookDto bookDto);

  List<BookDto> bookListToBookDtoList(List<Book> bookList);

  List<Book> bookDtoListToBookList(List<BookDto> BookDtoList);

  BookPriceDto bookToBookPriceDto(Book book);
}
