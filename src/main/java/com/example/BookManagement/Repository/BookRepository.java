package com.example.BookManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookManagement.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
