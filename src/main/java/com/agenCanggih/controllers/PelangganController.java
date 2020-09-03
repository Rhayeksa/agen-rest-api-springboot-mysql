package com.agenCanggih.controllers;

import java.util.List;

import com.agenCanggih.models.*;
import com.agenCanggih.services.PelangganService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pelanggan")
public class PelangganController {

    @Autowired
    private PelangganService pelangganService;

    @PostMapping(path = "/add")
    public ResponseMessage<PelangganEntity> add(@RequestBody PelangganEntity entity) {
        PelangganEntity pelanggan = this.pelangganService.save(entity);
        return ResponseMessage.ok(HttpStatus.OK.value(), pelanggan);
    }

    @GetMapping(path = "")
    public ResponseMessage<PageAbleList<PelangganEntity>> getAll(@RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size, @RequestParam(defaultValue = "ASC") String sort) {
        Direction direction = Direction.fromOptionalString(sort).orElse(Direction.ASC);
        Page<PelangganEntity> pelangganPage = this.pelangganService.getAll(page, size, direction);
        List<PelangganEntity> pelangganList = pelangganPage.toList();
        PageAbleList<PelangganEntity> list = new PageAbleList<>(pelangganList, pelangganPage.getTotalElements(), page,
                size);
        return ResponseMessage.ok(HttpStatus.OK.value(), list);
    }

    @GetMapping(path = "/{id}")
    public ResponseMessage<PelangganEntity> getById(@PathVariable Long id) {
        PelangganEntity pelangan = this.pelangganService.getById(id);
        return ResponseMessage.ok(HttpStatus.OK.value(), pelangan);
    }

    @PutMapping(path = "/update/{id}")
    public ResponseMessage<PelangganEntity> updateById(@PathVariable Long id, @RequestBody PelangganEntity entity) {
        entity.setId(id);
        PelangganEntity pelanggan = this.pelangganService.getById(id);
        pelanggan = this.pelangganService.save(entity);
        return ResponseMessage.ok(HttpStatus.OK.value(), pelanggan);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseMessage<PelangganEntity> deleteById(@PathVariable Long id) {
        PelangganEntity pelanggan = pelangganService.deleteById(id);
        return ResponseMessage.ok(HttpStatus.OK.value(), pelanggan);
    }
}