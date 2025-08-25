package com.example.irctc.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainBodyResponseDTO {
    private String trainbody_id;
    private String name;
    private String city;
    private String createdAt;
    private String updatedAt;
}
