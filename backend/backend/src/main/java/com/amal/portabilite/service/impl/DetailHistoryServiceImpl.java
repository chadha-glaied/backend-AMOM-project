package com.amal.portabilite.service.impl;

import com.amal.portabilite.model.DetailHistory;
import com.amal.portabilite.repositories.DetailHistoryRepository;
import com.amal.portabilite.service.DetailHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DetailHistoryServiceImpl implements DetailHistoryService {
    @Autowired
    private DetailHistoryRepository detailHistoryRepository;
    @Override
    public List<DetailHistory> getDetailHistories() {
        return  detailHistoryRepository.findAll();
    }

    @Override
    public DetailHistory getDetailHistory(Long detailHistoryId) {
        return detailHistoryRepository.findById(detailHistoryId).get();
    }
}
