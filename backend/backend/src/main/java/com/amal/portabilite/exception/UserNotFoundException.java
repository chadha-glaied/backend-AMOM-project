package com.amal.portabilite.exception;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super("utilisateur non existant !!");
    }

    public UserNotFoundException(String message){
        super(message);
    }

}
