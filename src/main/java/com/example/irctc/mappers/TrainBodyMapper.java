package com.example.irctc.mappers;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.entity.TrainBody;

public class TrainBodyMapper {

    public static TrainBodyResponseDTO EntitytoResponseDTO(TrainBody trainbody) {
        return TrainBodyResponseDTO.builder()
                .companyName(trainbody.getCompanyName())
                .trainbody_id(trainbody.getId())
                .createdAt(trainbody.getCreatedAt())
                .updatedAt(trainbody.getUpdatedAt())
                .build();
    }
    public static TrainBodyRequestDTO EntitytoRequestDTO(TrainBody trainbody) {
        return TrainBodyRequestDTO.builder()
                .companyName(trainbody.getCompanyName())
                .build();
    }

    public static TrainBody toEntity(TrainBodyResponseDTO trainBodyResponseDTO)
    {
        return TrainBody.builder()
                .companyName(trainBodyResponseDTO.getCompanyName())
                .build();
    }

    public static TrainBody RequestDTOtoEntity(TrainBodyRequestDTO trainBodyRequestDTO) {
        return TrainBody.builder()
                .companyName(trainBodyRequestDTO.getCompanyName())
                .build();
    }
}
