package com.geekster.Restaurent.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurent {

    @NotNull
    private Integer restaurentId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]+$")
    private String restaurentName;

    private String restaurentAddress;

    @Size(min = 12,max = 12)
    @Pattern( regexp = "91[0-9]+",message = "Enter a Valid Phone Number")
    private String restaurentContact;

    @Email(message = "Enter valid Email")
    private String restaurentEmail;

    private String restaurentSpecialty;

    private Integer numberOfStaff;

    private Type restaurentType;


    public Integer getRestaurentId() {
        return restaurentId;
    }

    public void setRestaurentSpecialty(String restaurentSpecialty) {
        this.restaurentSpecialty = restaurentSpecialty;
    }
}
