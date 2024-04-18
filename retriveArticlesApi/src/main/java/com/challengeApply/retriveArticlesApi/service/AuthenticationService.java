package com.challengeApply.retriveArticlesApi.service;

import com.challengeApply.retriveArticlesApi.bean.JwtAuthenticationResponse;
import com.challengeApply.retriveArticlesApi.bean.SignUpRequest;
import com.challengeApply.retriveArticlesApi.bean.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}