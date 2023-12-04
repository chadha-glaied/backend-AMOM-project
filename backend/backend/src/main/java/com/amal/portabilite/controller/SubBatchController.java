package com.amal.portabilite.controller;

import com.amal.portabilite.model.SubBatch;
import com.amal.portabilite.service.SubBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/subBatch")
@CrossOrigin("*")
public class SubBatchController {
    @Autowired
    private SubBatchService subBatchService;

    @GetMapping("/{subBatchId}")
    public SubBatch getSubBatchById(@PathVariable("subBatchId") Long subBatchId){
        return subBatchService.getSubBatch(subBatchId);
    }

    @GetMapping("/")
    public List<SubBatch> getSubBatches(){
//        System.out.println(subBatchService.getSubBatches());
        return subBatchService.getSubBatches();
    }

}
