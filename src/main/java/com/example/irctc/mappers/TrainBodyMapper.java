package com.example.irctc.mappers;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.entity.TrainBody;

public class TrainBodyMapper {

    public static TrainBodyResponseDTO toResponseDTO(TrainBody trainbody) {
        return TrainBodyResponseDTO.builder()
                .companyName(trainbody.getCompanyName())
                .trainBodyId(trainbody.getId())
                .createdAt(trainbody.getCreatedAt())
                .updatedAt(trainbody.getUpdatedAt())
                .build();
    }

    public static TrainBody toEntity(TrainBodyRequestDTO trainBodyRequestDTO) {
        return TrainBody.builder()
                .companyName(trainBodyRequestDTO.getCompanyName())
                .build();
    }
}
