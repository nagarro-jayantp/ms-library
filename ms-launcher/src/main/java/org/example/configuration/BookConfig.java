package org.example.configuration;

import org.example.adapters.BookJpaAdapter;
import org.example.ports.api.BookServicePort;
import org.example.ports.spi.BookDataPort;
import org.example.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

  @Bean
  public BookDataPort bookDataPort() {
    return new BookJpaAdapter();
  }

  @Bean
  public BookServicePort bookServicePort() {
    return new BookServiceImpl(bookDataPort());
  }
}
