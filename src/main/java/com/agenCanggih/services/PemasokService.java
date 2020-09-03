package com.agenCanggih.services;

import java.util.List;

import com.agenCanggih.models.PemasokEntity;

public interface PemasokService {
    PemasokEntity addPemasok(PemasokEntity pemasok);

    List<PemasokEntity> getAllPemasok();

    PemasokEntity getPemasokById(Long id);

    PemasokEntity updatePemasokById(PemasokEntity pemasok);

    void deletePemasokById(Long id);
}