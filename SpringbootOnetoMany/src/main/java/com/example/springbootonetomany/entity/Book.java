package com.example.springbootonetomany.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer bId;

    @Column(name = "bName")
    @NonNull
    public String bName;

    @ManyToOne
    @JoinColumn(name = "sId")
    public Student student;





}