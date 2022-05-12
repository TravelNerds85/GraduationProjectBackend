package com.graduation.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
//import com.graduation.backend.model.FutureTravels;
import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.Lob;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelTipsDto {

        private Long id;

        @NotBlank(message = "Please enter a name.")
        private String name;

        @NotBlank(message = "Please enter a country.")
        private String country;

        @NotBlank(message = "Please enter a city.")
        private String city;

        @NotBlank(message = "Please enter a description.")
        private String description;

        @Lob
        @Null
        private byte[] file;

//        private FutureTravels futu;

}
