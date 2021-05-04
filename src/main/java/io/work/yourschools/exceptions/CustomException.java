package io.work.yourschools.exceptions;

import lombok.*;

public class CustomException extends Exception {
    public CustomException(String message){
        super(message);
    }
}
