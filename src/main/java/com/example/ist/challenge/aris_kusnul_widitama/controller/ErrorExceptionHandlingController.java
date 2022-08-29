package com.example.ist.challenge.aris_kusnul_widitama.controller;

import com.example.ist.challenge.aris_kusnul_widitama.constant.EErrorCode;
import com.example.ist.challenge.aris_kusnul_widitama.handler.ResponseHandler;
import com.example.ist.challenge.aris_kusnul_widitama.helper.ResourceAlreadyExistException;
import com.example.ist.challenge.aris_kusnul_widitama.helper.ResourceNotFoundException;
import com.example.ist.challenge.aris_kusnul_widitama.helper.SignInFailException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ErrorExceptionHandlingController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e) {
        var error = EErrorCode.NOT_FOUND;

        return ResponseHandler.generateErrorResponse(HttpStatus.NOT_FOUND, e.getMessage(), error.getCode(), error.getDescription());
    }

    @ExceptionHandler(ResourceAlreadyExistException.class)
    public ResponseEntity<?> handleResourceAlreadyExistException(ResourceAlreadyExistException e) {
        var error = EErrorCode.RESOURCE_EXIST;

        return ResponseHandler.generateErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage(), error.getCode(), error.getDescription());
    }

    @ExceptionHandler(SignInFailException.class)
    public ResponseEntity<?> handleSignInFailException(SignInFailException e) {
        var error = EErrorCode.INVALID_CRED;

        return ResponseHandler.generateErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage(), error.getCode(), error.getDescription());
    }
}
