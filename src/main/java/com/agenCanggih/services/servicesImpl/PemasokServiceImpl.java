package com.agenCanggih.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import com.agenCanggih.exceptions.ResourceNotFoundExeption;
import com.agenCanggih.models.PemasokEntity;
import com.agenCanggih.repositories.PemasokRepository;
import com.agenCanggih.services.PemasokService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PemasokServiceImpl implements PemasokService {

    @Autowired
    private PemasokRepository pemasokRepository;

    @Override
    public PemasokEntity addPemasok(PemasokEntity pemasok) {
        return this.pemasokRepository.save(pemasok);
    }

    @Override
    public List<PemasokEntity> getAllPemasok() {
        return this.pemasokRepository.findAll();
    }

    @Override
    public PemasokEntity getPemasokById(Long id) {
        Optional<PemasokEntity> pemasok = this.pemasokRepository.findById(id);

        if (pemasok.isPresent()) {
            return pemasok.get();
        } else {
            throw new ResourceNotFoundExeption("Pemasok dengan ID : " + id + " tidak ditemukan");
        }
    }

    @Override
    public PemasokEntity updatePemasokById(PemasokEntity pemasok) {
        Optional<PemasokEntity> pemasokDb = this.pemasokRepository.findById(pemasok.getId());

        if (pemasokDb.isPresent()) {
            PemasokEntity pemasokUpdate = pemasokDb.get();
            pemasokUpdate.setId(pemasok.getId());
            pemasokUpdate.setNama(pemasok.getNama());
            pemasokUpdate.setHp(pemasok.getHp());
            pemasokUpdate.setEmail(pemasok.getEmail());
            pemasokRepository.save(pemasokUpdate);
            return pemasokUpdate;
        } else {
            throw new ResourceNotFoundExeption("Pemasok dengan ID : " + pemasok.getId() + " tidak terdaftar");
        }
    }

    @Override
    public void deletePemasokById(Long id) {
        Optional<PemasokEntity> pemasokDb = this.pemasokRepository.findById(id);

        if (pemasokDb.isPresent()) {
            this.pemasokRepository.delete(pemasokDb.get());
        } else {
            throw new ResourceNotFoundExeption(
                    "Pemasok dengan ID : " + id + " tidak dapat dihapus, karena tidak terdaftar");
        }
    }

}