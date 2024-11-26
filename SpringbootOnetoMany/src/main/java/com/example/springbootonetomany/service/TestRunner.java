package com.example.springbootonetomany.service;

import com.example.springbootonetomany.entity.Book;
import com.example.springbootonetomany.entity.Student;
import com.example.springbootonetomany.repository.BookRepo;
import com.example.springbootonetomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");




//        Student st1=new Student();
//        st1.setSName("Prajwal");
//        st1.setSCity("Baramati");
//
//
//        Book book1=new Book();
//        //book1.setBId(10);
//        book1.setBName("DS");
//
//
//        Book book2=new Book();
//        //book2.setBId(20);
//        book2.setBName("SB");
//
//        st1.addBook(book1);
//        st1.addBook(book2);
//
//        studentRepo.save(st1);
//
//        Book b1=new Book();
//        b1.setBName("Algorithm");
//        bookRepo.save(b1);
//
//
//
//        Student student=new Student();
//        student.setSName("Prasad");
//        student.setSCity("Panvel");
//
//        studentRepo.save(student);
//        System.out.println(student.toString());
//        student.addBook(b1);
//
//        studentRepo.save(student);
//        System.out.println(student);
//
//
//
//
//

        Optional<Student> studentResult=studentRepo.findById(1);

        if(studentResult !=null){
            System.out.println(studentResult.get().getSId());
            System.out.println(studentResult.get().getSCity());
            System.out.println(studentResult.get().getSName());
            System.out.println(studentResult.get().getBookList());
        }


    }
}
