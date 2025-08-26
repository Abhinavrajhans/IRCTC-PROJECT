package com.example.irctc.dto;

import lombok.*;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrainBodyResponseDTO {
    private Long trainBodyId;
    private String companyName;
    private Instant createdAt;
    private Instant updatedAt;
}
