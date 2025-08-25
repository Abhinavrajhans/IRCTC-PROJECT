package com.example.irctc.services;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;

public interface ITrainBodyService {

    public TrainBodyResponseDTO createTrainBody(TrainBodyRequestDTO  trainbody );
}
