package org.example.repository;

import org.example.entity.Book;
import org.example.entity.projections.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
  BookPrice getPriceById(Long id);
}
