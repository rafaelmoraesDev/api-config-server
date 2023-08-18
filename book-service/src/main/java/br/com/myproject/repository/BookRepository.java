package br.com.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myproject.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
