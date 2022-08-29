package com.example.ist.challenge.aris_kusnul_widitama.service;

import com.example.ist.challenge.aris_kusnul_widitama.dto.SignInRequestDTO;
import com.example.ist.challenge.aris_kusnul_widitama.dto.SignUpRequestDTO;
import com.example.ist.challenge.aris_kusnul_widitama.helper.ResourceAlreadyExistException;
import com.example.ist.challenge.aris_kusnul_widitama.helper.ResourceNotFoundException;
import com.example.ist.challenge.aris_kusnul_widitama.helper.SignInFailException;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authenticateUser(SignInRequestDTO loginRequest) throws SignInFailException;

    ResponseEntity<?> registerUser(SignUpRequestDTO signUpRequestDTO) throws ResourceAlreadyExistException, ResourceNotFoundException;
}
