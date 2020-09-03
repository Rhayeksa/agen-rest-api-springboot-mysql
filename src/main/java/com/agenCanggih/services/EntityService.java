package com.agenCanggih.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;

public interface EntityService<ENT, ID> {
    ENT save(ENT entity);

    Page<ENT> getAll(int page, int size, Direction direction);

    ENT getById(ID id);

    ENT deleteById(ID id);

}