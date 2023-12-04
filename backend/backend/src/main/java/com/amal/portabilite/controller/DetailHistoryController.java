package com.amal.portabilite.controller;

import com.amal.portabilite.model.DetailHistory;
import com.amal.portabilite.service.DetailHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detailHistory")
public class DetailHistoryController {
    @Autowired
    private DetailHistoryService detailHistoryService;

    @GetMapping("/")
    public List<DetailHistory> getDetailHistories(){
        return detailHistoryService.getDetailHistories();
    }

    @GetMapping("/{detailHistoryId}")
    public DetailHistory getDetailHistoryById(@PathVariable ("detailHistoryId") Long detailHistoryId){
        return detailHistoryService.getDetailHistory(detailHistoryId);
    }




}
