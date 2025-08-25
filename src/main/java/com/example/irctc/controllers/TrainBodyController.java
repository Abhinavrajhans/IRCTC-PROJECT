package com.example.irctc.controllers;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.services.ITrainBodyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/trainbody")
public class TrainBodyController {

    private final ITrainBodyService trainbodyservice;

    public TrainBodyController(ITrainBodyService trainbodyservice) {
        this.trainbodyservice = trainbodyservice;
    }

    @PostMapping
    public ResponseEntity<TrainBodyResponseDTO> createTrainBody(@RequestBody TrainBodyRequestDTO trainBodyDTO) {
        TrainBodyResponseDTO trainBodyResponseDTO=this.trainbodyservice.createTrainBody(trainBodyDTO);
        return ResponseEntity.ok().body(trainBodyResponseDTO);
    }

}
