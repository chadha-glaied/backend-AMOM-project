package com.amal.portabilite.controller;

import com.amal.portabilite.model.SubBatchHistory;
import com.amal.portabilite.service.SubBatchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subBatchHistory")
public class SubBatchHistoryController {
    @Autowired
    private SubBatchHistoryService subBatchHistoryService;

    @GetMapping("/")
    public List<SubBatchHistory> getSubBatchHistories(){
        return subBatchHistoryService.getSubBatchHistories();
    }

    @GetMapping("/{subBatchHistoryId}")
    public SubBatchHistory getSubBatchHistory(@PathVariable ("subBatchHistoryId") Long subBatchHistoryId){
        return subBatchHistoryService.getSubBatchHistory(subBatchHistoryId);
    }
}
