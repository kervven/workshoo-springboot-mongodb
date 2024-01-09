package com.kerven.workshop.services.exception;

import org.springframework.stereotype.Service;


public class ObjectNotFoundException extends RuntimeException{

        private static final long serialVersionUID = 1L;

        public ObjectNotFoundException(String msg){
        super(msg);
        }
}
