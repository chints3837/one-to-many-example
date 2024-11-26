package com.example.springbootonetomany.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer sId;

    @Column(name = "sName")
    @NonNull
    public String sName;

    @Column(name = "sCity")
    public String sCity;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Book> bookList=new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
        book.setStudent(this);
    }

    public void removeBook(Book book){
        bookList.remove(book);
        book.setStudent(null);
    }





}
