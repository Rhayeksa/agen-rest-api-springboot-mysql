package com.agenCanggih.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundExeption extends ApplicationException {
    private static final long serialVersionUID = 1867857529156028756L;

    public ResourceNotFoundExeption(String massage) {
        super(massage);
    }

}