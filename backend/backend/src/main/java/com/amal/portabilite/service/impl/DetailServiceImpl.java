package com.amal.portabilite.service.impl;

import com.amal.portabilite.model.Detail;
import com.amal.portabilite.model.SubBatch;
import com.amal.portabilite.repositories.DetailRepository;
import com.amal.portabilite.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailRepository detailRepository;
    @Override
    public List<Detail> getDetails() {
        List<Detail>  detailList = detailRepository.findAll();
        return new ArrayList<>(detailList) ;
    }

    @Override
    public Detail getDetail(Long detailId) {
        return detailRepository.findById(detailId).get();
    }
}
