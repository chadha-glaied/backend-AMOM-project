package com.amal.portabilite.controller;

import com.amal.portabilite.model.Detail;
import com.amal.portabilite.service.DetailService;
import com.amal.portabilite.service.impl.DetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/detail")
@CrossOrigin("*")
public class DetailController {

    @Autowired
    private DetailService detailService;

    @GetMapping("/{detailId}")
    public Detail getDetailById( @PathVariable ("detailId") Long detailId){
        return detailService.getDetail( detailId );
    }

    @GetMapping("/")
    public List<Detail> getDetails(){
        return detailService.getDetails();
    }
}
