package com.altimatrik.cms.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
public class ApiError {
    private Date on;
    private String message;
    private String cause;

}
