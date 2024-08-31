package com.apparotech.FoodDevlivery.Api.authexceptions;

public class AuthorizationException extends  Exception {


    public AuthorizationException() {

    }

    public AuthorizationException( String message) {
        super(message);
    }
    
}
