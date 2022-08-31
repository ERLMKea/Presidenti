package com.example.presidenti.controller;

import com.example.presidenti.model.President;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class PresidentRESTController {

    Set<President> lstPresidents = new HashSet<>();

    @GetMapping("/presidents")
    public Set<President> getLstPresidents() {
        President p1 = new President();
        lstPresidents.add(p1);
        lstPresidents.add(p1);
        return lstPresidents;
    }

    @PostMapping("/president")
    public President addPresident(@RequestBody President president) {
        lstPresidents.add(president);
        President p1 = new President();

        lstPresidents.contains(p1);
        return president;
    }

    @DeleteMapping("/president/{id}")
    public ResponseEntity<String> deletePresident(@PathVariable String id){
        try {
            for (President p: lstPresidents) {
                if (p.getId() == Integer.valueOf(id)) {
                    lstPresidents.remove(p);
                    return new ResponseEntity<>("Removed id=" + id, HttpStatus.OK);
                }
            }
            return new ResponseEntity<>("President with id=" + id, HttpStatus.NOT_FOUND);
        } catch (Exception err){
            return new ResponseEntity<>("President with id=" + id, HttpStatus.NOT_FOUND);
        }

    }

}




