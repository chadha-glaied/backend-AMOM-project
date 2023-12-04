package com.amal.portabilite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class SubBatchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subBatchHistoryId;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "subBatchHistory")
//    @JsonManagedReference and  @JsonIgnoreProperties("subBatchHistory") doesn't solve the stackOverFlow error (JSON recursive dependency)
    private List<SubBatch> subBatches = new ArrayList<>();


}
