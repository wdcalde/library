package com.example.library.Util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummyBookFilter {
    private final BookService bookService;

    public DummyBookFilter(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init(){

        bookService.addBook(
                new Book(null, "El señor de los anillos", "libro completo de la trilogía", "J.R.R Tolkien", 500, 2));

        try {
                Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        bookService.addBook(
                new Book(null, "Harry Potter y la cámara secreta", "Segundo libro de la trilogía", "J.K. Rowling", 300, 5));

        try {
                Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        bookService.addBook(
                new Book(null, "Rayuela", "Edición conmemorativa", "Julio Cortazar", 600, 3));

        try {
                Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        bookService.addBook(
                new Book(null, "Que viva la música", "Obras completas", "Andrés Caicedo", 100, 4));
    }
}
