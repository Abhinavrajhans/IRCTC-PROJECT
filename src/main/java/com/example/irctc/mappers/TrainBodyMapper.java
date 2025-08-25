package com.example.irctc.mappers;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.entity.TrainBody;

public class TrainBodyMapper {

    public static TrainBodyResponseDTO EntitytoResponseDTO(TrainBody trainbody) {
        return TrainBodyResponseDTO.builder()
                .city(trainbody.getCity())
                .name(trainbody.getName())
                .build();
    }
    public static TrainBodyRequestDTO EntitytoRequestDTO(TrainBody trainbody) {
        return TrainBodyRequestDTO.builder()
                .name(trainbody.getName())
                .city(trainbody.getCity())
                .build();
    }

    public static TrainBody toEntity(TrainBodyResponseDTO trainBodyResponseDTO)
    {
        return TrainBody.builder()
                .city(trainBodyResponseDTO.getCity())
                .name(trainBodyResponseDTO.getName())
                .build();
    }

    public static TrainBody RequestDTOtoEntity(TrainBodyRequestDTO trainBodyRequestDTO) {
        return TrainBody.builder()
                .name(trainBodyRequestDTO.getName())
                .city(trainBodyRequestDTO.getCity())
                .build();
    }
}
