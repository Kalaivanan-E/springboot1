package com.example.JobPortApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity  // this annotation is used to create table in database
@Data  // this will generate getter and setter, equal() & hashcode()
@AllArgsConstructor // parameterized constructor
@NoArgsConstructor  // default constructor
public class Application {
    @Id  // this marks the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // it will automatically generates number for the id
    private Long id;
    @ManyToOne // Many Applications belong to one User.
    @JoinColumn(name = "user_id") //his creates a foreign key column in the database.
    private User user;
    @ManyToOne // Many applications belong to one job.
    @JoinColumn(name = "job_id") // his creates a foreign key column in the database.
    private Job job;
    private LocalDate appliedDate; //Stores the date when the user applied for the job.
    private String status;

}
