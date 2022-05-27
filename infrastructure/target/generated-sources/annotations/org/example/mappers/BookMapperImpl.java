package org.example.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.data.BookDto;
import org.example.data.BookPriceDto;
import org.example.entity.Book;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-27T18:52:46+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setTitle( book.getTitle() );
        bookDto.setDescription( book.getDescription() );
        bookDto.setPrice( book.getPrice() );

        return bookDto;
    }

    @Override
    public Book bookDtoToBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookDto.getId() );
        book.setTitle( bookDto.getTitle() );
        book.setDescription( bookDto.getDescription() );
        book.setPrice( bookDto.getPrice() );

        return book;
    }

    @Override
    public List<BookDto> bookListToBookDtoList(List<Book> bookList) {
        if ( bookList == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( bookList.size() );
        for ( Book book : bookList ) {
            list.add( bookToBookDto( book ) );
        }

        return list;
    }

    @Override
    public List<Book> bookDtoListToBookList(List<BookDto> BookDtoList) {
        if ( BookDtoList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( BookDtoList.size() );
        for ( BookDto bookDto : BookDtoList ) {
            list.add( bookDtoToBook( bookDto ) );
        }

        return list;
    }

    @Override
    public BookPriceDto bookToBookPriceDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookPriceDto bookPriceDto = new BookPriceDto();

        bookPriceDto.setPrice( book.getPrice() );

        return bookPriceDto;
    }
}
