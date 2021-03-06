package com.studies.technocorp.exception.CustomException;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;


@Data
public class ApiException extends Exception{
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;

}
