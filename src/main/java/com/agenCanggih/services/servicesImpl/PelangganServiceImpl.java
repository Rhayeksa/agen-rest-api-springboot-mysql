package com.agenCanggih.services.servicesImpl;

import com.agenCanggih.models.PelangganEntity;
import com.agenCanggih.repositories.PelangganRepository;
import com.agenCanggih.services.PelangganService;

import org.springframework.stereotype.Service;

@Service
public class PelangganServiceImpl 
        extends EntityServiceImpl<PelangganEntity, Long, PelangganRepository>
        implements PelangganService {

}