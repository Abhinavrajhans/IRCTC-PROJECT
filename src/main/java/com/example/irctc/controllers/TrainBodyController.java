package com.example.irctc.controllers;

import com.example.irctc.dto.TrainBodyRequestDTO;
import com.example.irctc.dto.TrainBodyResponseDTO;
import com.example.irctc.services.ITrainBodyService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/trainbody")
public class TrainBodyController {

    private final ITrainBodyService trainBodyService;

    public TrainBodyController(ITrainBodyService trainBodyService) {
        this.trainBodyService = trainBodyService;
    }

    @PostMapping
    public ResponseEntity<TrainBodyResponseDTO> createTrainBody(@Valid @RequestBody TrainBodyRequestDTO trainBodyDTO)  {
        TrainBodyResponseDTO trainBodyResponseDTO=this.trainBodyService.createTrainBody(trainBodyDTO);
        return ResponseEntity.ok().body(trainBodyResponseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainBodyResponseDTO> getByTrainBodyId(@PathVariable long id)
    {
        TrainBodyResponseDTO trainBodyResponseDTO=this.trainBodyService.getTrainBodyById(id);
        return ResponseEntity.ok().body(trainBodyResponseDTO);
    }

    @GetMapping
    public ResponseEntity<Page<TrainBodyResponseDTO>> getAllTrainBodies(
            @RequestParam(defaultValue = "0") int offset,
            @RequestParam(defaultValue = "2") int pageSize
      ){
        Pageable pageable= PageRequest.of(offset,pageSize);
        return ResponseEntity.ok().body(this.trainBodyService.getAllTrainBodies(pageable));
    }

}
