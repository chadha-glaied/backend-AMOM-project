package com.amal.portabilite.service;

import com.amal.portabilite.model.SubBatchHistory;

import java.util.List;
import java.util.Set;

public interface SubBatchHistoryService {

    List<SubBatchHistory> getSubBatchHistories();

    SubBatchHistory getSubBatchHistory(Long subBatchHistoryId);
}
