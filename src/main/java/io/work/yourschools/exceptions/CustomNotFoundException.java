package io.work.yourschools.exceptions;

public class CustomNotFoundException extends  RuntimeException {
        public CustomNotFoundException(String msg) {
            super(msg);
        }
}
