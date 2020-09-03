package com.agenCanggih.services.servicesImpl;

import com.agenCanggih.exceptions.EntityNotFoundException;
import com.agenCanggih.services.EntityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class EntityServiceImpl<ENT, ID, REPO extends JpaRepository<ENT, ID>>
        implements EntityService<ENT, ID> {

    @Autowired
    private REPO repository;

    public ENT save(ENT entity) {
        return repository.save(entity);
    }

    public Page<ENT> getAll(int page, int size, Direction direction) {
        Sort sort = Sort.by(direction, "id");
        return repository.findAll(PageRequest.of(page, size, sort));
    }

    public ENT getById(ID id) {
        String idNotFound = id.toString();
        ENT entity = repository.findById(id).orElseThrow(() -> new EntityNotFoundException(idNotFound));
        return entity;
    }

    public ENT deleteById(ID id) {
        ENT entity = getById(id);
        repository.delete(entity);
        return entity;
    }
}