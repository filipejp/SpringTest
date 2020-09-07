package com.example.springwebflux;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping("/all")
    public Book getBook(){
        return new Book();
    }

    @GetMapping("/{title}")
    public Book getBook(@PathVariable String title){
        Book book = new Book();
        book.setTitle(title);
        return book;
    }

    @PutMapping("/new")
    public ResponseEntity<Book> getBook(@RequestBody Book book){
        return ResponseEntity.ok().body(book);
    }
}
