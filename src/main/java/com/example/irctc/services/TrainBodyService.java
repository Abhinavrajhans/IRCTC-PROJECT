package com.example.irctc.services;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.entity.TrainBody;
import com.example.irctc.exception.TrainBodyNotFoundException;
import com.example.irctc.mappers.TrainBodyMapper;
import com.example.irctc.repository.TrainBodyRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TrainBodyService implements ITrainBodyService {

    private final TrainBodyRepository trainBodyRepository;

    public TrainBodyService(TrainBodyRepository trainrepository) {
        this.trainBodyRepository = trainrepository;
    }


    @Override
    public TrainBodyResponseDTO createTrainBody(TrainBodyRequestDTO trainBodyDTO)  {
        TrainBody trainbody = TrainBodyMapper.toEntity(trainBodyDTO);
        TrainBody savedTrainBody = trainBodyRepository.save(trainbody);
        return TrainBodyMapper.toResponseDTO(savedTrainBody);
    }

    @Override
    public TrainBodyResponseDTO getTrainBodyById(long id) {
        TrainBody trainbody=this.trainBodyRepository.findById(id)
                .orElseThrow(()-> new TrainBodyNotFoundException("Train Body With ID :"+id+ " Not Found"));
        return TrainBodyMapper.toResponseDTO(trainbody);
    }

    @Override
    public List<TrainBodyResponseDTO> getAllTrainBodies(Pageable pageable) {
        return trainBodyRepository.findAll(pageable)
                .stream()
                .map(TrainBodyMapper::toResponseDTO)
                .toList();
    }
}
