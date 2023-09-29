package com.inbev.tech.exceptions.example.exceptions;

import com.inbev.tech.exceptions.example.exceptions.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.naming.ServiceUnavailableException;

@ControllerAdvice
public class ExceptionHandlerController{

    @ExceptionHandler(CustomNotFoundException.class)
    public ResponseEntity<String> handlerCustomNotFoundException(CustomNotFoundException ex){
        //return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handlerGenericException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }

    @ExceptionHandler(ServiceUnavailableException.class)
    public ResponseEntity<String> handlerServiceUnavailableException(ServiceUnavailableException ex){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(ex.getMessage());
    }
}


// curl -i http://localhost:8080/api/hello/error ou curl -i -X GET http://localhost:8080/api/hello/error
// url para acessar: o user error

// curl -i -X GET http://localhost:8080/api/hello/emerson
// url para acessar: hello, emerson

// curl -i -X GET http://localhost:8080/api/generic
// url para acessar: erro generico

// curl -i -X GET http://localhost:8080/api/serviceUnavailable
// url para acessar: serviço indisponivel