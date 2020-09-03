package com.agenCanggih.exceptions;

import com.agenCanggih.models.ResponseMessage;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ResponseMessage<Object>> handleApplicationException(ApplicationException e) {
        ResponseMessage<Object> body = ResponseMessage.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
        return ResponseEntity.ok(body);
    }
}