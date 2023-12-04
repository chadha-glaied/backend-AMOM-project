package com.amal.portabilite.service.impl;

import com.amal.portabilite.model.SubBatchHistory;
import com.amal.portabilite.repositories.SubBatchHistoryRepository;
import com.amal.portabilite.service.SubBatchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service

public class SubBatchHistoryServiceImpl implements SubBatchHistoryService {
    @Autowired
    private SubBatchHistoryRepository subBatchHistoryRepository;
    @Override
    public List<SubBatchHistory> getSubBatchHistories() {
        return  subBatchHistoryRepository.findAll();
    }

    @Override
    public SubBatchHistory getSubBatchHistory(Long subBatchHistoryId) {
        return subBatchHistoryRepository.findById( subBatchHistoryId ).get() ;
    }
}
