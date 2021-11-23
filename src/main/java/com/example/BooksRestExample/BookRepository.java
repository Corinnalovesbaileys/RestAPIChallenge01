package com.example.BooksRestExample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // custom query to search to books post by title or author
    List<Book> findByTitleContainingOrAuthorContaining(String text, String textAgain);

}
