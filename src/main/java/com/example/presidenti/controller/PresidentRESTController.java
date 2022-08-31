package com.example.presidenti.controller;

import com.example.presidenti.model.President;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PresidentRESTController {

    List<President> lstPresidents = new ArrayList<>();

    @GetMapping("/presidents")
    public List<President> getLstPresidents() {
        President p1 = new President();
        lstPresidents.add(p1);
        lstPresidents.add(p1);
        return lstPresidents;
    }
}
