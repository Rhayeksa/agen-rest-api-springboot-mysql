package com.agenCanggih.exceptions;

public class EntityNotFoundException extends ApplicationException {

    private static final long serialVersionUID = 6115750680994965418L;

    public EntityNotFoundException(String id) {
        super("Data dengan ID : " + id + " tidak terdaftar");
    }
}