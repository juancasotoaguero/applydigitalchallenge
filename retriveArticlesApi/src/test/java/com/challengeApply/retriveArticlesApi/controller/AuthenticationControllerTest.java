package com.challengeApply.retriveArticlesApi.controller;


import com.challengeApply.retriveArticlesApi.bean.JwtAuthenticationResponse;
import com.challengeApply.retriveArticlesApi.bean.SignUpRequest;
import com.challengeApply.retriveArticlesApi.bean.SigninRequest;
import com.challengeApply.retriveArticlesApi.service.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AuthenticationControllerTest {

    @InjectMocks
    private AuthenticationController authenticationController;

    @Mock
    private AuthenticationService authenticationService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSignup() {
        SignUpRequest signUpRequest = new SignUpRequest("name", "lastName", "email", "password");
        JwtAuthenticationResponse jwtAuthenticationResponse = new JwtAuthenticationResponse("token");

        when(authenticationService.signup(signUpRequest)).thenReturn(jwtAuthenticationResponse);

        ResponseEntity<JwtAuthenticationResponse> responseEntity = authenticationController.signup(signUpRequest);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(jwtAuthenticationResponse, responseEntity.getBody());
    }

    @Test
    public void testSignin() {
        SigninRequest signinRequest = new SigninRequest("username", "password");
        JwtAuthenticationResponse jwtAuthenticationResponse = new JwtAuthenticationResponse("token");

        when(authenticationService.signin(signinRequest)).thenReturn(jwtAuthenticationResponse);

        ResponseEntity<JwtAuthenticationResponse> responseEntity = authenticationController.signin(signinRequest);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(jwtAuthenticationResponse, responseEntity.getBody());
    }
}