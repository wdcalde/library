package com.example.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public List<Book> getAll(){
        return bookRepository.getAll();
    }

    public Book get(String bookId) {
        return bookRepository.get(bookId);
    }

    public List<Book> findByAuthor(String authorId){
        return bookRepository.findByAuthor(authorId);
    }

    public Book addBook(Book book){
        book.setBookId(null);
        return bookRepository.save(book);
    }

    public Book updateBook(String bookId, Book book){
        Book bookR = bookRepository.get(bookId);
        if (bookR == null) {
            return null;
        }
        book.setBookId(bookId);
        return bookRepository.save(book);
    }

    public Book deleteBook(String bookId){
        return bookRepository.delete(bookId);
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
