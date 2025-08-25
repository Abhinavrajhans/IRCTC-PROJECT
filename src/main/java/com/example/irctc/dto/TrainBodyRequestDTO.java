package com.example.irctc.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainBodyRequestDTO {

    @NotBlank(message ="Company name is Required")
    @Size(min=2 , max= 100 , message = "Company Name must be between 2 and 100 characters")
    private String companyName;

}
