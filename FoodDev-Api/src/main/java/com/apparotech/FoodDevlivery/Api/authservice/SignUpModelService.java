package com.apparotech.FoodDevlivery.Api.authservice;

import com.apparotech.FoodDevlivery.Api.authexceptions.AuthorizationException;
import com.apparotech.FoodDevlivery.Api.authmodels.SignUpModel;

public interface  SignUpModelService {
    

    public SignUpModel newSignUp(SignUpModel signUp) throws  AuthorizationException;

    public SignUpModel  updateSignup(SignUpModel signUp, String key) throws  AuthorizationException;
    
}
