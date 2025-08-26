package com.example.irctc.services;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;

import java.io.IOException;

public interface ITrainBodyService {

    TrainBodyResponseDTO createTrainBody(TrainBodyRequestDTO  trainbody ) ;
    TrainBodyResponseDTO getTrainBodyById(long id);
}
