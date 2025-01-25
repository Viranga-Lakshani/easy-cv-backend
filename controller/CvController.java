package com.example.easycv.controller;

import com.example.easycv.exception.CvNotFoundException;
import com.example.easycv.model.Cv;
import com.example.easycv.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cvs")
public class CvController {

    @Autowired
    private CvService cvService;

    @GetMapping
    public ResponseEntity<List<Cv>> getAllCvs() {
        return ResponseEntity.ok(cvService.getAllCvs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cv> getCvById(@PathVariable Long id) throws CvNotFoundException {
        return ResponseEntity.ok(cvService.getCvById(id));
    }

    @PostMapping
    public ResponseEntity<Cv> createCv(@Valid @RequestBody Cv cv) {
        return new ResponseEntity<>(cvService.createCv(cv), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cv> updateCv(@PathVariable Long id, @Valid @RequestBody Cv cv) throws CvNotFoundException {
        cv.setId(id);
        return ResponseEntity.ok(cvService.updateCv(cv));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCv(@PathVariable Long id) throws CvNotFoundException {
        cvService.deleteCv(id);
        return ResponseEntity.noContent().build();
    }
}
