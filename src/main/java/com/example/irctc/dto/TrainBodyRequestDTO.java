package com.example.irctc.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainBodyRequestDTO {

    @NotBlank(message =" Station name is Required")
    @Size(min=2 , max= 100 , message = "Station Name must be between 2 and 100 characters")
    private String name;

    @NotBlank(message = " City name is Required")
    @Size(min=2, max= 100 , message = "City Name must be between 10 and 100  characters")
    private String city;
}
