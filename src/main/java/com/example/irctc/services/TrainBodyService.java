package com.example.irctc.services;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.entity.TrainBody;
import com.example.irctc.mappers.TrainBodyMapper;
import com.example.irctc.repository.TrainBodyRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TrainBodyService implements ITrainBodyService {

    private final TrainBodyRepository trainrepository;

    TrainBodyService(TrainBodyRepository trainrepository) {
        this.trainrepository = trainrepository;
    }


    @Override
    public TrainBodyResponseDTO createTrainBody(TrainBodyRequestDTO trainBodyDTO)  {
        TrainBody trainbody = TrainBodyMapper.toEntity(trainBodyDTO);
        TrainBody savedTrainBody = trainrepository.save(trainbody);
        return TrainBodyMapper.toResponseDTO(savedTrainBody);
    }
}
