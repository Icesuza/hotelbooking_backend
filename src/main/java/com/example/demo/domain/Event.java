package com.example.demo.domain;

import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Data
@NoArgsConstructor
@Table (name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String title;

    @Column (columnDefinition = "TEXT",nullable = false)
    private String description;

    @Column (name = "start_date",nullable = false)
    private Date startDate;

    @Column (name = "end_date",nullable = false)
    private Date endDate;

    @Column (name = "created_at",nullable = false)
    private Timestamp createdAt;
}
