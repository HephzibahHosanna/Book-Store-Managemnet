package com.example.BookManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookManagement.Entity.MyBookList;

@Repository
public interface MyBookListRepository  extends JpaRepository<MyBookList,Integer>{

}
