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

public class DetailHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long detailHistoryId;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "detailHistory")
    private List<Detail> details = new ArrayList<>();

}
