package com.amal.portabilite.service.impl;

import com.amal.portabilite.model.SubBatch;
import com.amal.portabilite.repositories.SubBatchRepository;
import com.amal.portabilite.service.SubBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class SubBatchServiceImpl implements SubBatchService {

    @Autowired
    private SubBatchRepository subBatchRepository;
    @Override
    public List<SubBatch> getSubBatches() {
        List<SubBatch> subBatchList = subBatchRepository.findAll();
        return new ArrayList<>(subBatchList);
    }

    @Override
    public SubBatch getSubBatch(Long subBatchId) {
        return subBatchRepository.findById(subBatchId).get();
    }


}
