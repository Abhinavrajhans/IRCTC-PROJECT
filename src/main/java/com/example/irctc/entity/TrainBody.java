package com.example.irctc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainBody extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;
}