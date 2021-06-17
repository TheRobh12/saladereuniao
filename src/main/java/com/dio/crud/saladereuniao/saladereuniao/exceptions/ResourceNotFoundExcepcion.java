package com.dio.crud.saladereuniao.saladereuniao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcepcion extends Exception{

    private static final long serialVersionUID = 1L;
    public ResourceNotFoundExcepcion(String message){
        super(message);
    }

}
