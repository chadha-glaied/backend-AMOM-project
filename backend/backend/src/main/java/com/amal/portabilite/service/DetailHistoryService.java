package com.amal.portabilite.service;

import com.amal.portabilite.model.DetailHistory;

import java.util.List;
import java.util.Set;

public interface DetailHistoryService {
    List<DetailHistory> getDetailHistories();
    DetailHistory getDetailHistory( Long detailHistoryId);
}
