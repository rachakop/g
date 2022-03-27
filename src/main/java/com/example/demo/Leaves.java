package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "leave")
public class Leaves {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "article_gen")
//    @SequenceGenerator(name = "article_gen",sequenceName = "article_seq")

    @Column(name = "start_date")
    Date startDate;

    @Column(name = "end_date")
    Date endDate;

    @Column(name = "number_of_leaves_approved")
    int numberOfLeavesApproved;

}
