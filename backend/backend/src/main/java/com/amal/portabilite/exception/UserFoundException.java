package com.amal.portabilite.exception;

public class UserFoundException extends Exception{

    public UserFoundException(){
        super("l'utilisateur existe déjà, réessayez !!");
    }

    public UserFoundException(String message){
        super(message);
    }
}
