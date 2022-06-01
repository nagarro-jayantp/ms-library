package org.example.entity.projections;

import org.example.entity.Book;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "bookPrice", types = { Book.class })
public interface BookPrice {
  Double getPrice();
}
