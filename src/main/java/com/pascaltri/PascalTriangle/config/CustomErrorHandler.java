package com.pascaltri.PascalTriangle.config;

import com.pascaltri.PascalTriangle.wrapper.ResponseWrap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {

    @ExceptionHandler(value= { Exception.class })
    public ResponseEntity<ResponseWrap> handleConflict(Exception ex) {
        String bodyOfResponse = ex.getMessage();
        ResponseWrap wrap = new ResponseWrap<>();
        wrap.setCode(HttpStatus.BAD_REQUEST.value());
        wrap.setData(bodyOfResponse);
        return new ResponseEntity<>(wrap, HttpStatus.BAD_REQUEST);
    }
}
