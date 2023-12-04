package com.amal.portabilite.service;

import com.amal.portabilite.model.SubBatch;

import java.util.List;
import java.util.Set;

public interface SubBatchService {

     List<SubBatch> getSubBatches();
     SubBatch getSubBatch(Long subBatchId);
}
