package com.altimatrik.cms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.sql.Date;
@Data
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private int customerId;
    @NotBlank(message = "Customer name is mandatory field should not be empty")
    private String customerName;
    @Past(message = "Dob should be not be future date")
    private Date customerDob;
    private boolean isIndianCitizen;
}
