package com.example.irctc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TrainBody extends BaseEntity{
    @Column(nullable = false, unique = true, length = 100)
    private String companyName;

}