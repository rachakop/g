package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vacation")
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "article_gen")
//    @SequenceGenerator(name = "article_gen",sequenceName = "article_seq")


//    @Pattern(regexp = "^[a-zA-Z0-9]{3}", message = "string is more than 3 letters")
    String name;

//    @Min(value = 2, message = "num should be greater than 2")
    int num;

//    @AssertFalse
    boolean hj;
}
