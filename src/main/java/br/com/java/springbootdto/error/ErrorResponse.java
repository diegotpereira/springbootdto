package br.com.java.springbootdto.error;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.*;

@Getter
@AllArgsConstructor
public class ErrorResponse {

    private final String message;
    private final int code;
    private final String status;
    private final String objectName;
    private final List<ErrorObject> errors;
}
