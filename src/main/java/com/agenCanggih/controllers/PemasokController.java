package com.agenCanggih.controllers;

import java.util.List;

import com.agenCanggih.exceptions.ApplicationException;
import com.agenCanggih.models.PemasokEntity;
import com.agenCanggih.services.PemasokService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pemasok")
public class PemasokController {

    @Autowired
    private PemasokService pemasokService;

    @PostMapping(path = "/add")
    public ResponseEntity<PemasokEntity> addPemasok(@RequestBody PemasokEntity pemasok) {
        return ResponseEntity.ok().body(this.pemasokService.addPemasok(pemasok));
    }

    @GetMapping(path = "")
    public ResponseEntity<List<PemasokEntity>> getAllPemasok() {
        return ResponseEntity.ok().body(this.pemasokService.getAllPemasok());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PemasokEntity> getPemasokById(@PathVariable Long id) throws ApplicationException {
        return ResponseEntity.ok().body(this.pemasokService.getPemasokById(id));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<PemasokEntity> updatePemasokById(@PathVariable Long id, @RequestBody PemasokEntity pemasok) {
        pemasok.setId(id);
        return ResponseEntity.ok().body(this.pemasokService.updatePemasokById(pemasok));
    }

    @DeleteMapping(path = "/delete/{id}")
    public HttpStatus deletePemasokById(@PathVariable Long id) {
        this.pemasokService.deletePemasokById(id);
        return HttpStatus.OK;
    }

}