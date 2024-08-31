package com.apparotech.FoodDevlivery.Api.authController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apparotech.FoodDevlivery.Api.authexceptions.AuthorizationException;
import com.apparotech.FoodDevlivery.Api.authmodels.SignUpModel;
import com.apparotech.FoodDevlivery.Api.authservice.SignUpModelService;

@RestController
public class SignUpController {

    @Autowired
    private  SignUpModelService signUpService;

    @PostMapping("/signUp")

    public ResponseEntity<SignUpModel> createNewSignUpHandler(@RequestBody SignUpModel newSignUp) throws  AuthorizationException {

        SignUpModel newSignedUp =signUpService.newSignUp(newSignUp);
        return  new ResponseEntity<SignUpModel>(newSignedUp,HttpStatus.CREATED);
    }
        
    
}
