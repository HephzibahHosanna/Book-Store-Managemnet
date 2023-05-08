package com.example.BookManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookManagement.Entity.MyBookList;
import com.example.BookManagement.Repository.MyBookListRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookListRepository myBookRepo;
	
	public void saveMyBooks(MyBookList book) {
		myBookRepo.save(book);
	}
	
	public List<MyBookList> getAllBooks() {
	 return myBookRepo.findAll();
	}
	
	public void deleteById(int id) {
		myBookRepo.deleteById(id);
	}
}
