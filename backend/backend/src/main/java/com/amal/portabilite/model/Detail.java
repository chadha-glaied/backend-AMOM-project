package com.amal.portabilite.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailId;

    private String MSISDN;
    private String clientCode;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime modificationDate;
    private String message;

    @ManyToOne
    @JoinColumn(name = "detailHistoryId")
    @JsonIgnore
    @ToString.Exclude
    private DetailHistory detailHistory;


    @OneToOne
    @JoinColumn(name = "subBatchId")
    @JsonIgnore
    @ToString.Exclude
    private SubBatch subBatch;

}