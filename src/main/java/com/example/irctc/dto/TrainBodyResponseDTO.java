package com.example.irctc.dto;

import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainBodyResponseDTO {
    private Long trainbody_id;
    private String companyName;
    private Instant createdAt;
    private Instant updatedAt;
}
