package com.example.irctc.services;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import org.springframework.data.domain.Pageable;

import java.io.IOException;
import java.util.List;

public interface ITrainBodyService {

    TrainBodyResponseDTO createTrainBody(TrainBodyRequestDTO  trainbody ) ;
    TrainBodyResponseDTO getTrainBodyById(long id);
    List<TrainBodyResponseDTO> getAllTrainBodies(Pageable pageable);
}
